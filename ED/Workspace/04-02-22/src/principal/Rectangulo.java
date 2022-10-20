package principal;

public class Rectangulo {
	private int base;
	private int altura;
	
	public Rectangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	public double calculaArea() {
		double area;
		area=base*altura;
		return area;
	}
	public double perimetro() {
		double perimetro;
		perimetro=(2*base)+(altura*2);
		return perimetro;
	}
}
