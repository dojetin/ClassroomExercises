package clases;

public class Concesionario {
	private String nombreDueño;
	private String marcaCoches;
	private String direccion;
	private String nif;
	private Integer stock;
	
	
	
	public Concesionario(String nombreDueño) {
		super();
		this.nombreDueño = nombreDueño;
	}
	public Concesionario() {
		super();
	}
	public Concesionario(String nombreDueño, String marcaCoches, String direccion, String nif, Integer stock) {
		super();
		this.nombreDueño = nombreDueño;
		this.marcaCoches = marcaCoches;
		this.direccion = direccion;
		this.nif = nif;
		this.stock = stock;
	}
	public String getNombreDueño() {
		return nombreDueño;
	}
	public void setNombreDueño(String nombreDueño) {
		this.nombreDueño = nombreDueño;
	}
	public String getMarcaCoches() {
		return marcaCoches;
	}
	public void setMarcaCoches(String marcaCoches) {
		this.marcaCoches = marcaCoches;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Concesionario [nombreDueño=" + nombreDueño + ", marcaCoches=" + marcaCoches + ", direccion=" + direccion
				+ ", nif=" + nif + ", stock=" + stock + "]";
	}
	
	
}
