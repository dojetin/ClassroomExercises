package SS;

public class Magos extends Supports{
		private boolean healer;
		private boolean escuditos;
		
		public Magos(int nšsUPPROTS, String Runas, String[] Objetos, String nombre, Integer vecesJugado,
				Integer victorias, Integer derrotas, Integer kills, Integer assist, Integer deaths, boolean healer,
				boolean escuditos) {
			super(nšsUPPROTS, Runas, Objetos, nombre, vecesJugado, victorias, derrotas, kills, assist, deaths);
			this.healer = healer;
			this.escuditos = escuditos;
		}
	
		
}
