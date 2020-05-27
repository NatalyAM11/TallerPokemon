package model;

import java.util.Comparator;

public class FechaComparator implements Comparator <User> {

	
	public int compare(User o1, User o2) {
		
		return o1.getFecha().compareTo(o2.getFecha());
	}

}
