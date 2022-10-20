package SS2;

public abstract class Campeon {
		private String Nombre;
		private static Integer VecesJugado;
		private static Integer Victorias;
		private static Integer Derrotas;
		private static Integer Kills;
		private static Integer Assist;
		private static Integer Deaths;
		
		private static Integer KDA;
		private static Integer WinRate;
		
		public Campeon(String nombre, Integer vecesJugado, Integer victorias, Integer derrotas, Integer kills,
				Integer assist, Integer deaths) {
			super();
			this.Nombre = nombre;
			VecesJugado = vecesJugado;
			Victorias = victorias;
			Derrotas = derrotas;
			Kills = kills;
			Assist = assist;
			Deaths = deaths;
		}
		
		public String getNombre() {
			return Nombre;
		}

		public void setNombre(String nombre) {
			Nombre = nombre;
		}

		public static Integer getVecesJugado() {
			return VecesJugado;
		}

		public static void setVecesJugado(Integer vecesJugado) {
			VecesJugado = vecesJugado;
		}

		public static Integer getVictorias() {
			return Victorias;
		}

		public static void setVictorias(Integer victorias) {
			Victorias = victorias;
		}

		public static Integer getDerrotas() {
			return Derrotas;
		}

		public static void setDerrotas(Integer derrotas) {
			Derrotas = derrotas;
		}

		public static Integer getKills() {
			return Kills;
		}

		public static void setKills(Integer kills) {
			Kills = kills;
		}

		public static Integer getAssist() {
			return Assist;
		}

		public static void setAssist(Integer assist) {
			Assist = assist;
		}

		public static Integer getDeaths() {
			return Deaths;
		}

		public static void setDeaths(Integer deaths) {
			Deaths = deaths;
		}

		public static Integer getKDA() {
			return KDA;
		}

		public static void setKDA(Integer kDA) {
			KDA = kDA;
		}

		public static Integer getWinRate() {
			return WinRate;
		}

		public static void setWinRate(Integer winRate) {
			WinRate = winRate;
		}

		public static void CalculaKDA() {
			if (Deaths==0) {
				Deaths=1;
			}
			if (Kills+Assist<1) {
				KDA=0;
			}else {
				KDA=(Kills+Assist)/Deaths;
			}
		}	
		public static void CalculaWinrate() {
			try {
				WinRate=(Victorias-Derrotas)/VecesJugado;
			} catch (Exception e) {
			}	
		}

		
		
		
}
