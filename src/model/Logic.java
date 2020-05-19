package model;

import gifAnimation.Gif;
import processing.core.PApplet;
import processing.core.PImage;

public class Logic {
	PApplet app;
	String pokemones[];
	String pokemones2[];
	String pokemon;
	int pantalla;
	
	//llamar la función Gif y nombrarla 
	Gif prueba;
	
	//imagenes fondo y botones
	PImage fondoInicio, fondoNada, continuarBoton, continuarBotonN,registrarseBoton,registrarseBotonN, usuarioBoton,usuarioBotonN,pokemonEleccion;
	PImage selec1,selec2,selec3;
	
	
	public Logic(PApplet app) {
		
		this.app=app;
		pantalla=0;
		pokemones = app.loadStrings("lib/info_pokemones.txt");
		/* llamar la variable y indicarle que haga un nuevo objeto y este debe
		recibir como parametro el nombre de la carpeta donde se encuentra el gif y el nombre de la imagen.*/
		
		prueba= new Gif(app,"gif/Girafarig.gif");
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
		prueba.loop();
		for(int i = 0; i < pokemones.length ; i++) {
			pokemones2 = pokemones[i].split(",");
			pokemon = pokemones2[2];
			System.out.print(pokemon);
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
		
			}
			//Escoge la emolga
			if( (app.mouseX>286 && app.mouseX<417)&& (app.mouseY>298 && app.mouseY<328)){
		
			}
			//Escoge la bayleef
			if( (app.mouseX>453 && app.mouseX<583)&& (app.mouseY>298 && app.mouseY<328)){
				
			}
		}
		
		
	}

}
