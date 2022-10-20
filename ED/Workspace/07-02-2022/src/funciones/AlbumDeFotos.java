package funciones;

import java.util.Arrays;

public class AlbumDeFotos {
	Fotos fotos[]=new Fotos [10];

	
	
	
	public AlbumDeFotos(Fotos[] fotos) {
		super();
		this.fotos = fotos;
	}


	public Fotos[] getFotos() {
		return fotos;
	}


	public void setFotos(Fotos[] fotos) {
		this.fotos = fotos;
	}


	@Override
	public String toString() {
		return "AlbumDeFotos [fotos=" + Arrays.toString(fotos) + "]";
	}
	
}
