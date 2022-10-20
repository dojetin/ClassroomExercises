package Transporte;

public class PaquetePequeño extends Paquete{
	private int peso=0;
	private int pesoMax=10;
	
	
	public PaquetePequeño(String destino, String origen) {
		super(destino, origen);
	}
	
	public PaquetePequeño(String destino, String origen, int peso) {
		super(destino, origen);
		this.peso = peso;
	}
	
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getPesoMax() {
		return pesoMax;
	}
	public void setPesoMax(int pesoMax) {
		this.pesoMax = pesoMax;
	}
	@Override
	void calcularCoste() {
		if (peso>pesoMax) {
			System.out.println("Lo sentimos pero estas gordito");
		}else {
			super.setCosteEnvio(peso*0.05);
		}
	}
	public String toString() {
		return "PaqueteGrande [peso=" + peso +", pesoMax=" + pesoMax +", destino=" + super.getDestino() +", origen=" + super.getOrigen() + ", id_Paquete=" + super.getId_paquete() +", costeEnvio=" + super.getCosteEnvio() +", totalPaquetes=" + totalPaquetes +"]";
	}
	
	
}
