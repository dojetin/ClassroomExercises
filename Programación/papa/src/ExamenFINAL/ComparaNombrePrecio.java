package ExamenFINAL;

import java.util.Comparator;

public class ComparaNombrePrecio implements Comparator<Digimon>{
	
	@Override
	public int compare(Digimon o1, Digimon o2) {
		// TODO Auto-generated method stub
		if (o1.getNombre().charAt(0) > o2.getNombre().charAt(0)) {
			return 1;
		} else if (o1.getNombre().charAt(0) < o2.getNombre().charAt(0)) {
			return -1;
		} else {
			if (o1.getPrecio_Venta() < o2.getPrecio_Venta()) {
				return 1;
			} else if (o1.getPrecio_Venta() > o2.getPrecio_Venta()) {
				return -1;
			} else 
			return 0;
		}
	}
}
