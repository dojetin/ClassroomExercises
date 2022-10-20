package Ex1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado e1=new Empleado("David", 49164571, 'W');
		System.out.println(e1.mostrarDNICompleto());
		e1.introducirDNI(49164571, 'R');
		System.out.println(e1.mostrarDNICompleto());
		
		e1.setEstadoCivil("casado");
		e1.setHorasExtra(15);
		e1.setNumHijos(1);
		e1.setSueldoBruto(1000);
		System.out.println(e1.retenciones());
		System.out.println(e1.sueldoCompleto());
		System.out.println(e1.toStringBasico());
		System.out.println(e1.toString());
	}
}
