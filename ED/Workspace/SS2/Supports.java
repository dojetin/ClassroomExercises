package SS2;

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

		public int getNšsUPPROTS() {
			return nšsUPPROTS;
		}

		public void setNšsUPPROTS(int nšsUPPROTS) {
			this.nšsUPPROTS = nšsUPPROTS;
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
