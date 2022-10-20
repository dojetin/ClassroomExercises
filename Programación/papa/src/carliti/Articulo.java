package carliti;

public class Articulo {
	
	//---------------------
	//------ATRIBUTOS------
	//---------------------
	
	private int id=(int) (Math.random()*99999999);
	private String nombre;
	private float precio;
	private int unidades;
	
	//---------------------
	//----CONTRUCTORES-----
	//---------------------
	
	Articulo() {	
	}
	
	Articulo(String nombre,float precio,int unidades){
		this.nombre=nombre;
		this.precio=precio;
		this.unidades=unidades;
	}
	
	//---------------------
	//-------METODOS-------
	//---------------------
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	
	
}
