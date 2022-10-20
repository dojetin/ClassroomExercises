package Ej11final;

import java.util.Comparator;

public class ComparaNivel implements Comparator<Pokemones>{

	@Override
	public int compare(Pokemones o1, Pokemones o2) {
		// TODO Auto-generated method stub
		if (o1.getNivel()<o2.getNivel()) {
			return 1;
		}else if (o1.getNivel()>o2.getNivel()) {
			return -1;
		}else {
			return 0;
		}
	}
	
}
