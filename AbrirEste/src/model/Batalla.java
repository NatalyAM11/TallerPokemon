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

}
