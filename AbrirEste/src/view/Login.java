package view;
import controlP5.ControlP5;
import controlP5.Textfield;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class Login {

	private PApplet app;
	
	private String email, contrasenna;
	private ControlP5 cp5;
	private PImage fondo, boton,continuarBoton,continuarBotonN;
	private Verificar logica;
	

	public Login(PApplet app) {

		this.app = app;
		logica = new Verificar(app);
		fondo=app.loadImage("img/fondoInicio.png");
		boton=app.loadImage("img/continuarBoton.png");
		continuarBoton=app.loadImage("img/continuarBoton.png");
		continuarBotonN=app.loadImage("img/continuarBotonN.png");
		
		cp5 = new ControlP5(app);
		
		cp5.addTextfield("Email")
		.setPosition(210,225)
		.setSize(300,41)
		.setAutoClear(true)
		.setColorCaptionLabel(255)
		.setColorBackground(0);
		
		cp5.addTextfield("contrasenna")
		.setPosition(210,283)
		.setSize(300,41)
		.setAutoClear(true)
		.setColorCaptionLabel(255)
		.setColorBackground(0);
		
		cp5.hide();

	}

	public void Pintar() {

		app.image(fondo, 0, 0);
		cp5.show(); 
		app.image(continuarBoton,257,348);
		if (app.mouseX > 257 && app.mouseX < 465 && app.mouseY > 348 && app.mouseY < 391) {
			app.image(continuarBotonN,257,348);
		}

	}

	public void Click() {

		if (app.mouseX > 257 && app.mouseX < 465 && app.mouseY > 348 && app.mouseY < 391) {

			email = cp5.get(Textfield.class, "Email").getText();
			contrasenna = cp5.get(Textfield.class, "contrasenna").getText();

			if ( contrasenna.isEmpty() == false && email.isEmpty() == false ) {

				logica.verificarLogin(email, contrasenna);

				if (logica.verificarLogin(email, contrasenna)) {

					Ocultar();
					cp5.get(Textfield.class, "contrasenna").clear();
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

}
