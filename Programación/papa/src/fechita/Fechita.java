package fechita;

public class Fechita {
	private int dia;
	private int mes;
	private int a�o;
	
	
	public Fechita(int dia, int mes, int a�o) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
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
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
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
			if ((a�o % 4 == 0) && ((a�o % 100 != 0) || (a�o % 400 == 0))) {
				bisiesto=true;
			}
			return bisiesto;
		}
	@Override
	public String toString() {
		if (dia<10&&mes<10) {
			return "fechita [dia=0" + dia + ", mes=0" + mes + ", a�o=" + a�o + "]";
		}else if (dia<10) {
			return "fechita [dia=0" + dia + ", mes=" + mes + ", a�o=" + a�o + "]";
		}else if (mes<10) {
			return "fechita [dia=" + dia + ", mes=0" + mes + ", a�o=" + a�o + "]";
		}else {
			return "fechita [dia=" + dia + ", mes=" + mes + ", a�o=" + a�o + "]";
		}
	}
	
	
	
}
