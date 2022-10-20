package paquete;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * A partir del fichero anterior “quiosco.dat” y haciendo uso de la clase
RandomAccessFile, visualiza todos los registros. El posicionamiento para
empezar a recorrer los registros empieza en 0.
La ejecución de este ejercicio debe quedar así:
ID: 1, Estanteria: 3, TipoChuicheria: Chicles, PrecioSinIva: 3.2
ID: 2, Estanteria: 2, TipoChuicheria: Gusanitos, PrecioSinIva: 18.5
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) throws EOFException {

		File f = new File("C:\\Users\\usuario\\Desktop\\DAM\\AcDatos\\cosas\\quiosco.dat");
		try {
			RandomAccessFile lee = new RandomAccessFile(f, "r");
			while (true) {
				System.out.println("ID: "+lee.readInt());
				System.out.println("Estanteria: "+lee.readInt());
				System.out.print("TipoChuche: ");
				for (int i = 0; i < 20; i++) {
					System.out.print(lee.readChar());
				}
				System.out.println("\nPrecioSinIva: "+lee.readDouble());
				System.out.println("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
