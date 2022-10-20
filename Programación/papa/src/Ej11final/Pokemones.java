package Ej11final;

import java.util.Comparator;

public class Pokemones implements Comparable<Pokemones> {
	private String Nombre;
	private String mote;
	private String tipo;
	private int nivel;

	public Pokemones(String nombre, String mote, String tipo, int nivel) {
		super();
		Nombre = nombre;
		this.mote = mote;
		this.tipo = tipo;
		this.nivel = nivel;
	}

	public Pokemones() {
		super();
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getMote() {
		return mote;
	}

	public void setMote(String mote) {
		this.mote = mote;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return "Pokemones [Nombre=" + Nombre + ", mote=" + mote + ", tipo=" + tipo + ", nivel=" + nivel + "]";
	}

	public int compareTo(Pokemones o1) {
		if (this.getNombre().charAt(0) > o1.getNombre().charAt(0)) {
			return 1;
		} else if (this.getNombre().charAt(0) < o1.getNombre().charAt(0)) {
			return -1;
		} else {
			if (this.getNivel() < o1.getNivel()) {
				return 1;
			} else if (this.getNivel() > o1.getNivel()) {
				return -1;
			} else {
				if (this.getMote().charAt(0) > o1.getMote().charAt(0)) {
					return 1;
				} else if (this.getMote().charAt(0) < o1.getMote().charAt(0)) {
					return -1;
				} else {
					return 0;
				}
			}
		}
	}

}
