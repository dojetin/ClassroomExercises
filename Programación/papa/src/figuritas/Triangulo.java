package figuritas;

public class Triangulo extends Figura{
	private double base;
	private double altura;
	
	
	public Triangulo(double base, double altura, String color) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		double area;
		area=base*altura/2;
		System.out.println(area);
	}


	@Override
	public void calcularPerimetro() {
		// TODO Auto-generated method stub
		double perimetro;
		perimetro=base*3;
		System.out.println(perimetro);
	}
	
	
}
