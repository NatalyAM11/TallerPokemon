package model;

import java.util.LinkedList;

import processing.core.PApplet;
import processing.core.PImage;

public class Batalla {
	
	public PApplet app;
	LinkedList <Pokemons> poke;
	LinkedList<Girafarig> giraf;
	LinkedList<Emolga> emolga;
	LinkedList<Bayleef> bayleef;


	PImage hpJugador, hpOponente, pantallaAtrapado, botonContinuar, botonContinuar2,botonBatalla,pantallaEncontrado,pantallaEscapo;
	int cambioImagen;
	
	public Batalla (PApplet app) {
		
		this.app=app;
		poke = new LinkedList<Pokemons> ();
		bayleef= new LinkedList<Bayleef>();
		emolga = new LinkedList<Emolga>();
		giraf = new LinkedList<Girafarig>() ;
		hpJugador = app.loadImage("img/HPjugador.png");
		hpOponente = app.loadImage("img/HPoponente.png");
		pantallaEncontrado= app.loadImage("img/encontradoPantalla.png");
		pantallaAtrapado= app.loadImage("img/pokemonAtrapado.png");
		pantallaEscapo= app.loadImage("img/escapoPantalla.png");
		botonContinuar= app.loadImage("img/continuarBotonN.png");
		botonBatalla= app.loadImage("img/botonesBatalla.png");
		

	}
	
	
	
	public void Selecciono(int w) {
		
		switch(w) {
		
		case 0:
			giraf.add(new Girafarig (0,0,"holi",0,100,"salvaje", app));
			
			break;
			
		case 1:
			
			emolga.add(new Emolga (0,0,"holi",0,100,"salvaje", app));

			
			
			break;
			
		case 2:
			
			bayleef.add(new Bayleef (0,0,"holi",0,100,"salvaje", app));

			
			break;
		
		
		}
		
	}
	
public void pintarVidas () {
		
		app.image(hpJugador, 0, 0,170,56);
		app.image(hpOponente, 530, 0,170,56);
		
		
	}
	
	public void pintarSeleccionado() {
		
		for(int i=0; i < emolga.size(); i++ ) {
			emolga.get(i).pintar(cambioImagen);
			emolga.get(i).vida();


			
		}
        for(int i=0; i < giraf.size(); i++ ) {
        	
        	giraf.get(i).pintar(cambioImagen);
        	giraf.get(i).vida();


			
		}
       for(int i=0; i < bayleef.size(); i++ ) {
    	   
    	   bayleef.get(i).pintar(cambioImagen);
    	   bayleef.get(i).vida();


			
		}
		
	
		
       for(int i=0; i < poke.size(); i++ ) {
			
			poke.get(i).pintar(cambioImagen);
			poke.get(i).mover(cambioImagen);

			
		}
		
		
		
		
	}
	
	
	
	
	
	public void Capturaste(int a) {
		
		
       switch(a) {
		
		case 1:
			poke.add(new Shaymin (300,-100,"holi",0,100,"salvaje", app));
			
			break;
			
		case 2:
			
			poke.add(new Bulbasaur (0,0,"holi",0,100,"salvaje", app));

			
			
			break;
			
		case 3:
			
			poke.add(new Luxray (0,0,"holi",0,100,"salvaje", app));

			
			break;
			
          case 4:
			
			poke.add(new Pikachu (0,0,"holi",0,100,"salvaje", app));

			
			break;
			
			
          case 5:
  			poke.add(new Gothorita (300,-100,"holi",0,100,"salvaje", app));
  			
  			break;
  			
  		case 6:
  			
  			poke.add(new Luxray (0,0,"holi",0,100,"salvaje", app));

  			
  			
  			break;
  			
  		case 7:
  			
  			poke.add(new Manectric (0,0,"holi",0,100,"salvaje", app));

  			
  			break;
  			
            case 8:
  			
  			poke.add(new MegaGardevoir (0,0,"holi",0,100,"salvaje", app));

  			
  			break;
  			
            case 9:
      			poke.add(new MegaGardevoir (434,150,"holi",0,100,"salvaje", app));
      			
      			break;
      			
      		case 10:
      			
      			poke.add(new Pikachu (0,0,"holi",0,100,"salvaje", app));

      			
      			
      			break;
      			
      		case 11:
      			
      			poke.add(new Gothorita (0,0,"holi",0,100,"salvaje", app));

      			
      			break;
      			
                case 12:
      			
      			poke.add(new Bulbasaur (0,0,"holi",0,100,"salvaje", app));

      			
      			break;
  		
			
		
		
		
		}
		
	}
	
	public void comienza(int a) {
		
		
		
		if(a == 1) {
			
			app.image(botonBatalla,0,309);
		}
		
		if(a == 0) {
		
		app.image(botonContinuar,294,300);
		}	
	}
	
	
	
	
	//Se avisa que se 
	public void anuncio() {
		
	
		app.image(pantallaEncontrado,197,115,300,150);
		
		app.image(botonContinuar,253,285);
		
	}


public void atrapar() {
		
		int aleotoridad = (int)app.random(0,4);
		
		if(aleotoridad== 3) {
			
			System.out.print("Lo atrapaste");
			cambioImagen=1;
			app.image(pantallaAtrapado,0,0);
		}
        if(aleotoridad== 1 || aleotoridad== 2 || aleotoridad== 0) {
			
			System.out.print("Mala Suerte");
			cambioImagen=2;
			app.image(pantallaEscapo,0,0);
		}
		
		
	}
	
	public void atacar() {
		
		int turnos=0;
		
		for(int i=0; i<poke.size(); i++) {
			for(int j=0; j<poke.size(); j++) {
		
		
		switch(turnos) {
		
		//Pokemon Seleccionado
		case 0:
			cambioImagen=2;
			poke.get(i).setVida(-20);
			
			//turnos =1;
			break;
		//Pokemon Encontrado

		case 1:
			
			//turnos =3;
			break;
		//Lo atraspaste o no. 

		case 3:
			
			break;
		}
		
		}
		
		}	
	}
	

}

