package model;

import gifAnimation.Gif;
import processing.core.PApplet;
import processing.core.PImage;

public class Girafarig extends Pokemons{
	
	PImage girafarigAtaque,girafarigDebil, girafarigEspalda, girafarigPerfil;
	Gif girafarigGif;
	

	public Girafarig(int posX, int posY, String nombre, int poder, int vida, String tipo,PApplet app) {
		super(posX, posY, nombre, poder, vida, tipo,app);
		
		//Cargo las imagenes
		girafarigAtaque=app.loadImage("img/Girafarig ataque.png");
		girafarigDebil=app.loadImage("img/Girafarig debil.png");
		girafarigEspalda=app.loadImage("img/Girafarig espaldas.png");
		girafarigPerfil=app.loadImage("img/girafarigPerfil.png");
	}


	public void pintar(int imgGirafarig ) {
		
		 switch(imgGirafarig) {
		 
		 case 0: app.image(girafarigAtaque,posX,posY);
			 break;
		 case 1:app.image(girafarigDebil,posX,posY);
			 break;
		 case 2: app.image(girafarigEspalda,posX,posY);
			 break;
		 case 3: app.image(girafarigPerfil,posX,posY);
		 break;
		
	 }
	
		
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}


	public void pintarGif() {
		
		girafarigGif= new Gif(app,"gif/Girafarig.gif");
		girafarigGif.loop();
	}



	
	public void pintarPMapa() {
		
		
	}

}
