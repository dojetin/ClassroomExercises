package SS2;

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

		public int getN�ADC() {
			return n�ADC;
		}

		public void setN�ADC(int n�ADC) {
			this.n�ADC = n�ADC;
		}

		public String getRunas() {
			return Runas;
		}

		public void setRunas(String runas) {
			Runas = runas;
		}

		public String[] getObjetos() {
			return Objetos;
		}

		public void setObjetos(String[] objetos) {
			Objetos = objetos;
		}
}
