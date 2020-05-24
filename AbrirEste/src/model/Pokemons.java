package model;

import processing.core.PApplet;

public abstract class Pokemons implements Comparable<Pokemons> {
	
	public PApplet app;
	public int posX, posY, vida, poder;
	public String debilidad, nombre, tipo;
	
	
	public Pokemons(int posX, int posY, String nombre, int poder,int vida, String tipo, PApplet app) {
		
		this.posX=posX;
		this.posY=posY;
		this.nombre = nombre;
		this.poder = poder;
		this.vida = vida;
		this.tipo = tipo;
		this.app = app;
		
	}
	
	public abstract void pintar(int numero);
	public abstract void mover();
	public abstract void pintarGif();
	public abstract void pintarPMapa();
	public abstract void ordenar();

	public int getPoder() {
		return poder;
	}

	public void setPoder(int poder) {
		this.poder = poder;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	

}
