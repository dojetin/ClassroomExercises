package PRACTICA1;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Pracej8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 8) Borrado: Crea un m�todo Java que reciba un identificador de chucher�a y lo borre.
			Se har� un borrado l�gico marcando el registro con la siguiente informaci�n: el
			identificador ser� igual a -1, el tipo ser� igual al identificador que se borra y la
			estanter�a y precio ser�n 0.
		 */
		Scanner sc = new Scanner (System.in);
		File fichero = new File("C:\\Users\\Usuario\\OneDrive\\Documents\\Programaci�n\\acceso\\src\\PRACTICA1\\quiosco.dat");
		RandomAccessFile raf=new RandomAccessFile(fichero,"rw");
		
		System.out.println("Dime el identificador");
		int id=sc.nextInt();
		boolean existe=false;
		int puntero=((id-1)*56);
		raf.seek(puntero);
		while (true) {
			int idArchivo=raf.readInt();
			if (idArchivo==id) {
				existe=true;
				break;
			}else {
				puntero+=56;
				raf.seek(puntero);
			}
		}
		puntero=((id-1)*56);
		raf.seek(puntero);
		if (existe) {
			raf.writeInt(-1);
			raf.writeInt(0);
			raf.writeChars(id+"");

		}
	}

}
