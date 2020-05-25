package model;

import gifAnimation.Gif;
import processing.core.PApplet;
import processing.core.PImage;

public class Girafarig extends Pokemons{
	
	PImage girafarigBarra,girafarigAtaque,girafarigDebil, girafarigEspalda, girafarigPerfil;
	Gif girafarigGif;
	

	public Girafarig(int posX, int posY, String nombre, int poder, int vida, String tipo,PApplet app) {
		super(posX, posY, nombre, poder, vida, tipo,app);
		
		//Cargo las imagenes
		girafarigAtaque=app.loadImage("img/Girafarig ataque.png");
		girafarigDebil=app.loadImage("img/Girafarig debil.png");
		girafarigEspalda=app.loadImage("img/Girafarig espaldas.png");
		girafarigPerfil=app.loadImage("img/girafarigPerfil.png");
		girafarigGif= new Gif(app,"gif/Girafarig.gif");
		girafarigBarra=app.loadImage("img/girafarigBarra.png");

	}


	public void pintar(int imgGirafarig ) {
		
		 switch(imgGirafarig) {
		 
		 case 0: app.image(girafarigAtaque,posX,posY);
			 break;
		 case 1:app.image(girafarigDebil,posX,posY);
			 break;
		 case 2: app.image(girafarigEspalda,posX,posY);
			 break;
		 
		
	 }
	
		
	}

	@Override
public void mover(int r) {
		
		
		switch(r) {
		
		case 1:
			
			break;
			
		case 2:
			
			break;
		
		
		
		}
	}


	public void pintarGif() {
		
		app.fill(255);
		app.rect(0,0,700,400);
		app.image(girafarigGif,posX,posY);
		girafarigGif.loop();
		app.image(girafarigPerfil,posX,posY);
	}



	
	public void pintarPMapa() {
		
		
	}


	//Pintamos las barras de los perfiles
	public void ordenar(int posY) {
		
		app.image(girafarigBarra,posX,posY);
	}


	//Ordenamiento natural
	public int compareTo(Pokemons o) {
		
		return this.nombre.compareTo(o.getNombre());  
	}


	@Override
	public void vida() {
		// TODO Auto-generated method stub
		app.fill(255,0,0);
		app.rect(34,23,vida,10);

	}


	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		
	}

}
