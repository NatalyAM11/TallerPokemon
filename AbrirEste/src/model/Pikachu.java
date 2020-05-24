package model;

import gifAnimation.Gif;
import processing.core.PApplet;
import processing.core.PImage;

public class Pikachu extends Pokemons {

	PImage pikachuBarra,pikachuAtaque,pikachuDebil, pikachuFrente, pikachuPerfil,pikachuMapa; 
	Gif pikachuGif;
	
	public Pikachu(int posX, int posY, String nombre, int poder, int vida, String tipo, PApplet app) {
		super(posX, posY, nombre, poder, vida, tipo, app);
		
		//Cargo las imagenes
		pikachuAtaque=app.loadImage("img/pikachu_ataque.png");
		pikachuDebil=app.loadImage("img/pikachu_debil.png");
		pikachuFrente=app.loadImage("img/pikach_frente.png");
		pikachuPerfil=app.loadImage("img/pikachuPerfil.png");
		pikachuMapa=app.loadImage("img/pikachuMapa.png");
		pikachuGif= new Gif(app,"gif/Pikachu.gif");
		pikachuBarra=app.loadImage("img/pikachuBarra.png");

	}

	
	public void pintar(int imgPikachu) {
		
		 switch(imgPikachu) {
		 
		 case 0: app.image(pikachuAtaque,posX,posY);
			 break;
		 case 1:app.image(pikachuDebil,posX,posY);
			 break;
		 case 2: app.image(pikachuFrente,posX,posY);
			 break;
		
	 }
	
		
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}

	
	public void pintarGif() {
		
		app.image(pikachuGif,posX,posY);
		pikachuGif.loop();
		app.image(pikachuPerfil,posX,posY);
		
	}


	
	public void pintarPMapa() {
		app.image(pikachuMapa,posX,posY);
		
	}


	@Override
	public void ordenar() {
		// TODO Auto-generated method stub
		app.image(pikachuBarra,posX,posY);
	}

}