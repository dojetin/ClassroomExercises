package SS;

public class ADC extends Campeon{
		
		private int nºADC;
		private String Runas;
		private String Objetos[];
		
		public ADC(int nºADC,String Runas,String[] Objetos,String nombre, Integer vecesJugado, Integer victorias, Integer derrotas, Integer kills, Integer assist,
				Integer deaths) {
			super(nombre, vecesJugado, victorias, derrotas, kills, assist, deaths);
			this.nºADC = nºADC;
			this.Runas = Runas;
			this.Objetos = Objetos;
			
		}
		
}
