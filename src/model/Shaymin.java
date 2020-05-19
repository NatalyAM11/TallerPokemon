package model;

import gifAnimation.Gif;
import processing.core.PApplet;
import processing.core.PImage;

public class Shaymin extends Pokemons{
	
	PImage shayminAtaque,shayminDebil, shayminFrente, shayminPerfil; 
	Gif shayminGif;

	public Shaymin(int posX, int posY, String nombre, int poder, int vida, String tipo, PApplet app) {
		super(posX, posY, nombre, poder, vida, tipo, app);

		
		//Cargo las imagenes
		shayminAtaque=app.loadImage("img/shaymin ataque.png");
		shayminDebil=app.loadImage("img/shaymin debil.png");
		shayminFrente=app.loadImage("img/shaymin frente.png");
		shayminPerfil=app.loadImage("img/shayminPerfil.png");
	}

	
	public void pintar(int imgShaymin) {
		
		
	 switch(imgShaymin) {
	 
		 case 0: app.image(shayminAtaque,0,0);
			 break;
		 case 1:app.image(shayminDebil,0,0);
			 break;
		 case 2: app.image(shayminFrente,0,0);
			 break;
		 case 3: app.image(shayminPerfil,0,0);
		 break;
		
	 }
	
		
	}

	public void mover() {
		
	}

	
	public void pintarGif() {
		
		shayminGif= new Gif(app,"gif/Shaymin.gif");
		shayminGif.loop();
	}

}
