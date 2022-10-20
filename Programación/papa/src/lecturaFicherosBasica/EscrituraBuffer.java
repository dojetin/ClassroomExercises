package lecturaFicherosBasica;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscrituraBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedWriter out = null;

		try {
			out = new BufferedWriter(new FileWriter("./src/lecturaFicherosBasica/jaja.txt", true));
			String cad = "Lorem ipsum dolor sit amet";
			
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
	}

}
