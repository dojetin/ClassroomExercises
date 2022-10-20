package SS2;

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

		public int getNºsUPPROTS() {
			return nºsUPPROTS;
		}

		public void setNºsUPPROTS(int nºsUPPROTS) {
			this.nºsUPPROTS = nºsUPPROTS;
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
