package SS;

public class ADC extends Campeon{
		
		private int n�ADC;
		private String Runas;
		private String Objetos[];
		
		public ADC(int n�ADC,String Runas,String[] Objetos,String nombre, Integer vecesJugado, Integer victorias, Integer derrotas, Integer kills, Integer assist,
				Integer deaths) {
			super(nombre, vecesJugado, victorias, derrotas, kills, assist, deaths);
			this.n�ADC = n�ADC;
			this.Runas = Runas;
			this.Objetos = Objetos;
			
		}
		
}
