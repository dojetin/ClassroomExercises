package puertas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edade=150;
		Persona personita[]=new Persona[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < personita.length; i++) {
        	personita[i]=new Persona(null, i, null);
			System.out.println("Dime un nombre para la persona "+(i+1));
			personita[i].setNombre(sc.next());
			System.out.println("Dime la edad para la persona "+(i+1));
			personita[i].setEdad(sc.nextInt());
			System.out.println("Dime el sexo para la persona "+(i+1));
			personita[i].setSerso(sc.next());
			System.out.flush();
		}

	       for (int i = 0; i < personita.length; i++) {
			if (personita[i].getSerso().contentEquals("mujer")&&personita[i].getEdad()<edade) {
				edade=personita[i].getEdad();
			}
		}
	       for (int i = 0; i < personita.length; i++) {
				if (edade==personita[i].getEdad()) {
					System.out.println(personita[i].getNombre()+" es la mujer de menor edad");
				}
	       	}
	    }
	}
