package model;

import gifAnimation.Gif;
import processing.core.PApplet;
import processing.core.PImage;

public class Gothorita extends Pokemons {


	PImage gothoritaBarra,gothoritaAtaque,gothoritaDebil, gothoritaFrente, gothoritaPerfil, gothoritaMapa; 
	Gif gothoritaGif;
	
	public Gothorita(int posX, int posY, String nombre, int poder, int vida, String tipo,PApplet app) {
		super(posX, posY, nombre, poder, vida, tipo,app);

		//Cargo las imagenes
		gothoritaAtaque=app.loadImage("img/gothorita ataque.png");
		gothoritaDebil=app.loadImage("img/gothorita debil.png");
		gothoritaFrente=app.loadImage("img/gothorita frente.png");
		gothoritaPerfil=app.loadImage("img/gothoritaPerfil.png");
		gothoritaMapa=app.loadImage("img/gothoritaMapa.png");
		gothoritaGif= new Gif(app,"gif/Gothorita.gif");
		gothoritaBarra=app.loadImage("img/gothoritaBarra.png");

	}


	public void pintar(int imgGothorita) {
		
		 switch(imgGothorita) {
		 
		 case 0: app.image(gothoritaAtaque,posX,posY);
			 break;
		 case 1:app.image(gothoritaDebil,posX,posY);
			 break;
		 case 2: app.image(gothoritaFrente,posX,posY);
			 break;
		
		
	 }

}     

	
		
	

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}

	
	public void pintarGif() {
		
		app.image(gothoritaGif,posX,posY);
		gothoritaGif.loop();
		app.image(gothoritaPerfil,posX,posY);
	}



	public void pintarPMapa() {
		
		app.image(gothoritaMapa,posX,posY);
		
	}


	@Override
	public void ordenar() {
		// TODO Auto-generated method stub
		app.image(gothoritaBarra,posX,posY);
	}

}
