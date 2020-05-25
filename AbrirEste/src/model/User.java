package model;

import processing.core.PApplet;
import processing.core.PImage;

public class User {
	
	private String nickname, email, password;
	private boolean login;
	PImage usuarioVinterx,usuarioZimzaladdude,usuarioAlexis,usuarioMariajose,usuarioMysterious;


public User ( String nickename, String email, String password, PApplet app) {
	
	this.nickname = nickename;
	this.email = email;
	this.password = password;
	usuarioVinterx = app.loadImage("img/usuarioVinterx.png");
	usuarioZimzaladdude = app.loadImage("img/usuarioZimzaladdude.png");
	usuarioAlexis = app.loadImage("img/usuarioAlexis.png");
	usuarioMariajose = app.loadImage("img/usuarioMariajose.png");
	usuarioMysterious = app.loadImage("img/usuarioMysterious.png");
}

public String getNickname() {
	return nickname;
}

public void setNikename(String nikename) {
	this.nickname = nikename;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public boolean isLogin() {
	return login;
}

public void setLogin(boolean login) {
	this.login = login;
}




}

