package seleccionFesac;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Entrenador e1= new Entrenador(123, 70);
			e1.setNombre("Jairo");
			
			Jugador j1=new Jugador(7, "Del");
			j1.setEdad(20);
			
			Medico m1= new Medico("ninguna", 0);
			m1.setEdad(19);
			m1.getTitulacion();
			
	}

}
