package papa;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int hora;
		String dia;
		System.out.println("Dime el día de la semana");
		dia=sc.next();
		System.out.println("Dime la hora \n 1. Primera\n 2. Segunda\n 3. Tercera\n 4. Cuarto\n 5. Quinta\n 6. Sexta ");
		hora=sc.nextInt();
		switch (dia) {
		case "Lunes":
		case "lunes":
				if (hora==1||hora==2) {
					System.out.println("Sistemas Informáticos");
				}else if (hora==3||hora==4) {
					System.out.println("Base de datos");
				}else{
					System.out.println("Entornos de desarrollo");
				}
			break;
		case "Martes":
		case "martes":
			if (hora==1) {
				System.out.println("Sistemas Informáticos");
			}else if (hora==2||hora==3) {
				System.out.println("Base de datos");
			}else{
				System.out.println("Lenguaje de marcas");
			}
			break;
		case "Miercoles":
		case "miercoles":
			if (hora==1||hora==2||hora==3) {
				System.out.println("Programacion");
			}else{
				System.out.println("FOL");
			}
			break;
		case "Jueves":
		case "jueves":
			if (hora==1||hora==2) {
				System.out.println("Programacion");
			}else if (hora==3) {
				System.out.println("Sistemas Informaticos");
			}else{
				System.out.println("Base de datos");
			}
			break;
		case "Viernes":
		case "viernes":
			if (hora==1) {
				System.out.println("Entornos de desarrollo");
			}else if (hora==2||hora==3||hora==4) {
				System.out.println("Programacion");
			}else{
				System.out.println("Sistemas Informaticos");
			}
			break;
		default:
			break;
		}
	}

}
