package seleccionFesac;

public class Entrenador extends SeleccionFESAC {
		private int idFederacion;
		private int añosTrabajados;
			
		public Entrenador(int idFederacion, int añosTrabajados) {
			super();
			this.idFederacion = idFederacion;
			this.añosTrabajados = añosTrabajados;
		}

		public int getIdFederacion() {
			return idFederacion;
		}

		public void setIdFederacion(int idFederacion) {
			this.idFederacion = idFederacion;
		}

		public int getAñosTrabajados() {
			return añosTrabajados;
		}

		public void setAñosTrabajados(int añosTrabajados) {
			this.añosTrabajados = añosTrabajados;
		}
		
}
