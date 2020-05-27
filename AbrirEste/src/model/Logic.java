package model;

import java.util.Collections;
import java.util.LinkedList;

import Exceptions.FirstException;
import processing.core.PApplet;
import processing.core.PImage;

public class Logic {
	PApplet app;
	
	LinkedList<Pokemons> listPokemons;
	LinkedList<User> listUsuarios;
	
	//txt pokemones
    String pokemones[];
	String pokemones2[];
	//txt usuarios
	String usuarios[];
	String usuarios2[];
	
	//Matriz del mapa
	private int map [][]=  
	       {{0, 0, 0, 0, 0, 4, 2, 0, 0, 2, 2},
	   		    {0,	0, 0, 0, 0, 1, 2, 0, 0, 0, 2},
			    {0, 0, 0, 2, 2, 1, 6, 2, 0, 0, 2},
			    {0, 2, 0, 5, 2, 0, 0, 0, 0, 0, 2},
			    {3, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2},
		    
	       };
	
	//Personaje
	Personaje bb;
	
	int caras =0;
	
	PImage pJue,jI,jD,jF,jA,jIF,jDF,jFF,jAF;
	int posYM,posXM;
	int posYMA,posXMA;
	int x, y;
	int pPokedex;
	int JM,screenCambio;
	int coco;
	int modo =0;
	Batalla batalla;
	boolean quitarAnuncio;
	boolean huyo;
	
	//Variable para controlar las veces que puede usar el boton de continuar cuando atrapa el pokemon
	int veces,vecesO,vecesO2;
	
	//Varaible que me ayuda a controlar la invisibilidad de los pokemones 
	boolean invisibles;

	
	//Todas las variables de los pokemones
	String pokemon;
	String tipo;
	int poderValor;
	String poder;
	String debilidad;
	int vida;
	int seleccion,capturado;
	boolean mover;
	
	//Todas las variables de los usuarios
	String nickname,email,fecha;
	
	//Inicialziamos la pokedex
	Pokedex poke;
	
	//Variables para controlar unas cositas
	int cambio = 0;
	int ordena;
	boolean botones=true;
	boolean botonInvisible = false;
	int boton1;

	//pantallas y mapas
	int pantalla,mapaX,mapaY;
	
	//imagenes fondo y botones
	PImage bOrdenarF,bOrdenarFN,fondo, arbol,inventarioIcono,fondoRosado,pokedexVolver,inventarioVolver,usuariosVolver,ordenarPor,ordenNombre,ordenFecha,ordenTipo,pokedexIcono,fondoInicio, fondoNada, continuarBoton, continuarBoton2, continuarBoton2N, continuarBotonN,registrarseBoton,registrarseBotonN, usuarioBoton,usuarioBotonN,pokemonEleccion,mapa,pantallaTecla,bOrdenarN,bOrdenarT,bOrdenarNN,bOrdenarTN,usuarioIcono,usuarioIconoN,barraUsuario,bVolverMapa,atrapar;
	PImage selec1,selec2,selec3;
	
	//Inicializamos la clase que carga las barras de los perfiles
	OrdenarPokemones ordenarPokemones;
	
	//Iniciliazamos las clase que compara las fechas
	FechaComparator fechaComparator;
	
