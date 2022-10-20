package principak;

import java.util.Iterator;

public class LlenarNumeros {

	

	public int[] Llenar(int n) {
		int[] intArray = new int[n];
		for (int j = 1; j < n; j++) {
					
			intArray[j]=j+1;
			System.out.println(intArray[j]);
			
		}
		return intArray;
	}
	
	int sumar(int[] tabla) {
		int resultado=0;
		for (int i = 0; i < tabla.length; i++) {
			resultado+=tabla[i];
		}
		return resultado;
	}
	
	

	
	
}
