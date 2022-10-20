package papa;
public class Ej20 {
	public static void main(String[] args) {
		int r=0,c=0;
		do {
			 r=(int) (Math.random()*100)+1;
			if (r%2==0) {
				 System.out.println(r);
				c++;
			}
		} while (r!=24);
	System.out.println(c+" intentos");
	}
}