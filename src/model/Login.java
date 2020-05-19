package model;

import java.util.ArrayList;

import controlP5.ControlP5;
import controlP5.Textfield;
import processing.core.PApplet;
import processing.core.PImage;

public class Login {
	
	private PApplet app;
	private boolean loged;
	private static ArrayList<User> user;
	private String email,contrasenna;
	private ControlP5 cp5;
	private PImage fondo,boton;

	
	public Login (PApplet app) {
		
		this.app=app;
		cp5=new ControlP5(app);
		user = new ArrayList<User>();
		
		
		fondo=app.loadImage("img/fondoInicio.png");
		boton=app.loadImage("img/continuarBoton.png");
		
		cp5.addTextfield("Email")
		.setPosition(210,225)
		.setSize(300,41)
		.setAutoClear(true)
		.setColorCaptionLabel(255)
		.setColorBackground(0);
		
		cp5.addTextfield("Password")
		.setPosition(210,283)
		.setSize(300,41)
		.setAutoClear(true)
		.setColorCaptionLabel(255)
		.setColorBackground(0);
		
		cp5.hide();

	}
	

	public boolean verificarLogin( String email,String Password) {
		
		for(int i=0;i<user.size();i++) {
			
			if(email.equals(user.get(i).getEmail()) && Password.equals(user.get(i).getPassword())) {
				
				
				System.out.println("Nickname " + user.get(i).getNickname());
				
				user.get(i).setLogin(true);
				
				return true;				
			}
			
			else {
				
				user.get(i).setLogin(false);
				System.out.println("No esta registrado " + user.get(i).getNickname());
			}		
			
		}
		return false;	
	}
	
	public void Pintar() {
		
		app.image(fondo,0,0);
		app.image(boton,257,348);

		cp5.show();
		
	}
	
	public void BotonPresionado() {
		
		
		if((app.mouseX>257 && app.mouseX<465) && (app.mouseY>348 && app.mouseY<391)) {
		
		email = cp5.get(Textfield.class, "Email").getText();
		contrasenna = cp5.get(Textfield.class, "Password").getText();
		
		if(contrasenna.isEmpty()==false  && email.isEmpty()==false) {
			
			
			verificarLogin(email, contrasenna);
			
			if (verificarLogin(email, contrasenna)) {

				Ocultar();
				cp5.get(Textfield.class, "Password").clear();
				cp5.get(Textfield.class, "Email").clear();
			}
			
			
		}
		
		else {
			
			System.out.println("Ingrese la información");
			
		}
		
		
	}
	}
	
	public void Ocultar() {

		cp5.hide();

	}


	public static ArrayList<User> getUser() {
		return user;
	}


	public static void setUser(ArrayList<User> user) {
		Login.user = user;
	}


	public boolean isLoged() {
		return loged;
	}


	public void setLoged(boolean loged) {
		this.loged = loged;
	}
	
	

}
