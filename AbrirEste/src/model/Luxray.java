package model;

import gifAnimation.Gif;
import processing.core.PApplet;
import processing.core.PImage;

public class Luxray extends Pokemons {
	
	PImage luxrayBarra,luxrayAtaque,luxrayDebil, luxrayFrente, luxrayPerfil, luxrayMapa;
	Gif luxrayGif;

	public Luxray(int posX, int posY, String nombre, int poder, int vida, String tipo,PApplet app) {
		super(posX, posY, nombre, poder, vida, tipo,app);

		//Cargo las imagenes
		luxrayAtaque=app.loadImage("img/luxray ataque.png");
		luxrayDebil=app.loadImage("img/luxray debil.png");
		luxrayFrente=app.loadImage("img/luxray frente.png");
		luxrayPerfil=app.loadImage("img/luxrayPerfil.png");
		luxrayMapa=app.loadImage("img/luxrayMapa.png");
		luxrayGif= new Gif(app,"gif/Luxray.gif");
		luxrayBarra=app.loadImage("img/luxrayBarra.png");

	}


	public void pintar(int imgLuxray) {
		
		 switch(imgLuxray) {
		 
		 case 0: app.image(luxrayAtaque,posX,posY);
			 break;
		 case 1:app.image(luxrayDebil,posX,posY);
			 break;
		 case 2: app.image(luxrayFrente,posX,posY);
			 break;
		
	 }
	
		
	}

	@Override
public void mover(int r) {
		
		
		switch(r) {
		
		case 1:
			
			//Se mueva a la izquierda
			this.posX -= this.dirX*3;
			
			if (this.posX < posXmenos) {
	            this.dirX=0;
	        }
			
			break;
			
		case 2:
			
			this.posX += this.dirX*3;
			this.posY += this.dirY*3;
			
			//asi tiembla
			if (this.posX > posXmas) {
	            this.dirX=-1;
	            this.dirY=1;
	        }
			
			if (this.posX < posXmenos) {
	            this.dirX=1;
	            this.dirY=-1;
	        }
			
			if (this.posY > posYmas) {
	            this.dirY=-1;
	            this.dirX=1;
	        }
			
			if (this.posY < posYmenos) {
	            this.dirY=1;
	            this.dirX=-1;
	        }
			
			break;
		
		
		
		}
	}


	public void pintarGif() {
		
		app.fill(255);
		app.rect(0,0,700,400);
		app.image(luxrayGif,-20,-50);
		luxrayGif.loop();
		app.image(luxrayPerfil,posX,posY);
	}


	
	public void pintarPMapa() {
		app.image(luxrayMapa,posX,posY);
		
	}


	//Pintamos las barras de los perfiles
	public void ordenar(int posY) {
	
		app.image(luxrayBarra,posX,posY);
	}


	//Ordenamiento natural
	public int compareTo(Pokemons o) {
		
		return this.nombre.compareTo(o.getNombre());  
	}


	@Override
	public void vida() {
		// TODO Auto-generated method stub
		app.fill(255,0,0);
		app.rect(549,23,vida,10);
	}


	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		
	}

}
