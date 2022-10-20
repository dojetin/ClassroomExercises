package acceso;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class Pruebita {

	public static void main(String[] args) throws IOException {
		/*
		//ej1
		File archivo = new File ("C:\\Users\\Usuario\\OneDrive\\Documents\\Programación\\acceso\\src\\acceso\\hola.txt");
		FileReader fr = new FileReader (archivo);
		BufferedReader br = new BufferedReader(fr);
		String linea = br.readLine();
		System.out.println(linea+"\nNombre "+archivo.getName()+"\nruta "+archivo.getPath()+"\nabsoluta "+archivo.getAbsolutePath());
	
		//ej2
		String carpetaActiva = System.getProperty("user.dir");
		File carpeta = new File(carpetaActiva);
		File[] listado = carpeta.listFiles();
    	System.out.println("\n\t Ejercicio 2");
		    for (int i=0; i< listado.length; i++) {
		        System.out.println(listado[i]);
		        if (listado[i].isDirectory()) {
					
				}
		}
		//ej3
		    try {
				String ruta="C:\\Users\\Usuario\\OneDrive\\Documents\\Programación\\acceso\\src\\acceso\\Marvel.txt";
				String[] contenido={"Iron Man","Thor","Thanos","Deadpool"};
				File marvelito = new File (ruta);


				
				FileWriter fw=new FileWriter(marvelito);
				BufferedWriter bw = new BufferedWriter(fw);
				for (int i = 0; i < contenido.length; i++) {
					bw.write(contenido[i]);
					bw.newLine();
				}
				
				bw.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
		    
		    
		 //ej4
		    String ruta="C:\\Users\\Usuario\\OneDrive\\Documents\\Programación\\acceso\\src\\acceso\\pokemon.txt";
		    String ruta1="C:\\Users\\Usuario\\OneDrive\\Documents\\Programación\\acceso\\src\\acceso\\primera.txt";
		    String ruta2="C:\\Users\\Usuario\\OneDrive\\Documents\\Programación\\acceso\\src\\acceso\\segunda.txt";
		    String ruta3="C:\\Users\\Usuario\\OneDrive\\Documents\\Programación\\acceso\\src\\acceso\\tercera.txt";

			String[] primera={"charmander","squirtle","bulbasaur"};
			String[] segunda={"chikorita","cyndaquil","totodile"};
			String[] tercera={"treecko","torchic","mudkip"};
			File pkimane = new File (ruta);

	
			FileReader fre = new FileReader (pkimane);
			BufferedReader bre = new BufferedReader(fre);
			
			
			
			String pokimon="ey";
			int aux=0;
			while (aux<9&&pokimon!=null) {
				try {
					pokimon=bre.readLine();
					System.out.println(pokimon);
					System.out.println(aux);
					if (pokimon.equals(primera[0])||pokimon.equals(primera[1])||pokimon.equals(primera[2])) {
						File g1 = new File (ruta1);
						FileWriter fw=new FileWriter(g1);
						BufferedWriter bw = new BufferedWriter(fw);

						bw.write(pokimon);
						bw.newLine();
						aux++;
						bw.close();
					}
					if (pokimon.equals(segunda[0])||pokimon.equals(segunda[1])||pokimon.equals(segunda[2])) {
						File g2 = new File (ruta2);
						FileWriter fwd=new FileWriter(g2);
						BufferedWriter bwd = new BufferedWriter(fwd);
						
						bwd.write(pokimon);
						bwd.newLine();
						aux++;
						bwd.close();
					}
					if (pokimon.equals(tercera[0])||pokimon.equals(tercera[1])||pokimon.equals(tercera[2])) {
						File g3 = new File (ruta3);
						FileWriter fw3=new FileWriter(g3);
						BufferedWriter bw3 = new BufferedWriter(fw3);
						
						bw3.write(pokimon);
						bw3.newLine();
						aux++;
						bw3.close();
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			*/
			//Ej5
			try {
			    String rutaej5="C:\\Users\\Usuario\\OneDrive\\Documents\\Programación\\acceso\\src\\acceso\\FichData.dat";
				
				FileOutputStream fileo=new FileOutputStream(new File (rutaej5));
				DataOutputStream filed=new DataOutputStream(fileo);
				
				FileInputStream file=new FileInputStream(rutaej5);
				DataInputStream fileiN=new DataInputStream(file);
				
				String[] nombres= {"Pepe","Pipo","Pedro"};
				int[] edades= {14,19,23};
				
				for (int i = 0; i < edades.length; i++) {
					filed.writeUTF(nombres[i]);
					filed.writeInt(edades[i]);
				}
				filed.close();
				for (int i = 0; i < edades.length; i++) {
					System.out.println(fileiN.readUTF());
					System.out.println(fileiN.readInt());
				}
				fileiN.close();
				
				
			} catch (Exception e) {
			}



			
	}

}
