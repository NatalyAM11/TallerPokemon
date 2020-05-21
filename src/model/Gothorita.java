package model;

import gifAnimation.Gif;
import processing.core.PApplet;
import processing.core.PImage;

public class Gothorita extends Pokemons {


	PImage gothoritaAtaque,gothoritaDebil, gothoritaFrente, gothoritaPerfil, gothoritaMapa; 
	Gif gothoritaGif;
	
	public Gothorita(int posX, int posY, String nombre, int poder, int vida, String tipo,PApplet app) {
		super(posX, posY, nombre, poder, vida, tipo,app);

		//Cargo las imagenes
		gothoritaAtaque=app.loadImage("img/gothorita ataque.png");
		gothoritaDebil=app.loadImage("img/gothorita debil.png");
		gothoritaFrente=app.loadImage("img/gothorita frente.png");
		gothoritaPerfil=app.loadImage("img/gothoritaPerfil.png");
		gothoritaMapa=app.loadImage("img/gothoritaMapa.png");

	}


	public void pintar(int imgGothorita) {
		
		 switch(imgGothorita) {
		 
		 case 0: app.image(gothoritaAtaque,posX,posY);
			 break;
		 case 1:app.image(gothoritaDebil,posX,posY);
			 break;
		 case 2: app.image(gothoritaFrente,posX,posY);
			 break;
		 case 3: app.image(gothoritaPerfil,posX,posY);
		 break;
		
	 }

}     

	
		
	

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}

	
	public void pintarGif() {
		
		gothoritaGif= new Gif(app,"gif/Gothorita.gif");
		gothoritaGif.loop();
		
	}



	public void pintarPMapa() {
		
		app.image(gothoritaMapa,posX,posY);
		
	}

}
