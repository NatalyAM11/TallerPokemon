package view;

import controller.Controller;
import processing.core.PApplet;

public class ScreenPokedex extends Screen{
	
	PApplet app;
	Controller control;
	
	public ScreenPokedex(PApplet app) {
		super(app);
		
		control = new Controller(app);
		
	}
	
	public void iniciar() {
		
		control.iniciar();
		
	}
	
	public void pintar() {
		
		control.pintar();
	}
	
	public void mouse() {
		
		control.mouse();
	}
	
	public void flechas() {
		control.flechas();
	}

}
