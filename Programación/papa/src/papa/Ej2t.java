package papa;
import java.util.Iterator;
import java.util.Scanner;

public class Ej2t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		int i=0;
		System.out.println("Dime las veces que quieres repetir el numero 0");
		try {
			int z=sc.nextInt();
			while (i<z) {
			System.out.println(i);
				z--;
				}	
			}
		catch(Exception e1) {
				System.out.println("Sigue buscando campeon");
			}				
	}
}
