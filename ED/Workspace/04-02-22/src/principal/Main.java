package principal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo cir=new Circulo(5);
		Cuadrado cua=new Cuadrado(7);
		Triangulo tria=new Triangulo(5, 7);
		Rectangulo rec=new Rectangulo(7, 4);
		
		System.out.println(cir.calculaArea());
		System.out.println(cir.perimetro());
		
		System.out.println(cua.calculaArea());
		System.out.println(cua.perimetro());
		
		System.out.println(tria.calculaArea());
		System.out.println(tria.perimetro());
		
		System.out.println(rec.calculaArea());
		System.out.println(rec.perimetro());
	}

}
