package furvo;

import java.util.Date;

public class Jugador {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private Integer codigoJugador;
	private Date fechaNacimiento;
	private Integer telefono;
	
	public Jugador(String nombre, String apellido1, String apellido2, Integer codigoJugador, Date fechaNacimiento,
			Integer telefono) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.codigoJugador = codigoJugador;
		this.fechaNacimiento = fechaNacimiento;
		this.telefono = telefono;
	}

	public Jugador() {
		super();
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido1() {
		return apellido1;
	}


	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}


	public String getApellido2() {
		return apellido2;
	}


	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}


	public Integer getCodigoJugador() {
		return codigoJugador;
	}


	public void setCodigoJugador(Integer codigoJugador) {
		this.codigoJugador = codigoJugador;
	}


	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public Integer getTelefono() {
		return telefono;
	}


	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}


	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", codigoJugador=" + codigoJugador + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono
				+ "]";
	}
}
