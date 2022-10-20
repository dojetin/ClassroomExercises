package EntregableAlas11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import Ej11final.Pokemones;

public class EscrituraBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedWriter out = null;
		Scanner sc = new Scanner(System.in);
		int elec = 0;
		String nomes;
		List<String> lista = new ArrayList<>();
		lista.add("goku.txt");
		lista.add("vegeta.txt");
		do {
			System.out.println("Que desea hacer?");
			System.out.println("1. Leer archivos");
			System.out.println("2. Escribir archivos");
			elec = sc.nextInt();
			sc.nextLine();
			switch (elec) {
			case 1:
				try {
					BufferedReader in = new BufferedReader(new FileReader("./src/EntregableAlas11/archivos.txt"));
					String c = in.readLine();
					System.out.println(lista.size());
					do {
						System.out.println(c);
						c = in.readLine();
					} while (c != null);
				} catch (Exception e) {
					System.out.println("Bueno casi");
				}
				System.out.println("Que archivo quieres leer?");
				nomes = sc.nextLine();
				for (int i = 0; i < lista.size(); i++) {
					System.out.println(nomes);
					
					if (nomes.equals(lista.get(i))) {
						try {
							String ruta = "./src/EntregableAlas11/" + nomes;
							System.out.println(ruta);
							BufferedReader in = new BufferedReader(new FileReader(ruta));
							String c = in.readLine();
							do {
								System.out.println(c);
								c = in.readLine();
							} while (c != null);
						} catch (Exception e) {
							System.out.println("Bueno casi");
						}
					}
				}
				break;
			case 2:
				int eleccion;
				System.out.println("1. En un nuevo archivo");
				System.out.println("2. Sobreescribir un archivo");
				System.out.println("3. Escribir al final de un archivo");
				eleccion = sc.nextInt();
				sc.nextLine();
				switch (eleccion) {
				case 1:
					
					System.out.println("Dime el nombre del nuevo archivo");
					String nuevo = sc.nextLine();
					nuevo = nuevo + ".txt";
					String rutas="./src/EntregableAlas11/"+nuevo;
					System.out.println(rutas);
					lista.add(nuevo);
					System.out.println(lista.get(2));
					try {
						out = new BufferedWriter(new FileWriter(rutas, true));
						System.out.println("Que quieres escribir");
						String cad = sc.nextLine();

						out.write(cad);

					} catch (IOException e) {
						e.printStackTrace();
					} finally {
	
						try {
							out.newLine();
							out = new BufferedWriter(new FileWriter("./src/EntregableAlas11/archivos.txt", true));
							System.out.println("Que quieres escribir");
							String cad = nuevo;

							out.write(cad);

						} catch (IOException e) {
							e.printStackTrace();
						} finally {
							try {
								out.close();
							} catch (IOException e) {
								// TODO: handle exception
								e.printStackTrace();
							}
						}
						try {
							out.close();
						} catch (IOException e) {
							// TODO: handle exception
							e.printStackTrace();
						}
					}
					break;
				case 2:
					
					try {
						BufferedReader in = new BufferedReader(new FileReader("./src/EntregableAlas11/archivos.txt"));
						String c = in.readLine();
						do {
							System.out.println(c);
							c = in.readLine();
						} while (c != null);
					} catch (Exception e) {
						System.out.println("Bueno casi");
					}
					System.out.println("Dime el nombre del archivo que deseas sobreescribir");
					String archivi = sc.nextLine();
					try {
						out = new BufferedWriter(new FileWriter(archivi, false));
						System.out.println("Que quieres escribir");
						String cad = sc.nextLine();

						out.write(cad);

					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							out.close();
						} catch (IOException e) {
							// TODO: handle exception
							e.printStackTrace();
						}
					}
					break;
				case 3:
					try {
						BufferedReader in = new BufferedReader(new FileReader("./src/EntregableAlas11/archivos.txt"));
						String c = in.readLine();
						do {
							System.out.println(c);
							c = in.readLine();
						} while (c != null);
					} catch (Exception e) {
						System.out.println("Bueno casi");
					}
					System.out.println("Dime el nombre del archivo que deseas escribir al final");
					String archivo = sc.nextLine();
					try {
						out = new BufferedWriter(new FileWriter(archivo, true));
						System.out.println("Que quieres escribir");
						String cad = sc.nextLine();

						out.write(cad);

					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							out.close();
						} catch (IOException e) {
							// TODO: handle exception
							e.printStackTrace();
						}
					}
					break;
				}

				break;
			
			}
		} while (elec != -1);
	}

}
