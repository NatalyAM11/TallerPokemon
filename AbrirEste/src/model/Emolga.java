package model;

import gifAnimation.Gif;
import processing.core.PApplet;
import processing.core.PImage;

public class Emolga extends Pokemons{

	PImage emolgaBarra,emolgaAtaque,emolgaDebil, emolgaEspalda, emolgaPerfil; 
	Gif emolgaGif;

	public Emolga(int posX, int posY, String nombre, int poder, int vida, String tipo,PApplet app) {
		super(posX, posY, nombre, poder, vida, tipo,app);

		
		//Cargo las imagenes
		emolgaAtaque=app.loadImage("img/emolga ataque.png");
		emolgaDebil=app.loadImage("img/emolga debil.png");
		emolgaEspalda=app.loadImage("img/emolga espaldas.png");
		emolgaPerfil=app.loadImage("img/emolgaPerfil.png");
		emolgaGif = new Gif(app,"gif/Emolga.gif");
		emolgaBarra=app.loadImage("img/emolgaBarra.png");
		
		
		
	}

	
	public void pintar(int imgEmolga) {
		
		 switch(imgEmolga) {
		 
		 case 0: app.image(emolgaAtaque,posX,posY);
			 break;
		 case 1:app.image(emolgaDebil,posX,posY);
			 break;
		 case 2: app.image(emolgaEspalda,posX,posY);
			 break;
		 
		
	 }
		
	
		
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}

	
	public void pintarPMapa() {
		
		
	}


	@Override
	public void pintarGif() {
		// TODO Auto-generated method stub
		app.image(emolgaGif,posX,posY);
		emolgaGif.loop();
		app.image(emolgaPerfil,posX,posY);
		
		
		
	}


	@Override
	public void ordenar() {
		// TODO Auto-generated method stub
		app.image(emolgaBarra,posX,posY);
	}

}
