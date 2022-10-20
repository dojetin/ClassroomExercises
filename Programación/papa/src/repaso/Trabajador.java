package repaso;

public class Trabajador extends Empleado {

	private String area;

	public Trabajador(String nombre, String ape1, String ape2, String dni, Fecha fechanacimiento, int telefono,
			String email, int id_trabajador, int horasTrabajo, int horasExtra, double sueldoBase, String area) {
		
		super(nombre, ape1, ape2, dni, fechanacimiento, telefono, email, id_trabajador, horasTrabajo, horasExtra,
				sueldoBase);
		
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public void getSueldoCompleto() {
		if (area.equalsIgnoreCase("limpieza")) {
			this.setHorasExtra(11);
		} else if (area.equalsIgnoreCase("administracion") || area.equalsIgnoreCase("enfermeria")) {
			this.setHorasExtra(15);
		}
		int sueldito= this.getHorasExtra()*this.getHorasTrabajo();
		System.out.println(sueldito+this.getSueldoBase());
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + getNombre() + ", ape1=" + getApe1() + ", ape2=" + getApe2() + ", dni=" + getDni() + ", fechanacimiento="
				+ getFechanacimiento() + ", telefono=" + getTelefono() + ", email=" + getEmail()+"area=" + area + "]";
	}
	
	
		

}
