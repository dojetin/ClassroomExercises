package solucion;

public abstract class Empleado extends Persona {

	private int id_trabajador;
	private int horasTrabajo;
	private int HorasExtra;
	private double sueldoBase;
	
	public Empleado() {}
	
	public Empleado(String nombre, String ape1, String ape2, String dni, Fecha fechanacimiento, int telefono,
			String email, int id_trabajador, int horasTrabajo, int horasExtra, double sueldoBase) {
		
		super(nombre, ape1, ape2, dni, fechanacimiento, telefono, email);
	
		this.id_trabajador = id_trabajador;
		this.horasTrabajo = horasTrabajo;
		HorasExtra = horasExtra;
		this.sueldoBase = sueldoBase;
	}
	
	public int getId_trabajador() {
		return id_trabajador;
	}
	public void setId_trabajador(int id_trabajador) {
		this.id_trabajador = id_trabajador;
	}
	public int getHorasTrabajo() {
		return horasTrabajo;
	}
	public void setHorasTrabajo(int horasTrabajo) {
		this.horasTrabajo = horasTrabajo;
	}
	public int getHorasExtra() {
		return HorasExtra;
	}
	public void setHorasExtra(int horasExtra) {
		HorasExtra = horasExtra;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	public abstract double getSueldoCompleto();
	
}