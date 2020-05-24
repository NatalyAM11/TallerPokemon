package model;

import gifAnimation.Gif;
import processing.core.PApplet;
import processing.core.PImage;

public class Pikachu extends Pokemons {

	PImage pikachuBarra,pikachuAtaque,pikachuDebil, pikachuFrente, pikachuPerfil,pikachuMapa; 
	Gif pikachuGif;
	
	public Pikachu(int posX, int posY, String nombre, int poder, int vida, String tipo, PApplet app) {
		super(posX, posY, nombre, poder, vida, tipo, app);
		this.nombre= nombre;
		//Cargo las imagenes
		pikachuAtaque=app.loadImage("img/pikachu_ataque.png");
		pikachuDebil=app.loadImage("img/pikachu_debil.png");
		pikachuFrente=app.loadImage("img/pikach_frente.png");
		pikachuPerfil=app.loadImage("img/pikachuPerfil.png");
		pikachuMapa=app.loadImage("img/pikachuMapa.png");
		pikachuGif= new Gif(app,"gif/Pikachu.gif");
		pikachuBarra=app.loadImage("img/pikachuBarra.png");

	}

	
	public void pintar(int imgPikachu) {
		
		 switch(imgPikachu) {
		 
		 case 0: app.image(pikachuAtaque,posX,posY);
			 break;
		 case 1:app.image(pikachuDebil,posX,posY);
			 break;
		 case 2: app.image(pikachuFrente,posX,posY);
			 break;
		
	 }
	
		
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}

	
	public void pintarGif() {
		
		app.fill(255);
		app.rect(0,0,700,400);
		app.image(pikachuGif,posX,0);
		pikachuGif.loop();
		app.image(pikachuPerfil,posX,posY);
		
	}


	
	public void pintarPMapa() {
		app.image(pikachuMapa,posX,posY);
		
	}


	//Pintamos las barras de los perfiles
	public void ordenar(int posY) {
		// TODO Auto-generated method stub
		app.image(pikachuBarra,posX,posY);
	}


	//Ordenamiento natural
	public int compareTo(Pokemons o) {
		return this.nombre.compareTo(o.getNombre());  
	}

}
