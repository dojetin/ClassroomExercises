package clases;

public class Concesionario {
	private String nombreDue�o;
	private String marcaCoches;
	private String direccion;
	private String nif;
	private Integer stock;
	
	
	
	public Concesionario(String nombreDue�o) {
		super();
		this.nombreDue�o = nombreDue�o;
	}
	public Concesionario() {
		super();
	}
	public Concesionario(String nombreDue�o, String marcaCoches, String direccion, String nif, Integer stock) {
		super();
		this.nombreDue�o = nombreDue�o;
		this.marcaCoches = marcaCoches;
		this.direccion = direccion;
		this.nif = nif;
		this.stock = stock;
	}
	public String getNombreDue�o() {
		return nombreDue�o;
	}
	public void setNombreDue�o(String nombreDue�o) {
		this.nombreDue�o = nombreDue�o;
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
		return "Concesionario [nombreDue�o=" + nombreDue�o + ", marcaCoches=" + marcaCoches + ", direccion=" + direccion
				+ ", nif=" + nif + ", stock=" + stock + "]";
	}
	
	
}
