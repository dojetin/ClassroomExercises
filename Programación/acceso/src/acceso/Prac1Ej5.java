package paquete;

import java.util.*;
import java.io.*;
/**
 * Crea un método Java que consulte los datos de un tipo de chuchería
del fichero “quiosco.dat”. El programa solicitará un identificador desde línea de
comandos. Si la chuchería existe, se visualizarán sus datos, si no existe, se
visualizará un mensaje indicándolo.
 *
 */
public class Prac1Ej5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el ID de la chuchería que busca");
		
		Long id = sc.nextLong();
		id = (id-1L)*56L;
		
		File f = new File("C:\\Users\\usuario\\Desktop\\DAM\\AcDatos\\cosas\\quiosco.dat");
		try {
			RandomAccessFile lee = new RandomAccessFile(f, "r");
			long memoria = f.length();
			lee.seek(id);
			System.out.println("ID: "+lee.readInt());
			System.out.println("Estanteria: "+lee.readInt());
			System.out.print("TipoChuche: ");
			for (int i = 0; i < 20; i++) {
				System.out.print(lee.readChar());
			}
			System.out.println("\nPrecioSinIva: "+lee.readDouble());
			System.out.println("\n");
		} catch (IOException e) {
			System.out.println("No hay lo que buscas! :-C");
		}
	}

}
