package model;

import java.util.ArrayList;

import controlP5.ControlP5;
import controlP5.Textfield;
import processing.core.PApplet;
import processing.core.PImage;


public class Registrar {
	
	private static ArrayList<User> User; 
	private String[] inputs;

	private String nickname, contrasenna, confirmPassword, email;
	private PApplet app;
	private ControlP5 cp5;
	private PImage fondo,boton;
	boolean registro ;
	 

	
	public Registrar(PApplet app) {
		
		this.app = app;
		cp5 = new ControlP5(app);
		User = new ArrayList<User>();
		
		boton = app.loadImage("img/continuarBoton.png");
		fondo = app.loadImage("img/fondoNada.png");

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
	

    public void crearUsuario(String nickname, String email, String password) {

	User.add(new User(nickname, email, password));

	System.out.println(User.size());

	for (int i = 0; i < User.size(); i++) {

		System.out.println(User.get(i).getNickname());

	}

}
public void Pintar() {
		
		app.image(fondo,0,0);
		app.image(boton,244,295);

		cp5.show();
			
	}

public void botonPresionado() {
	
	
	if((app.mouseX>257 && app.mouseX<465) && (app.mouseY>322 && app.mouseY<368)) {
	
		boolean nombre,contrasena,correo;
	
	nickname = cp5.get(Textfield.class, "nickname").getText();
	email = cp5.get(Textfield.class, "email").getText();
	contrasenna = cp5.get(Textfield.class, "password").getText();
	confirmPassword= cp5.get(Textfield.class, "confirm password").getText();
	
	if(nickname.isEmpty()) {
		
		nombre=false;	
	}
	
	else {
		
		nombre=true;
	}
	
	
	if(email.contains("@")) {
		
		correo=true;
		
	}
	
	
	else {
		
		correo=false;
		
	}
	
	
	if(contrasenna.isEmpty()== false && contrasenna.equals(confirmPassword)) {
		
		contrasena=true;			
	}
	
	else {
			
		contrasena=false;		
	}
		
	if(nombre && contrasena && contrasena && correo) {
		
		System.out.println("Valido");
		
		crearUsuario(nickname, email, contrasenna);
		
		cp5.hide();
		
		registro=true;
		 cp5.get(Textfield.class, "nickname").clear();
			cp5.get(Textfield.class, "email").clear();
			 cp5.get(Textfield.class, "password").clear();
			cp5.get(Textfield.class, "confirm password").clear();
	}
	
	else {
		System.out.println("Nikename"+nombre);
		System.out.println("email"+correo);
		System.out.println("password"+contrasena);
		System.out.println("Error");
	}
	
	}	
	
}

public void ocultar() {
	
	cp5.hide();
}


public static ArrayList<User> getUser() {
	return User;
}


public static void setUser(ArrayList<User> user) {
	User = user;
}


public boolean isRegistro() {
	return registro;
}


public void setRegistro(boolean registro) {
	this.registro = registro;
}


}