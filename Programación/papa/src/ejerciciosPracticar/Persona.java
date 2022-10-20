package ejerciciosPracticar;
import java.lang.Math;
public class Persona {
	private String nombre;
	private short edad;
	private String dni;
	private char sexo;
	private short peso;
	private short altura;

	public short IMC() {
		short pesa=0, imc=0;
		pesa=(short) (this.peso/(this.altura^2));
		if (pesa<20) {
			imc=-1;
		}else if (pesa>19&&pesa<26) {
			imc=0;
		}else {
			imc=1;
		}
		return imc;
	}
	
	public Boolean esMayorDeEdad() {
		if (this.edad>=18) {
			return true;
		}else {
			return false;
		}
	}
	
	public void comprobarSexo(char sexo) {
		if (sexo=='M') {
			
		}else if (sexo!='H') {
			this.sexo='H';
		}
		
	}
	
	public String generaDNI() {
			final char [] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
			int resto=0;
			int valorDado = (int) Math.floor(Math.random()*89999999+10000000);
			resto=valorDado%23;
			return ""+valorDado+letras[resto];
			}
	
	
	public Persona(String nombre, short edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	public Persona(String nombre, short edad, char sexo, short peso, short altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = generaDNI();
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public short getEdad() {
		return edad;
	}

	public void setEdad(short edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}


	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public short getPeso() {
		return peso;
	}

	public void setPeso(short peso) {
		this.peso = peso;
	}

	public short getAltura() {
		return altura;
	}

	public void setAltura(short altura) {
		this.altura = altura;
	}

	public Persona() {
		super();
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
}
