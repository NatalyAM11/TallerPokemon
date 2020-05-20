package model;

import java.util.LinkedList;

import gifAnimation.Gif;
import processing.core.PApplet;
import processing.core.PImage;

public class Logic {
	PApplet app;
	String pokemones[];
	String pokemones2[];
	
	private int map [][]=  
	       {{2, 0, 0, 0, 0, 2, 1, 1, 0, 0, 1},
		    {0, 0, 1, 0, 0, 1, 0, 0, 0, 2, 0},
		    {0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0},
		    {0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0},
		    {0, 2, 1, 0, 0, 1, 2, 4, 0, 0, 0},
		    
	       };
	
	Personaje bb;
	
	int caras =0;
	
	PImage pJue,jI,jD,jF,jA,jIF,jDF,jFF,jAF;
	int posYM,posXM;
	int x, y;
	int JM,screenCambio;

	
	//Todas las variables de los pokemones
	String pokemon;
	String tipo;
	int poderValor;
	String poder;
	String debilidad;
	int vida;
	
	//pantallas y mapas
	int pantalla,mapaX,mapaY;
	
	//imagenes fondo y botones
	PImage bayleefPerfil,pikachuPerfil,girafarigPerfil,gothoritaPerfil,shayminPerfil,emolgaPerfil,megaGardevoirPerfil,bulbasaurPerfil,manectricPerfil,luxrayPerfil,inventarioIcono,fondoRosado,pokedexVolver,inventarioVolver,usuariosVolver,ordenarPor,ordenNombre,ordenFecha,ordenTipo,pokedexIcono,fondoInicio, fondoNada, continuarBoton, continuarBotonN,registrarseBoton,registrarseBotonN, usuarioBoton,usuarioBotonN,pokemonEleccion,mapa;
	PImage selec1,selec2,selec3;
	
	
	public Logic(PApplet app) {
		
		this.app=app;
		pantalla=0;
		pokemones = app.loadStrings("lib/info_pokemones.txt");
		
		
		cargarImagenes();
		mapaX = -200;
		mapaY = -100;
		

		for (int matY = 0; matY < 5; matY++) {
	        for (int matX = 0; matX < 11; matX++) {
	            if (map[matY][matX] == 1) {
	                posYM = matY;
	                posXM = matX;
	                app.fill(255);
	                
	            }
	        }
	    }
	  

	  bb = new Personaje(x,y);
	  JM = 1;
		
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

			
			System.out.print(tipo);
		}
	}
	
	public void pintar() {
		
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
				app.text("X:" + app.mouseX + "Y:" + app.mouseY, app.mouseX, app.mouseY);
				break;
		
				case 1:
					//pantalla
					app.image(pokemonEleccion,0,0);
					
					
					app.fill(0);
					app.text("X:" + app.mouseX + "Y:" + app.mouseY, app.mouseX, app.mouseY);
					
					
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
					app.image(mapa,mapaX,mapaY);
					app.image(pokedexIcono,20,310,70,54);
					app.image(inventarioIcono,20,230);
					
					dibujarBebe();
					
					break;
				case 3:
					app.image(fondoRosado,0,0);
					app.image(pokedexVolver,0,0);
					app.image(ordenarPor,0,64);
					app.image(ordenNombre,230,64);
					app.image(ordenTipo,450,64);
					break;
				case 4:
					app.image(fondoRosado,0,0);
					app.image(usuariosVolver,0,0);
					app.image(ordenarPor,0,64);
					app.image(ordenNombre,230,64);
					app.image(ordenFecha,450,64);
					break;
				case 5:
					app.image(fondoRosado,0,0);
					app.image(inventarioVolver,0,0);
					break;
		
	}
	}
	
	
	public void mouse() {
		
		switch(pantalla) {

		case 0: 
		
		if( (app.mouseX>253 && app.mouseX<466)&& (app.mouseY>344 && app.mouseY<389)){
			pantalla=1;
			System.out.println("putostodos");
		}
		
		break;
		
		
		case 1:
						
			//Escoge la jirafa
			if( (app.mouseX>120 && app.mouseX<250)&& (app.mouseY>298 && app.mouseY<328)){
				pantalla = 2;
			}
			//Escoge la emolga
			if( (app.mouseX>286 && app.mouseX<417)&& (app.mouseY>298 && app.mouseY<328)){
				pantalla = 2;
			}
			//Escoge la bayleef
			if( (app.mouseX>453 && app.mouseX<583)&& (app.mouseY>298 && app.mouseY<328)){
				pantalla = 2;
			}
			break;
		case 2:
			if( (app.mouseX>20 && app.mouseX<20+70)&& (app.mouseY>310 && app.mouseY<310+54)){
				pantalla = 3;
			}
			if( (app.mouseX>20 && app.mouseX<20+70)&& (app.mouseY>230 && app.mouseY<230+54)){
				pantalla = 5;
			}
			break;
		case 3:
			if( (app.mouseX>0) && (app.mouseY>0 && app.mouseY<64)){
				pantalla = 2;
			}
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
		
		posYM = y / 70;
	    posXM = x / 70;
		
		  if (app.keyCode == app.LEFT) {
		    	if(posXM>0) {
		        if (posXM -1 < 50 && map[posYM][posXM - 1] == 0 || map[posYM][posXM - 1] == 4 || map[posYM][posXM - 1] == 5 || map[posYM][posXM - 1] == 7 || map[posYM][posXM - 1] == 6) {
		            x -= 70;
		            JM = 1;
		        }
		    }}

		    if (app.keyCode == app.RIGHT) {

		    	if(posXM<4) {
		        if (posXM + 1 < 50 && map[posYM][posXM + 1] == 0 || map[posYM][posXM + 1] == 4 || map[posYM][posXM + 1] == 5 || map[posYM][posXM + 1] == 7 || map[posYM][posXM + 1] == 6) {
		            x += 70;
		            JM = 2;
		        }
		    	}
		    }


		    if (app.keyCode == app.UP) {

		    	if(posYM>0) {
		        if (posYM - 1 < 11 && map[posYM - 1][posXM] == 0 || map[posYM - 1][posXM] == 4 ||map[posYM - 1][posXM] == 5 || map[posYM - 1][posXM] == 7 || map[posYM - 1][posXM] == 6) {
		            y -= 70;
		            JM = 3;
		        }
		    }
		    }

		    if (app.keyCode == app.DOWN) {
				  

		    	if(posYM<4) {
		        if (posYM + 1 < 11 && map[posYM + 1][posXM] == 0 || map[posYM + 1][posXM] == 4 || map[posYM + 1][posXM] == 5 || map[posYM + 1][posXM] == 7 || map[posYM + 1][posXM] == 6) {
		           
		        	System.out.print("entre1");
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
	
	public void cargarImagenes() {
		jI = app.loadImage("img/personaje lado2.png");
	    jD = app.loadImage("img/personaje lado1.png");
	    jF = app.loadImage("img/personaje frente.png");
	    jA = app.loadImage("img/personaje espalda.png");
		fondoInicio=app.loadImage("img/fondoInicio.png");
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
		ordenNombre=app.loadImage("img/ordenNombre.png");
		ordenFecha=app.loadImage("img/ordenFecha.png");
		ordenTipo=app.loadImage("img/ordenTipo.png");
		fondoRosado=app.loadImage("img/Rosado.png");
		inventarioIcono=app.loadImage("img/inventario.png");
		bayleefPerfil=app.loadImage("img/bayleefPerfil.png");
		emolgaPerfil=app.loadImage("img/emolgaPerfil.png");
		pikachuPerfil=app.loadImage("img/pikachuPerfil.png");
		bulbasaurPerfil=app.loadImage("img/bulbasaurPerfil.png");
		girafarigPerfil=app.loadImage("img/girafarigPerfil.png");
		gothoritaPerfil=app.loadImage("img/gothoritaPerfil.png");
		manectricPerfil=app.loadImage("img/manectricPerfil.png");
		megaGardevoirPerfil=app.loadImage("img/megaGardevoirPerfil.png");
		shayminPerfil=app.loadImage("img/shayminPerfil.png");
		luxrayPerfil=app.loadImage("img/luxrayPerfil.png");
		
		
	}

}