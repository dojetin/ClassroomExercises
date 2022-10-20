package Ex1;

public class Empleado {
								//---------------------//
								//------ATRIBUTOS------//
								//---------------------//
	
		private String nombre="Satoshi";
		private int nif=00000000;
		private char letraDNI='Z';
		private double sueldoBruto=0;
		private double precioHorasExtra=8.75;
		private int horasExtra=0;
		private double irpf=4.75;
		private String estadoCivil="soltero";
		private int numHijos=0;
        char[] letrita = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};	
		
						    	//---------------------//
						    	//----CONSTRUCTORES-----//
						    	//---------------------//
		
        public Empleado(String nombre, int nif, char letraDNI) {
			super();
			if (nif<100000000 && nif>10000000 && letraDNI==letrita[nif%23]) {
				this.nombre = nombre;
				this.nif = nif;
				this.letraDNI = letraDNI;
			}else {
				System.out.println("Error");
				this.nombre = nombre;
				this.nif = 99999999;
				this.letraDNI = 'P';
			}

		}
		public Empleado() {
			super();
		}
								
								//---------------------//
								//-------METODOS-------//
								//---------------------//
		
		private Boolean comprobarDNI(int nif, char letra) {
			Boolean correcto=false;
			if (nif<100000000 && nif>10000000 && letra==letrita[nif%23]) {
				correcto=true;
			}			
			return correcto;
		}
		
		public void introducirDNI(int nif, char letra) {
			if (comprobarDNI(nif, letra)==true) {
				this.nif = nif;
				this.letraDNI = letra;
			}
		}
		
		public String mostrarDNICompleto() {
			return "Empleado [DNI_COMPLETO=" + nif + letraDNI + "]";
		}

		private double pagoHorasExtra() {
			double pago;
			pago=this.horasExtra*this.precioHorasExtra;
			return pago;
		}
		
		private double sueldoNeto() {
			double neto;
			neto=this.sueldoBruto-retenciones();
			return neto;
		}
		
		public double retenciones() {
			double retencion;
			double irpfito = irpf;
				if (this.estadoCivil=="casado") {
					irpfito=irpfito+0.15;
				}else {
					irpfito=irpfito+0.35;
				}
			
				for (int i = 0; i < this.numHijos; i++) {
					irpfito=irpfito-0.1;
				}
				
				retencion=this.sueldoBruto*irpfito/100;
			return retencion;
		}
		
		public String sueldoCompleto() {
		String completo;
		if (comprobarDNI(nif, letraDNI)==false) {
			completo="Hasta que no tengas el DNI bien no podemos pagarte";
		}else {
			double completito=sueldoNeto()+pagoHorasExtra();
			completo=""+completito;
		}
		return completo;
		}

		
		public String toStringBasico() {
			return "Empleado [nombre=" + nombre + ", nif=" + nif + ", letraDNI=" + letraDNI + "]";
		}
		
		@Override
		public String toString() {
			return "Empleado [nombre=" + nombre + ", nif=" + nif + ", letraDNI=" + letraDNI + ", sueldoBruto="
					+ sueldoBruto + ", retenciones=" + retenciones() + ", pagoHorasExtra=" + pagoHorasExtra() + ", sueldoNeto=" + sueldoNeto() + ", sueldoCompleto=" + sueldoCompleto() + "]";
		}
								//---------------------//
								//-------GetYSet-------//
								//---------------------//
				
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public double getSueldoBruto() {
			return sueldoBruto;
		}
		public void setSueldoBruto(double sueldoBruto) {
			this.sueldoBruto = sueldoBruto;
		}
		public double getPrecioHorasExtra() {
			return precioHorasExtra;
		}
		public void setPrecioHorasExtra(double precioHorasExtra) {
			this.precioHorasExtra = precioHorasExtra;
		}
		public int getHorasExtra() {
			return horasExtra;
		}
		public void setHorasExtra(int horasExtra) {
			this.horasExtra = horasExtra;
		}
		public double getIrpf() {
			return irpf;
		}
		public void setIrpf(double irpf) {
			this.irpf = irpf;
		}
		public String getEstadoCivil() {
			return estadoCivil;
		}
		public void setEstadoCivil(String estadoCivil) {
			this.estadoCivil = estadoCivil;
		}
		public int getNumHijos() {
			return numHijos;
		}
		public void setNumHijos(int numHijos) {
			this.numHijos = numHijos;
		}
}
