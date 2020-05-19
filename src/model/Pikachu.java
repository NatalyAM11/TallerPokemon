package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Pikachu extends Pokemons {

	PImage pikachuAtaque,pikachuDebil, pikachuEspalda, pikachuPerfil; 
	
	public Pikachu(int posX, int posY, String nombre, int poder, int vida, String tipo, PApplet app) {
		super(posX, posY, nombre, poder, vida, tipo, app);
		
		//Cargo las imagenes
		pikachuAtaque=app.loadImage("img/pikachuPerfil.png");
		pikachuDebil=app.loadImage("img/pikachuPerfil.png");
		pikachuEspalda=app.loadImage("img/pikachuPerfil.png");
		pikachuPerfil=app.loadImage("img/pikachuPerfil.png");
	}

	
	public void pintar(int imgPikachu) {
		
		 switch(imgPikachu) {
		 
		 case 0: app.image(pikachuAtaque,0,0);
			 break;
		 case 1:app.image(pikachuDebil,0,0);
			 break;
		 case 2: app.image(pikachuEspalda,0,0);
			 break;
		 case 3: app.image(pikachuPerfil,0,0);
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
