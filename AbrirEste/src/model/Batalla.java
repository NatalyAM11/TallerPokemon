package model;

import java.util.LinkedList;

import processing.core.PApplet;
import processing.core.PImage;

public class Batalla {
	
	public PApplet app;
	LinkedList <Pokemons> poke;
	LinkedList<Girafarig> giraf;
	LinkedList<Emolga> emolga;
	LinkedList<Bayleef> bayleef;
	//comentario


	PImage hpJugador, hpOponente, pantallaAtrapado, botonContinuar, botonContinuar2,botonBatalla,pantallaEncontrado,pantallaEscapo;
	int cambioPersonaje = 0;
	int cambioEnemigo = 0;
	int turnos=0;
	boolean suerte,mal;
	
	public Batalla (PApplet app) {
		
		this.app=app;
		poke = new LinkedList<Pokemons> ();
		bayleef= new LinkedList<Bayleef>();
		emolga = new LinkedList<Emolga>();
		giraf = new LinkedList<Girafarig>() ;
		hpJugador = app.loadImage("img/HPjugador.png");
		hpOponente = app.loadImage("img/HPoponente.png");
		pantallaEncontrado= app.loadImage("img/encontradoPantalla.png");
		pantallaAtrapado= app.loadImage("img/pokemonAtrapado.png");
		pantallaEscapo= app.loadImage("img/escapoPantalla.png");
		botonContinuar= app.loadImage("img/continuarBotonN.png");
		botonBatalla= app.loadImage("img/botonesBatalla.png");
		this.suerte = false;
		this.mal = false;
		

	}
	
	
	
	public void Selecciono(int w) {
		
		switch(w) {
		
		case 0:
			giraf.add(new Girafarig (0,0,"holi",0,100,"salvaje", app));
			
			break;
			
		case 1:
			
			emolga.add(new Emolga (0,0,"holi",0,100,"salvaje", app));

			
			
			break;
			
		case 2:
			
			bayleef.add(new Bayleef (0,0,"holi",0,100,"salvaje", app));

			
			break;
		
		
		}
		
	}
	
public void pintarVidas () {
		
		app.image(hpJugador, 0, 0,170,56);
		app.image(hpOponente, 530, 0,170,56);
		
		
	}
	
	public void pintarSeleccionado() {
		
		for(int i=0; i < emolga.size(); i++ ) {
			emolga.get(i).pintar(cambioPersonaje);
			emolga.get(i).vida();
			emolga.get(i).mover(cambioPersonaje);

			if((emolga.get(i).getVida()) <= 0) {
	        	 
			       turnos =3;
			
		            }

			
		}
        for(int i=0; i < giraf.size(); i++ ) {
        	
        	giraf.get(i).pintar(cambioPersonaje);
        	giraf.get(i).vida();
        	giraf.get(i).mover(cambioPersonaje);

        	if((giraf.get(i).getVida()) <= 0) {
	        	 
			       turnos =3;
			
		            }

			
		}
       for(int i=0; i < bayleef.size(); i++ ) {
    	   
    	   bayleef.get(i).pintar(cambioPersonaje);
    	   bayleef.get(i).vida();
    	   bayleef.get(i).mover(cambioPersonaje);

    	   if((bayleef.get(i).getVida()) <= 0) {
	        	 
		       turnos =3;
		
	            }

			
		}
		
	
		
       for(int i=0; i < poke.size(); i++ ) {
			
			poke.get(i).pintar(cambioEnemigo);
			poke.get(i).mover(cambioEnemigo);
			poke.get(i).vida();

			if((poke.get(i).getVida()) <= 20) {
	        	 
			       turnos =3;
			
		            }
			
		}
       
       
       if(mal == true) {
    	   
    	app.fill(255,0,0);
       	app.rect(300,300,100,200);
       }
       
       if(suerte == true) {
    	   
       	app.fill(0,255,0);
          	app.rect(300,200,100,200);
          }
		
		
		
		
	}
	
	
	
	
	
	public void Capturaste(int a) {
		
		
       switch(a) {
		
		case 1:
			poke.add(new Shaymin (300,-100,"holi",0,100,"salvaje", app));
			break;
			
		case 2:
			
			poke.add(new Bulbasaur (0,0,"holi",0,100,"salvaje", app));
			
			
			break;
			
		case 3:
			
			poke.add(new Luxray (0,0,"holi",0,100,"salvaje", app));


			
			break;
			
          case 4:
			
			poke.add(new Pikachu (0,0,"holi",0,100,"salvaje", app));


			
			break;
			
			
          case 5:
  			poke.add(new Gothorita (300,100,"holi",0,100,"salvaje", app));

  			
  			break;
  			
  		case 6:
  			
  			poke.add(new Luxray (0,0,"holi",0,100,"salvaje", app));


  			
  			
  			break;
  			
  		case 7:
  			
  			poke.add(new Manectric (0,0,"holi",0,100,"salvaje", app));


  			
  			break;
  			
            case 8:
  			
  			poke.add(new MegaGardevoir (0,0,"holi",0,100,"salvaje", app));


  			
  			break;
  			
            case 9:
      			poke.add(new MegaGardevoir (434,150,"holi",0,100,"salvaje", app));

      			
      			break;
      			
      		case 10:
      			
      			poke.add(new Pikachu (0,0,"holi",0,100,"salvaje", app));


      			
      			
      			break;
      			
      		case 11:
      			
      			poke.add(new Gothorita (0,0,"holi",0,100,"salvaje", app));


      			
      			break;
      			
                case 12:
      			
      			poke.add(new Bulbasaur (0,0,"holi",0,100,"salvaje", app));


      			
      			break;
  		
			
		
		
		
		}
		
	}
	
