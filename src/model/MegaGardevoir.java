package model;

import processing.core.PApplet;
import processing.core.PImage;

public class MegaGardevoir extends Pokemons {

	
	PImage megaGardevoirAtaque,megaGardevoirDebil, megaGardevoirFrente, megaGardevoirPerfil; 
	
	public MegaGardevoir(int posX, int posY, String nombre, int poder, int vida, String tipo,PApplet app) {
		super(posX, posY, nombre, poder, vida, tipo,app);

		
		//Cargo las imagenes
		megaGardevoirAtaque=app.loadImage("img/mega gardevoir ataque.png");
		megaGardevoirDebil=app.loadImage("img/mega gardevoir debil.png");
		megaGardevoirFrente=app.loadImage("img/mega gardevoir frente.png");
		megaGardevoirPerfil=app.loadImage("img/megaGardevoirPerfil.png");
	}

	public void pintar(int imgMegaGardevoir) {
		
		
	 switch(imgMegaGardevoir) {
	 
		 case 0: app.image(megaGardevoirAtaque,0,0);
			 break;
		 case 1:app.image(megaGardevoirDebil,0,0);
			 break;
		 case 2: app.image(megaGardevoirFrente,0,0);
			 break;
		 case 3: app.image(megaGardevoirPerfil,0,0);
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
