public class Heroe {
	private String alterEgo;
	private String nombre;
	private Integer edad; 
	private Integer salud; 
	
	public void recibeDanyo(Integer danyo) {
		this.salud=this.salud-danyo;
	}
	public void cura(Integer curita) {
		this.salud=this.salud+curita;
	}
	
	public Heroe() {
		super();
		this.alterEgo = "Superman";
		this.nombre = "Clark Joseph Kent";
		this.edad = 83;
		this.salud = 100;
	}


	public Heroe(String alterEgo, String nombre, Integer edad, Integer salud) {
		super();
		this.alterEgo = alterEgo;
		this.nombre = nombre;
		this.edad = edad;
		this.salud = salud;
	}


	public String getAlterEgo() {
		return alterEgo;
	}


	public void setAlterEgo(String alterEgo) {
		this.alterEgo = alterEgo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getEdad() {
		return edad;
	}


	public void setEdad(Integer edad) {
		this.edad = edad;
	}


	public Integer getSalud() {
		return salud;
	}


	public void setSalud(Integer salud) {
		this.salud = salud;
	}
	@Override
	public String toString() {
		return "Heroe [alterEgo=" + alterEgo + ", nombre=" + nombre + ", edad=" + edad + ", salud=" + salud + "]";
	}
	
};
