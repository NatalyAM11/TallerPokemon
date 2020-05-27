package model;

import java.util.LinkedList;

import processing.core.PApplet;

public class Pokedex {
	
	PApplet app;
	LinkedList <Pokemons> pokemons;	
	public Pokedex(PApplet app) {
		
		this.app=app;
		
		pokemons = new LinkedList<Pokemons>();
		
		
		
	}
	
	
	public void comenzar() {
		for(int i =0; i<pokemons.size(); i++) {
			
			pokemons.get(i).pintarGif();
			
		}
	}
	
	public void eliminar() {
		
		for(int i =0; i<pokemons.size(); i++) {
			
			pokemons.remove(i);
			
		}
	}
	
	public void pintar(int w) {
		
	switch(w) {
	
	case 1:
		pokemons.add(new Bayleef (0,0,"hola",0,0,"rapido",app));
		break;
	case 2:
		pokemons.add(new Shaymin (0,0,"hola",0,0,"rapido",app));
		break;
	case 3: 
		pokemons.add(new Bulbasaur(0,0,"hola",0,0,"rapido",app));
		break;
	case 4: 
		pokemons.add(new Girafarig(0,0,"hola",0,0,"rapido",app));
		break;
	case 5: 
		pokemons.add(new Gothorita (0,0,"hola",0,0,"rapido",app));
		break;
	case 6: 
		pokemons.add(new MegaGardevoir (0,0,"hola",0,0,"rapido",app));
		break;
	case 7: 
		pokemons.add(new Emolga (0,0,"hola",0,0,"rapido",app));
		break;
	case 8: 
		pokemons.add(new Luxray (0,0,"hola",0,0,"rapido",app));
		break;
	case 9: 
		pokemons.add(new Manectric (0,0,"hola",0,0,"rapido",app));
		break;
	case 10: 
		pokemons.add(new Pikachu (0,0,"hola",0,0,"rapido",app));
		break;
		
	
	}
			
			
		
	}
	
	
	
	

}
