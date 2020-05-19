package model;

import gifAnimation.Gif;
import processing.core.PApplet;
import processing.core.PImage;

public class Manectric extends Pokemons {
	
	
	PImage manectricAtaque,manectricDebil, manectricFrente, manectricPerfil; 
	Gif manectricGif;

	public Manectric(int posX, int posY, String nombre, int poder, int vida, String tipo,PApplet app) {
		super(posX, posY, nombre, poder, vida, tipo,app);

		
		//Cargo las imagenes
		manectricAtaque=app.loadImage("img/manectric ataque.png");
		manectricDebil=app.loadImage("img/manectric debil.png");
		manectricFrente=app.loadImage("img/manectric frente.png");
		manectricPerfil=app.loadImage("img/manectricPerfil.png");
		
	}


	public void pintar(int imgManectric) {
		
	 switch(imgManectric) {
	 
		 case 0: app.image(manectricAtaque,0,0);
			 break;
		 case 1:app.image(manectricDebil,0,0);
			 break;
		 case 2: app.image(manectricFrente,0,0);
			 break;
		 case 3: app.image(manectricPerfil,0,0);
		 break;
		
	 }
	
		
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}

	
	public void pintarGif() {
		
		manectricGif= new Gif(app,"gif/Manectric.gif");
		manectricGif.loop();
	}

}
