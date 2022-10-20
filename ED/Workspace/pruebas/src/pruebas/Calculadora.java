package pruebas;

//La clase
public class Calculadora {

	//Atributo de la clase
	private Integer num1;
	
	//Segundo atributo de la clase
	// Para declarar un atributo pones el modificador private o public o protected / EL tipo / El nombre
	private Integer num2;
	
	//Constructor se crean con la palabra reservada del modificador / Nombre de la clase / 
	public Calculadora() {
		this.num1 = 0;
		this.num2 = 0;
	}
	
	public Calculadora(Integer a, Integer b) {
		this.num1 = a;
		this.num2 = b;
	}
	
	//Metodos de la calse

	//las funciones que puedes haer con los atributos
	// modificados / el tipo que devuelve / el nombre del metodo
	public Integer suma() {
		return 0;
	}

	//las funciones que puedes haer con los atributos
	public Integer resta() {
		return 0;
	}	
	//las funciones que puedes haer con los atributos
	public Integer multiplicar() {
		return 0;
	}
	
	//las funciones que puedes haer con los atributos
	public Float dividir() {
		return 0F;
	}
	
	public Integer getNum1() {
		return num1;
	}
	public Integer getNum2() {
		return num2;
	}
	
}
