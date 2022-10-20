package ExamenFINAL;

import java.util.Comparator;

import Ej11final.Pokemones;

public class ComparaPrecio implements Comparator<Digimon>{
	@Override
	public int compare(Digimon o1, Digimon o2) {
		// TODO Auto-generated method stub
		if (o1.getPrecio_Venta()<o2.getPrecio_Venta()) {
			return 1;
		}else if (o1.getPrecio_Venta()>o2.getPrecio_Venta()) {
			return -1;
		}else {
			return 0;
		}
	}
}
