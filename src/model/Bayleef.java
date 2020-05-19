package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Bayleef extends Pokemons {
	
	
	PImage bayleefAtaque,bayleefDebil, bayleefEspalda, bayleefPerfil; 
	
	public Bayleef(int posX, int posY, String nombre, int poder, int vida, String tipo,PApplet app) {
		super(posX, posY, nombre, poder, vida, tipo,app);

		
		//Cargo las imagenes
		bayleefAtaque=app.loadImage("img/bayleef ataque.png");
		bayleefDebil=app.loadImage("img/bayleef debil.png");
		bayleefEspalda=app.loadImage("img/bayleef espaldas.png");
		bayleefPerfil=app.loadImage("img/bayleefPerfil.png");
		
	}

	
	public void pintar(int imgBayleef) {
		
	 switch(imgBayleef) {
	 
		 case 0: app.image(bayleefAtaque,0,0);
			 break;
		 case 1:app.image(bayleefDebil,0,0);
			 break;
		 case 2: app.image(bayleefEspalda,0,0);
			 break;
		 case 3: app.image(bayleefPerfil,0,0);
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
