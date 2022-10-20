package acceso;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Escrit {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File fichero = new File("C:\\Users\\Usuario\\OneDrive\\Documents\\Programación\\acceso\\src\\acceso\\random.txt");
		RandomAccessFile file=new RandomAccessFile(fichero,"rw");
		double [] numeros= {0.0,1.5,3.0,4.5};
		for (int i = 0; i < numeros.length; i++) {
			file.writeDouble(numeros[i]);
		}
		int pos=8;
		for (int i = 0; i < numeros.length; i++) {
			file.seek(pos);
			if (file.getFilePointer()!=file.length()) {
				System.out.println(file.readDouble());
				pos+=8;
			}
		}
		
		file.close();
	

		

	
	}
	
}
