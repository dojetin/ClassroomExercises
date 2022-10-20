package badman;

import java.time.YearMonth;

public class Personas {
		private String nombre;
		private String apellido;
		private int anionacimiento;
		private int edad;
		
		public Personas() {
			super();
		}

		public Personas(String nombre, String apellido, int anionacimiento) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.anionacimiento = anionacimiento;
		}
		
		public void identificar() {
			System.out.println(this.nombre);
			System.out.println(this.apellido);
			System.out.println(this.anionacimiento);
		}
		
		public void calcular_edad() {
			int year = YearMonth.now().getYear();		
			this.edad=year-this.anionacimiento;
			
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public int getAnionacimiento() {
			return anionacimiento;
		}

		public void setAnionacimiento(int anionacimiento) {
			this.anionacimiento = anionacimiento;
		}

		public int getEdad() {
			return edad;
		}
		
}
