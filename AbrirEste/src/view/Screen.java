package view;

import processing.core.PApplet;

public class Screen {
	
	public PApplet app;
	private int numPantalla;
	ScreenPokedex scr2;
	
	
	public Screen(PApplet app) {
		
		this.app = app;
		
		
	}
	public void inciar() {
		
		scr2 = new ScreenPokedex(app);
		scr2.iniciar();
	}
	public void pintarPantallas() {
		
		numPantalla = 0;
		
		switch(numPantalla) {
		
		case 0:
			
			scr2.pintar();
			
			break;
			
			
		case 1:
			
			
			break;
			
		case 2:
			
			
			break;
		
		
		}
		
		
		
		
	}
	
	public void click() {

		switch(numPantalla) {
		
		case 0:
			scr2.mouse();
			break;
			
			
		case 1:
			
			
			break;
			
		case 2:
			
			
			break;
		
		
		}
		
	}
	
	
	public void key() {
		
switch(numPantalla) {
		
		case 0:
			
			scr2.flechas();
			break;
			
			
		case 1:
			
			
			break;
			
		case 2:
			
			
			break;
		
		
		}
		
	}
	

}
