package paquete;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
/**
Recibe un identificador de chuchería y un importe. Se debe realizar
la modificación del precio. La modificación consistirá en sumar al precio de la
chuchería el importe introducido. El programa debe visualizar el Tipo de
chuchería, el precio antiguo y el nuevo. Si el identificador no existe, se realizará
una inserción del mismo y se informará de la operación realizada.
**/
public class Prac1Ej7 {

	public static void main(String[] args) {

		File f  = new File("C:\\Users\\usuario\\Desktop\\DAM\\AcDatos\\cosas\\quiosco.dat");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el ID: \n");
		Integer id = sc.nextInt();
		sc.nextLine(); //pa limpiar el buffer de lectura
		
		System.out.println("Introduce el añadido: \n");
		Double anadido = sc.nextDouble();
		sc.close();
			
		Long items = f.length()/56L; //nos indica el número de items guardados en el archivo .dat

		try {
			RandomAccessFile ins = new RandomAccessFile(f, "rw");
			
			Boolean	existe = false;
			Integer aux = null;
			for (Long i = 0L; i < items; i++) {
				ins.seek(i*56);
				aux=ins.readInt();
				if (id==aux) {
					existe=true;
					break;
				}
			}
			
			if (existe) { 
				System.out.println("La referencia "+id+" ya existe mi pana: vamos a modificarla");
				ins.seek((id-1)*56);
				ins.readInt(); //pasamos por el ID
				ins.readInt(); //pasamos por la estantería				
				
				System.out.print("Tipo de chucheria: ");
				for (int j = 0; j < 20; j++) System.out.print(ins.readChar());
				System.out.println();
				
				Double original = ins.readDouble();
				System.out.println("Precio original: "+original+" €");
				
				ins.seek(((id-1)*56)+48);//tenemos que volver a colocarnos donde nos corresponde tras leer
				System.out.println("Precio final: "+(original+anadido)+" €");
				anadido+=original;
				ins.writeDouble(anadido);
			} else {
				System.out.println("La referencia "+id+" NO existe mi pana: vamos a insertarla");
				ins.seek(f.length());
				ins.writeInt(id);
				aux=0;
				ins.writeInt(aux); //estantería cero
				for (int j = 0; j < 20; j++) ins.writeChar(32); //32 es el espacio  " "
				ins.writeDouble(anadido);
				System.out.println("Datos insertados!");
			}
			
			ins.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


}
