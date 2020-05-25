package model;

import gifAnimation.Gif;
import processing.core.PApplet;
import processing.core.PImage;

public class Gothorita extends Pokemons {


	PImage gothoritaBarra,gothoritaAtaque,gothoritaDebil, gothoritaFrente, gothoritaPerfil, gothoritaMapa; 
	Gif gothoritaGif;
	
	public Gothorita(int posX, int posY, String nombre, int poder, int vida, String tipo,PApplet app) {
		super(posX, posY, nombre, poder, vida, tipo,app);

		//Cargo las imagenes
		gothoritaAtaque=app.loadImage("img/gothorita ataque.png");
		gothoritaDebil=app.loadImage("img/gothorita debil.png");
		gothoritaFrente=app.loadImage("img/gothorita frente.png");
		gothoritaPerfil=app.loadImage("img/gothoritaPerfil.png");
		gothoritaMapa=app.loadImage("img/gothoritaMapa.png");
		gothoritaGif= new Gif(app,"gif/Gothorita.gif");
		gothoritaBarra=app.loadImage("img/gothoritaBarra.png");

	}


	public void pintar(int imgGothorita) {
		
		 switch(imgGothorita) {
		 
		 case 0: app.image(gothoritaAtaque,posX,posY);
			 break;
		 case 1:app.image(gothoritaDebil,posX,posY);
			 break;
		 case 2: app.image(gothoritaFrente,posX,posY);
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
		app.image(gothoritaGif,-30,posY);
		gothoritaGif.loop();
		app.image(gothoritaPerfil,posX,posY);
	}



	public void pintarPMapa() {
		
		app.image(gothoritaMapa,posX,posY);
		
	}


	//Pintamos las barras de los perfiles
	public void ordenar(int posY) {
		
		app.image(gothoritaBarra,posX,posY);
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
