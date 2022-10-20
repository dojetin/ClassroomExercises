package lecturaFicherosBasica;

import java.io.FileWriter;
import java.io.IOException;

public class Escriturita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter out=null;
		
		try {
			out=new FileWriter("./src/lecturaFicherosBasica/jaja.txt",true);
			String cad="Lorem ipsum dolor sit amet";
			for (int i = 0; i < cad.length(); i++) {
				out.write(cad.charAt(i));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				out.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
