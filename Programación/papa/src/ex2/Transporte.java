package ex2;

public class Transporte {
		private double precio;
		private int asientos;
		private String destino;
		private int distancia;
		
		
		public Transporte() {
			super();
		}


		public Transporte(double precio, int asientos, String destino, int distancia) {
			super();
			this.precio = precio;
			this.asientos = asientos;
			this.destino = destino;
			this.distancia = distancia;
		}


		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		public int getAsientos() {
			return asientos;
		}

		public void setAsientos(int asientos) {
			this.asientos = asientos;
		}

		public String getDestino() {
			return destino;
		}

		public int getDistancia() {
			return distancia;
		}

		public void introducirDestino(String destino, int distancia) {
			this.distancia = distancia;
			this.destino=destino;
		}
		

		@Override
		public String toString() {
			return "Transporte [precio=" + precio + ", asientos=" + asientos + ", destino=" + destino + ", distancia="
					+ distancia + "]";
		}
		

}
