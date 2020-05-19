package model;


import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class LogicUser {
	
	Registrar register;
	Login login;
	public int pantalla;
	public PApplet app;
	public PImage fondo,reg,vacio;
	private PFont font;

	
	
	public LogicUser(PApplet app) {
		
		this.app = app;
		pantalla = 0;

		register = new Registrar(app);
		login = new Login(app);
		
		font = app.createFont("fonts/pokemon-classic-regular.ttf",18);
		fondo = app.loadImage("img/fondoInicio.png");
		reg = app.loadImage("img/registrarseBoton.png");
		vacio = app.loadImage("img/botonVacio.png");

		
		
	}
	
	public void inciar() {
		
		
	}
	
	public void pintar() {
		

		switch (pantalla) {
		
		case 0:
			
			
			// Cambiar por el fondo y los botones 
			app.image(fondo,0,0);
			
			app.image(reg,257,249);
			app.image(vacio,257,310);
			app.fill(255);
			app.textFont(font);
			app.text("Ingresar", 295, 340);

			break;
			

		case 1:

			register.Pintar();

			break;
		case 2:
			login.Pintar();

			break;
			
		case 3:
			app.fill(255,0,0);
			app.ellipse(30,30,50,50);
			
			break;

		case 4:
			
			
			
			break;

		
		}
		app.fill(0);
app.textSize(10);
		app.text("x:"+app.mouseX,app.mouseX,app.mouseY);
		app.text("y:"+app.mouseY,app.mouseX+50,app.mouseY);
		
		
		
	}
	
	public void mouse() {
		
switch (pantalla) {
		
		
		case 0: 
			
			
			if((app.mouseX>257 && app.mouseX<465) && (app.mouseY>249 && app.mouseY<295)) {
				System.out.println("entre");
				pantalla=1;

				
			} else if((app.mouseX> 257 && app.mouseX<465)&&(app.mouseY>310 && app.mouseY<356)) {
				
				
				pantalla=2;

				
			}
			
			break;

		case 1:
			
			register.botonPresionado();
			
			if(register.registro) {
				
				pantalla=2;
				
			}
			
			break;

		case 2:

			login.BotonPresionado();

			for (int i = 0; i < Login.getUser().size(); i++) {

				
				if (Login.getUser().get(i).isLogin()) {

					System.out.println("Entro Pantalla 3");

                     pantalla=3;

				}
				

			}

			break;
		}
		
	}
	
	public void key() {
	

		
	
	
	}
}
