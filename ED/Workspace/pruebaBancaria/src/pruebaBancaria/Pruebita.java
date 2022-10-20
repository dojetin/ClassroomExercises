package pruebaBancaria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Pruebita {

	@Test
	void testConstructorVacio() {

		//cuando creo una cuentabancaria con el constructor vacio el saldo tiene que ser 0
		//Resultado esperado
		Float resultadoEsperado = 0F;


		//Resultado obtenido
		CuentaBancaria c1 = new CuentaBancaria();
		c1.getSaldo();

		//comprobacion

		assertEquals(resultadoEsperado, c1.getSaldo());
		}
	@Test
	void testConstructorRsal() {
			//ResultadoEsperado
			Float saldoIntroducido=23F;
			
			//ResultadoObtenido
			CuentaBancaria c2=new CuentaBancaria("Pepito", "12345", 23F);
			
			//Comprobacion
			assertEquals(saldoIntroducido,c2.getSaldo());
		
	}
	
	//si hago una transferencia tengo que tener saldo suficiente
	@Test
	void testSaldoSuficiente() {

		//Resultado esperado
		//no se realiza transferencia si el saldo es menor
		Float saldoIntroducido=50F;
		CuentaBancaria cuentaDadora=new CuentaBancaria("Pepito", "12345", saldoIntroducido);
		CuentaBancaria cuentaReceptora=new CuentaBancaria("Pepito", "12346", saldoIntroducido);

		Float resultadoEsperadoDadora = cuentaDadora.getSaldo();
		Float resultadoEsperadoReceptora = cuentaReceptora.getSaldo();

		//Resultado obtenido
		cuentaDadora.transferencia(cuentaReceptora, saldoIntroducido);

		//comprobacion

		assertEquals(resultadoEsperadoDadora, cuentaDadora.getSaldo());
		assertEquals(resultadoEsperadoReceptora, cuentaReceptora.getSaldo());
		}
	//En ingresar tu saldo final debe ser tu saldo inicial mas la cantidad.

	@Test
	void Ingreso() {

		//Resultado esperado
		//no se realiza transferencia si el saldo es menor
		Float saldoIntroducido=50F;
		

		Float resultadoEsperado = 73F;


		//Resultado obtenido
		CuentaBancaria cuentita=new CuentaBancaria("Pepito", "12345", 23F);
		cuentita.ingresar(saldoIntroducido);
		Float resultadObtenido=cuentita.getSaldo();
		//comprobacion

		assertEquals(resultadoEsperado, resultadObtenido);
		}
	@Test
	void IngresoNegativo() {

		//Resultado esperado
		//no se realiza transferencia si el saldo es negativo
		Float saldoIntroducido=-50F;
		

		Float resultadoEsperado = 23F;


		//Resultado obtenido
		CuentaBancaria cuentita=new CuentaBancaria("Pepito", "12345", 23F);
		cuentita.ingresar(saldoIntroducido);
		Float resultadObtenido=cuentita.getSaldo();
		//comprobacion

		assertEquals(resultadoEsperado, resultadObtenido);
		}
	@Test
	void Comprita() {

		//Resultado esperado
		Float saldoIntroducido=10F;
		

		Float resultadoEsperado = 13F;


		//Resultado obtenido
		CuentaBancaria cuentita=new CuentaBancaria("Pepito", "12345", 23F);
		cuentita.compra(saldoIntroducido);
		Float resultadObtenido=cuentita.getSaldo();
		//comprobacion

		assertEquals(resultadoEsperado, resultadObtenido);
		}
	@Test
	void CompritaSuficiente() {

		//Resultado esperado
		//no se realiza transferencia si el saldo  es negativo
		Float saldoIntroducido=500F;
		

		Float resultadoEsperado = 23F;


		//Resultado obtenido
		CuentaBancaria cuentita=new CuentaBancaria("Pepito", "12345", 23F);
		cuentita.compra(saldoIntroducido);
		Float resultadObtenido=cuentita.getSaldo();
		//comprobacion

		assertEquals(resultadoEsperado, resultadObtenido);
		}
	
	@Test
	void CompritaNegativa() {

		//Resultado esperado
		//no se realiza transferencia si el saldo es negativo
		Float saldoIntroducido=-10F;
		

		Float resultadoEsperado = 23F;


		//Resultado obtenido
		CuentaBancaria cuentita=new CuentaBancaria("Pepito", "12345", 23F);
		cuentita.compra(saldoIntroducido);
		Float resultadObtenido=cuentita.getSaldo();
		//comprobacion

		assertEquals(resultadoEsperado, resultadObtenido);
		}
	
}
