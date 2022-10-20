package paquete;

import java.util.*;
import java.io.*;
/**
 * Crea un m�todo Java que consulte los datos de un tipo de chucher�a
del fichero �quiosco.dat�. El programa solicitar� un identificador desde l�nea de
comandos. Si la chucher�a existe, se visualizar�n sus datos, si no existe, se
visualizar� un mensaje indic�ndolo.
 *
 */
public class Prac1Ej5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el ID de la chucher�a que busca");
		
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
