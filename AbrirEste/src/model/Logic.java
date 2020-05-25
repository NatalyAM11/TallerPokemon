package model;

import java.util.Collections;
import java.util.LinkedList;

import processing.core.PApplet;
import processing.core.PImage;

public class Logic {
	PApplet app;
	
	LinkedList<Pokemons> listPokemons;
    String pokemones[];
	String pokemones2[];
	
	
	//Matriz del mapa
	private int map [][]=  
	       {{0, 0, 0, 0, 0, 4, 0, 0, 0, 2, 2},
		    {0,	0, 0, 0, 0, 1, 2, 0, 0, 0, 2},
		    {0, 0, 0, 2, 2, 0, 6, 0, 0, 0, 2},
		    {0, 2, 0, 5, 0, 0, 0, 0, 0, 0, 2},
		    {3, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2},
		    
	       };
	
	//Personaje
	Personaje bb;
	
	int caras =0;
	
	PImage pJue,jI,jD,jF,jA,jIF,jDF,jFF,jAF;
	int posYM,posXM;
	int posYMA,posXMA;
	int x, y;
	int JM,screenCambio;
	int coco;
	Batalla batalla;
	
	
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
	
	
	//Inicialziamos la pokedex
	Pokedex poke;
	
	int cambio = 0;
	int ordena;
	boolean botones=true;
	
	//pantallas y mapas
	int pantalla,mapaX,mapaY;
	
	//imagenes fondo y botones
	PImage arbol,inventarioIcono,fondoRosado,pokedexVolver,inventarioVolver,usuariosVolver,ordenarPor,ordenNombre,ordenFecha,ordenTipo,pokedexIcono,fondoInicio, fondoNada, continuarBoton, continuarBotonN,registrarseBoton,registrarseBotonN, usuarioBoton,usuarioBotonN,pokemonEleccion,mapa;
	PImage selec1,selec2,selec3;
	
	//Inicializamos la clase que carga las barras de los perfiles
	OrdenarPokemones ordenarPokemones;
	
	
	public Logic(PApplet app) {
		
		this.app=app;
		pantalla=0;
		pokemones = app.loadStrings("lib/info_pokemones.txt");
		
		listPokemons = new LinkedList <Pokemons>();
		poke = new Pokedex(app);
		batalla = new Batalla (app);
		ordenarPokemones= new OrdenarPokemones(app);
		cargarImagenes();
        cargarPokemones();
        


		
		
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
	  
	  //con esto los grupos de pokemones seran aleatorios
	  //System.out.print(pokemon1);
	  //Partimos el txt
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
	}
	
	public void iniciar(){
			
		

		
	}
	
