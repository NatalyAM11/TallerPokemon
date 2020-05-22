package model;

import gifAnimation.Gif;
import processing.core.PApplet;
import processing.core.PImage;

public class Luxray extends Pokemons {
	
	PImage luxrayAtaque,luxrayDebil, luxrayFrente, luxrayPerfil, luxrayMapa;
	Gif luxrayGif;

	public Luxray(int posX, int posY, String nombre, int poder, int vida, String tipo,PApplet app) {
		super(posX, posY, nombre, poder, vida, tipo,app);

		//Cargo las imagenes
		luxrayAtaque=app.loadImage("img/luxray ataque.png");
		luxrayDebil=app.loadImage("img/luxray debil.png");
		luxrayFrente=app.loadImage("img/luxray frente.png");
		luxrayPerfil=app.loadImage("img/luxrayPerfil.png");
		luxrayMapa=app.loadImage("img/luxrayMapa.png");
		luxrayGif= new Gif(app,"gif/Luxray.gif");

	}


	public void pintar(int imgLuxray) {
		
		 switch(imgLuxray) {
		 
		 case 0: app.image(luxrayAtaque,posX,posY);
			 break;
		 case 1:app.image(luxrayDebil,posX,posY);
			 break;
		 case 2: app.image(luxrayFrente,posX,posY);
			 break;
		
	 }
	
		
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}


	public void pintarGif() {
		
		app.image(luxrayGif,posX,posY);
		luxrayGif.loop();
		app.image(luxrayPerfil,posX,posY);
	}


	
	public void pintarPMapa() {
		app.image(luxrayMapa,posX,posY);
		
	}

}
