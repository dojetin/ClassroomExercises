package Transporte;

public class Carta extends Paquete{
	boolean sello;
	String mensaje;
	
	public Carta(String destino, String origen, boolean sello, String mensaje) {
		super(destino, origen);
		this.sello = sello;
		this.mensaje = mensaje;
	}
	public String LeerMensaje() {
		return mensaje;
	}
	@Override
	void calcularCoste() {
		if (sello==true) {
			super.setCosteEnvio(0.05);
		}
	}
	public String toString() {
		return "PaqueteGrande [sello=" + sello +", destino=" + super.getDestino() +", origen=" + super.getOrigen() + ", id_Paquete=" + super.getId_paquete() +", costeEnvio=" + super.getCosteEnvio() +", totalPaquetes=" + totalPaquetes +"]";
	}
	
}