	public void comienza(int a) {
		
		
		
		if(a == 1) {
			
			app.image(botonBatalla,0,309);
		}
		
		if(a == 0) {
		
		app.image(botonContinuar,294,300);
		}	
	}
	
	
	
	
	//Se avisa que se 
	public void anuncio() {
		
	
		app.image(pantallaEncontrado,197,115,300,150);
		
		app.image(botonContinuar,253,285);
		
	}


public void atrapar() {
		
		int aleotoridad = (int)app.random(0,4);
		
		if(aleotoridad== 3) {
			
			System.out.print("Lo atrapaste");
			cambioEnemigo=3;
			app.image(pantallaAtrapado,0,0);
			suerte= true;
		}
        if(aleotoridad== 1 || aleotoridad== 2 || aleotoridad== 0) {
			
			System.out.print("Mala Suerte");
			cambioEnemigo=4;
			app.image(pantallaEscapo,0,0);
			mal = true;
		}
		
		
	}
	
	public void atacar(int a) {
		
		int quitarVida = (int) app.random(5,15);
		int quitarVida2 = (int) app.random(5,15);
		for(int i=0; i<poke.size(); i++) {
		switch(a) {
		
		case 0:
			for(int j=0; j<giraf.size(); j++) {
				
				switch(turnos) {
				
				//Pokemon Seleccionado
				case 0:
					
					cambioPersonaje=1;
					cambioEnemigo=1;	
					poke.get(i).setVida(poke.get(i).getVida()-quitarVida);
					
				    turnos =1;
					break;
				//Pokemon Encontrado

				case 1:
					cambioEnemigo=2;
					cambioPersonaje=2; 
		            giraf.get(j).setVida(giraf.get(j).getVida()- quitarVida2);
		            
		         
		            turnos = 0;
					break;

				case 3:
					
					// Si lo atrapa o se escapa. 
					
					int aleotoridad = (int)app.random(0,4);
					
					if(aleotoridad== 3) {
						
						System.out.print("Lo atrapaste");
						cambioEnemigo=3;
						app.image(pantallaAtrapado,0,0);
						suerte= true;
					}
			        if(aleotoridad== 1 || aleotoridad== 2 || aleotoridad== 0) {
						
						System.out.print("Mala Suerte");
						cambioEnemigo=4;
						app.image(pantallaEscapo,0,0);
						mal = true;
					}
				}
			}
			
			break;
			
			
		case 1:
                  for(int e=0; e<emolga.size(); e++) {
				
				switch(turnos) {
				
				//Pokemon Seleccionado
				case 0:
					
					cambioPersonaje=1;
					cambioEnemigo=1;	
					poke.get(i).setVida(poke.get(i).getVida()-quitarVida);
					
				    turnos =1;
					break;
				//Pokemon Encontrado

				case 1:
					cambioEnemigo=2;
					cambioPersonaje=2; 
					emolga.get(e).setVida(emolga.get(e).getVida()- quitarVida2);
		            
		         
		            turnos = 0;
					break;

				case 3:
					
					// Si lo atrapa o se escapa. 
					
					int aleotoridad = (int)app.random(0,4);
					
					if(aleotoridad== 3) {
						
						System.out.print("Lo atrapaste");
						cambioEnemigo=3;
						app.image(pantallaAtrapado,0,0);
						suerte= true;
					}
			        if(aleotoridad== 1 || aleotoridad== 2 || aleotoridad== 0) {
						
						System.out.print("Mala Suerte");
						cambioEnemigo=4;
						app.image(pantallaEscapo,0,0);
						mal = true;
					}
				}
			}
			
			break;
			
		case 2:
                  for(int e=0; e<bayleef.size(); e++) {
				
				switch(turnos) {
				
				//Pokemon Seleccionado
				case 0:
					
					cambioPersonaje=1;
					cambioEnemigo=1;	
					poke.get(i).setVida(poke.get(i).getVida()-quitarVida);
					
				    turnos =1;
					break;
				//Pokemon Encontrado

				case 1:
					cambioEnemigo=2;
					cambioPersonaje=2; 
					bayleef.get(e).setVida(bayleef.get(e).getVida()- quitarVida2);
		            
		         
		            turnos = 0;
					break;

				case 3:
					
					// Si lo atrapa o se escapa. 
					
					int aleotoridad = (int)app.random(0,4);
					
					if(aleotoridad== 3) {
						
						System.out.print("Lo atrapaste");
						cambioEnemigo=3;
						app.image(pantallaAtrapado,0,0);
						suerte= true;
					}
			        if(aleotoridad== 1 || aleotoridad== 2 || aleotoridad== 0) {
						
						System.out.print("Mala Suerte");
						cambioEnemigo=4;
						app.image(pantallaEscapo,0,0);
						mal = true;
					}
				}
			}
			
			break;
		}
		}
	}	
		
			
				
}