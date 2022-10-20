package paquete;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
/**
 * Crea un método Java que reciba un identificador de chuchería y lo borre.
Se hará un borrado lógico marcando el registro con la siguiente información:
	el identificador será igual a -1,
	el tipo será igual al identificador que se borra y
	la estantería y precio serán 0.
 *
 */
public class Prac8eJ8 {

	public static void main(String[] args) {

		File f  = new File("C:\\Users\\usuario\\Desktop\\DAM\\AcDatos\\cosas\\quiosco.dat");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el ID del registro a borrar: \n");
		Integer id = sc.nextInt();
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
			aux=null;
			
			if (existe) { 
				System.out.println("La referencia "+id+" existe mi pana: vamos a borrarla");
				ins.seek((id-1)*56);
				ins.writeInt(-1); //pasamos por el ID
				ins.writeInt(0); //pasamos por la estantería				
				
				//el tipo será igual al identificador que se borra
				aux=0;
				Integer[] num = {0};
				while (id>=10) {
					num[aux]=id%10;
					id=id/10;
					aux++;
				}
				num[aux]=id;
				for (int i = num.length-1; i >= 0 ; i--) {
					ins.writeChar((num[i]+48));
				}
				for (int j = 0; j < 20-num.length; j++) {
					ins.writeChar(32);
				}
								
				ins.writeDouble(0);
			} else {
				System.out.println("La referencia "+id+" NO existe mi pana:");
			}
			
			ins.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
