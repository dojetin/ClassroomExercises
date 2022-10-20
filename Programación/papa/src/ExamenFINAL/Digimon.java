package ExamenFINAL;

public class Digimon implements Comparable<Digimon> {
	private int id;
	private String nombre;
	private double precio_Venta;
	private double precio_Proveedor;
	private double IVA = 21;
	private int stock;
	private static int numStatico = 0;

	public Digimon(String nombre, double precio_Proveedor, int stock) {
		super();
		id = numStatico;
		numStatico++;
		this.nombre = nombre;
		if (precio_Proveedor > 0) {
			this.precio_Proveedor = precio_Proveedor;
		}
		this.precio_Venta = (precio_Proveedor + 0.5) + (precio_Proveedor + 0.5) * IVA / 100;
		this.stock = stock;
	}

	public double getPrecio_Venta() {
		return precio_Venta;
	}

	public void setPrecio_Venta(int precio_Venta) {
		if (precio_Venta > 0) {
			this.precio_Venta = precio_Venta;
		}
	}

	public double getPrecio_Proveedor() {
		return precio_Proveedor;
	}

	public void setPrecio_Proveedor(int precio_Proveedor) {
		if (precio_Proveedor > 0) {
			this.precio_Proveedor = precio_Proveedor;
		}

	}

	public double getIVA() {
		return IVA;
	}

	public void setIVA(int iVA) {
		IVA = iVA;
	}

	public int getStock() {
		return stock;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public boolean venderCliente(int cantidad) {
		boolean posible = false;
		if (cantidad <= this.stock) {
			this.stock = this.stock - cantidad;
			posible = true;
		}

		return posible;
	}

	public boolean comprarProveedor(int cantidad) {
		boolean posible = true;
		this.stock = this.stock + cantidad;
		return posible;
	}

	@Override
	public String toString() {
		return "Digimon [nombre=" + nombre + ", id=" + id + ", precio_Venta=" + precio_Venta + ", precio_Proveedor="
				+ precio_Proveedor + ", IVA=" + IVA + ", stock=" + stock + "]";
	}

	@Override
	public int compareTo(Digimon o1) {
		if (this.id > o1.getId()) {
			return 1;
		} else if (this.id < o1.getId()) {
			return -1;
		} else {
			return 0;
		}
	}

}
