package paquete;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Prac1Ej2 {
	public static int CuentaPalabras(String linea) {
		Integer word = 0;
		for (char c: linea.toCharArray()) if (c==32) word++;
		return word;
	}
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader(new File("C:\\Users\\usuario\\Desktop\\quijote.txt"));
			BufferedReader bfr = new BufferedReader(fr);
			Integer w = 0;
			while (bfr.ready()) w+=CuentaPalabras(bfr.readLine());
			bfr.close();
			System.out.println("El número de palabras en el fichero es: "+w);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}