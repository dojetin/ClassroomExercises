package principal;

public class Cuadrado {
	private int lado;

	public Cuadrado(int lado) {
		super();
		this.lado = lado;
	}
	public double calculaArea() {
		double area;
		area=lado*lado;
		return area;
	}
	public double perimetro() {
		double perimetro;
		perimetro=lado*4;
		return perimetro;
	}
}
