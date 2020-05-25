package model;

public class User {
	
	private String nickname, email, password;
	private boolean login;


public User ( String nickename, String email, String password ) {
	
	this.nickname = nickename;
	this.email = email;
	this.password = password;
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
