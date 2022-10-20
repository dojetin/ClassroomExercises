package solucion;

public class Fecha {

	private int anio;
	private int mes;
	private int dia;
	
	public Fecha (int anio, int mes, int dia) {
		this.anio=anio;
		this.mes=mes;
		this.dia=dia;
	}

	public int getAnio() {
		return anio;
	}

	public int getMes() {
		return mes;
	}

	public int getDia() {
		return dia;
	}

	public void setFecha (int anio, int mes, int dia) {
		this.anio=anio;
		this.mes=mes;
		this.dia=dia;
	}

	@Override
	public String toString() {
		return "Fecha [anio=" + anio + ", mes=" + mes + ", dia=" + dia + "]";
	}	
	
	

}
