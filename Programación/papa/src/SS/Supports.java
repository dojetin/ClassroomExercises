package SS;

public class Supports extends Campeon{
		private int nºsUPPROTS;
		private String Runas;
		private String Objetos[];
		
		public Supports(int nºsUPPROTS,String Runas,String[] Objetos,String nombre, Integer vecesJugado, Integer victorias, Integer derrotas, Integer kills, Integer assist,
				Integer deaths) {
			super(nombre, vecesJugado, victorias, derrotas, kills, assist, deaths);
			this.nºsUPPROTS = nºsUPPROTS;
			this.Runas = Runas;
			this.Objetos = Objetos;
			
		}

}