	public Logic(PApplet app) {
		
		this.app=app;
		pantalla=1;
		mover=true;
		pokemones = app.loadStrings("lib/info_pokemones.txt");
		usuarios = app.loadStrings("lib/infoUsuarios.txt");
		listPokemons = new LinkedList <Pokemons>();
		listUsuarios = new LinkedList <User>();
		poke = new Pokedex(app);
		batalla = new Batalla (app);
		ordenarPokemones= new OrdenarPokemones(app);
		fechaComparator= new FechaComparator();
		cargarImagenes();
        cargarPokemones();
        quitarAnuncio=true;


		
		
		invisibles=true;
		
		mapaX = -200;
		mapaY = -100;
		
		
		//Recorremos la matriz para que el personaje pueda moverse por el mapa, lo igualamos con las variables globales
		for (int matY = 0; matY < 5; matY++) {
	        for (int matX = 0; matX < 11; matX++) {
	            if (map[matY][matX] == 1) {
	                posYM = matY;
	                posXM = matX;
	                app.fill(255);
	                
	            }
	        }
	    }
	  
		//inicializamos el personaje
	  bb = new Personaje(x,y);
	  JM = 1;
	  capturado=0;
	 
	  //Partimos el txt de los pokemones
		for(int i = 0; i < pokemones.length ; i++) {
			pokemones2 = pokemones[i].split(",");
			//nombre
			pokemon = pokemones2[0];
			//tipo de pokemon
			tipo=pokemones2[1];
			//poder en numero
			poderValor=Integer.parseInt(pokemones2[2]);
			//poder
			poder=pokemones2[3];
			//debilidad
			debilidad=pokemones2[4];
			//vida
			vida=Integer.parseInt(pokemones2[5]);
			
		}
		
		//Partimos el txt de los usuarios
		for(int i = 0; i < usuarios.length ; i++) {
			usuarios2 = usuarios[i].split(",");
			//nombre
			nickname = usuarios2[0];
			//tipo de pokemon
			email=usuarios2[1];
			//poder en numero
			fecha=usuarios2[2];
			
			
			
			//Buscamos cada usuario del txt
			if(nickname.equals("Vinterx")) {
				listUsuarios.add(new User (nickname,email,"jiji",fecha,0,app));
			}
			if(nickname.equals("Alexis")) {
				listUsuarios.add(new User (nickname,email,"jiji",fecha,2,app));
			}
			if(nickname.equals("Mysteriousguy")) {
				listUsuarios.add(new User (nickname,email,"jiji",fecha,4,app));
			}
			if(nickname.equals("Mariajose")) {
				listUsuarios.add(new User (nickname,email,"jiji",fecha,3,app));
			}
			if(nickname.equals("Zimzaladdude")) {
				listUsuarios.add(new User (nickname,email,"jiji",fecha,1,app));
			}
		}
		
	}

	
	public void iniciar(){
			
		

		
	}
	
