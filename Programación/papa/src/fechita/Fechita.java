package fechita;

public class Fechita {
	private int dia;
	private int mes;
	private int año;
	
	
	public Fechita(int dia, int mes, int año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}
	
	public Fechita() {
		super();
	}
	
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public Boolean fechaCorrecta() {
		Boolean correcta=false;
		if ((mes<13&&mes>0)&&(dia>0&&dia<32)) {
			switch (mes) {
			case 1:
				correcta=true;
				break;
			case 2:
					if (dia<29) {
						correcta=true;
					}else if (esBisiesto()==true) {
						correcta=true;
					}
				break;
			case 3:
				correcta=true;
				break;
			case 4:
				if (dia<31) {
					correcta=true;
				}
				break;
			case 5:
				correcta=true;
				break;
			case 6:
				if (dia<31) {
					correcta=true;
				}
				break;
			case 7:
				correcta=true;
				break;
			case 8:
				correcta=true;
				break;
			case 9:
				if (dia<31) {
					correcta=true;
				}
				break;
			case 10:
				correcta=true;
				break;
			case 11:
				if (dia<31) {
					correcta=true;
				}
				break;
			case 12:
				correcta=true;
				break;
			default:
				break;
			}
		}		
		return correcta;
	}
		private Boolean esBisiesto() {
			Boolean bisiesto=false;
			if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
				bisiesto=true;
			}
			return bisiesto;
		}
	@Override
	public String toString() {
		if (dia<10&&mes<10) {
			return "fechita [dia=0" + dia + ", mes=0" + mes + ", año=" + año + "]";
		}else if (dia<10) {
			return "fechita [dia=0" + dia + ", mes=" + mes + ", año=" + año + "]";
		}else if (mes<10) {
			return "fechita [dia=" + dia + ", mes=0" + mes + ", año=" + año + "]";
		}else {
			return "fechita [dia=" + dia + ", mes=" + mes + ", año=" + año + "]";
		}
	}
	
	
	
}
