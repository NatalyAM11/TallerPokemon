package model;

import gifAnimation.Gif;
import processing.core.PApplet;
import processing.core.PImage;

public class Bulbasaur extends Pokemons{
	
	
	PImage bulbasaurBarra,bulbasaurAtaque, bulbasaurDebil, bulbasaurFrente, bulbasaurPerfil, bulbasaurMapa;
	Gif bulbasaurGif;

	public Bulbasaur(int posX, int posY, String nombre, int poder, int vida, String tipo,PApplet app) {
		super(posX, posY, nombre, poder, vida, tipo,app);

		
		//Cargo las imagenes
		bulbasaurAtaque=app.loadImage("img/bulbasaur ataque.png");
		bulbasaurDebil=app.loadImage("img/bulbasaur debil.png");
		bulbasaurFrente=app.loadImage("img/bulbasaur frente.png");
		bulbasaurPerfil=app.loadImage("img/bulbasaurPerfil.png");
		bulbasaurMapa=app.loadImage("img/bulbasaurMapa.png");
		bulbasaurGif= new Gif(app,"gif/Bulbasaur.gif");
		bulbasaurBarra=app.loadImage("img/bulbasaurBarra.png");

	}


	public void pintar(int imgBulbasaur) {
		
		 switch(imgBulbasaur) {
		 
		 case 0: //app.image(bulbasaurAtaque,posX,posY);
			 break;
		 case 1:app.image(bulbasaurDebil,posX,posY);
			 break;
		 case 2: app.image(bulbasaurFrente,posX,posY);
			 break;
		 
		
	 }
		
		
	
		
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}

	
	public void pintarGif() {
		app.image(bulbasaurPerfil,posX,posY);

		app.image(bulbasaurGif,posX,posY);
		bulbasaurGif.loop();
		
		
	}

	
	public void pintarPMapa() {
		app.image(bulbasaurMapa,posX,posY);
		
	}


	@Override
	public void ordenar(int posY) {
		// TODO Auto-generated method stub
		app.image(bulbasaurBarra,posX,posY);
	}


	@Override
	public int compareTo(Pokemons o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.getNombre());  
	}

}
