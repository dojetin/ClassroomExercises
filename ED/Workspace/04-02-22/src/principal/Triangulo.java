package principal;

public class Triangulo {
private int lado;
private int altura;


public Triangulo(int lado, int altura) {
	super();
	this.lado = lado;
	this.altura = altura;
}
public double calculaArea() {
	double area;
	area=lado*altura;
	return area;
}
public double perimetro() {
	double perimetro;
	perimetro=lado*3;
	return perimetro;
}

}
