package funciones;

import java.util.Date;

public class Fotos {
	private String titulo;
	private Date fecha;
	private String autor;
	private int tamaño;
	
	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public int getTamaño() {
		return tamaño;
	}


	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}


	public Fotos(String titulo, Date fecha, String autor, int tamaño) {
		super();
		this.titulo = titulo;
		this.fecha = fecha;
		this.autor = autor;
		this.tamaño = tamaño;
	}


	@Override
	public String toString() {
		return "Fotos [titulo=" + titulo + ", fecha=" + fecha + ", autor=" + autor + ", tamaño=" + tamaño + "]";
	}

}
