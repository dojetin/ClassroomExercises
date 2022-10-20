package contador;

public class Contador {
	private Integer numeroQueLlevaLaCuenta;

	public Contador(Integer numeroQueLlevaLaCuenta) {
		super();
		this.numeroQueLlevaLaCuenta = numeroQueLlevaLaCuenta;
	}
	
	public void suma1() {
		this.numeroQueLlevaLaCuenta++;
	}
	
	public void resta1() {
		this.numeroQueLlevaLaCuenta--;
	}
	
	public void suma1(int suma) {
		this.numeroQueLlevaLaCuenta=numeroQueLlevaLaCuenta+suma;
	}
	
	public void resta1(int resta) {
		this.numeroQueLlevaLaCuenta=numeroQueLlevaLaCuenta-resta;
	}
	
	public void sumaValor(Integer Valor) {
		this.numeroQueLlevaLaCuenta=this.numeroQueLlevaLaCuenta+Valor;
	}
	

	public Integer getNumeroQueLlevaLaCuenta() {
		return numeroQueLlevaLaCuenta;
	}

	public void setNumeroQueLlevaLaCuenta(Integer numeroQueLlevaLaCuenta) {
		this.numeroQueLlevaLaCuenta = numeroQueLlevaLaCuenta;
	}
	

}
