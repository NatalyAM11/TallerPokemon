package controller;

import model.LogicUser;
import processing.core.PApplet;

public class ControllerUser {
	
	public PApplet app;
	
	LogicUser logicU;
	public ControllerUser(PApplet app) {
		
		this.app=app;
		logicU= new LogicUser(app);
		
	}
	 public void pantalla() {
		 
		 logicU.pintar();
		 
	 }
	 
	 public void mouse() {
		 
		 logicU.mouse();
		 
	 }
	 
	 public void teclado() {
		 
		 logicU.key();
		 
	 }
	

}
