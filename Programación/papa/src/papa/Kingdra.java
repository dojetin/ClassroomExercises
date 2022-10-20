package papa;
import java.util.Scanner;

public class Kingdra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero");
        int n = sc.nextInt();
		System.out.println("Dime un numero");
        int m = sc.nextInt();
        int g;
        if (n>m) {
			g=n;
			n=m;
			m=g;
		}
        for (int j=n ; j <= m; j++) {
    		System.out.println(j);

		}
	}

}
