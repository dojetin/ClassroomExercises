package principal;

public class Circulo {
	private int radio;
	final double pi=3.1415926525;
	
	public Circulo(int radio) {
		super();
		this.radio = radio;
	}

	public double calculaArea() {
		double area;
		area=pi*(radio*radio);
		return area;
	}
	public double perimetro() {
		double perimetro;
		perimetro=2*pi*radio;
		return perimetro;
	}
}


