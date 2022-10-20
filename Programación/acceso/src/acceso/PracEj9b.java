package paquete;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * Crea un método que muestre los identificadores de las chucherías borradas.
 *
 */
public class PracEj9 {
	
	public static void main(String[] args) {
		String fichero = "C:\\Users\\usuario\\Desktop\\_DAM_\\AcDatos\\cosas\\quiosco.dat";
		showErased(fichero);
	} 
	
	public void showErased(String ruta) {

		File f  = new File(ruta);
			
		Long items = f.length()/56L; //nos indica el número de items guardados en el archivo .dat

		try {
			RandomAccessFile ins = new RandomAccessFile(f, "rw");			
			Boolean	existe = false;
			Integer aux = null;
			Integer id = -1;
			System.out.print("Los IDs de las chucherías borradas son: ");
			for (Long i = 0L; i < items; i++) {
				ins.seek(i*56);
				aux=ins.readInt();
				if (id==aux) {
					ins.seek(i*56+8);
					for (int j = 0; j < 20; j++) {
						System.out.print(ins.readChar());
					}
					System.out.print(", ");
				}
			}
			ins.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
