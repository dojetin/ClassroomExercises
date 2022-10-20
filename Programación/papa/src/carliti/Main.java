package carliti;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int x=0;
		String opcion;
		String nombre="a";
		float precio=1;
		int unidades=1;
		Articulo articulos[] = new Articulo[11];
		Articulo articulos2[] = new Articulo[11];
		
		for(int i=0;i<11;i++) {
			System.out.println("Quieres introducir un articulo nuevo?");
			opcion =s.nextLine();
			
			if(opcion.equalsIgnoreCase("si")) {
				System.out.println("Escribe el nombre,el precio y las unidades que hay");
				nombre = s.next();
				precio = s.nextFloat();
				unidades = s.nextInt();
				s.nextLine();
				articulos[i] = new Articulo(nombre,precio,unidades);	
				x++;
			}else {
				i=11;
			}
		}
		
		for(int i=0;i<x;i++) {
			if(articulos[i].getUnidades()<10)
			System.out.println(articulos[i].getNombre());
		}
		s.close();
	}
	
}
