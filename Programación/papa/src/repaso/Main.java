package repaso;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Fecha fechita = new Fecha(1900, 2, 4);
		Fecha fechado = new Fecha(1995, 9, 15);
		Fecha facha = new Fecha(1998, 1, 1);
		Fecha ficha = new Fecha(1938, 4, 20);
		Scanner sc = new Scanner (System.in);
		
		Persona listaTrabajadores[] = new Persona[10];
		
		for(int i =0; i<10;i++) {
			
			if(i==1){
				listaTrabajadores[i] = new Trabajador("Manuel", "Picaso", "Malaga", "79169816K", ficha, 66724650, "picaso@picota.com", 2, 180, 0, 950, "limpieza");
			} else if(i%2==0) {
				listaTrabajadores[i] =new Estudiante("Pablo Bruno", "Nobrega", "Lopez", "18815987D", fechado, 608439985, "nunoeselmejor@creetelo.com", 1, "DAM", 1, 10); 
			}else {
				listaTrabajadores[i] = new Profesor ("Antonio", "Rufo", "Apellido2", "35857368T", facha, 657883497, "rufo@rufo.rufo", 1, 160, 0, 1000, facha, "DAM", "Programacion", true);
				
			}
			//System.out.println(listaTrabajadores[i]);
		}
				
	for(int i =0; i<10;i++) {
			
			if(listaTrabajadores[i].getNombre().equalsIgnoreCase("Manuel")) {
				System.out.println(listaTrabajadores[i]);
			}
		}
				
	
	int eleccion=0;
	do {
		System.out.println("¿Qué quieres hacer?");
		System.out.println("1. Introcudir estudiante");
		System.out.println("2. Introcudir profesor");
		System.out.println("3. Introcudir trabajador");
		System.out.println("4. Introducir todo por defecto");
		System.out.println("5. Mostrar todo");
		System.out.println("6. Mostrar trabajadores");
		System.out.println("7. Mostrar profesores");
		System.out.println("8. Mostrar estudiantes");
		System.out.println("9. Mostrar quien gana mas de X");
		System.out.println("0. Salir");
		eleccion=sc.nextInt();
	} while (eleccion<0||eleccion>9);
	
	
	}	
}
