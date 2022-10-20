package clases;

public class Vehiculos {

	
		//Atributo Visibilidad Tipo Nombre;
	private Integer numeroDeRuedas;
	private Integer numeroPuertas;
	private Integer cilindrada;
	private Integer nKilometros;
	private String marca;
	private String modelo;
	
		
	public Vehiculos(Integer numeroDeRuedas, Integer numeroPuertas, Integer cilindrada, Integer nKilometros,
			String marca, String modelo) {
		super();
		this.numeroDeRuedas = numeroDeRuedas;
		this.numeroPuertas = numeroPuertas;
		this.cilindrada = cilindrada;
		this.nKilometros = nKilometros;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	//Metodo visibilidad lo-que-devuelve nombre(atributo de entrada){}
		//Metodo para cambiar el valor de nuestro atributo numero ruedas
	public void setNumeroDeRuedas(Integer numeroDeRuedas) {
		this.numeroDeRuedas=numeroDeRuedas;
	}
		//Metodo para obtener el valor que tiene el atributo numero ruedas
	public Integer getNumeroDeRuedas() {
		return numeroDeRuedas;
	}
		
	//Puertas
	public void setNumeroPuertas(Integer numeroPuertas) {
		this.numeroPuertas=numeroPuertas;
	}
	public Integer getNumeroPuertas() {
		return numeroPuertas;
	}
	//Cilindradas
	public void setCilindrada(Integer cilindrada) {
		this.cilindrada=cilindrada;
	}
	public Integer getCilindrada() {
		return cilindrada;
	}
	//nKilometros
	public void setNkilometros(Integer nKilometros) {
		this.nKilometros=nKilometros;
	}
	public Integer getNkilometros() {
		return nKilometros;
	}
	//Marca
	public void setMarca(String marca) {
		this.marca=marca;
	}
	public String getMarca() {
		return marca;
	}
	//Modelo
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
	public String getModelo() {
		return modelo;
	}
	//ToString
	@Override
	public String toString() {
		return "Vehiculos "
				+ "[numeroDeRuedas=" 	+ numeroDeRuedas + 
	", numeroPuertas=" + numeroPuertas + 
	", cilindrada="	+ cilindrada + 
	", nKilometros=" + nKilometros + 
	", marca=" + marca + 
	", modelo=" + modelo + "]";
}}
