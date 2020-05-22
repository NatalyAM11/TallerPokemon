package model;

import gifAnimation.Gif;
import processing.core.PApplet;
import processing.core.PImage;

public class Manectric extends Pokemons {
	
	
	PImage manectricAtaque,manectricDebil, manectricFrente, manectricPerfil, manectricMapa; 
	Gif manectricGif;

	public Manectric(int posX, int posY, String nombre, int poder, int vida, String tipo,PApplet app) {
		super(posX, posY, nombre, poder, vida, tipo,app);

		
		//Cargo las imagenes
		manectricAtaque=app.loadImage("img/manectric ataque.png");
		manectricDebil=app.loadImage("img/manectric debil.png");
		manectricFrente=app.loadImage("img/manectric frente.png");
		manectricPerfil=app.loadImage("img/manectricPerfil.png");
		manectricMapa=app.loadImage("img/manectricMapa.png");
		manectricGif= new Gif(app,"gif/Manectric.gif");

	}


	public void pintar(int imgManectric) {
		
	 switch(imgManectric) {
	 
		 case 0: app.image(manectricAtaque,posX,posY);
			 break;
		 case 1:app.image(manectricDebil,posX,posY);
			 break;
		 case 2: app.image(manectricFrente,posX,posY);
			 break;
		 
		
	 }
	
		
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}

	
	public void pintarGif() {
		
		app.image(manectricGif,posX,posY);
		manectricGif.loop();
		app.image(manectricPerfil,posX,posY);
	}


	
	public void pintarPMapa() {
		
		app.image(manectricMapa,posX,posY);
		
	}

}
