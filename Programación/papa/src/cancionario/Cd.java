package cancionario;

public class Cd {
	private Cancion[] canciones;
	private int contador=0;
	
	
	public Cd(int numcanciones) {
		super();
		canciones=new Cancion[numcanciones];
		
	}

	public int getContador() {
		return contador;
	}


	
}
