package prueba.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ParImparTest {

	@Test
	void testPar() {
		int numeroPrueba=2;
		ParImpar pepito=new ParImpar();
		String resultado=pepito.parImpar(2);
		assertEquals(resultado, "Par");
	}
	@Test
	void testImpar() {
		int numeroPrueba=3;
		ParImpar pepito=new ParImpar();
		String resultado=pepito.parImpar(numeroPrueba);
		assertEquals(resultado, "Impar");
	}

	@Test
	void testErrorPar() {
		int numeroPrueba=3;
		ParImpar calculaParImpar=new ParImpar();
		String resultado=calculaParImpar.parImpar(numeroPrueba);
		assertNotEquals(resultado,"Par");
	}

	@Test
	void testErrorTipoPar() {
		fail("Not yet implemented");
	}

	@Test
	void testErrorImpar() {
		fail("Not yet implemented");
	}

	@Test
	void testErrorTipoImpar() {
		fail("Not yet implemented");
	}


}
