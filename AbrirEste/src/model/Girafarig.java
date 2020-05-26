package model;

import gifAnimation.Gif;
import processing.core.PApplet;
import processing.core.PImage;

public class Girafarig extends Pokemons{
	
	PImage pokebola,hojas,girafarigBarra,girafarigAtaque,girafarigDebil, girafarigEspalda, girafarigPerfil, girafarigFrente;
	Gif girafarigGif;
	

	public Girafarig(int posX, int posY, String nombre, int poder, int vida, String tipo,PApplet app) {
		super(posX, posY, nombre, poder, vida, tipo,app);
		
		//Cargo las imagenes
		girafarigAtaque=app.loadImage("img/Girafarig ataque.png");
		girafarigDebil=app.loadImage("img/Girafarig debil.png");
		girafarigEspalda=app.loadImage("img/Girafarig espaldas.png");
		girafarigPerfil=app.loadImage("img/girafarigPerfil.png");
		girafarigGif= new Gif(app,"gif/Girafarig.gif");
		girafarigBarra=app.loadImage("img/girafarigBarra.png");
		girafarigFrente=app.loadImage("img/girafarigFrente.png");
		pokebola=app.loadImage("img/pokebola.png");
		hojas=app.loadImage("img/hojas.png");
	}


	public void pintar(int imgGirafarig ) {
		
		 switch(imgGirafarig) {
		 
		 case 0: app.image(girafarigEspalda,posX,posY);
			 break;
		 case 1:app.image(girafarigAtaque,posX,posY);
			 break;
		 case 2: app.image(girafarigDebil,posX,posY);
			 break;
			//Pokebola NO COLOCAR IMAGEN DEJAR VACIO
		 case 3: 
			 break;
			//Hoja NO COLOCAR IMAGEN DEJAR VACIO
		 case 4:
			 break;
		 case 5:
			 app.image(girafarigFrente,posX,posY);
		 break;
		 
		
	 }
	
		
	}

	public void run() {
		
		try {
			
			mover2(); 
			
			
		}catch(IndexOutOfBoundsException  e) {
			
		}catch (Exception e) {
			
		}
		
	}
	
	
public void mover() {
		
		
		
			//se mueve a la derecha
			this.posX += this.dirX*3;
			
			if (this.posX > posXmas) {
	            this.dirX=0;
	        }
			
			
		
		
		
		}
	
	
	public void mover2() {
		
		this.posX += this.dirX*3;
		this.posY += this.dirY*3;
		
	if(this.posX>0) {
			
	this.dirX=this.dirX*-1;
	
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
	}
	}


	public void pintarGif() {
		
		app.fill(255);
		app.rect(0,0,700,400);
		app.image(girafarigGif,posX,posY);
		girafarigGif.loop();
		app.image(girafarigPerfil,posX,posY);
	}



	
	public void pintarPMapa() {
		
		
	}


	//Pintamos las barras de los perfiles
	public void ordenar(int posY) {
		
		app.image(girafarigBarra,posX,posY);
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
