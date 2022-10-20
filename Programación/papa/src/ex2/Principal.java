package ex2;

public class Principal {

	public static void main(String args[]) {
		
		System.out.println("\tPrueba con la clase Transporte:");
		Transporte t1 = new Transporte(150,300,"Madrid", 500);
		
		System.out.println(t1);
		
		t1.introducirDestino("Perú", 25000);
		t1.setPrecio(1200);
		System.out.println(t1);
		
		System.out.println("\n\tPrueba con la clase Avion:");
		
		Avion a1 = new Avion(150,300,"Madrid", 500, 4,"Rayaner");
		
		System.out.println(a1);
		
		a1.introducirDestino("China", 25000);
		a1.setPrecio(150);
		a1.duracionVuelo();
		a1.setAsientos(6);
		a1.setAsientos(50);
		System.out.println(a1);
	
		System.out.println("\n\tPrueba con la clase Tierra:");
		
		Tierra tie1 = new Tierra(150,300,"Madrid", 500, "0008DTB", (short) 2);
		
		System.out.println(tie1.getAsientos());
		System.out.println(tie1.getMatricula());
		System.out.println(tie1.getDestino());
		tie1.introducirDestino("China", 25000);
		System.out.println(tie1.getDestino());
		if(tie1.introducirMatricula("123456AB")) {
			System.out.println("Matricula cambiada a 123456AB NO DEBERIA HACERLO");
		}else {
			System.out.println("La matricula no se ha cambiado.");
		}
		
		if(tie1.introducirMatricula("1234ABF")) {
			System.out.println("Matricula cambiada correctamente");
		}else {
			System.out.println("La matricula no se ha cambiado.");
		}
		System.out.println(tie1.getMatricula());
	
		System.out.println("\tPrueba con la clase Coche:");
		Coche c1 = new Coche(150,300,"Madrid", 500, "0008DTB", (short) 2,"Mercedes","a1");
		
		System.out.println(c1);
		
		c1.introducirDestino("Sofia", 287);
		c1.introducirMatricula("9874SDR");
		c1.setPrecio(12);
		c1.setMarca("Transformer");
		c1.setModelo("Optimus");
		System.out.println(c1);
		
		
	}	
}
