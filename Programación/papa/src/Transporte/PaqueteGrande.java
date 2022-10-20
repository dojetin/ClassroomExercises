package Transporte;

public class PaqueteGrande extends Paquete{
	private int altura=-1;
	private int anchura=-1;
	private int grosor=-1;
	private double volumen=-1;
	private boolean fragil=false;
	
	public PaqueteGrande(String destino, String origen, int altura, int anchura, int grosor) {
		super(destino, origen);
		this.altura = altura;
		this.anchura = anchura;
		this.grosor = grosor;
	}



	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}


	public int getAnchura() {
		return anchura;
	}


	public void setAnchura(int anchura) {
		this.anchura = anchura;
	}


	public int getGrosor() {
		return grosor;
	}


	public void setGrosor(int grosor) {
		this.grosor = grosor;
	}


	public boolean isFragil() {
		return fragil;
	}


	public void setFragil(boolean fragil) {
		this.fragil = fragil;
	}


	public double getVolumen() {
		return volumen;
	}


	public int calcularVolumen() {
		
		int vol=this.altura*this.altura*this.grosor;
		this.volumen=vol;
		return vol;
	}
	
	public void calcularVolumen(String codigoAfiliado) {
		double vol=this.altura*this.altura*this.grosor;
		if (codigoAfiliado=="DES10") {
			vol=vol*0.9;
		}else if (codigoAfiliado=="DES25") {
			vol=vol*0.75;
		}else {
			System.out.println("Lo siento churri pero te va a aser descuento quien yo me se");
		}
		this.volumen=vol;
	}
	@Override
	void calcularCoste() {
		if (volumen==-1) {
			calcularVolumen();
			if (fragil==true) {
				super.setCosteEnvio(10+volumen*0.05);
			}else {
				super.setCosteEnvio(volumen*0.05);
			}
		}else {
			super.setCosteEnvio(volumen*0.05);
		}
		
	}



	@Override
	public String toString() {
		return "PaqueteGrande [altura=" + altura + ", anchura=" + anchura + ", grosor=" + grosor + ", volumen="
				+ volumen + ", fragil=" + fragil +", destino=" + super.getDestino() +", origen=" + super.getOrigen() + ", id_Paquete=" + super.getId_paquete() +", costeEnvio=" + super.getCosteEnvio() +", totalPaquetes=" + totalPaquetes +"]";
	}
	
	
}
