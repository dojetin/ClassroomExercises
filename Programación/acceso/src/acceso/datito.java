package acceso;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.Scanner;

public class datito {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		File fichero = new File("C:\\Users\\Usuario\\OneDrive\\Documents\\Programación\\acceso\\src\\acceso\\datito.txt");
		RandomAccessFile file=new RandomAccessFile(fichero,"rw");
		int id =0;
		String[] apellidos= {"Gil","Manzano","Martín","Arripitingalamo"};
		
		int dep[]= {10,20,10,20};
		Double[]salario= {2000.0,1500.0,1800.0,1300.0};
		for (int i = 0; i < salario.length; i++) {
			StringBuffer buffer=new StringBuffer(apellidos[i]);
			buffer.setLength(10);
		
			id++;
			file.writeInt(id);
			file.writeChars(buffer.toString());
			file.writeInt(dep[i]);
			file.writeDouble(salario[i]);
			/*
			System.out.println(id);
			System.out.println(buffer.toString());
			System.out.println(dep[i]);
			System.out.println(salario[i]);
			System.out.println(file.length());
			*/
		}

		int pos=-36;
		for (int i = 0; i < salario.length; i++) {
			System.out.println("Que ID buscas?");
			int iden=sc.nextInt()*36;
			sc.nextLine();
			/*
			System.out.println(iden+"iden");
			System.out.println(iden+pos+"iden+pos");
			*/
			file.seek(pos+iden);
			
			/*
			System.out.println(file.getFilePointer()+"pointer");
			System.out.println(file.length()+"length");
			*/
			
			if (file.getFilePointer()!=file.length()) {
				System.out.println(file.readInt()+"  identificador");
				for (int j = 0; j < 10; j++) {
					System.out.print(file.readChar());
					
				}
				System.out.println();
				System.out.println(file.readInt()+"   dep");
				System.out.println(file.readDouble()+"   dineros");
				
			}

		}
		sc.close();
		file.close();
	}

}
