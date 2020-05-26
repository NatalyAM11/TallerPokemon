package view;
import java.util.ArrayList;

import controlP5.ControlP5;
import controlP5.Textfield;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class Register {

	private String[] inputs;
	private ArrayList<User> user;
	private String name, password, confirmPassword, email;
	private PApplet app;
	private ControlP5 cp5;
	private PImage fondo, boton,continuarBoton,continuarBotonN;
	
	private Verificar logica;
	boolean registro;

	public Register(PApplet app) {

		this.app = app; 
		logica = new Verificar(app);
		cp5 = new ControlP5(app);
		
		
		fondo=app.loadImage("img/fondoNada.png");
		boton=app.loadImage("img/continuarBoton.png");
		
		continuarBoton=app.loadImage("img/continuarBoton.png");
		continuarBotonN=app.loadImage("img/continuarBotonN.png");

		

		inputs = new String[4];
		inputs[0] = "nickname";
		inputs[1] = "email";
		inputs[2] = "password";
		inputs[3] = "confirm password";

	

		for (int i = 0; i < inputs.length; i++) {
			cp5.addTextfield(inputs[i])
			.setPosition((210), 41 + (i * 60))
			.setSize(300,40)
			.setAutoClear(true)
			.setColorCaptionLabel(155)
			.setColorBackground(0);
		}

		cp5.hide();
	}

	public void Pintar() {

		app.image(fondo, 0, 0);
		app.image(continuarBoton, 257, 322);
		if (app.mouseX > 257 && app.mouseX < 465 && app.mouseY > 322 && app.mouseY < 368) {
		app.image(continuarBotonN, 257, 322);
		}
		cp5.show();

	}

	public void botonPresionado() {

		if (app.mouseX > 257 && app.mouseX < 465 && app.mouseY > 322 && app.mouseY < 368) {

			boolean nombre, contrasena, correo;
			
			name = cp5.get(Textfield.class,  "nickname").getText();
			email = cp5.get(Textfield.class,  "email").getText();
			password = cp5.get(Textfield.class, "password").getText();
			confirmPassword = cp5.get(Textfield.class, "confirm password").getText();

		
			if (name.isEmpty()) {

				nombre = false;

			}

			else {

				nombre = true;
			}

		
			if (email.contains("@")) {

				correo = true;

			}

			else {

				correo = false;

			}

			

			if (password.isEmpty() == false && password.equals(confirmPassword)) {

				contrasena = true;

			}

			else {

				contrasena = false;

			}

			

			if (nombre && contrasena && contrasena && correo) {

				System.out.println("Valido");

				logica.CreateUser(name, email, password);

				cp5.hide();

				registro = true;
				 cp5.get(Textfield.class, "nickname").clear();
				cp5.get(Textfield.class, "email").clear();
				 cp5.get(Textfield.class, "password").clear();
				cp5.get(Textfield.class, "confirm password").clear();
				
			}

			else {
				System.out.println("Nikename"+nombre);
				System.out.println("email"+correo);
				System.out.println("password"+contrasena);

				System.out.println("Contraseña Incorrecta");
			}

		}

	}

	public boolean isRegistro() {
		return registro;
	}

	public void setRegistro(boolean registro) {
		this.registro = registro;
	}

	public void ocultar() {

		cp5.hide();
	}

}
