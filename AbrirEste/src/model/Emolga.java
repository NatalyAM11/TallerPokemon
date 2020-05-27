package model;

import gifAnimation.Gif;
import processing.core.PApplet;
import processing.core.PImage;

public class Emolga extends Pokemons{

	PImage hojas,pokebola,emolgaBarra,emolgaAtaque,emolgaDebil, emolgaEspalda, emolgaPerfil, emolgaFrente; 
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
		emolgaFrente=app.loadImage("img/emolgaFrente.png");
		pokebola=app.loadImage("img/pokebola.png");
		hojas=app.loadImage("img/hojas.png");
		
		
	}

	
	public void pintar(int imgEmolga) {
		
		 switch(imgEmolga) {
		 
		 case 0: app.image(emolgaEspalda,posX,posY);
			 break;
		 case 1:app.image(emolgaAtaque,posX,posY);
			 break;
		 case 2: app.image(emolgaDebil,posX,posY);
			 break;
			//Pokebola NO COLOCAR IMAGEN DEJAR VACIO
		 case 3: 
		     break; 
		   //Hoja NO COLOCAR IMAGEN DEJAR VACIO
		 case 4:
			 break;
		 case 5: app.image(emolgaFrente,posX,posY);
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
	public void moverInventario() {
		// TODO Auto-generated method stub
		this.posY -= this.dirY*3;
   	 
		
 		if(this.posY<700) {
			this.dirY=this.dirY*-1;
			
			if (this.posY < posXmenos) {
	            this.dirX=0;
	        }
 		}
		
	}

}
