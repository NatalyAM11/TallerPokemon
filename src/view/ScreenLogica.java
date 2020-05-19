package view;

import controller.ControllerUser;
import processing.core.PApplet;

public class ScreenLogica extends Screen{

	ControllerUser control;
	
	public ScreenLogica(PApplet app) {
		super(app);
		
		control = new ControllerUser(app);
	}

	public void pintarUser() {
		
		
	    control.pantalla();
	}
	
	
	public void pantalla() {
		
	}
	
	public void mouse() {
		control.mouse();
	}
	
	public void teclado() {
		control.teclado();
	}
}