	public void pintar() {
		
		//pokemon1= (int) app.random(1,4);


		
		switch(pantalla) {
		


			case 0:
				//Imagenes
				app.image(fondoInicio,0,0);
				app.image(registrarseBoton,253,227);
				app.image(continuarBoton,253,285);
				app.image(usuarioBoton,253,344);
		
				//usar la funcion image para cargar el gif
				//app.image(prueba,0,0);
				
				
				//botones 
				
				if( (app.mouseX>253 && app.mouseX<466)&& (app.mouseY>227 && app.mouseY<272)){
				app.image(registrarseBotonN,253,227);
				} 
				if( (app.mouseX>253 && app.mouseX<466)&& (app.mouseY>285 && app.mouseY<331)){
					app.image(continuarBotonN,253,285);
				} 
				if( (app.mouseX>253 && app.mouseX<466)&& (app.mouseY>344 && app.mouseY<389)){
					app.image(usuarioBotonN,253,344);
				} 
				

				
				app.fill(0);
				break;
		
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
		
					//Los arboles si aparecen paula :( holi 
					for (int matY = 0; matY < 5; matY++) {
				        for (int matX = 0; matX < 11; matX++) {
				    
				          if (map[matY][matX] == 2) {
				            	  posYMA = matY*70;
					              posXMA = matX*70;
				            	app.image(arbol,posXMA,posYMA);     
				            }
				        }
				        }
					
					
					
					
					//invisibilidad
					if (map[posYM][posXM]==3 ||map[posYM][posXM]==4 ||map[posYM][posXM]==5 ||map[posYM][posXM]==6) {
						invisibles=false;
					}
					
				
                   for(int i = 0; i<listPokemons.size(); i++) {
						
                	   if(invisibles==false) {
						listPokemons.get(i).pintarPMapa();
                	   }
						
					}
                   
                   if(invisibles==false) {
						
						batalla.anuncio();

					}
                   
					
					break;
					
					//Perfiles pokemons con gifs 
				case 3:
					
					app.image(fondoRosado,0,0);
					app.image(pokedexVolver,0,0);
					app.image(ordenarPor,0,64);
					app.text("X:" + app.mouseX + "Y:" + app.mouseY, app.mouseX, app.mouseY);
					
					//Pintamos las barras del pefil de cada pokemon
					ordenarPokemones.pintar();
					
					
					poke.comenzar();
					
					//Botones ordenamiento
					if(botones==true) {
					app.image(selec3,81,353);
					app.image(selec2,460,353);
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
					
                    batalla.pintarSeleccionado();
                    

					break;
				
			//BATALLA
				case 6:

					batalla.Capturaste(capturado);
					batalla.comienza();
                    batalla.pintarSeleccionado();
                    PokemonCapturado();

					
					break;
		
	}
		app.fill(255);
		app.text("X:" + app.mouseX + "Y:" + app.mouseY, app.mouseX, app.mouseY);

	}
	
	
	public void mouse() {
		
		switch(pantalla) {

		case 0: 
		
		if( (app.mouseX>253 && app.mouseX<466)&& (app.mouseY>344 && app.mouseY<389)){
			pantalla=1;
		}
		
		break;
		
		
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
			
			if(invisibles==false) {
				if( (app.mouseX>291 && app.mouseX<291+70)&& (app.mouseY>300 && app.mouseY<300+54)){
					
					pantalla = 6;
				}
			}
			break;
		case 3:
			
			
			if( (app.mouseX>0) && (app.mouseY>0 && app.mouseY<64)){
				pantalla = 2;
			}
			
			//ordenamiento natural-nombres
			if( (app.mouseX>81 && app.mouseX<208)&& (app.mouseY>353 && app.mouseY<384)){
				ordena=1;
			}
			//ordenamiento parcial-tipo
			if( (app.mouseX>460 && app.mouseX<589)&& (app.mouseY>353 && app.mouseY<384)){
				ordena=2;
			}
			
			
			app.image(selec3,81,353);
			app.image(selec2,460,353);
			//ordenamiento de los natural de los nombres
			ordenarPokemones.comparar(ordena);
			
			
			break;
		case 4:
			
			break;
		case 5:
			if( (app.mouseX>0) && (app.mouseY>0 && app.mouseY<64)){
				pantalla = 2;
			}
			break;
			
		}
		
		
	}
	
	
	public void recorrerMatriz() {
		//Camina el mu�ecos
		posYM = y / 70;
	    posXM = x / 70;
		
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
	
	botones=false;
	
	if(pantalla == 3) {
		
		if(app.key== 'e' || app.key== 'E') {
			cambio =1;
		}
		if(app.key== 's' || app.key== 'S') {
			cambio =2;
		}
		if(app.key== 'b' || app.key== 'B') {
			cambio =3;
		}
		if(app.key== 'i' || app.key== 'I') {
			cambio =4;
		}
		if(app.key== 'g' || app.key== 'G') {
			cambio =5;
		}
		if(app.key== 'm' || app.key== 'M') {
			cambio =6;
		}
		if(app.key== 'c' || app.key== 'C') {
			cambio =7;
		}
		if(app.key== 'l' || app.key== 'L') {
			cambio =8;
		}
		if(app.key== 'a' || app.key== 'A') {
			cambio =9;
		}
		if(app.key== 'p' || app.key== 'P') {
			cambio =10;
		}
		
		poke.pintar(cambio);

		
	}
		
	
}


public void PokemonCapturado() {
	
	
        	
	
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


	public void cargarImagenes() {
		jI = app.loadImage("img/personaje lado2.png");
	    jD = app.loadImage("img/personaje lado1.png");
	    jF = app.loadImage("img/personaje frente.png");
	    jA = app.loadImage("img/personaje espalda.png");
		fondoInicio=app.loadImage("img/fondoInicio.png");
		arbol=app.loadImage("img/arbolPequeno.png");
		fondoNada=app.loadImage("img/fondoNada.png");
		continuarBoton=app.loadImage("img/continuarBoton.png");
		continuarBotonN=app.loadImage("img/continuarBotonN.png");
		registrarseBoton=app.loadImage("img/registrarseBoton.png");
		registrarseBotonN=app.loadImage("img/registrarseBotonN.png");
		usuarioBoton=app.loadImage("img/usuario.png");
		usuarioBotonN=app.loadImage("img/usuarioN.png");
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
	
		
	}

}