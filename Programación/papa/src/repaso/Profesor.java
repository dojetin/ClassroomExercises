package repaso;

public class Profesor extends Empleado {

	private Fecha antiguedad;
	private String departamento;
	private String asignatura;
	private Boolean tutor;
	
	
	public Profesor(String nombre, String ape1, String ape2, String dni, Fecha fechanacimiento, int telefono,
			String email, int id_trabajador, int horasTrabajo, int horasExtra, double sueldoBase, Fecha antiguedad,
			String departamento, String asignatura, Boolean tutor) {
		super(nombre, ape1, ape2, dni, fechanacimiento, telefono, email, id_trabajador, horasTrabajo, horasExtra,
				sueldoBase);
		this.antiguedad = antiguedad;
		this.departamento = departamento;
		this.asignatura = asignatura;
		this.tutor = tutor;
		
		if (sueldoBase<1320) {
			this.setSueldoBase(1320);
		}
	}
	
	
	public Fecha getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(Fecha antiguedad) {
		this.antiguedad = antiguedad;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public Boolean getTutor() {
		return tutor;
	}
	public void setTutor(Boolean tutor) {
		this.tutor = tutor;
	}
	
	
	@Override
	public void getSueldoCompleto () {
		if (tutor) {
			this.setSueldoBase(1320*1.2);
		}
		System.out.println(this.getSueldoBase());
	}
	
	@Override
	public String toString() {
		return "Profesor [nombre=" + getNombre() + ", ape1=" + getApe1() + ", ape2=" + getApe2() + ", dni=" + getDni() + ", fechanacimiento="
				+ getFechanacimiento() + ", telefono=" + getTelefono() + ", email=" + getEmail()+"antiguedad=" + getAntiguedad() + ", departamento=" + departamento + ", asignatura=" + asignatura
				+ ", tutor=" + tutor + "]";
	}	
	
}
