package Transporte;

public abstract class Paquete {
	private int id_paquete;
	private String destino;
	private String Origen;
	private double costeEnvio=0;
	public static int totalPaquetes=0;
	
	
	public Paquete( String destino, String origen) {
		super();
		this.destino = destino;
		this.Origen = origen;
		Paquete.totalPaquetes++;
		this.id_paquete++;
	}


	public int getId_paquete() {
		return id_paquete;
	}


	public String getDestino() {
		return destino;
	}


	public String getOrigen() {
		return Origen;
	}


	public double getCosteEnvio() {
		return costeEnvio;
	}


	public void setCosteEnvio(double costeEnvio) {
		this.costeEnvio = costeEnvio;
	}
	
	public String enviar() {
		String res;
		if (this.costeEnvio>0) {
			res="Todo correcto, procedemos al envío.";
		}else {
			res="Error 404 not found";
		}
		return res;
	}
	
	abstract void calcularCoste();
}
