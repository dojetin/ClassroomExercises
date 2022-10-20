package ejerciciosPracticar;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1=new Persona("Pedro", (short)23, 'H', (short)90, (short)1.76);
		Persona p2=new Persona("Alberto", (short)19, 'H', (short)81, (short)1.75);
		Persona p3=new Persona("Vilchez", (short)19, 'H', (short)65, (short)1.74);
//		Persona p4=new Persona("Rafa", (short)20, 'H', (short)76, (short)1.78);

		System.out.println(p1.IMC());
		System.out.println(p2.IMC());
		System.out.println(p3.IMC());
//		System.out.println(p4.IMC());
		System.out.println(p1.esMayorDeEdad());
		System.out.println(p2.esMayorDeEdad());
		System.out.println(p3.esMayorDeEdad());
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());

	}
}
