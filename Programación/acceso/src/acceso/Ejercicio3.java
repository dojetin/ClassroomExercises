package paquete;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;

//Inserta datos de un quiosco en un fichero llamado �quiosco.dat� a trav�s
//de la siguiente informaci�n:
//Estanter�a = {3,2,3,8,1}
//TipoChucheria = {"Chicles", "Gusanitos", "Gominola", "Pipas","Piruletas"}
//PrecioSinIva = {3.2, 18.5, 2.5,15.17, 12.40}
//Por cada producto tambi�n se insertar� un identificador (mayor que 0) que
//coincidir� con el �ndice +1 con el que se recorrer�n los datos anteriores. El tama�o
//del campo tipoChucheria ser� fijo y ocupar� 20 caracteres. Debe hacer uso de la
//clase RandomAccessFile.

public class Ejercicio3 {

	public static void main(String[] args) {
				
		Integer[] Estanteria = {3,2,3,8,1};
		
		String[] TipoChucheria = {"Chicles", "Gusanitos", "Gominola", "Pipas","Piruletas"};
		for (int i = 0; i < TipoChucheria.length; i++) {			
			StringBuffer chuche = new StringBuffer(TipoChucheria[i]);
			chuche.setLength(20);
			TipoChucheria[i]=chuche.toString();
		}
				
		Double[] PrecioSinIva = {3.2D, 18.5D, 2.5D, 15.17D, 12.40D};
		
		File f = new File("C:\\Users\\usuario\\Desktop\\DAM\\AcDatos\\cosas\\quiosco.dat");
		try {
			RandomAccessFile escribe = new RandomAccessFile(f, "rw");
			int i=0; 
			while (i<5) {
				escribe.writeInt(i+1);
				escribe.writeInt(Estanteria[i]);
				for (int j = 0; j < 20; j++) {
					escribe.writeChar(TipoChucheria[i].charAt(j));
				}
				escribe.writeDouble(PrecioSinIva[i]);
				i++;
			}
			escribe.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
