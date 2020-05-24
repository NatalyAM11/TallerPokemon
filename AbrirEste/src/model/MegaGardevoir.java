package model;

import gifAnimation.Gif;
import processing.core.PApplet;
import processing.core.PImage;

public class MegaGardevoir extends Pokemons {

	
	PImage megaGardevoirAtaque,megaGardevoirBarra,megaGardevoirDebil, megaGardevoirFrente, megaGardevoirPerfil, megaGardevoirMapa; 
	Gif megagardevoirGif;
	
	public MegaGardevoir(int posX, int posY, String nombre, int poder, int vida, String tipo,PApplet app) {
		super(posX, posY, nombre, poder, vida, tipo,app);

		
		//Cargo las imagenes
		megaGardevoirAtaque=app.loadImage("img/mega gardevoir ataque.png");
		megaGardevoirDebil=app.loadImage("img/mega gardevoir debil.png");
		megaGardevoirFrente=app.loadImage("img/mega gardevoir frente.png");
		megaGardevoirPerfil=app.loadImage("img/megaGardevoirPerfil.png");
		megaGardevoirMapa=app.loadImage("img/megagardevoirMapa.png");
		megagardevoirGif= new Gif(app,"gif/MegaGardevoir.gif");	
		megaGardevoirBarra=app.loadImage("img/megaGardevoirBarra.png");

	}

	public void pintar(int imgMegaGardevoir) {
		
		
	 switch(imgMegaGardevoir) {
	 
		 case 0: app.image(megaGardevoirAtaque,posX,posY);
			 break;
		 case 1:app.image(megaGardevoirDebil,posX,posY);
			 break;
		 case 2: app.image(megaGardevoirFrente,posX,posY);
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
		app.image(megagardevoirGif,posX,posY);
		megagardevoirGif.loop();
		app.image(megaGardevoirPerfil,posX,posY);
	}

	
	public void pintarPMapa() {
		
		app.image(megaGardevoirMapa,posX,posY);
	}

	//Pintamos las barras de los perfiles
	public void ordenar(int posY) {
		
		app.image(megaGardevoirBarra,posX,posY);
	}

	//Ordenamiento natural
	public int compareTo(Pokemons o) {
	
		return this.nombre.compareTo(o.getNombre());  
	}

}
