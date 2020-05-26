package model;

import java.util.LinkedList;

import processing.core.PApplet;
import processing.core.PImage;

public class User implements Comparable <User> {
	
	private String nickname, email, password,fecha;
	private boolean login;
	PImage usuarioVinterx,usuarioZimzaladdude,usuarioAlexis,usuarioMariajose,usuarioMysterious;
	private int posX;
	PApplet app;
	int p;


public User ( String nickname, String email, String password, String fecha,int p, PApplet app) {
	
	
	this.app=app;
	this.nickname = nickname;
	this.email = email;
	this.password = password;
	this.fecha=fecha;
	usuarioVinterx = app.loadImage("img/usuarioVinterx.png");
	usuarioZimzaladdude = app.loadImage("img/usuarioZimzaladdude.png");
	usuarioAlexis = app.loadImage("img/usuarioAlexis.png");
	usuarioMariajose = app.loadImage("img/usuarioMariajose.png");
	usuarioMysterious = app.loadImage("img/usuarioMysterious.png");
	this.posX=0;
	this.p=p;
	
	
	
}

public void pintarUser(int posY) {
	
	switch (p) {
	case 0:
	app.image(usuarioVinterx,posX,posY);
	break;
	case 1:
	app.image(usuarioZimzaladdude,posX,posY);
	break;
	case 2:
	app.image(usuarioAlexis,posX,posY);
	break;
	case 3:
	app.image(usuarioMariajose,posX,posY);
	break;
	case 4:
	app.image(usuarioMysterious,posX,posY);
	break;
	
	}
}



//Comparable por los nombres de los usuarios
public int compareTo(User nextUser) {
	
	return this.nickname.compareTo(nextUser.getNickname());  
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

public String getFecha() {
	return fecha;
}

public void setFecha(String fecha) {
	this.fecha = fecha;
}

public PImage getUsuarioVinterx() {
	return usuarioVinterx;
}

public void setUsuarioVinterx(PImage usuarioVinterx) {
	this.usuarioVinterx = usuarioVinterx;
}

public PImage getUsuarioZimzaladdude() {
	return usuarioZimzaladdude;
}

public void setUsuarioZimzaladdude(PImage usuarioZimzaladdude) {
	this.usuarioZimzaladdude = usuarioZimzaladdude;
}

public PImage getUsuarioAlexis() {
	return usuarioAlexis;
}

public void setUsuarioAlexis(PImage usuarioAlexis) {
	this.usuarioAlexis = usuarioAlexis;
}

public PImage getUsuarioMariajose() {
	return usuarioMariajose;
}

public void setUsuarioMariajose(PImage usuarioMariajose) {
	this.usuarioMariajose = usuarioMariajose;
}

public PImage getUsuarioMysterious() {
	return usuarioMysterious;
}

public void setUsuarioMysterious(PImage usuarioMysterious) {
	this.usuarioMysterious = usuarioMysterious;
}

public int getPosX() {
	return posX;
}

public void setPosX(int posX) {
	this.posX = posX;
}

public PApplet getApp() {
	return app;
}

public void setApp(PApplet app) {
	this.app = app;
}

public int getP() {
	return p;
}

public void setP(int p) {
	this.p = p;
}

public void setNickname(String nickname) {
	this.nickname = nickname;
}




}


