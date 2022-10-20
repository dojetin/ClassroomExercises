package paquete;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * Crea un método Java que inserte una chuchería en el fichero
“quiosco.dat”. El programa debe recibir 4 parámetros: identificador de la
chuchería, la estantería, el tipo de chuchería y el precio sin IVA. Antes de insertar
se comprobará si el identificador existe, en ese caso se debe visualizar un
mensaje indicándolo; si no existe se deberá insertar en la última posición del
fichero.
 *
 */
public class Prac1Ej6 {

	public static void main(String[] args) {

		File f  = new File("C:\\Users\\usuario\\Desktop\\DAM\\AcDatos\\cosas\\quiosco.dat");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el ID: \n");
		Integer id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduce la estanteria: \n");
		Integer est = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduce el tipo de chuche: \n");
		String tipoChuche = sc.next();
		sc.nextLine();
		
			StringBuffer chuche = new StringBuffer(tipoChuche);
			chuche.setLength(20);
			tipoChuche=chuche.toString();
		
		System.out.println("Introduce el precio SIN IVA: \n");
		Double precio = sc.nextDouble();
		sc.close();
			
		Long items = f.length()/56L; //nos indica el número de items guardados en el archivo .dat

		try {
			RandomAccessFile ins = new RandomAccessFile(f, "rw");
			if (id <= items) { 
				System.out.println("La referencia "+id+" ya existe mi pana");
			} else {
				ins.seek(f.length());
				ins.writeInt(id);
				ins.writeInt(est);
				for (int j = 0; j < 20; j++) {
					ins.writeChar(tipoChuche.charAt(j));
				}
				ins.writeDouble(precio);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
