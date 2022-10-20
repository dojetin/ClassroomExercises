package repaso;

public class Estudiante extends Persona {

	private int id_estudiante;
	private String grado;
	private int curso;
	private int notamedia;
	
	public Estudiante(String nombre, String ape1, String ape2, String dni, Fecha fechanacimiento, int telefono,
			String email, int id_estudiante, String grado, int curso, int notamedia) {
		super(nombre, ape1, ape2, dni, fechanacimiento, telefono, email);
		this.id_estudiante = id_estudiante;
		this.grado = grado;
		this.curso = curso;
		this.notamedia = notamedia;
	}

	public int getId_estudiante() {
		return id_estudiante;
	}

	public void setId_estudiante(int id_estudiante) {
		this.id_estudiante = id_estudiante;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public int getNotamedia() {
		return notamedia;
	}

	public void setNotamedia(int notamedia) {
		this.notamedia = notamedia;
	}
	
	public void hablar () {
		System.out.println("Amarillo, amarillo, amarillo los plátano");
	}
	
	public void hablar (String nombre) {
		System.out.println("El profesor "+nombre+" me tiene manía! Buahhhh!");
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + getNombre() + ", ape1=" + getApe1() + ", ape2=" + getApe2() + ", dni=" + getDni() + ", diaNacimiento="
				+ getFechanacimiento().getDia()+" Mes Nacimiento= "+getFechanacimiento().getMes()+" Año nacimiento = "+getFechanacimiento().getAnio() + ", telefono=" + getTelefono() + ", email=" + getEmail() +"id_estudiante=" + id_estudiante + ", grado=" + grado + ", curso=" + curso + ", notamedia="
				+ notamedia + "]";
	}
	
		

}
