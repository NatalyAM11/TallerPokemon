package model;

import java.util.Collections;
import java.util.LinkedList;

import processing.core.PApplet;

public class OrdenarPokemones  {
	
	// Creamos esta clase para pintar las barras de los perfiles de los pokemones en la pokedex
	
	public LinkedList <Pokemons> listaPokemones;
	int posX,posY,poderValor,vida;
	String nombre, tipo;
	PApplet app;
	String pokemones[];
	String pokemones2[];
	
	TipoComparator comparator;


	public OrdenarPokemones(PApplet app){
		
		this.app=app;
		
		this.posY=100;
		
		//Se parte el txt
		pokemones = app.loadStrings("lib/info_pokemones.txt");
		
		listaPokemones = new LinkedList <Pokemons> ();
		comparator = new TipoComparator();
		
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
			
		
	
	
		
		
		//cargamos todos los pokemones
		
		if(nombre.equals("Bayleef")) {
			
			listaPokemones.add(new Bayleef(posX,posY,nombre,poderValor,vida,tipo,app));

		}  
		
		if(nombre.equals("Shaymin")) {
			listaPokemones.add(new Shaymin(posX,posY,nombre,poderValor,vida,tipo,app));

			
		}  
		
		if(nombre.equals("Bulbasaur")) {
			
			listaPokemones.add(new Bulbasaur(posX,posY,nombre,poderValor,vida,tipo,app));

		}  
		
		if(nombre.equals("Girafarig")) {
			
			listaPokemones.add(new Girafarig (posX,posY,nombre,poderValor,vida,tipo,app));

		}  
		
		if(nombre.equals("Gothorita")) {
			
			listaPokemones.add(new Gothorita (posX,posY,nombre,poderValor,vida,tipo,app));

		}  
		
		if(nombre.equals("MegaGardevoir")) {
			listaPokemones.add(new MegaGardevoir(posX,posY,nombre,poderValor,vida,tipo,app)); 

			
		}  
		
		if(nombre.equals("Emolga")) {
			
			listaPokemones.add(new Emolga(posX,posY,nombre,poderValor,vida,tipo,app)); 

		} if(nombre.equals("Luxray")) {
			
			listaPokemones.add(new Luxray(posX,posY,nombre,poderValor,vida,tipo,app)); 

			
			
		}  if(nombre.equals("Manectric")) {
			
			listaPokemones.add(new Manectric(posX,posY,nombre,poderValor,vida,tipo,app)); 

		} if(nombre.equals("Pikachu")) {
			listaPokemones.add(new Pikachu (posX,posY,nombre,poderValor,vida,tipo,app)); 

			
		}

		}
	
		System.out.println(listaPokemones);

		
	}
	


	public void pintar() {

		for(int i=0; i<listaPokemones.size(); i++) {
			listaPokemones.get(i).ordenar((24 * i)+ 100);	
			
		}
		
	}


	//Ordeamiento natural
	public void comparar(int b) {
		
		switch(b) {
		
		case 1:
			
			Collections.sort(listaPokemones);

			
			break;
			
		case 2:
			
			Collections.sort(listaPokemones,comparator);

			
			break;
		}
			
			System.out.println(listaPokemones);

		
			
	}



	public LinkedList<Pokemons> getListaPokemones() {
		return listaPokemones;
	}



	public void setListaPokemones(LinkedList<Pokemons> listaPokemones) {
		this.listaPokemones = listaPokemones;
	}



	public int getPosX() {
		return posX;
	}



	public void setPosX(int posX) {
		this.posX = posX;
	}



	public int getPosY() {
		return posY;
	}



	public void setPosY(int posY) {
		this.posY = posY;
	}



	public int getPoderValor() {
		return poderValor;
	}



	public void setPoderValor(int poderValor) {
		this.poderValor = poderValor;
	}



	public int getVida() {
		return vida;
	}



	public void setVida(int vida) {
		this.vida = vida;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public PApplet getApp() {
		return app;
	}



	public void setApp(PApplet app) {
		this.app = app;
	}



	public String[] getPokemones() {
		return pokemones;
	}



	public void setPokemones(String[] pokemones) {
		this.pokemones = pokemones;
	}



	public String[] getPokemones2() {
		return pokemones2;
	}



	public void setPokemones2(String[] pokemones2) {
		this.pokemones2 = pokemones2;
	}
	}




