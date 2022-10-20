package papa;

import java.util.Scanner;

public class Espeon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int num=0, total=0, contador=0;
		while (num>=0) {
			System.out.println("Introduce un numero");
			num=sc.nextInt();
			total=total+num;
			contador++;
		}
		System.out.println("Ha introducido "+contador+" numeros");
		System.out.println("La suma de todos los numeros es de "+total);

	}

}
