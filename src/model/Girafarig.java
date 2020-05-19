package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Girafarig extends Pokemons{
	
	PImage girafarigAtaque,girafarigDebil, girafarigEspalda, girafarigPerfil; 
	

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
		 
		 case 0: app.image(girafarigAtaque,0,0);
			 break;
		 case 1:app.image(girafarigDebil,0,0);
			 break;
		 case 2: app.image(girafarigEspalda,0,0);
			 break;
		 case 3: app.image(girafarigPerfil,0,0);
		 break;
		
	 }
	
		
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pintarGif() {
		// TODO Auto-generated method stub
		
	}

}
