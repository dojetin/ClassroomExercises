
public class harem {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Heroe spiderman=new Heroe("Spiderman", "Peter Parker", 19, 100);
		System.out.println(spiderman.getSalud());
		spiderman.recibeDanyo(30);
		System.out.println(spiderman.getSalud());
		spiderman.cura(30);
		System.out.println(spiderman.getSalud());

	}

}
