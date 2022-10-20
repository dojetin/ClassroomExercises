package badman;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personas p1=new Personas("Pepe", "Juli", 2002);
		p1.calcular_edad();
		System.out.println(p1.getEdad());
		p1.identificar();
	}
		
}
