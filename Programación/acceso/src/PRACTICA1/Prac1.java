package PRACTICA1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Prac1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		/*
		 * 1) Realizar un ejercicio en el que vayamos leyendo palabras del teclado hasta
		 * que el usuario introduzca la palaba “EXIT”. Sin necesidad de una estructura
		 * auxiliar (arrays, arraList, list, etc...) debemos guardar en un fichero de
		 * texto llamada “listaDatos.txt” todas las palabras introducidas, pero
		 * cambiando las vocales por el carácter “.” A continuación, debemos mostrar por
		 * pantalla todas las palabras introducidas y después de ser modificadas.
		 */
		
		File fichero = new File(
				"C:\\Users\\Usuario\\OneDrive\\Documents\\Programación\\acceso\\src\\PRACTICA1\\listaDatos.txt");
		FileWriter fw = new FileWriter(fichero);
		BufferedWriter file = new BufferedWriter(fw);

		System.out.println("Dime una palabra");
		String inWord = sc.nextLine();
		if (inWord!=null&&inWord!="EXIT") {

		}
		while (!inWord.equals("EXIT")) {
			file.write(inWord + "\n");
			inWord = inWord.replaceAll("[aeiouAEIOUáéíóúÁÉÍÓÚ]", ".");
			file.write(inWord + "\n");
			System.out.println("Dime una palabra");
			inWord = sc.nextLine();
			if (inWord!=null&&inWord!="EXIT") {

			}
		}
		file.close();

		FileReader fr = new FileReader(fichero);
		BufferedReader fileR = new BufferedReader(fr);
		
		String linea=fileR.readLine();
		while (linea!=null) {
			System.out.println(linea);
			linea=fileR.readLine();
		}	
		fileR.close();
		sc.close();
	}
}
