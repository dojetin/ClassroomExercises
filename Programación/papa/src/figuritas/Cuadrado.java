package figuritas;

public class Cuadrado extends Figura{
		private double lado;

		public Cuadrado(double lado, String color) {
			super(color);
			this.lado = lado;
		}

		
		public double getLado() {
			return lado;
		}


		public void setLado(double lado) {
			this.lado = lado;
		}


		@Override
		public void calcularArea() {
			// TODO Auto-generated method stub
			double area;
			area=lado*lado;
			System.out.println(area);
		}

		@Override
		public void calcularPerimetro() {
			// TODO Auto-generated method stub
			double peri;
			peri=lado*4;
			System.out.println(peri);
		}
		
		
}
