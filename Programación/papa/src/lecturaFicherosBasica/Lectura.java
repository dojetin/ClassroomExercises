package lecturaFicherosBasica;

import java.io.FileReader;

public class Lectura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader in;
		//C:\\Users\\Usuario\\OneDrive\\Documents\\Programación\\papa\\src\\lecturaFicherosBasica/jaja.txt
		try {
			in=new FileReader("./src/lecturaFicherosBasica/jaja.txt");
			int c=in.read();
			
			do {
				System.out.print((char)c);
				c=in.read();
			} while (c!=-1);
			
		} catch (Exception e) {
			System.out.println("Bueno casi");
		}
	}

}