	public void pintar() {
		
		//pokemon1= (int) app.random(1,4);


		
		switch(pantalla) {
		
				case 1:
					//pantalla
					app.image(pokemonEleccion,0,0);
					
					
					app.fill(0);
					
					
					
					//Botones
					if( (app.mouseX>120 && app.mouseX<250)&& (app.mouseY>298 && app.mouseY<328)){
						app.image(selec1,121,297);
					}
					if( (app.mouseX>286 && app.mouseX<417)&& (app.mouseY>298 && app.mouseY<328)){
						app.image(selec2,288,297);
					}
					if( (app.mouseX>453 && app.mouseX<583)&& (app.mouseY>298 && app.mouseY<328)){
						app.image(selec3,453,297);
					}
				break;
				case 2:
					app.image(mapa,0,0);
					app.image(pokedexIcono,20,345,70,54);
					app.image(inventarioIcono,120,345,70,54);
					
					
					dibujarBebe();
		
					//Los arboles si aparecen 
					for (int matY = 0; matY < 5; matY++) {
				        for (int matX = 0; matX < 11; matX++) {
				    
				          if (map[matY][matX] == 2) {
				            	  posYMA = matY*70;
					              posXMA = matX*70;
				            	app.image(arbol,posXMA,posYMA);     
				            }
				        }
				        }
					
					
					//Boton usuario
					app.image(usuarioIcono,630,10);
					
					  if( (app.mouseX>630 && app.mouseX<673)&& (app.mouseY>10 && app.mouseY<53)){
						  app.image(usuarioIconoN,630,10); 
					  }
					
					
					//invisibilidad
					if (map[posYM][posXM]==3 ||map[posYM][posXM]==4 ||map[posYM][posXM]==5 ||map[posYM][posXM]==6) {
						invisibles=false;
						mover=false;
					}
					
				
                   for(int i = 0; i<listPokemons.size(); i++) {
						
                	   if(invisibles==false) {
						listPokemons.get(i).pintarPMapa();
                	   }
						
					}
                   
                   //aviso encontro un pokemon
                   if(invisibles==false) {
						
                	   if(quitarAnuncio==true) {
                    	   batalla.anuncio();
                       }
			
						 
					}
                   
                   
                  
                   
					
					break;
					
					//Perfiles pokemons con gifs 
				case 3:
					switch(pPokedex) {
					case 0:
						app.image(pantallaTecla,0,0);
						app.image(continuarBoton2,253,328);
						
						
						if( (app.mouseX>253 && app.mouseX<466)&& (app.mouseY>328 && app.mouseY<374)){
						app.image(continuarBoton2N,253,328);
						}
						
						break;
						
					case 1: 
						app.image(fondoRosado,0,0);
						app.image(pokedexVolver,0,0);
						app.image(ordenarPor,0,64);
						app.text("X:" + app.mouseX + "Y:" + app.mouseY, app.mouseX, app.mouseY);
						
						//Pintamos las barras del pefil de cada pokemon
						ordenarPokemones.pintar();
						
						
						poke.comenzar();
						
						//Botones ordenamiento
						if(botones==true) {
						app.image(bOrdenarN,81,353);
						app.image(bOrdenarT,460,353);
						
						if( (app.mouseX>81 && app.mouseX<295)&& (app.mouseY>353 && app.mouseY<397)){
							app.image(bOrdenarNN,81,353);
							
							
						}
							
						if( (app.mouseX>460 && app.mouseX<673)&& (app.mouseY>353 && app.mouseY<397)){
							app.image(bOrdenarTN,460,353);
							}
						
						}
						
			    		 //Excepcion2 
       				 
       				 try {
       					 
       					 yaNoMas();
       				 }	catch(FirstException e) {
       					 app.fill(255);
       					 app.textSize(20);
       			         app.text (e.getMessage(),213,64);
       			       
       					}
       				 
			    		 //Excepcion2 
       				 
       				 try {
       					 
       					 yaNoMas2();
       				 }	catch(FirstException e) {
       					 app.fill(255);
       					 app.textSize(20);
       			         app.text (e.getMessage(),213,64);
       			       
       					}
						
						
						break;
					}
				
					break;
					
					
				case 4:
					app.image(fondoRosado,0,0);
					app.image(usuariosVolver,0,0);
					app.image(ordenarPor,0,64);
					app.image(ordenFecha,450,64);
					break;
					
				// Inventario 
					
				case 5:
					app.image(fondoRosado,0,0);
					app.image(inventarioVolver,0,0);
					
                    batalla.pintarInvertario();
                    

					break;
				
			//BATALLA
				case 6:

					app.image(fondo, 0, 0);
					batalla.pintarVidas();
                    batalla.pintarSeleccionado();
                    PokemonCapturado();
                    
                    if (botonInvisible == false) {
                    	
                        batalla.comienza(boton1);

                    }
       
                    
					 switch(modo) {
					 
					 case 0:	 try {
    					 
    					 yaNoMasPelea();
    				 }	catch(FirstException e) {
    					 app.fill(255);
    					 app.textSize(20);
    			         app.text (e.getMessage(),248,64);
    			       
    					}
            	
			
                   break;
                    
                    case 1:
                    	app.fill(255);
                    	app.textSize(20);
                    	app.text("Deja todo a la suerte, presiona el boton para atrapar",68,300);
                    	app.image(atrapar,92,335);
                    	app.image(bVolverMapa,378,335);
                    	quitarAnuncio=false;
                		 //Excepcion 
        				 
            				 try {
            					 
            					 stopTodo();
            				 }	catch(FirstException e) {
            					 app.fill(255);
            					 app.textSize(20);
            			         app.text (e.getMessage(),248,64);
            			       
            					}
                    	
                    	break;
                    	
                    case 2:
                    	
                    	break;
                    	
                    case 3:
            
                    	
                    	break;
                    }

					
					break;
					
					
					//pantalla usuario
				   case 7:
					   app.image(fondoRosado,0,0);
					   app.image(barraUsuario,0,0);
					   app.image(bOrdenarN,81,353);
					   app.image(bOrdenarF,460,353);
					   if( (app.mouseX>81 && app.mouseX<295)&& (app.mouseY>353 && app.mouseY<397)){
							app.image(bOrdenarNN,81,353);
						}
							
						if( (app.mouseX>460 && app.mouseX<673)&& (app.mouseY>353 && app.mouseY<397)){
							app.image(bOrdenarFN,460,353);
							}
					   
					 //pintamos las barras con la info de los usuarios
					   for(int i=0; i<listUsuarios.size(); i++) {
							listUsuarios.get(i).pintarUser((24 * i)+ 100);
						}
					   
					break;
		
	 }
		app.fill(255);
		app.text("X:" + app.mouseX + "Y:" + app.mouseY, app.mouseX, app.mouseY);

	}
	
	
	public void mouse() {
		
		switch(pantalla) {

		
			case 1:
						
			//Escoge la jirafa
			if( (app.mouseX>120 && app.mouseX<250)&& (app.mouseY>298 && app.mouseY<328)){
				pantalla = 2;
				seleccion = 0;
				
				
			}
			//Escoge la emolga
			if( (app.mouseX>286 && app.mouseX<417)&& (app.mouseY>298 && app.mouseY<328)){
				pantalla = 2;
				seleccion = 1;
			}
			//Escoge la bayleef
			if( (app.mouseX>453 && app.mouseX<583)&& (app.mouseY>298 && app.mouseY<328)){
				pantalla = 2;
				seleccion = 2;
			}
			
			batalla.Selecciono(seleccion);
			
			
			//System.out.print();


			break;
		case 2:
			if( (app.mouseX>20 && app.mouseX<20+70)&& (app.mouseY>345 && app.mouseY<345+54)){
				pantalla = 3;
			}
			if( (app.mouseX>120 && app.mouseX<120+70)&& (app.mouseY>345 && app.mouseY<345+54)){
				pantalla = 5;
			}
			
			//pasa a la pantalla de batalla
			if(invisibles==false) {
				if( (app.mouseX>253 && app.mouseX<466)&& (app.mouseY>285 && app.mouseY<331)){
					pantalla = 6;
				} 	
			}
			
			//pasa a la pantalla de usuarios
			 if( (app.mouseX>630 && app.mouseX<673)&& (app.mouseY>10 && app.mouseY<53)){
				  pantalla=7; 
			  }
			 
	
			break;
		case 3:
			switch(pPokedex) {
			
			case 0: 
				if( (app.mouseX>253 && app.mouseX<466)&& (app.mouseY>328 && app.mouseY<374)){
					pPokedex=1;	
				}
				if( (app.mouseX>0 && app.mouseX<81) && (app.mouseY>0 && app.mouseY<64)){
					pantalla = 2;
					botones=true;
				}
				
				break;
			case 1:
				if( (app.mouseX>0 && app.mouseX<81) && (app.mouseY>0 && app.mouseY<64)){
					pantalla = 2;
					poke.eliminar();
					botones=true;
				}
				
				//ordenamiento natural-nombres
				if( (app.mouseX>81 && app.mouseX<295)&& (app.mouseY>353 && app.mouseY<397)){
					ordena=1;
					vecesO+=1;
				}
				//ordenamiento parcial-tipo
				if( (app.mouseX>460 && app.mouseX<673)&& (app.mouseY>353 && app.mouseY<397)){
					ordena=2;
					vecesO2=+1;
				}
				
				
		
				//ordenamiento de los natural de los nombres
				ordenarPokemones.comparar(ordena);
				
				break;
			}
			
		
			break;
		case 4:
			
			break;
		case 5:
			if( (app.mouseX>0) && (app.mouseY>0 && app.mouseY<64)){
				pantalla = 2;
			}
			break;
			
		case 6:
				if(boton1 ==0) {
				
				batalla.Capturaste(capturado);
				System.out.print("AgregoOtro");
				boton1 = 1;
				
			}
			
			switch(modo) {
			
			case 0:
				
				
				//Atacar
				if( (app.mouseX>320 && app.mouseX<406)&& (app.mouseY>337 && app.mouseY<359)){
					System.out.print("Atacar");
					modo =2;
					botonInvisible = true;
				}
				
				//Huir
	            if( (app.mouseX>418 && app.mouseX<475)&& (app.mouseY>334 && app.mouseY<357)){
					System.out.print("Huir");
					
					pantalla =2;

					
				}
	            
	            
	            //Atrapar
	            if( (app.mouseX>330 && app.mouseX<415)&& (app.mouseY>369 && app.mouseY<382)){
					System.out.print("Atrapar");
					botonInvisible = true;
					modo =1;
					
				
	            }
				
				break;
				
			case 1:
				
				//Elimine el continuar y salgan botones de salida y ir al mapa 
				if(veces<1) {
					batalla.atrapar();
				}
				
				if( (app.mouseX>90 && app.mouseX<304)&& (app.mouseY>338 && app.mouseY<380)){
					veces+=1;
				}
				
					if( (app.mouseX>377 && app.mouseX<591)&& (app.mouseY>336 && app.mouseY<382)){
						pantalla=2;
						
						mover=true;
					}
				
				break;
				
			
			case 2:
				
				batalla.atacar(seleccion);
				if( (app.mouseX>66 && app.mouseX<279)&& (app.mouseY>335 && app.mouseY<382)){
					pantalla=2;
				}
				if( (app.mouseX>378 && app.mouseX<591)&& (app.mouseY>335 && app.mouseY<382)){
					pantalla=2;
				}
				
				
				
				break;
				
			
		
			}
			break;
			
			//Pantalla usuario 
			case 7: 
				if( (app.mouseX>0 && app.mouseX<56) && (app.mouseY>0 && app.mouseY<64)){
				pantalla = 2;
			}
				
				//Ordenamiento natural por los nombres de los usuarios
				if( (app.mouseX>81 && app.mouseX<295)&& (app.mouseY>353 && app.mouseY<397)){
				Collections.sort(listUsuarios);
				}
				//Ordenamiento parcial por la fecha
				if( (app.mouseX>460 && app.mouseX<673)&& (app.mouseY>353 && app.mouseY<397)){
				Collections.sort(listUsuarios,fechaComparator);
				}
				break;
			
		}
		
		
	}
	
	
	public void recorrerMatriz() {
		//Camina el mu�ecos
		posYM = y / 70;
	    posXM = x / 70;
		
	    
	    if(mover==true) {
		  if (app.keyCode == app.LEFT) {
		    	if(posXM>0) {
		        if (posXM -1 < 50 && map[posYM][posXM - 1] == 0 || map[posYM][posXM - 1] == 3 || map[posYM][posXM - 1] == 4 || map[posYM][posXM - 1] == 5 || map[posYM][posXM - 1] == 7 || map[posYM][posXM - 1] == 6) {
		            x -= 70;
		            JM = 1;
		        }
		    }}

		    if (app.keyCode == app.RIGHT) {

		    	if(posXM<10) {
		        if (posXM + 1 < 50 && map[posYM][posXM + 1] == 0 || map[posYM][posXM + 1] == 3 || map[posYM][posXM + 1] == 4 || map[posYM][posXM + 1] == 5 || map[posYM][posXM + 1] == 7 || map[posYM][posXM + 1] == 6) {
		            x += 70;
		            JM = 2;
		        }
		    	}
		    }


		    if (app.keyCode == app.UP) {

		    	if(posYM>0) {
		        if (posYM - 1 < 11 && map[posYM - 1][posXM] == 0 || map[posYM - 1][posXM] == 3|| map[posYM - 1][posXM] == 4 ||map[posYM - 1][posXM] == 5 || map[posYM - 1][posXM] == 7 || map[posYM - 1][posXM] == 6) {
		            y -= 70;
		            JM = 3;
		        }
		    }
		    }

		    if (app.keyCode == app.DOWN) {
				  

		    	if(posYM<4) {
		        if (posYM + 1 < 11 && map[posYM + 1][posXM] == 0 || map[posYM + 1][posXM] == 3|| map[posYM + 1][posXM] == 4 || map[posYM + 1][posXM] == 5 || map[posYM + 1][posXM] == 7 || map[posYM + 1][posXM] == 6) {
		           
		        	y += 70;
		            JM = 4;
		        }
		    	}

		    }
	    }
	}
	
