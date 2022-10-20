package PRACTICA1;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Pracej3 {

	public static void main(String[] args) throws IOException {
		/*
		  3) Escritura: Inserta datos de un quiosco en un fichero llamado �quiosco.dat� a trav�s
			de la siguiente informaci�n:
			Estanter�a = {3,2,3,8,1}
			TipoChucheria = {�Chicles�, �Gusanitos�, �Gominola�, �Pipas�,
			�Piruletas�}
			PrecioSinIva = {3.2, 18.5, 2.5,15.17, 12.40}
			Por cada producto tambi�n se insertar� un identificador (mayor que 0) que
			coincidir� con el �ndice +1 con el que se recorrer�n los datos anteriores. El tama�o
			del campo tipoChucheria ser� fijo y ocupar� 20 caracteres. Debe hacer uso de la
			clase RandomAccessFile.
		 */
		File fichero = new File("C:\\Users\\Usuario\\OneDrive\\Documents\\Programaci�n\\acceso\\src\\PRACTICA1\\quiosco.dat");
		RandomAccessFile raf=new RandomAccessFile(fichero,"rw");
		Integer[] Estanteria= {3,2,3,8,1};
		String[] TipoChucheria= {"Chicles","Gusanitos","Gominola","Pipas","Piruletas"};
		Double[] PrecioSinIva= {3.2,18.5,2.5,15.17,12.40};
		StringBuffer buffer;
		
		for (int id = 0; id < Estanteria.length; id++) {
			buffer=new StringBuffer(TipoChucheria[id]);
			buffer.setLength(20);
			raf.writeInt(id+1);
			raf.writeInt(Estanteria[id]);
			raf.writeChars(buffer.toString());
			raf.writeDouble(PrecioSinIva[id]);
		}
		raf.close();
	}

}
