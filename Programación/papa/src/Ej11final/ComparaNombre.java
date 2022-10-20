package Ej11final;

import java.util.Comparator;

public class ComparaNombre implements Comparator<Pokemones>{

	@Override
	public int compare(Pokemones o1, Pokemones o2) {
		// TODO Auto-generated method stub
		if (o1.getNombre().charAt(0)>o2.getNombre().charAt(0)) {
			return 1;
		}else if (o1.getNombre().charAt(0)<o2.getNombre().charAt(0)) {
			return -1;
		}else {
			return 0;
		}
	}

}
