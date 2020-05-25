package model;

import java.util.LinkedList;

import processing.core.PApplet;
import processing.core.PImage;

public class Batalla implements Runnable {
	
	public PApplet app;
	LinkedList <Pokemons> poke;
	PImage fondo, hpJugador, hpOponente, pantallaAtrapado, botonContinuar, botonContinuar2,botonBatalla;
	
	public Batalla (PApplet app) {
		
		this.app=app;
		poke = new LinkedList<Pokemons> ();
		fondo = app.loadImage("img/fondoBatalla.png");
		hpJugador = app.loadImage("img/HPjugador.png");
		hpOponente = app.loadImage("img/HPoponente.png");
		pantallaAtrapado= app.loadImage("img/pokemonAtrapado.png");
		botonContinuar= app.loadImage("img/continuarBotonN.png");
		botonBatalla= app.loadImage("img/botonesBatalla.png");
	}
	
	
	
	public void Selecciono(int w) {
		
		switch(w) {
		
		case 0:
			poke.add(new Girafarig (0,0,"holi",0,0,"salvaje", app));
			
			break;
			
		case 1:
			
			poke.add(new Emolga (0,0,"holi",0,0,"salvaje", app));

			
			
			break;
			
		case 2:
			
			poke.add(new Bayleef (0,0,"holi",0,0,"salvaje", app));

			
			break;
		
		
		}
		
	}
	
	public void pintarSeleccionado() {
		
		for(int i=0; i < poke.size(); i++ ) {
			
			poke.get(i).pintar(1);
			
		}
		
		
		
		
	}
	
	
	public void pintarVidas () {
		
		app.image(hpJugador, 0, 0,170,56);
		app.image(hpOponente, 530, 0,170,56);
		
		
	}
	
	
	public void Capturaste(int a) {
		
		
       switch(a) {
		
		case 1:
			poke.add(new Shaymin (300,-100,"holi",0,0,"salvaje", app));
			
			break;
			
		case 2:
			
			poke.add(new Bulbasaur (0,0,"holi",0,0,"salvaje", app));

			
			
			break;
			
		case 3:
			
			poke.add(new Luxray (0,0,"holi",0,0,"salvaje", app));

			
			break;
			
          case 4:
			
			poke.add(new Pikachu (0,0,"holi",0,0,"salvaje", app));

			
			break;
			
			
          case 5:
  			poke.add(new Gothorita (300,-100,"holi",0,0,"salvaje", app));
  			
  			break;
  			
  		case 6:
  			
  			poke.add(new Luxray (0,0,"holi",0,0,"salvaje", app));

  			
  			
  			break;
  			
  		case 7:
  			
  			poke.add(new Manectric (0,0,"holi",0,0,"salvaje", app));

  			
  			break;
  			
            case 8:
  			
  			poke.add(new MegaGardevoir (0,0,"holi",0,0,"salvaje", app));

  			
  			break;
  			
            case 9:
      			poke.add(new MegaGardevoir (434,150,"holi",0,0,"salvaje", app));
      			
      			break;
      			
      		case 10:
      			
      			poke.add(new Pikachu (0,0,"holi",0,0,"salvaje", app));

      			
      			
      			break;
      			
      		case 11:
      			
      			poke.add(new Gothorita (0,0,"holi",0,0,"salvaje", app));

      			
      			break;
      			
                case 12:
      			
      			poke.add(new Bulbasaur (0,0,"holi",0,0,"salvaje", app));

      			
      			break;
  		
			
		
		
		
		}
		
	}
	
	public void comienza() {
		
		app.image(fondo, 0, 0);
			
	}
	
	public void run() {

	/*	try {
			
			anuncio();
			
		}catch(IndexOutOfBoundsException  e) {
			
		}*/
	}
	
	
	//Se avisa que se 
	public void anuncio() {
	
		app.image(pantallaAtrapado,0,0);
		app.image(botonContinuar,253,285);
	}


	
	

}

