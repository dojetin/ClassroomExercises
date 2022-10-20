package huevosConChorizo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comidita c1=new Comidita(5, 500);
		System.out.println(c1.getPlatos());
		c1.addHuevos(16);
		System.out.println(c1.getPlatos());

	}

}
