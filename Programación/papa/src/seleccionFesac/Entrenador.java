package seleccionFesac;

public class Entrenador extends SeleccionFESAC {
		private int idFederacion;
		private int a�osTrabajados;
			
		public Entrenador(int idFederacion, int a�osTrabajados) {
			super();
			this.idFederacion = idFederacion;
			this.a�osTrabajados = a�osTrabajados;
		}

		public int getIdFederacion() {
			return idFederacion;
		}

		public void setIdFederacion(int idFederacion) {
			this.idFederacion = idFederacion;
		}

		public int getA�osTrabajados() {
			return a�osTrabajados;
		}

		public void setA�osTrabajados(int a�osTrabajados) {
			this.a�osTrabajados = a�osTrabajados;
		}
		
}
