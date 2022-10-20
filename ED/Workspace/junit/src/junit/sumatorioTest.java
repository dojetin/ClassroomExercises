package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sumatorioTest {

	@Test //1) Un caso de prueba que toma un valor entero de 1 digito como entrada
	void test() {
		//valor esperado0 
		int valorEsperado =3;
		//capturar el valor de tu clase
		sumatorio s1=new sumatorio();
		int valorClase=s1.Sumita(3);
		// compararlos
		assertEquals(valorEsperado, valorClase);
	}
	@Test //2) Un caso de prueba que toma un valor entero con dos dígitos como entrada
	void test2() {
		//valor esperado0 
		int valorEsperado =6;
		//capturar el valor de tu clase
		sumatorio s1=new sumatorio();
		int valorClase=s1.Sumita(42);
		// compararlos
		assertEquals(valorEsperado, valorClase);
	}
	@Test //3) Toma un valor entero de tres dígitos como caso de prueba de entrada
	void test3() {
		//valor esperado0 
		int valorEsperado =6;
		//capturar el valor de tu clase
		sumatorio s1=new sumatorio();
		int valorClase=s1.Sumita(123);
		// compararlos
		assertEquals(valorEsperado, valorClase);
	}
	@Test //4) Un caso de prueba con un valor negativo
	void test4() {
		//valor esperado0 
		int valorEsperado =0;
		//capturar el valor de tu clase
		sumatorio s1=new sumatorio();
		int valorClase=s1.Sumita(-123);
		// compararlos
		assertEquals(valorEsperado, valorClase);
	}
	@Test //5) Un valor decimal como entrada.
	void test5() {
		//valor esperado0 
		int valorEsperado =3;
		//capturar el valor de tu clase
		sumatorio s1=new sumatorio();
		int valorClase=s1.Sumita((int)12.2);
		// compararlos
		assertEquals(valorEsperado, valorClase);
	}

}
