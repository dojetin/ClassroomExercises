package pruebaBancaria;

public class CuentaBancaria {
	private String titular;
	private String numCuenta;
	private float saldo;
	
	public CuentaBancaria() {
		super();
	}

	public CuentaBancaria(String nombre, String nCuenta, float saldo) {
		super();
		this.titular = nombre;
		this.numCuenta = nCuenta;
		this.saldo = saldo;
	}
	
	public void ingresar(Float cantidad) {
		if (cantidad>0) {
			saldo=saldo+cantidad;

		}
	}
	public void compra(Float cantidad) {
		if (cantidad<=saldo&&cantidad>0) {
			saldo=saldo-cantidad;
		}
	}
	public void transferencia (CuentaBancaria cuenta,Float dinerito) {
		if (saldo>dinerito) {
			this.saldo=this.saldo-dinerito;
		}
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
}
