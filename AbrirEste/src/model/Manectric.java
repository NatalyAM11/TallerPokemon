package model;

import gifAnimation.Gif;
import processing.core.PApplet;
import processing.core.PImage;

public class Manectric extends Pokemons {
	
	
	PImage manectricBarra,manectricAtaque,manectricDebil, manectricFrente, manectricPerfil, manectricMapa; 
	Gif manectricGif;

	public Manectric(int posX, int posY, String nombre, int poder, int vida, String tipo,PApplet app) {
		super(posX, posY, nombre, poder, vida, tipo,app);

		
		//Cargo las imagenes
		manectricAtaque=app.loadImage("img/manectric ataque.png");
		manectricDebil=app.loadImage("img/manectric debil.png");
		manectricFrente=app.loadImage("img/manectric frente.png");
		manectricPerfil=app.loadImage("img/manectricPerfil.png");
		manectricMapa=app.loadImage("img/manectricMapa.png");
		manectricGif= new Gif(app,"gif/Manectric.gif");
		manectricBarra=app.loadImage("img/manectricBarra.png");

	}


	public void pintar(int imgManectric) {
		
	 switch(imgManectric) {
	 
		 case 0: app.image(manectricAtaque,posX,posY);
			 break;
		 case 1:app.image(manectricDebil,posX,posY);
			 break;
		 case 2: app.image(manectricFrente,posX,posY);
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
		app.image(manectricGif,0,-60);
		manectricGif.loop();
		app.image(manectricPerfil,posX,posY);
	}


	
	public void pintarPMapa() {
		
		app.image(manectricMapa,posX,posY);
		
	}


	//Pintamos las barras de los perfiles
	public void ordenar(int posY) {
		
		app.image(manectricBarra,posX,posY);
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