	public void dibujarBebe() {
	    switch (JM) {
	        case 1:
	            app.image(jI,x, y, 50, 70);
	            break;
	        case 2:
	            app.image(jD, x , y, 50, 70);
	            break;
	        case 3:
	            app.image(jA, x,y, 63, 70);
	            break;
	        case 4:
	            app.image(jF, x, y, 63, 70);
	    }


	}
	
	
//Cargamos los pokemones que van en el mapa
	
public void cargarPokemones() {
	
	int pokemon1 = (int) app.random(1,4);

		for (int matY = 0; matY < 5; matY++) {
	        for (int matX = 0; matX < 11; matX++) {
	        	
	        	posXMA= matX*70;
	        	posYMA = matY*70;
	        	
	        	
	        	switch((int)pokemon1) {
	        	
	        	case 1:
	        		
	        		if (map[matY][matX] == 3) {
	        		
	        		listPokemons.add(new Shaymin(posXMA,posYMA,"mori",poderValor,vida,"cambia",app));    
		        	  System.out.print("entre");
		        	  
	        		}
	        		
	        		if (map[matY][matX] == 4) {
	        			
				        listPokemons.add(new Bulbasaur(posXMA,posYMA,pokemon,poderValor,vida,tipo,app));    

		        		}
	        		
	        		if ( map[matY][matX] == 5) {
			        	  
			        	  listPokemons.add(new Luxray(posXMA,posYMA,pokemon,poderValor,vida,tipo,app));    
		            }
	        		
	        		if ( map[matY][matX] == 6) {
			        	 
			        	  listPokemons.add(new Pikachu(posXMA,posYMA,pokemon,poderValor,vida,tipo,app));    
		            }
	        		
	        		break;
	        		
	        	case 2:
	        		
	        		if (map[matY][matX] == 3) {
			         listPokemons.add(new Gothorita(posXMA,posYMA,"mori",poderValor,vida,"cambia",app));    

	        		}
	        		
	        		if (map[matY][matX] == 4) {
	        			
                   	 listPokemons.add(new Luxray(posXMA,posYMA,pokemon,poderValor,vida,tipo,app));
	        		}
	        		
			         if (map[matY][matX] == 5) {
				        	
			        	  listPokemons.add(new Manectric(posXMA,posYMA,pokemon,poderValor,vida,tipo,app));    
		            }
			         
			         if (map[matY][matX] == 6) {
			        	 
			        	  listPokemons.add(new MegaGardevoir(posXMA,posYMA,pokemon,poderValor,vida,tipo,app));    
		            
		        	
		        	}
	        		
	        		break;
	        		
	        	case 3:
	        		if (map[matY][matX] == 3) {
			         listPokemons.add(new MegaGardevoir(posXMA,posYMA,"mori",poderValor,vida,"cambia",app));    
	        		}
	        		
	        		 if (map[matY][matX] == 4) {
		        			
	                    	listPokemons.add(new Pikachu(posXMA,posYMA,pokemon,poderValor,vida,tipo,app));
		        	}
	        		 
	        		 if ( map[matY][matX] == 5) {
			        	 
			        	  listPokemons.add(new Gothorita(posXMA,posYMA,pokemon,poderValor,vida,tipo,app));    
		            }
	        	
			          if ( map[matY][matX] == 6) {
			        	  
			        	  listPokemons.add(new Bulbasaur(posXMA,posYMA,pokemon,poderValor,vida,tipo,app));    
		            }
	        		
	        		break;
	       		
	        	}
	             }
		   }
		
		          
		         
		coco = pokemon1;

		System.out.print(pokemon1);
		System.out.print(coco);
		
		}




//Con este metodo controlas la visualizacion del perfil de cada pokemon
public void perfiles() {
	
	switch(pPokedex) {
	case 1:
		mover=true;
	if(pantalla == 3) {
		
		if(app.key== 'e' || app.key== 'E') {
			cambio =1;
			botones=false;
		}
		if(app.key== 's' || app.key== 'S') {
			cambio =2;
			botones=false;
		}
		if(app.key== 'b' || app.key== 'B') {
			cambio =3;
			botones=false;
		}
		if(app.key== 'i' || app.key== 'I') {
			cambio =4;
			botones=false;
		}
		if(app.key== 'g' || app.key== 'G') {
			cambio =5;
			botones=false;
		}
		if(app.key== 'm' || app.key== 'M') {
			cambio =6;
			botones=false;
		}
		if(app.key== 'c' || app.key== 'C') {
			cambio =7;
			botones=false;
		}
		if(app.key== 'l' || app.key== 'L') {
			cambio =8;
			botones=false;
		}
		if(app.key== 'a' || app.key== 'A') {
			cambio =9;
			botones=false;
		}
		if(app.key== 'p' || app.key== 'P') {
			cambio =10;
			botones=false;
		}
		
		}
	
	poke.pintar(cambio);
	break;
	}

}


public void PokemonCapturado() {
	
	mover=false;
        	
	
	if(coco==1 && map[posYM][posXM] == 3) {
		
		capturado = 1;
		
		
		
	}  if(coco==2 && map[posYM][posXM] == 3) {
		
		capturado = 5;

		
	} if(coco==3 && map[posYM][posXM] == 3) {
		
		capturado = 9;
		

	} if(coco==1 && map[posYM][posXM] == 4) {
		
		capturado = 2;

		
	}if(coco==2 && map[posYM][posXM] == 4) {
		
		capturado = 6;

		
	} if(coco==3 && map[posYM][posXM] == 4) {
		
		capturado = 10;

		
	}   if(coco==2 && map[posYM][posXM] == 5) {
		
		capturado = 7;

		
	} if(coco==1 && map[posYM][posXM] == 5) {
		
		capturado = 3;

		
	} if(coco==3 && map[posYM][posXM] == 5) {
		
		capturado = 11;

		
	} if(coco==1 && map[posYM][posXM] == 6) {
		
		capturado = 4;
	
	}  if(coco==2 && map[posYM][posXM] == 6) {
		
		capturado = 8;

		
	}  if(coco==3 && map[posYM][posXM] == 6) {
		
		capturado = 12;

		
	}
	 

	
}


//Excepciones
public void stopTodo() throws FirstException {
	 
	 if(veces>=2) {
		 throw new FirstException("Debes volver al mapa");
	 }
	 
}

public void yaNoMas () throws FirstException {
	 
	 if(vecesO>=2) {
		 throw new FirstException("Ya estan ordenados por nombre");
	 }
	 
}

public void yaNoMas2 () throws FirstException {
	 
	 if(vecesO2>=2) {
		 throw new FirstException("Ya estan ordenados por Tipo");
	 }
	 
}

public void yaNoMasPelea() throws FirstException {
	 
	
		 throw new FirstException("Ya estan ordenados por Tipo");
	 
	 
}




