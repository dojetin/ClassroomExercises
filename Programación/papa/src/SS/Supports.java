package SS;

public class Supports extends Campeon{
		private int n�sUPPROTS;
		private String Runas;
		private String Objetos[];
		
		public Supports(int n�sUPPROTS,String Runas,String[] Objetos,String nombre, Integer vecesJugado, Integer victorias, Integer derrotas, Integer kills, Integer assist,
				Integer deaths) {
			super(nombre, vecesJugado, victorias, derrotas, kills, assist, deaths);
			this.n�sUPPROTS = n�sUPPROTS;
			this.Runas = Runas;
			this.Objetos = Objetos;
			
		}

}
