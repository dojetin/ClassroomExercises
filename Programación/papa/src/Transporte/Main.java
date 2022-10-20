package Transporte;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner (System.in);
			int cuantos,elec,c1=0;
			do {
				System.out.println("Cuantos paquetes qu ieres introducir?");
				cuantos=sc.nextInt();
			} while (cuantos<1);
			Paquete[] p1 = new Paquete[cuantos];
			while (cuantos>0) {
				do {
					System.out.println("1.Paquete Grande");
					System.out.println("2.Paquete Pequeño");
					System.out.println("3.Carta");
					System.out.println("4.Carta Certificada");
					elec=sc.nextInt();
					sc.nextLine();
				} while (elec<1||elec>4);
				switch (elec) {
				case 1: {
					System.out.println("Dime la ciudad de destino");
					String destinino=sc.nextLine();
					System.out.println("Dime la ciudad de origen");
					String origenino=sc.nextLine();
					System.out.println("Dime la altura");
					int alt=sc.nextInt();
					sc.nextLine();
					System.out.println("Dime la anchura");
					int anch=sc.nextInt();
					sc.nextLine();
					System.out.println("Dime el grosor");
					int gro=sc.nextInt();
					sc.nextLine();
					p1[c1]=new PaqueteGrande(destinino, origenino, alt, anch, gro);
					c1++;
					cuantos--;
					elec=0;
				}
				case 2: {
					System.out.println("Dime la ciudad de destino");
					String destinino=sc.nextLine();
					System.out.println("Dime la ciudad de origen");
					String origenino=sc.nextLine();
					System.out.println("Dime el peso");
					int pes=sc.nextInt();
					sc.nextLine();
					p1[c1]=new PaquetePequeño(destinino, origenino, pes);
					c1++;
					cuantos--;
					elec=0;
				}
				case 3: {
					System.out.println("Dime la ciudad de destino");
					String destinino=sc.nextLine();
					System.out.println("Dime la ciudad de origen");
					String origenino=sc.nextLine();
					System.out.println("Tiene sello?");
					boolean sellito=sc.nextBoolean();
					sc.nextLine();
					System.out.println("Dime el mensaje de la carta");
					String mensa=sc.nextLine();
					
					p1[c1]=new Carta(destinino, origenino, sellito, mensa);
					c1++;
					cuantos--;
					elec=0;
				}
				case 4: {
					System.out.println("Dime la ciudad de destino");
					String destinino=sc.nextLine();
					System.out.println("Dime la ciudad de origen");
					String origenino=sc.nextLine();
					System.out.println("Tiene sello?");
					boolean sellito=sc.nextBoolean();
					sc.nextLine();
					System.out.println("Dime el mensaje de la carta");
					String mensa=sc.nextLine();
					p1[c1]=new CartaCertificada(destinino, origenino, sellito, mensa);
					c1++;
					cuantos--;
					elec=0;
				}
				default:
				}
			}
			for (int i = 0; i < p1.length; i++) {
				p1[i].toString();
			}
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
