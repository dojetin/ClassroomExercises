package SS2;

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

		public int getN�sUPPROTS() {
			return n�sUPPROTS;
		}

		public void setN�sUPPROTS(int n�sUPPROTS) {
			this.n�sUPPROTS = n�sUPPROTS;
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
