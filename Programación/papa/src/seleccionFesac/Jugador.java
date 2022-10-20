package seleccionFesac;

public class Jugador extends SeleccionFESAC {
		private int dorsal;
		private String posicion;
		
		
		public Jugador(int dorsal, String posicion) {
			super();
			this.dorsal = dorsal;
			this.posicion = posicion;
		}

		public int getDorsal() {
			return dorsal;
		}

		public void setDorsal(int dorsal) {
			this.dorsal = dorsal;
		}

		public String getPosicion() {
			return posicion;
		}

		public void setPosicion(String posicion) {
			this.posicion = posicion;
		}

}
