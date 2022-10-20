package lecturaFicherosBasica;

import java.io.BufferedReader;
import java.io.FileReader;

public class LecturaBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			BufferedReader in=new BufferedReader(new FileReader("./src/lecturaFicherosBasica/jaja.txt"));
			String c=in.readLine();
			do {
				System.out.println(c);
				c=in.readLine();
			} while (c!=null);
		} catch (Exception e) {
			System.out.println("Bueno casi");
		}

	}

}
