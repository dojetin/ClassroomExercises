package PRACTICA1;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Pracej5 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner (System.in);

		/*
		  5) Consulta: Crea un m�todo Java que consulte los datos de un tipo de chucher�a
			del fichero �quiosco.dat�. El programa solicitar� un identificador desde l�nea de
			comandos. Si la chucher�a existe, se visualizar�n sus datos, si no existe, se
			visualizar� un mensaje indic�ndolo.
		*/
		File fichero = new File("C:\\Users\\Usuario\\OneDrive\\Documents\\Programaci�n\\acceso\\src\\PRACTICA1\\quiosco.dat");
		RandomAccessFile raf=new RandomAccessFile(fichero,"rw");
		System.out.println("Dime el identificador de la chucheria");
		int ide=sc.nextInt();
		int posSeek=-56;
		try {
			while (true) {
				posSeek+=56;
				raf.seek(posSeek);
				int idArchivo=raf.readInt();

				if (idArchivo==ide) {
					System.out.println("ID: "+idArchivo);
					System.out.println("Estanteria: "+raf.readInt());
					System.out.print("TipoChuche: ");
					for (int i = 0; i < 20; i++) {
						System.out.print(raf.readChar());
					}
					System.out.println();
					System.out.println("PrecioSinIva: "+raf.readDouble());
				}
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Bro, ese no existe, no trolees");
		}
			raf.close();
			sc.close();
	}

}
