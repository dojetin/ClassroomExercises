package funciones;

import java.util.Date;

public class Fotos {
	private String titulo;
	private Date fecha;
	private String autor;
	private int tama�o;
	
	
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


	public int getTama�o() {
		return tama�o;
	}


	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}


	public Fotos(String titulo, Date fecha, String autor, int tama�o) {
		super();
		this.titulo = titulo;
		this.fecha = fecha;
		this.autor = autor;
		this.tama�o = tama�o;
	}


	@Override
	public String toString() {
		return "Fotos [titulo=" + titulo + ", fecha=" + fecha + ", autor=" + autor + ", tama�o=" + tama�o + "]";
	}

}
