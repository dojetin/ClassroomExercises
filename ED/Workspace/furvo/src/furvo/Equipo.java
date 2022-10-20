package furvo;

import java.util.Arrays;
import java.util.Date;

public class Equipo {
	private Jugador listaJugadores[]=new Jugador[11];
	private String nombreEquipo;
	private String ciudad;
	private int contador=0;
	
	
	public void insertarJugador(Jugador jugadorQueJuega) {
			listaJugadores[contador]=jugadorQueJuega;
		contador++;
	}
	
	public Equipo() {
		super();
	}


	public Equipo(Jugador[] listaJugadores, String nombreEquipo, String ciudad) {
		super();
		this.listaJugadores = listaJugadores;
		this.nombreEquipo = nombreEquipo;
		this.ciudad = ciudad;
	}


	public Jugador[] getListaJugadores() {
		return listaJugadores;
	}


	public void setListaJugadores(Jugador[] listaJugadores) {
		this.listaJugadores = listaJugadores;
	}


	public String getNombreEquipo() {
		return nombreEquipo;
	}


	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	@Override
	public String toString() {
		return "Equipo [listaJugadores=" + Arrays.toString(listaJugadores) + ", nombreEquipo=" + nombreEquipo
				+ ", ciudad=" + ciudad + "]";
	}
}
