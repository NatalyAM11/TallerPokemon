package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Bulbasaur extends Pokemons{
	
	
	PImage bulbasaurAtaque, bulbasaurDebil, bulbasaurFrente, bulbasaurPerfil;
	

	public Bulbasaur(int posX, int posY, String nombre, int poder, int vida, String tipo,PApplet app) {
		super(posX, posY, nombre, poder, vida, tipo,app);

		
		//Cargo las imagenes
		bulbasaurAtaque=app.loadImage("img/bulbasaur ataque.png");
		bulbasaurDebil=app.loadImage("img/bulbasaur debil.png");
		bulbasaurFrente=app.loadImage("img/bulbasaur frente.png");
		bulbasaurPerfil=app.loadImage("img/bulbasaurPerfil.png");	
		

	}


	public void pintar(int imgBulbasaur) {
		
		 switch(imgBulbasaur) {
		 
		 case 0: app.image(bulbasaurAtaque,0,0);
			 break;
		 case 1:app.image(bulbasaurDebil,0,0);
			 break;
		 case 2: app.image(bulbasaurFrente,0,0);
			 break;
		 case 3: app.image(bulbasaurPerfil,0,0);
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
