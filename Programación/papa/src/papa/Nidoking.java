package papa;

import java.util.Scanner;

public class Nidoking {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int[] nido= new int[100];
		int num=2, contador=0;
		while (num%2==0) {
			
			System.out.println("Dime un numero");
			num=sc.nextInt();
			if (num%2==1) {
				
			}else {
			nido[contador]=num;
			contador++;
		}
			}
		for (int i = 0; i < contador; i++) {
			System.out.println(nido[i]);
			
		}
	}

}
