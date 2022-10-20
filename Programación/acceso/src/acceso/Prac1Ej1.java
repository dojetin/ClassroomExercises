package paquete;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Prac1Ej1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File archivo = new File("C:\\Users\\usuario\\Desktop\\listaDatos.txt");
		System.out.println("Escribe!: \n");
		String cadena = "";
		try {
			FileWriter palabra = new FileWriter(archivo);
			BufferedWriter escribe = new BufferedWriter(palabra);
			while (!cadena.equalsIgnoreCase("EXIT")) {
				cadena = sc.next();				
				if (!cadena.equalsIgnoreCase("EXIT")) {
					cadena = cadena.replaceAll("[aeiouAEIOU]", "·");
					escribe.write(cadena+", ");
				}
			}
			escribe.close();
			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
