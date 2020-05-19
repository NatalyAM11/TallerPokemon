package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Gothorita extends Pokemons {


	PImage gothoritaAtaque,gothoritaDebil, gothoritaFrente, gothoritaPerfil; 
	
	
	public Gothorita(int posX, int posY, String nombre, int poder, int vida, String tipo,PApplet app) {
		super(posX, posY, nombre, poder, vida, tipo,app);

		//Cargo las imagenes
		gothoritaAtaque=app.loadImage("img/gothorita ataque.png");
		gothoritaDebil=app.loadImage("img/gothorita debil.png");
		gothoritaFrente=app.loadImage("img/gothorita frente.png");
		gothoritaPerfil=app.loadImage("img/gothoritaPerfil.png");
		
	}


	public void pintar(int imgGothorita) {
		
		 switch(imgGothorita) {
		 
		 case 0: app.image(gothoritaAtaque,0,0);
			 break;
		 case 1:app.image(gothoritaDebil,0,0);
			 break;
		 case 2: app.image(gothoritaFrente,0,0);
			 break;
		 case 3: app.image(gothoritaPerfil,0,0);
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
