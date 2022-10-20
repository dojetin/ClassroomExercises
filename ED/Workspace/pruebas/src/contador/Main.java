	package contador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Contador c1=new Contador(5);
			System.out.println(c1.getNumeroQueLlevaLaCuenta());
			c1.resta1();
			System.out.println(c1.getNumeroQueLlevaLaCuenta());
			c1.suma1();
			System.out.println(c1.getNumeroQueLlevaLaCuenta());
			c1.resta1(4);
			System.out.println(c1.getNumeroQueLlevaLaCuenta());
			c1.suma1(5);
			System.out.println(c1.getNumeroQueLlevaLaCuenta());
			c1.sumaValor(-3);
			System.out.println(c1.getNumeroQueLlevaLaCuenta());

	}

}
