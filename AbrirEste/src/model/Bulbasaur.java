package model;

import gifAnimation.Gif;
import processing.core.PApplet;
import processing.core.PImage;

public class Bulbasaur extends Pokemons{
	
	
	PImage bulbasaurBarra,bulbasaurAtaque, bulbasaurDebil, bulbasaurFrente, bulbasaurPerfil, bulbasaurMapa;
	Gif bulbasaurGif;

	public Bulbasaur(int posX, int posY, String nombre, int poder, int vida, String tipo,PApplet app) {
		super(posX, posY, nombre, poder, vida, tipo,app);

		
		//Cargo las imagenes
		bulbasaurAtaque=app.loadImage("img/bulbasaur ataque.png");
		bulbasaurDebil=app.loadImage("img/bulbasaur debil.png");
		bulbasaurFrente=app.loadImage("img/bulbasaur frente.png");
		bulbasaurPerfil=app.loadImage("img/bulbasaurPerfil.png");
		bulbasaurMapa=app.loadImage("img/bulbasaurMapa.png");
		bulbasaurGif= new Gif(app,"gif/Bulbasaur.gif");
		bulbasaurBarra=app.loadImage("img/bulbasaurBarra.png");

	}


	public void pintar(int imgBulbasaur) {
		
		 switch(imgBulbasaur) {
		 
		 case 0: //app.image(bulbasaurAtaque,posX,posY);
			 break;
		 case 1:app.image(bulbasaurDebil,posX,posY);
			 break;
		 case 2: app.image(bulbasaurFrente,posX,posY);
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
		app.image(bulbasaurGif,posX,posY);
		app.image(bulbasaurPerfil,posX,posY);
		bulbasaurGif.loop();
		
		
	}

	
	public void pintarPMapa() {
		app.image(bulbasaurMapa,posX,posY);
		
	}


	//Pintamos las barras de los perfiles
	public void ordenar(int posY) {
	
		app.image(bulbasaurBarra,posX,posY);
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
