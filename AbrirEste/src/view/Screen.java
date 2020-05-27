package view;

import processing.core.PApplet;
import processing.core.PImage;

public class Screen {

	public PApplet app;
	ScreenPokedex scr2;
	Verificar logic;
	Register register;
	Login login;
	PImage fondo, vacio, registrarseBoton, 
	registrarseBotonN, usuarioBoton, usuarioBotonN;
	int pantalla;

	public Screen(PApplet app) {

		this.app = app;
		logic = new Verificar(app);
		register = new Register(app);
		login = new Login(app);
		pantalla = 0;
		cargarImagenes();

	}

	public void iniciar() {

		scr2 = new ScreenPokedex(app);

	}

	public void pintarPantallas() {

		switch (pantalla) {

		case 0:

			app.image(fondo, 0, 0);
			app.image(usuarioBoton, 257, 249);

			if ((app.mouseX > 257 && app.mouseX < 465) && (app.mouseY > 249 && app.mouseY < 295)) {
				app.image(usuarioBotonN, 257, 249);
			}
			app.image(registrarseBoton, 257, 324);
			if ((app.mouseX > 257 && app.mouseX < 465) && (app.mouseY > 324 && app.mouseY < 400)) {

				app.image(registrarseBotonN, 257, 324);
			}
			break;

		case 1:

			register.Pintar();

			break;
		case 2:
			login.Pintar();

			break;

		case 3:
			scr2.pintar();

			break;

		}

	}

	public void click() {

		switch (pantalla) {

		case 0:

			if ((app.mouseX > 257 && app.mouseX < 465) && (app.mouseY > 249 && app.mouseY < 295)) {

				pantalla = 2;

			}

			else if ((app.mouseX > 257 && app.mouseX < 465) && (app.mouseY > 310 && app.mouseY < 356)) {

				pantalla = 1;
				app.image(usuarioBotonN, 0, 0);
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

			scr2.mouse();
		}

	}

	public void key() {

		switch (pantalla) {

		case 3:

			scr2.flechas();
			break;

		}

	}
	
	public void cargarImagenes() {
		fondo = app.loadImage("img/fondoInicio.png");
		vacio = app.loadImage("img/botonVacio.png");
		registrarseBoton = app.loadImage("img/registrarseBoton.png");
		registrarseBotonN = app.loadImage("img/registrarseBotonN.png");
		usuarioBoton = app.loadImage("img/usuario.png");
		usuarioBotonN = app.loadImage("img/usuarioN.png");
		
	}
}


