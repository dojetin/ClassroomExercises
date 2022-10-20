package seleccionFesac;

public class Entrenador extends SeleccionFESAC {
		private int idFederacion;
		private int aņosTrabajados;
			
		public Entrenador(int idFederacion, int aņosTrabajados) {
			super();
			this.idFederacion = idFederacion;
			this.aņosTrabajados = aņosTrabajados;
		}

		public int getIdFederacion() {
			return idFederacion;
		}

		public void setIdFederacion(int idFederacion) {
			this.idFederacion = idFederacion;
		}

		public int getAņosTrabajados() {
			return aņosTrabajados;
		}

		public void setAņosTrabajados(int aņosTrabajados) {
			this.aņosTrabajados = aņosTrabajados;
		}
		
}
