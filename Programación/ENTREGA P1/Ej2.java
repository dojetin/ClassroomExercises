package practica1;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

		
		
		
		
		char letrae='e';
		String frase;
	    int contador=0;
	   System.out.println("Dime una frase y te cuento las vocales");
	   frase=sc.nextLine();
	   for (int i = 0; i < frase.length(); i++)
	    {
	        if (frase.charAt(i)=='a'||frase.charAt(i)=='A'||frase.charAt(i)=='e'||frase.charAt(i)=='E'||frase.charAt(i)=='i'||frase.charAt(i)=='I'||frase.charAt(i)=='o'||frase.charAt(i)=='O'||frase.charAt(i)=='u'||frase.charAt(i)=='U')
	        {
	            contador++;
	            if (frase.charAt(i)=='a'||frase.charAt(i)=='A')
	            {
	            	frase.charAt(i)='e';
	            }
	        }
	    }
	    System.out.println("Tiene "+contador+" vocales");
	    System.out.println(frase);
		
		
		
		
		
		
		
	}

}
