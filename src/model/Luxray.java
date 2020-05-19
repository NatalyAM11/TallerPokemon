package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Luxray extends Pokemons {
	
	PImage luxrayAtaque,luxrayDebil, luxrayFrente, luxrayPerfil;

	public Luxray(int posX, int posY, String nombre, int poder, int vida, String tipo,PApplet app) {
		super(posX, posY, nombre, poder, vida, tipo,app);

		//Cargo las imagenes
		luxrayAtaque=app.loadImage("img/luxray ataque.png");
		luxrayDebil=app.loadImage("img/luxray debil.png");
		luxrayFrente=app.loadImage("img/luxray frente.png");
		luxrayPerfil=app.loadImage("img/luxrayPerfil.png");
	}


	public void pintar(int imgLuxray) {
		
		 switch(imgLuxray) {
		 
		 case 0: app.image(luxrayAtaque,0,0);
			 break;
		 case 1:app.image(luxrayDebil,0,0);
			 break;
		 case 2: app.image(luxrayFrente,0,0);
			 break;
		 case 3: app.image(luxrayPerfil,0,0);
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
