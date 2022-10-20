package pruebaBancaria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PruebitaTest {

	//En ingresar tu saldo final debe ser tu saldo inicial mas la cantidad.

	@Test
	void testSaldoSuficiente() {

		//Resultado esperado
		//no se realiza transferencia si el saldo es menor
		Float saldoIntroducido=50F;
		CuentaBancaria cuentita=new CuentaBancaria("Pepito", "12345", 23F);

		Float resultadoEsperado = saldoIntroducido;


		//Resultado obtenido
		CuentaBancaria c1 = new CuentaBancaria();
		c1.getSaldo();

		//comprobacion

		assertEquals(resultadoEsperado, c1.getSaldo());
		}

}
