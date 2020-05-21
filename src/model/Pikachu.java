package model;

import gifAnimation.Gif;
import processing.core.PApplet;
import processing.core.PImage;

public class Pikachu extends Pokemons {

	PImage pikachuAtaque,pikachuDebil, pikachuFrente, pikachuPerfil,pikachuMapa; 
	Gif pikachuGif;
	
	public Pikachu(int posX, int posY, String nombre, int poder, int vida, String tipo, PApplet app) {
		super(posX, posY, nombre, poder, vida, tipo, app);
		
		//Cargo las imagenes
		pikachuAtaque=app.loadImage("img/pikachu_ataque.png");
		pikachuDebil=app.loadImage("img/pikachu_debil.png");
		pikachuFrente=app.loadImage("img/pikachu_frente.png");
		pikachuPerfil=app.loadImage("img/pikachuPerfil.png");
		pikachuMapa=app.loadImage("img/pikachuMapa.png");
	}

	
	public void pintar(int imgPikachu) {
		
		 switch(imgPikachu) {
		 
		 case 0: app.image(pikachuAtaque,posX,posY);
			 break;
		 case 1:app.image(pikachuDebil,posX,posY);
			 break;
		 case 2: app.image(pikachuFrente,posX,posY);
			 break;
		 case 3: app.image(pikachuPerfil,posX,posY);
		 break;
		
	 }
	
		
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}

	
	public void pintarGif() {
		pikachuGif= new Gif(app,"gif/Pikachu.gif");
		pikachuGif.loop();
		
	}


	
	public void pintarPMapa() {
		app.image(pikachuMapa,posX,posY);
		
	}

}
