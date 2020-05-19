package controller;

import model.Logic;
import processing.core.PApplet;

public class Controller {

	PApplet app;
	Logic log;
	
	public Controller(PApplet app) {
		
		this.app = app;
		log = new Logic(app);
		
	}
	
	public void pintar() {
		
		log.pintar();
		
	}
	
	public void mouse() {
		log.mouse();
	}
}
