package ex2;

public class Avion extends Transporte {
		private int numMotores;
		private String compania;
		
		
		public Avion(double precio, int asientos, String destino, int distancia,int numMotores, String compania) {
			super(precio, asientos, destino, distancia);
			this.numMotores = numMotores;
			this.compania = compania;
			
		}
		
		public void duracionVuelo(){
			double duracion;
			int velocidad;
			if (numMotores==4) {
				velocidad=920;
			}else if(numMotores==3) {
				velocidad=860;
			}else {
				velocidad=810;
			}
			duracion=this.getDistancia()/velocidad;
			System.out.println(duracion);
		}

		@Override
		public String toString() {
			return "Avion [numMotores=" + numMotores + ", compania=" + compania +", precio=" + this.getPrecio() +", asientos=" + this.getAsientos() +", destino=" + this.getDestino() +", distancia=" + this.getDistancia() + "]";
		}
		
}
