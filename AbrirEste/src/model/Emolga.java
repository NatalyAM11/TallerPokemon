package model;

import gifAnimation.Gif;
import processing.core.PApplet;
import processing.core.PImage;

public class Emolga extends Pokemons{

	PImage emolgaBarra,emolgaAtaque,emolgaDebil, emolgaEspalda, emolgaPerfil; 
	Gif emolgaGif;

	public Emolga(int posX, int posY, String nombre, int poder, int vida, String tipo,PApplet app) {
		super(posX, posY, nombre, poder, vida, tipo,app);

		
		//Cargo las imagenes
		emolgaAtaque=app.loadImage("img/emolga ataque.png");
		emolgaDebil=app.loadImage("img/emolga debil.png");
		emolgaEspalda=app.loadImage("img/emolga espaldas.png");
		emolgaPerfil=app.loadImage("img/emolgaPerfil.png");
		emolgaGif = new Gif(app,"gif/Emolga.gif");
		emolgaBarra=app.loadImage("img/emolgaBarra.png");
		
		
		
	}

	
	public void pintar(int imgEmolga) {
		
		 switch(imgEmolga) {
		 
		 case 0: app.image(emolgaAtaque,posX,posY);
			 break;
		 case 1:app.image(emolgaDebil,posX,posY);
			 break;
		 case 2: app.image(emolgaEspalda,posX,posY);
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

	
	public void pintarPMapa() {
		
		
	}


	public void pintarGif() {
		
		app.fill(255);
		app.rect(0,0,700,400);
		app.image(emolgaGif,40,-140);
		emolgaGif.loop();
		app.image(emolgaPerfil,posX,posY);
		
		
		
	}


	//Pintamos las barras de los perfiles
	public void ordenar(int posY) {
		
		app.image(emolgaBarra,posX,posY);
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
