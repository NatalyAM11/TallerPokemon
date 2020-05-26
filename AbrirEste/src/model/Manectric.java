package model;

import gifAnimation.Gif;
import processing.core.PApplet;
import processing.core.PImage;

public class Manectric extends Pokemons {
	
	
	PImage pokebola,hojas,manectricBarra,manectricAtaque,manectricDebil, manectricFrente, manectricPerfil, manectricMapa; 
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
		pokebola=app.loadImage("img/pokebola.png");
		hojas=app.loadImage("img/hojas.png");


	}


	public void pintar(int imgManectric) {
		
	 switch(imgManectric) {
	 
	      case 0: app.image(manectricFrente,posX,posY);
		 break;
		 case 1: app.image(manectricAtaque,posX,posY);
			 break;
		 case 2:app.image(manectricDebil,posX,posY);
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
