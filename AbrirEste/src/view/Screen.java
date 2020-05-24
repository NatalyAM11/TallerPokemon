package view;

import processing.core.PApplet;

public class Screen {
	
	public PApplet app;
	private int numPantalla;
	ScreenLogica scr1;
	ScreenPokedex scr2;
	
	
	public Screen(PApplet app) {
		
		this.app = app;
		
		
	}
	public void inciar() {
		
		scr1 = new ScreenLogica(app);
		scr2 = new ScreenPokedex(app);
		scr2.iniciar();
	}
	public void pintarPantallas() {
		
		numPantalla = 0;
		
		switch(numPantalla) {
		
		case 0:
			//scr1.pintarUser();
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
			//scr1.mouse();
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
			scr1.teclado();
			scr2.flechas();
			break;
			
			
		case 1:
			
			
			break;
			
		case 2:
			
			
			break;
		
		
		}
		
	}
	

}
