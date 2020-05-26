package model;

import gifAnimation.Gif;
import processing.core.PApplet;
import processing.core.PImage;

public class Shaymin extends Pokemons{
	
	PImage pokebola,hojas,shayminBarra,shayminAtaque,shayminDebil, shayminFrente, shayminPerfil, shayminMapa; 
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
		pokebola=app.loadImage("img/pokebola.png");
		hojas=app.loadImage("img/hojas.png");
		
	}

	// Se llama este pintar para la batalla
	public void pintar(int imgShaymin) {
		
	
	 switch(imgShaymin) {
	 
	     case 0: app.image(shayminFrente,posX,posY);
		 break;
		 case 1: app.image(shayminAtaque,posX,posY);
			 break;
		 case 2:app.image(shayminDebil,posX,posY);
			 break;
		 case 3: 
			 app.image(pokebola,495,200);
			 break;
		 case 4:
			 app.image(hojas,411,160,220,97);
			 break;
		 case 5: 
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
	
	
    public void info(int posY) {
		
    	app.text(nombre,posX, posY);
		app.text(poder,posX+50*2, posY);
		app.text(tipo,posX+50*4, posY);

	 
	 
	 
	 }
     public void mover() {
		
    	 this.posX -= this.dirX*3;
			
			if (this.posX < posXmenos) {
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
