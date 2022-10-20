package SS2;

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

		public int getNºADC() {
			return nºADC;
		}

		public void setNºADC(int nºADC) {
			this.nºADC = nºADC;
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
