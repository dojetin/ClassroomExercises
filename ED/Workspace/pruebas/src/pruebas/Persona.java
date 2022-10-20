package pruebas;
//Esto es una clase persona
public class Persona {
	
	//Esto es un atributo que dice que tamaño tiene de cabeza
	private int tamanyoCabeza;
	
	//Esto son atributo de persona
	private float estatura;
	private int numeroPiernas;
	private float dineroBanco;
	private String nombre;
	private String dni;
	private String colorPelo;
	private int longPelo;
	
	
	private float varsueldo;
	
	public int getLongPelo() {
		return longPelo;
	}
	public void setLongPelo(int longPelo) {
		this.longPelo = longPelo;
	}
	public float getVarsueldo() {
		return varsueldo;
	}
	public void setVarsueldo(float varsueldo) {
		this.varsueldo = varsueldo;
	}
	public int getTamanyoCabeza() {
		return tamanyoCabeza;
	}
	
	
	//Esto es un constructor
	public Persona() {
	
	}
	public Persona(String nombrePersona) {
		nombre=nombrePersona;
		
	}
	public Persona(int tamanyoCabeza, float estatura, int numeroPiernas, float dineroBanco, String nombre, String dni,
			String colorPelo, int longPelo, float varsueldo) {
		super();
		this.tamanyoCabeza = tamanyoCabeza;
		this.estatura = estatura;
		this.numeroPiernas = numeroPiernas;
		this.dineroBanco = dineroBanco;
		this.nombre = nombre;
		this.dni = dni;
		this.colorPelo = colorPelo;
		this.longPelo = longPelo;
		this.varsueldo = varsueldo;
	}
	
	//Esto son metodos
	
	
	
	public void Peluquería(String color,int corte) {
		colorPelo=color;
		longPelo=corte;
	}
	public float Trabajar() {
		dineroBanco=dineroBanco+varsueldo;
		return dineroBanco;
	}
	
	public void setTamanyoCabeza(int tamanyoCabeza) {
		this.tamanyoCabeza = tamanyoCabeza;
	}
	public float getEstatura() {
		return estatura;
	}
	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}
	public int getNumeroPiernas() {
		return numeroPiernas;
	}
	public void setNumeroPiernas(int numeroPiernas) {
		this.numeroPiernas = numeroPiernas;
	}
	public float getDineroBanco() {
		return dineroBanco;
	}
	public void setDineroBanco(float dineroBanco) {
		this.dineroBanco = dineroBanco;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getColorPelo() {
		return colorPelo;
	}
	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}
	@Override
	public String toString() {
		return "Persona [tamanyoCabeza=" + tamanyoCabeza + ", estatura=" + estatura + ", numeroPiernas=" + numeroPiernas
				+ ", dineroBanco=" + dineroBanco + ", nombre=" + nombre + ", dni=" + dni + ", colorPelo=" + colorPelo
				+ ", longPelo=" + longPelo + ", varsueldo=" + varsueldo + "]";
	}
}
