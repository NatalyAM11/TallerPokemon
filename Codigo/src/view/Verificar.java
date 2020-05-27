package view;

import java.util.ArrayList;

import processing.core.PApplet;

public class Verificar {

	private static ArrayList<User> user = new ArrayList<User>();
	private boolean loged;
	private PApplet app;

	public Verificar(PApplet app) {

		this.app = app;

	}

	public void CreateUser(String name, String email, String password) {

		user.add(new User(name, email, password));

		for (int i = 0; i < user.size(); i++) {

			System.out.println("Nickname " + user.get(i).getName());

		}

	}

	public boolean verificarLogin(String email, String Password) {

		for (int i = 0; i < user.size(); i++) {

			if (email.equals(user.get(i).getEmail()) && Password.equals(user.get(i).getPassword())) {

				System.out.println("Nickname " + user.get(i).getName());

				user.get(i).setLogin(true);

				return true;
			}

			else {
				user.get(i).setLogin(false);
				System.out.println("No esta registrado " + user.get(i).getName());
			}

		}
		return false;

	}

	public static ArrayList<User> getUser() {
		return user;
	}

	public static void setUser(ArrayList<User> user) {
		Verificar.user = user;
	}

	public boolean isLoged() {
		return loged;
	}

	public void setLoged(boolean loged) {
		this.loged = loged;
	}

}
