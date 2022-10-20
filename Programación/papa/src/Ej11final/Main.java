package Ej11final;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String motillo;
		String tipe;
		int lvl;
        boolean salir=false;

		Scanner sc = new Scanner(System.in);
		List<Pokemones> lista = new ArrayList<>();
		int eleccion = 0;
		while(!salir) {
			do {
				System.out.println("1. Añadir nuevo Pokémon (Max hasta 6)");
				System.out.println("2. Eliminar Pokémon (Se eliminará por el mote)");
				System.out.println("3. Ver equipo (Mostrará nombre, mote, tipo y nivel de cada pokemon)");
				System.out.println("4. Ver solo un Pokémon (Mostrará un pokemon de la lista)");
				System.out.println("5. Ordenar por defecto");
				System.out.println("6. Ordenar por nombre");
				System.out.println("7. Ordenar por nivel");
				System.out.println("8. Salir");
				eleccion = sc.nextInt();
				sc.nextLine();
			} while (eleccion < 1 || eleccion > 8);

			switch (eleccion) {
			case 1:
				System.out.println("Dime el nombre");
				name=sc.nextLine();
				System.out.println("Dime el mote");
				motillo=sc.nextLine();
				System.out.println("Dime el tipo");
				tipe=sc.nextLine();
				System.out.println("Dime el nivel");
				lvl=sc.nextInt();
				lista.add(new Pokemones(name, motillo, tipe, lvl));
				break;
			case 2:
				if (lista.size()>0) {
					System.out.println("Dime el mote");
					boolean hay=false;
					motillo=sc.nextLine();
					Iterator<Pokemones> itr=lista.iterator();
					while (itr.hasNext()&&!hay) {
						Pokemones p=itr.next();
						if (p.getMote().equals(motillo)) {
							System.out.println("Este sí");
							hay=true;
							lista.remove(p);
						}
					}
				}else {
					System.out.println("No hay pokemones a los que borrar");
					System.out.println("");
				}
				break;
			case 3:
				if (lista.size()>0) {
					for (int i=0;i<lista.size();i++) {
						System.out.println(lista.get(i).toString());
					}	
				}else {
					System.out.println("No puedes mostrar algo que no existe");
					System.out.println("");

				}
				break;
			case 4:
				if (lista.size()>0) {
					int random = (int) (Math.random()*lista.size());
					System.out.println(lista.get(random).toString());	
				}else {
					System.out.println("No puedes mostrar algo que no existe");
					System.out.println("");
				}
				break;
			case 5:
				Collections.sort(lista);
				break;
			case 6:
				Collections.sort(lista,new ComparaNombre());
				break;
			case 7:
				Collections.sort(lista,new ComparaNivel());
				break;
			case 8:
					salir=true;
				break;

			default:
				break;
			}
		}
		sc.close();
	}
}
