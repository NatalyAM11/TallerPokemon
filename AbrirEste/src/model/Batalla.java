package model;

import java.util.LinkedList;

import processing.core.PApplet;

public class Batalla {
	
	public PApplet app;
	LinkedList <Pokemons> poke;
	
	public Batalla (PApplet app) {
		
		this.app=app;
		poke = new LinkedList<Pokemons> ();
		
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
	
	
	public void Capturaste(int a) {
		
		
       switch(a) {
		
		case 1:
			poke.add(new Shaymin (0,0,"holi",0,0,"salvaje", app));
			
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
  			poke.add(new Gothorita (0,0,"holi",0,0,"salvaje", app));
  			
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
      			poke.add(new MegaGardevoir (0,0,"holi",0,0,"salvaje", app));
      			
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
		
		app.fill(255);
		app.rect(0,0,700,400);
		
		
		
	}
	
	public void anuncio() {
		
		app.fill(0);
		app.rect(100,50,500,300);
	}

}

