package view;

import Exceptions.FirstException;
import controller.Controller;
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {

	Screen srcGlobal;
    Verificar logic;
	
	
	Register register;
	
	Login login;
	
	int pantalla;
	PImage fondo,vacio,registrarseBoton,registrarseBotonN,usuarioBoton,usuarioBotonN;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.Main");
	}
	
	public void settings() {
		size(701,401);
	}
	public void setup() {
		
		srcGlobal = new Screen(this);
		srcGlobal.inciar();
		
		logic = new Verificar(this);
		register = new Register(this);
		login = new Login(this);
		
		fondo=loadImage("img/fondoInicio.png");
		vacio = loadImage("img/botonVacio.png");
		registrarseBoton= loadImage("img/registrarseBoton.png");
		registrarseBotonN= loadImage("img/registrarseBotonN.png");
		usuarioBoton=loadImage("img/usuario.png");
		usuarioBotonN=loadImage("img/usuarioN.png");
		
		pantalla = 3;
		
	}
	
	public void draw() {
		background(0);
		
		switch (pantalla) {

		case 0:

			image(fondo, 0, 0);
			image(usuarioBoton,257,249);
			
			if ((mouseX>257 && mouseX<465) && (mouseY>249 && mouseY<295)) {
				image(usuarioBotonN,257,249);
			}
			image(registrarseBoton,257,324);
			if ((mouseX>257 && mouseX<465) && (mouseY>324 && mouseY<400)) {

			image(registrarseBotonN,257,324);
			}
			break;

		case 1:

			register.Pintar();

			break;
		case 2:
			login.Pintar();

			break;

		case 3:
			srcGlobal.pintarPantallas();
			break;
		
			

		
	}
		fill(0);
		text("X:" + mouseX + "Y:" + mouseY, mouseX, mouseY);
	}
	
	
	public void mousePressed() {
		
		
		
		switch (pantalla) {

		

		case 0:

			if ((mouseX>257 && mouseX<465) && (mouseY>249 && mouseY<295)) {

				pantalla = 2;
				

			}

			else if ((mouseX> 257 && mouseX<465)&&(mouseY>310 && mouseY<356)) {

				pantalla = 1;
				image(usuarioBotonN,0,0);
			}

			break;

		

		case 1:

			register.botonPresionado();

			if (register.registro) {

				pantalla = 2;

			}
			break;

		

		case 2:

			login.Click();

			for (int i = 0; i < Verificar.getUser().size(); i++) {


				if (Verificar.getUser().get(i).isLogin()) {
					
					System.out.println("Bienvenido");


					pantalla = 3;

				}

			}

			break;
			
		case 3:
			
			srcGlobal.click();

		
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void keyPressed() {
		
		srcGlobal.key();
	}
	
	

}
