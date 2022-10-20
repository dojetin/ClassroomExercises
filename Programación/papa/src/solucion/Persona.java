package solucion;

import java.util.Calendar;

public abstract class Persona {

	private String nombre;
	private String ape1;
	private String ape2;
	private String dni;
	private Fecha fechanacimiento;
	private int telefono;
	private String email;
	
	public Persona(String nombre, String ape1, String ape2, String dni, Fecha fechanacimiento, int telefono,
			String email) {
		this.nombre = nombre;
		this.ape1 = ape1;
		this.ape2 = ape2;
		this.dni = dni;
		this.fechanacimiento = fechanacimiento;
		this.telefono = telefono;
		this.email = email;
	}
	
	public Persona() {}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApe1() {
		return ape1;
	}

	public void setApe1(String ape1) {
		this.ape1 = ape1;
	}

	public String getApe2() {
		return ape2;
	}

	public void setApe2(String ape2) {
		this.ape2 = ape2;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Fecha getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(Fecha fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Boolean mayorEdad () {
		Calendar fechaHoy = Calendar.getInstance();
		int diaHoy = fechaHoy.get(Calendar.DAY_OF_MONTH);
		int mesHoy = fechaHoy.get(Calendar.MONTH);
		int anioHoy = fechaHoy.get(Calendar.YEAR);
		
		if ((anioHoy-fechanacimiento.getAnio())>18) {
			return true;
		} else if (	anioHoy-getFechanacimiento().getAnio()==18	&&
					mesHoy>=getFechanacimiento().getMes()		&&
					diaHoy>=getFechanacimiento().getDia()		) {
			return true;			
		} else {
			return false;
		}
	}
	
	public void introducirDNI (String DNI) {
		int cont=0;
		for (int i = 0; i < 8; i++) {
			if (Character.isDigit(DNI.charAt(i))) {
				cont++;
			}
		}
		if (cont==8) {
		    	this.dni=DNI;
		} else {
				this.dni="00000000X";
		}
	}
	
	public void introducirDNI (String DNI, char letra) {
			int resto=Integer.parseInt(DNI)%23;
			char[] letraFinal = new char[23];
		    letraFinal[0]='T';
		    letraFinal[1]='R';
		    letraFinal[2]='W';
		    letraFinal[3]='A';
		    letraFinal[4]='G';
		    letraFinal[5]='M';
		    letraFinal[6]='Y';
		    letraFinal[7]='F';
		    letraFinal[8]='P';
		    letraFinal[9]='D';
		    letraFinal[10]='X';
		    letraFinal[11]='B';
		    letraFinal[12]='N';
		    letraFinal[13]='J';
		    letraFinal[14]='Z';
		    letraFinal[15]='S';
		    letraFinal[16]='Q';
		    letraFinal[17]='V';
		    letraFinal[18]='H';
		    letraFinal[19]='L';
		    letraFinal[20]='C';
		    letraFinal[21]='K';
		    letraFinal[22]='E';
		    
		    if (letraFinal[resto]==letra) {
		    	this.dni=DNI+letra;
			} else {
				this.dni="00000000X";
			}
		}

	@Override
	public abstract String toString();
	
	public abstract String toStringBonito();
}