package model;

import java.util.LinkedList;

import processing.core.PApplet;

public class Pokedex {
	
	PApplet app;
	LinkedList <Pokemons> pokemons;	
	public Pokedex(PApplet app) {
		
		pokemons = new LinkedList<Pokemons>();
		
		
		pokemons.add(new Bulbasaur(0,0,"hola",0,0,"rapido",app));
		
	}
	
	
	public void comenzar() {
		for(int i =0; i<pokemons.size(); i++) {
			
			pokemons.get(i).pintarGif();
			
		}
	}
	
	public void pintar(int w) {
		
	switch(w) {
	
	case 1:
		
		pokemons.add(new Bulbasaur(0,0,"hola",0,0,"rapido",app));

		
		break;
		
	case 2:
		
		pokemons.add(new Pikachu(0,0,"hola",0,0,"rapido",app));

		
		
		break;
		
		
	case 3: 
		
		pokemons.add(new Shaymin(0,0,"hola",0,0,"rapido",app));

		
		
		break;
	
	
	}
			
			
		
	}
	
	
	
	

}
