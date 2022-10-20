package Transporte;

import java.util.Scanner;

public class CartaCertificada extends Carta{
	Scanner sc = new Scanner (System.in);
	public CartaCertificada(String destino, String origen, boolean sello, String mensaje) {
		super(destino, origen, sello, mensaje);
		// TODO Auto-generated constructor stub
	}
	private boolean desproteger() {
		boolean sol=false;
		int nota=0;
		int ran=(int)Math.random()*6+1 ;
		switch (ran) {
		case 1: {
			String respuesta;
			System.out.println("De qué color es el caballo blanco de Santiago?");
			respuesta=sc.next();
			if (respuesta=="Negro") {
				nota++;
			}
			System.out.println("En qué estación es la Navidad?");
			respuesta=sc.next();
			if (respuesta=="Verano") {
				nota++;
			}
			System.out.println("Qué mata a los vampiros?");
			respuesta=sc.next();
			if (respuesta=="Rebujito") {
				nota++;
			}
			if (nota==3) {
				sol=true;
			}
		}
		case 2: {
			String respuesta;
			System.out.println("En qué estación es la Navidad?");
			respuesta=sc.next();
			if (respuesta=="Verano") {
				nota++;
			}
			System.out.println("De qué color es el caballo blanco de Santiago?");
			respuesta=sc.next();
			if (respuesta=="Negro") {
				nota++;
			}
			System.out.println("Qué mata a los vampiros?");
			respuesta=sc.next();
			if (respuesta=="Rebujito") {
				nota++;
			}
			if (nota==3) {
				sol=true;
			}
		}
		case 3: {
			String respuesta;
			System.out.println("En qué estación es la Navidad?");
			respuesta=sc.next();
			if (respuesta=="Verano") {
				nota++;
			}
			System.out.println("Qué mata a los vampiros?");
			respuesta=sc.next();
			if (respuesta=="Rebujito") {
				nota++;
			}
			
			System.out.println("De qué color es el caballo blanco de Santiago?");
			respuesta=sc.next();
			if (respuesta=="Negro") {
				nota++;
			}
			if (nota==3) {
				sol=true;
			}
		}
		case 4: {
			String respuesta;
			System.out.println("Qué mata a los vampiros?");
			respuesta=sc.next();
			if (respuesta=="Rebujito") {
				nota++;
			}
			System.out.println("En qué estación es la Navidad?");
			respuesta=sc.next();
			if (respuesta=="Verano") {
				nota++;
			}
			System.out.println("De qué color es el caballo blanco de Santiago?");
			respuesta=sc.next();
			if (respuesta=="Negro") {
				nota++;
			}
			if (nota==3) {
				sol=true;
			}
		}
		case 5: {
			String respuesta;
			System.out.println("Qué mata a los vampiros?");
			respuesta=sc.next();
			if (respuesta=="Rebujito") {
				nota++;
			}
			System.out.println("De qué color es el caballo blanco de Santiago?");
			respuesta=sc.next();
			if (respuesta=="Negro") {
				nota++;
			}
			System.out.println("En qué estación es la Navidad?");
			respuesta=sc.next();
			if (respuesta=="Verano") {
				nota++;
			}
			if (nota==3) {
				sol=true;
			}
		}
		case 6: {
			String respuesta;
			System.out.println("De qué color es el caballo blanco de Santiago?");
			respuesta=sc.next();
			if (respuesta=="Negro") {
				nota++;
			}
			System.out.println("Qué mata a los vampiros?");
			respuesta=sc.next();
			if (respuesta=="Rebujito") {
				nota++;
			}
			System.out.println("En qué estación es la Navidad?");
			respuesta=sc.next();
			if (respuesta=="Verano") {
				nota++;
			}
			if (nota==3) {
				sol=true;
			}
		}
	}
		return sol;
		
	}
	public String LeerMensaje() {
		if (desproteger()==true) {
			return LeerMensaje();
		}else {
			String error="Lo sentimos, ha ocurrido un error inesperado";
			return error;
		}
	}
	void calcularCoste() {
			super.setCosteEnvio(1.5);
	}
	public String toString() {
		return "PaqueteGrande [sello=" + sello +", destino=" + super.getDestino() +", origen=" + super.getOrigen() + ", id_Paquete=" + super.getId_paquete() +", costeEnvio=" + super.getCosteEnvio() +", totalPaquetes=" + totalPaquetes +"]";
	}
}
