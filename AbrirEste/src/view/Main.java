package view;

import Exceptions.FirstException;
import controller.Controller;
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {

	Screen srcGlobal;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.Main");
	}

	public void settings() {
		size(701, 401);
	}

	public void setup() {

		srcGlobal = new Screen(this);
		srcGlobal.iniciar();

	}

	public void draw() {
		background(0);
		srcGlobal.pintarPantallas();

	}

	public void mousePressed() {

		srcGlobal.click();

	}

	public void keyPressed() {

		srcGlobal.key();
	}

}
