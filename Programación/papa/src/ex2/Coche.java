package ex2;

public class Coche extends Tierra{
		private String marca;
		private String modelo;
		

		public Coche(double precio, int asientos, String destino, int distancia, String matricula,
				short tipoCombustible, String marca, String modelo) {
			super(precio, asientos, destino, distancia, matricula, tipoCombustible);
			this.marca = marca;
			this.modelo = modelo;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		
		public void duracionViaje() {
			double duracion;
			double velocidad;
			if (marca=="Mercedes") {
				velocidad=120;
			}else if(marca=="Mini") {
				velocidad=80;
			}else {
				velocidad=10;
			}
			duracion=this.getDistancia()/velocidad;
			System.out.println(duracion);
		}
}
