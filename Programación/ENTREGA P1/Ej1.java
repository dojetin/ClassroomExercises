package practica1;

import java.io.ObjectInputStream.GetField;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;


public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		new java.util.Random();
    Scanner sc = new Scanner(System.in);
	int aux=4,num,pos;
	int [] arrai=new int[5];
	int [] inverted=new int[5];
	for(int i=0; i<5;i++) {
		arrai[i]=(int) Math.floor(Math.random()*100);
		System.out.println("El array uno esta compuesto por : "+arrai[i]);
		}
		System.out.println();System.out.println();
		for (int i = 0; i < 5; i++) {
			inverted[i]=arrai[aux];
			System.out.println("El array dos esta compuesto por : "+inverted[i]);
			aux--;
		}
		do {
			System.out.println("En que posicion quiere introducir un numero");
			pos=sc.nextInt();
		} while (pos<0||pos>4);
		System.out.println("Que numero");
		num=sc.nextInt();
		while (num!=0) {
			arrai[pos]=num;
			//arays
			for (int i = 0; i < 5; i++)
		    {
		        System.out.println("El array uno esta compuesto por : "+arrai[i]);       
		    }
		    aux=4;
		    System.out.println("");
		    System.out.println("");
		    for (int i = 0; i<5; i++)
		        {
		            inverted[i]=arrai[aux];
		            System.out.println("El array dos esta compuesto por : "+inverted[i]);
		            aux--;
		        }
		        System.out.println("En que posicion quiere introducir un numero?");
		        pos=sc.nextInt();
		        System.out.println("Que numero?");
		        num=sc.nextInt();
		    }
		}
	}

