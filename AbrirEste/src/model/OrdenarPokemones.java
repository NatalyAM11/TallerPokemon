package model;

import java.util.Comparator;
import java.util.LinkedList;

import processing.core.PApplet;

public class OrdenarPokemones implements Comparator <Pokemons> {
	
	
	LinkedList <Pokemons> listaPokemones;
	int posX,posY,poderValor,vida;
	String nombre, tipo;
	PApplet app;
	String pokemones[];
	String pokemones2[];

	public OrdenarPokemones(PApplet app){
		
		this.app=app;
		this.posX=0;
		this.posY=0;
		pokemones = app.loadStrings("lib/info_pokemones.txt");
		
		
		
		for(int i = 0; i < pokemones.length ; i++) {
			pokemones2 = pokemones[i].split(",");
			//nombre
			nombre = pokemones2[0];
			//tipo de pokemon
			tipo=pokemones2[1];
			//poder en numero
			poderValor=Integer.parseInt(pokemones2[2]);
			//poder
			//poder=pokemones2[3];
			//debilidad
			//debilidad=pokemones2[4];
			//vida
			vida=Integer.parseInt(pokemones2[5]);
			
			System.out.print(tipo);
		}
	
	
		
		
		
		listaPokemones.add(new Bayleef(posX,posY,nombre,poderValor,vida,tipo,app));
		listaPokemones.add(new Bulbasaur(posX,posY,nombre,poderValor,vida,tipo,app)); 
		listaPokemones.add(new Emolga(posX,posY,nombre,poderValor,vida,tipo,app)); 
		listaPokemones.add(new Girafarig (posX,posY,nombre,poderValor,vida,tipo,app)); 
		listaPokemones.add(new Gothorita (posX,posY,nombre,poderValor,vida,tipo,app)); 
		listaPokemones.add(new Luxray(posX,posY,nombre,poderValor,vida,tipo,app)); 
		listaPokemones.add(new Manectric(posX,posY,nombre,poderValor,vida,tipo,app)); 
		listaPokemones.add(new MegaGardevoir(posX,posY,nombre,poderValor,vida,tipo,app)); 
		listaPokemones.add(new Pikachu (posX,posY,nombre,poderValor,vida,tipo,app)); 
		listaPokemones.add(new Shaymin(posX,posY,nombre,poderValor,vida,tipo,app)); 
		
		
	}
	


	public void pintar() {
		
		for(int i=0; i<listaPokemones.size(); i++) {
			listaPokemones.get(i).ordenar();;
		}
		
	}


	
	public int compare (Pokemons o1, Pokemons o2) {
		
		return o1.tipo.compareTo(o2.tipo);
	}



}