	public void cargarImagenes() {
		jI = app.loadImage("img/personaje lado2.png");
	    jD = app.loadImage("img/personaje lado1.png");
	    jF = app.loadImage("img/personaje frente.png");
	    jA = app.loadImage("img/personaje espalda.png");
		fondoInicio=app.loadImage("img/fondoInicio.png");
		arbol=app.loadImage("img/arbolPequeno.png");
		fondoNada=app.loadImage("img/fondoNada.png");
		continuarBoton=app.loadImage("img/continuarBoton.png");
		continuarBoton2=app.loadImage("img/continuarBotonN.png");
		continuarBoton2N=app.loadImage("img/continuarBoton.png");
		continuarBotonN=app.loadImage("img/continuarBotonN.png");
		
		
		pokemonEleccion=app.loadImage("img/PokemonEleccion.png");
		selec1=app.loadImage("img/seleccionarBotonN.png");
		selec2=app.loadImage("img/seleccionarBotonN.png");
		selec3=app.loadImage("img/seleccionarBotonN.png");
		mapa=app.loadImage("img/Mapa.png");
		pokedexIcono=app.loadImage("img/pokedex.png");
		pokedexVolver=app.loadImage("img/pokedexVolver.png");
		inventarioVolver=app.loadImage("img/inventarioVolver.png");
		usuariosVolver=app.loadImage("img/usuariosVolver.png");
		ordenarPor=app.loadImage("img/ordenarPor.png");	
		ordenFecha=app.loadImage("img/ordenFecha.png");
		fondoRosado=app.loadImage("img/Rosado.png");
		inventarioIcono=app.loadImage("img/inventario.png");
		pantallaTecla=app.loadImage("img/pantallaTecla.png");
		bOrdenarN=app.loadImage("img/ordenarPorNombreN.png");
		bOrdenarT=app.loadImage("img/ordenarPorTipoN.png");
		bOrdenarNN=app.loadImage("img/ordenarPorNombre.png");
		bOrdenarTN=app.loadImage("img/ordenarPorTipo.png");
		bOrdenarF=app.loadImage("img/ordenarFechaN.png");
		bOrdenarFN=app.loadImage("img/ordenarFecha.png");
		fondo = app.loadImage("img/fondoBatalla.png");
		usuarioIcono = app.loadImage("img/botonUsuario.png");
		usuarioIconoN = app.loadImage("img/botonUsuarioN.png");
		barraUsuario= app.loadImage("img/barraUsuario.png");
		bVolverMapa= app.loadImage("img/volverAlMapa.png");
	    atrapar= app.loadImage("img/atacar.png");
	}

}