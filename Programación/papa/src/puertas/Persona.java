package puertas;

public class Persona {
		private String nombre;
		private int edad;
		private String serso;
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public String getSerso() {
			return serso;
		}
		public Persona(String nombre, int edad, String serso) {
			super();
			this.nombre = nombre;
			this.edad = edad;
			this.serso = serso;
		}
		public void setSerso(String serso) {
			this.serso = serso;
		}
		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", edad=" + edad + ", serso=" + serso + "]";
		}	
}
