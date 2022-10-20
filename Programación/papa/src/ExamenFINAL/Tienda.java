package ExamenFINAL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import Ej11final.ComparaNivel;
import Ej11final.ComparaNombre;
import Ej11final.Pokemones;

public class Tienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eleccion = 0;
		String Salir = " ";
		Scanner sc = new Scanner(System.in);
		List<Digimon> lista = new ArrayList<>();
		lista.add(new Digimon("javi", 12, 5));
		lista.add(new Digimon("julio", 150, 50));
		lista.add(new Digimon("alvaro", 2, 50));
try {
	while (Salir != "Salir" || Salir != "Volver") {
		do {
			System.out.println("1. Mostrar artículos");
			System.out.println("2. Venta a cliente");
			System.out.println("3. Compra a proveedor");
			System.out.println("4. Gestiona artículos.");
			System.out.println("5. Criterios de ordenación");
			System.out.println("6. Salir");
			eleccion = sc.nextInt();
			sc.nextLine();
		} while (eleccion < 1 || eleccion > 6);

		switch (eleccion) {
		case 1:
			if (lista.size() > 0) {
				for (int i = 0; i < lista.size(); i++) {
					System.out.println(lista.get(i).toString());
				}
			} else {
				System.out.println("No puedes mostrar algo que no existe");
				System.out.println("");

			}
			break;

		case 2:
			List<Integer> ides = new ArrayList<>();
			List<Integer> cantidades = new ArrayList<>();
			int i = 0;
			boolean confirmacion = false;
			int ide = 1;
			int idegood = 0;
			int cantidad = 0;
			double valor = 0;
			boolean existe = false;
			boolean haySuficientes = false;
			if (lista.size() > 0) {
				System.out.println("Dime el ID del articulo que deseas comprar");
				ide = sc.nextInt();
				sc.nextLine();
				while (ide > -1) {
					existe = false;
					haySuficientes = false;
					idegood = ide;
					Iterator<Digimon> itr = lista.iterator();
					while (itr.hasNext() && !existe) {
						Digimon d = itr.next();
						if (d.getId() == (ide)) {
							existe = true;
							System.out.println("Cuantos kieres?");
							cantidad = sc.nextInt();
							sc.nextLine();
							if (d.getStock() >= cantidad) {
								haySuficientes = true;
								cantidades.add(cantidad);
								ides.add(ide);
								valor = valor + d.getPrecio_Venta() * cantidad;
							} else {
								System.out.println("No hay suficientes en stock");
							}
						} else {

						}

					}

					System.out.println("Dime el ID del articulo que deseas comprar");
					ide = sc.nextInt();
				}
				if (ides.size() > 0) {
					System.out.println("El precio total es de " + valor);
					System.out.println("Sigues adelante con la operacion?");
					System.out.println("true/false");
					confirmacion = sc.nextBoolean();
					if (confirmacion) {
						for (int j = 0; j < ides.size(); j++) {
							Iterator<Digimon> itr = lista.iterator();
							while (itr.hasNext()) {
								Digimon d = itr.next();
								if (d.getId() == ides.get(j)) {
									System.out.println(cantidad);
									lista.get(idegood).setStock(lista.get(idegood).getStock() - cantidad);
								}
							}

						}

					}
				}

			} else {
				System.out.println("No hay digimones a los que comprar");
				System.out.println("");
			}

			break;
		case 3:
			int ideCompra = 0;
			int cantidadCompra = 0;
			System.out.println("Dime el id del producto que deseas comprar");
			ideCompra = sc.nextInt();
			sc.nextLine();
			System.out.println("Cuantos quieres?");
			cantidadCompra = sc.nextInt();
			sc.nextLine();
			lista.get(ideCompra).setStock(lista.get(ideCompra).getStock()+cantidadCompra);

			
			break;
		case 4:

			int election = 0;
			System.out.println("1) Añadir articulo");
			System.out.println("2) Eliminar articulo");
			System.out.println("3) Editar articulo");
			System.out.println("4) Volver al menu articulo");
			election = sc.nextInt();
			sc.nextLine();
			switch (election) {
			case 1: {
				String name;
				double presi;
				int cuanto = 0;
				System.out.println("Dime el nombre");
				name = sc.nextLine();
				System.out.println("Dime el precio");
				presi = sc.nextDouble();
				System.out.println("Dime el stock");
				cuanto = sc.nextInt();
				sc.nextLine();
				lista.add(new Digimon(name, presi, cuanto));
				break;
			}
			case 2: {
				int inde = 0;
				System.out.println("Dime la posicion(Si estan ordenador por ID será el ID)");
				inde = sc.nextInt();
				sc.nextLine();
				lista.remove(inde);
				break;
			}
			case 3: {
				int inde = 0, eles = 0;
				System.out.println(
						"Dime la posicion del pokemon que quieras modificar(Si estan ordenador por ID será el ID)");
				inde = sc.nextInt();
				sc.nextLine();
				System.out.println("Que atributo quieres modificar?");
				System.out.println("1. IVA");
				System.out.println("2. Precio proveedor");
				System.out.println("3. Precio venta");
				System.out.println("4. Set stock");
				eles = sc.nextInt();
				sc.nextLine();
				switch (eles) {
				case 1:
					int iva = 0;
					System.out.println("Nuevo iva");
					iva = sc.nextInt();
					lista.get(inde).setIVA(iva);
					break;
				case 2:
					int Precio = 0;
					System.out.println("Nuevo Precio");
					Precio = sc.nextInt();
					lista.get(inde).setPrecio_Proveedor(Precio);
					break;
				case 3:
					int Precio1 = 0;
					System.out.println("Nuevo Precio");
					Precio1 = sc.nextInt();
					lista.get(inde).setPrecio_Venta(Precio1);
					break;
				case 4:
					int Stoc = 0;
					System.out.println("Nuevo stock");
					Stoc = sc.nextInt();
					lista.get(inde).setStock(Stoc);
					break;
				default:
					break;
				}
				break;
			}
			case 4: {

				break;
			}
			default:
			}

			break;
		case 5:
			int elecs = 0;
			System.out.println("Que tipo de orden quieres");
			System.out.println("1. Por defecto(ID)");
			System.out.println("2. Por precio_v");
			System.out.println("3. Por nombre y precio");
			elecs = sc.nextInt();
			switch (elecs) {
			case 1:
				Collections.sort(lista);

				break;
			case 2:
				Collections.sort(lista,new ComparaPrecio());
				break;
			case 3:
				Collections.sort(lista,new ComparaNombrePrecio());
				break;
			default:
				break;
			}
			break;
		case 6:
			Salir = "Salir";
			break;

		default:
			break;
		}
	}
} catch (Exception inputMismatchException) {
	System.out.println("No me ha dado tiempo");
}
		
		sc.close();
	}
}
