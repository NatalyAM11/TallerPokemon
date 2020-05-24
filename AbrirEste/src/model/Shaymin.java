package model;

import gifAnimation.Gif;
import processing.core.PApplet;
import processing.core.PImage;

public class Shaymin extends Pokemons{
	
	PImage shayminBarra,shayminAtaque,shayminDebil, shayminFrente, shayminPerfil, shayminMapa; 
	Gif shayminGif;

	public Shaymin(int posX, int posY, String nombre, int poder, int vida, String tipo, PApplet app) {
		super(posX, posY, nombre, poder, vida, tipo, app);

		
		//Cargo las imagenes
		shayminAtaque=app.loadImage("img/shaymin ataque.png");
		shayminDebil=app.loadImage("img/shaymin debil.png");
		shayminFrente=app.loadImage("img/shaymin frente.png");
		shayminPerfil=app.loadImage("img/shayminPerfil.png");
		shayminMapa=app.loadImage("img/shayminMapa.png");
		shayminGif = new Gif(app,"gif/Shaymin.gif");
		shayminBarra=app.loadImage("img/shayminBarra.png");
		
	}

	// Se llama este pintar para la batalla
	public void pintar(int imgShaymin) {
		
	
	 switch(imgShaymin) {
	 
		 case 0: app.image(shayminAtaque,posX,posY);
			 break;
		 case 1:app.image(shayminDebil,posX,posY);
			 break;
		 case 2: app.image(shayminFrente,posX,posY);
			 break;
		
	 }
		
	}
	
    public void info(int posY) {
		
    	app.text(nombre,posX, posY);
		app.text(poder,posX+50*2, posY);
		app.text(tipo,posX+50*4, posY);

	 
	 
	 
	 }
	public void mover() {
		
	}

	
	public void pintarGif() {
		
		app.fill(255);
		app.rect(0,0,700,400);
		app.image(shayminGif,posX,20);
		shayminGif.loop();
		app.image(shayminPerfil,posX,posY);
	}

	
	public void pintarPMapa() {
		
		app.image(shayminMapa,posX,posY);
		
	}

	//Pintamos las barras de los perfiles
	public void ordenar(int posY) {
	
		app.image(shayminBarra,posX,posY);
	}

	//Ordenamiento natural
	public int compareTo(Pokemons o) {
		
		return this.nombre.compareTo(o.getNombre());  
	}

}
