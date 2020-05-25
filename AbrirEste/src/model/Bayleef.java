package model;

import gifAnimation.Gif;
import processing.core.PApplet;
import processing.core.PImage;

public class Bayleef extends Pokemons {
	
	
	PImage pokebola,hojas,bayleefBarra,bayleefAtaque,bayleefDebil, bayleefEspalda, bayleefPerfil, bayleefFrente;
	Gif bayleefGif;
	
	public Bayleef(int posX, int posY, String nombre, int poder, int vida, String tipo,PApplet app) {
		super(posX, posY, nombre, poder, vida, tipo,app);

		
		//Cargo las imagenes
		bayleefAtaque=app.loadImage("img/bayleef ataque.png");
		bayleefDebil=app.loadImage("img/bayleef debil.png");
		bayleefEspalda=app.loadImage("img/bayleef espaldas.png");
		bayleefPerfil=app.loadImage("img/bayleefPerfil.png");
		bayleefGif= new Gif(app,"gif/Bayleef.gif");
		bayleefBarra=app.loadImage("img/bayleefBarra.png");
		bayleefFrente=app.loadImage("img/bayleefFrente.png");
		pokebola=app.loadImage("img/pokebola.png");
		hojas=app.loadImage("img/hojas.png");
	} 
	
	
	public void pintar(int imgBayleef) {
		
	 switch(imgBayleef) {
	 
		 case 0: app.image(bayleefEspalda,posX,posY);
			 break;
		 case 1:app.image(bayleefAtaque,posX,posY);
			 
			 break;
		 case 2: app.image(bayleefDebil,posX,posY);
			 break;
			//Pokebola NO COLOCAR IMAGEN DEJAR VACIO
		 case 3: 
		     break; 
		   //Hoja NO COLOCAR IMAGEN DEJAR VACIO
		 case 4:
			 break;
			 //Inventario
		 case 5: app.image(bayleefFrente,posX,posY);
			 break;
		
	 }
	}

	public void mover(int r) {
		
		
		switch(r) {
		case 0:
			break;
		case 1:
			
			//se mueve a la derecha
			this.posX += this.dirX*3;
			
			if (this.posX > posXmas) {
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
		case 3:
			break;
		case 4:
			break;
		
		
		}
		
	}


	public void pintarGif() {
		
		app.fill(255);
		app.rect(0,0,700,400);
		app.image(bayleefGif,-20,-70);
		bayleefGif.loop();
		app.image(bayleefPerfil,posX,posY);
		
	}


	public void pintarPMapa() {
		
		
	}


	//Pintamos las barras de los perfiles
	public void ordenar(int posY) {
	
		app.image(bayleefBarra,posX,posY);
	}


	//Ordenamiento natural
	public int compareTo(Pokemons o) {

		return this.nombre.compareTo(o.getNombre());  
	}


	@Override
	public void vida() {
		app.fill(255,0,0);
		app.rect(34,23,vida,10);
	}


	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		
	}

}
