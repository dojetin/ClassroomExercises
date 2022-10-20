package principak;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LlenarNumerosTest2 {

	@Test
	void testSumar() {
		//Resultado esperado
		int resultadoEsperado=1;
		int[] tabla=new int[1];
		tabla[0]=1;
		
		//Resultado de mi clase
		LlenarNumeros lln =new LlenarNumeros();
		int resultadoAProbar= lln.sumar(tabla);
		
		//Lo compruebo
		assertEquals(resultadoEsperado,resultadoAProbar);
	}
	@Test
	void testSumar2() {

		//Resultado esperado
		int resultadoEsperado=15;
		int[] tabla={1,2,3,4,5};


		//Resultado de mi clase
		LlenarNumeros lln =new LlenarNumeros();
		int resultadoAProbar= lln.sumar(tabla);
		
		//Lo compruebo
		assertEquals(resultadoEsperado,resultadoAProbar);
	}

	@Test
	void testSumar3() {
		//Resultado esperado
		int resultadoEsperado=55;
		int[] tabla= {1,2,3,4,5,6,7,8,9,10};
		
		//Resultado de mi clase
		LlenarNumeros lln =new LlenarNumeros();
		int resultadoAProbar= lln.sumar(tabla);
		
		//Lo compruebo
		assertEquals(resultadoEsperado,resultadoAProbar);
	}
	
	@Test
	void testSumar4() {
		//Resultado esperado
		int resultadoEsperado=6;
		int[] tabla= {1,2,3};
		
		//Resultado de mi clase
		LlenarNumeros lln =new LlenarNumeros();
		int resultadoAProbar= lln.sumar(tabla);
		
		//Lo compruebo
		assertEquals(resultadoEsperado,resultadoAProbar);
	}
	
	@Test
	void testSumar5() {
		//Resultado esperado
		int resultadoEsperado=121;
		int[] tabla= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		tabla[0]=1;
		
		//Resultado de mi clase
		LlenarNumeros lln =new LlenarNumeros();
		int resultadoAProbar= lln.sumar(tabla);
		
		//Lo compruebo
		assertNotEquals(resultadoEsperado,resultadoAProbar);
	}
}
