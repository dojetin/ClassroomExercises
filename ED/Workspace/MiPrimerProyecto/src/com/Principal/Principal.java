package com.Principal;

import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		int[] miTablaDevuelta = llenar(5);
		System.out.println("El Vector tabla es = a " + vectorToString(miTablaDevuelta));
	}

	private static int[] llenar(int n) {
		int[] tabla = new int[n];

		for (int i = 0; i < n; i++) {
			tabla[i] = i * 10;
		}
		return tabla;
	}

	public static String vectorToString(int[] miVector) {
			String resultado="";
			for(int i=0;i<miVector.length;i++) {
				resultado=resultado+miVector[i]+",";
			}
			return resultado;
		}
}
