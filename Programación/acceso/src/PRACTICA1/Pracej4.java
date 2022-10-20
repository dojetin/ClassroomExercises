package PRACTICA1;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Pracej4 {

	public static void main(String[] args) throws IOException {
		/*
		  4) Lectura: A partir del fichero anterior �quiosco.dat� y haciendo uso de la clase
			RandomAccessFile, visualiza todos los registros. El posicionamiento para
			empezar a recorrer los registros empieza en 0.
			La ejecuci�n de este ejercicio debe quedar as�:
			ID: 1, Estanteria: 3, TipoChuicheria: Chicles, PrecioSinIva: 3.2
			ID: 2, Estanteria: 2, TipoChuicheria: Gusanitos, PrecioSinIva: 18.5
		 */
		File fichero = new File("C:\\Users\\Usuario\\OneDrive\\Documents\\Programaci�n\\acceso\\src\\PRACTICA1\\quiosco.dat");
		RandomAccessFile raf=new RandomAccessFile(fichero,"rw");
		int id=raf.readInt();
		int count=0;
		try {
			while (count<id) {
				System.out.println("ID: "+id);
				System.out.println("Estanteria: "+raf.readInt());
				System.out.print("TipoChuche: ");
				for (int i = 0; i < 20; i++) {
					System.out.print(raf.readChar());
				}
				System.out.println();
				System.out.println("PrecioSinIva: "+raf.readDouble());
				id=raf.readInt();
				count++;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		raf.close();
	}

}
