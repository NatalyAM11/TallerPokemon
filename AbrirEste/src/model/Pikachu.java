package model;

import gifAnimation.Gif;
import processing.core.PApplet;
import processing.core.PImage;

public class Pikachu extends Pokemons {

	PImage hojas,pokebola,pikachuBarra,pikachuAtaque,pikachuDebil, pikachuFrente, pikachuPerfil,pikachuMapa; 
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
		pokebola=app.loadImage("img/pokebola.png");
		hojas=app.loadImage("img/hojas.png");
		
	}

	
	public void pintar(int imgPikachu) {
		
		 switch(imgPikachu) {
		 case 0: app.image(pikachuFrente,posX,posY);
			 break;
		 case 1: app.image(pikachuAtaque,posX,posY);
			 break;
		 case 2:app.image(pikachuDebil,posX,posY);
			 break;
		 case 3: 
			 app.image(pokebola,495,200);
			 break;
		 case 4: 
			 app.image(hojas,411,160,220,97);
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
		
		//Se mueva a la izquierda
		this.posX -= this.dirX*3;
		
		if(this.posX<700) {
			this.dirX=this.dirX*-1;
			
		if (this.posX < posXmenos) {
            this.dirX=0;
        }
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


	@Override
	public void vida() {
		// TODO Auto-generated method stub
		app.fill(255,0,0);
		app.rect(549,23,vida,10);

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
