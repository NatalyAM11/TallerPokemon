package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Emolga extends Pokemons{

	PImage emolgaAtaque,emolgaDebil, emolgaEspalda, emolgaPerfil; 
	

	public Emolga(int posX, int posY, String nombre, int poder, int vida, String tipo,PApplet app) {
		super(posX, posY, nombre, poder, vida, tipo,app);

		
		//Cargo las imagenes
		emolgaAtaque=app.loadImage("img/emolga ataque.png");
		emolgaDebil=app.loadImage("img/emolga debil.png");
		emolgaEspalda=app.loadImage("img/emolga espaldas.png");
		emolgaPerfil=app.loadImage("img/emolgaPerfil.png");
		
		
	}

	
	public void pintar(int imgEmolga) {
		
		 switch(imgEmolga) {
		 
		 case 0: app.image(emolgaAtaque,0,0);
			 break;
		 case 1:app.image(emolgaDebil,0,0);
			 break;
		 case 2: app.image(emolgaEspalda,0,0);
			 break;
		 case 3: app.image(emolgaPerfil,0,0);
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
