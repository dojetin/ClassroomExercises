package SS;

public class Supports extends Campeon{
		private int nšsUPPROTS;
		private String Runas;
		private String Objetos[];
		
		public Supports(int nšsUPPROTS,String Runas,String[] Objetos,String nombre, Integer vecesJugado, Integer victorias, Integer derrotas, Integer kills, Integer assist,
				Integer deaths) {
			super(nombre, vecesJugado, victorias, derrotas, kills, assist, deaths);
			this.nšsUPPROTS = nšsUPPROTS;
			this.Runas = Runas;
			this.Objetos = Objetos;
			
		}

}
