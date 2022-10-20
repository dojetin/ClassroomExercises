package huevosConChorizo;

public class Comidita {
	private int huevos;
	private double chori;
	
	
	
	public Comidita(int huevos, double chori) {
		super();
		this.huevos = huevos;
		this.chori = chori;
	}

	public int getHuevos() {
		return huevos;
	}

	public double getChori() {
		return chori;
	}

	public void addHuevos(int huevos) {
		this.huevos=this.huevos+huevos;
	}
	public void addChori(int chori) {
		this.chori=this.chori+chori;
	}

	public int getPlatos() {
		int platos=0;
		huevos=huevos*12;
		chori=chori*1000;
		while ((huevos>=2)&&((chori)>200)) {
			huevos=huevos-2;
			chori=chori-200;
			platos++;
		}
		return platos;
	}
	
	
	
}
