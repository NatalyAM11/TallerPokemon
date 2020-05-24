package model;

import java.util.Comparator;

public class TipoComparator implements Comparator<Pokemons> {

	

	@Override
	public int compare(Pokemons o1, Pokemons o2) {
		// TODO Auto-generated method stub
		return o1.getTipo().compareTo(o2.getTipo());  
	}

}
