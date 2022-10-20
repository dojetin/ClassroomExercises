package SS2;

public class Iniciadores extends Supports{
		private boolean tanque;
		private boolean movilidad;
		
		public Iniciadores(int nºsUPPROTS, String Runas, String[] Objetos, String nombre, Integer vecesJugado,
				Integer victorias, Integer derrotas, Integer kills, Integer assist, Integer deaths, boolean tanque,
				boolean movilidad) {
			super(nºsUPPROTS, Runas, Objetos, nombre, vecesJugado, victorias, derrotas, kills, assist, deaths);
			this.tanque = tanque;
			this.movilidad = movilidad;
		}

		public boolean isTanque() {
			return tanque;
		}

		public void setTanque(boolean tanque) {
			this.tanque = tanque;
		}

		public boolean isMovilidad() {
			return movilidad;
		}

		public void setMovilidad(boolean movilidad) {
			this.movilidad = movilidad;
		}
		
}
