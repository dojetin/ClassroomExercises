package SS2;

public class Magos extends Supports{
		private boolean healer;
		private boolean escuditos;
		
		public Magos(int n�sUPPROTS, String Runas, String[] Objetos, String nombre, Integer vecesJugado,
				Integer victorias, Integer derrotas, Integer kills, Integer assist, Integer deaths, boolean healer,
				boolean escuditos) {
			super(n�sUPPROTS, Runas, Objetos, nombre, vecesJugado, victorias, derrotas, kills, assist, deaths);
			this.healer = healer;
			this.escuditos = escuditos;
		}

		public boolean isHealer() {
			return healer;
		}

		public void setHealer(boolean healer) {
			this.healer = healer;
		}

		public boolean isEscuditos() {
			return escuditos;
		}

		public void setEscuditos(boolean escuditos) {
			this.escuditos = escuditos;
		}	
		
}
