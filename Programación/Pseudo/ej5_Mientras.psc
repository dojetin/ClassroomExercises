Proceso ej5_Mientras
	//5. Lee un n�mero por teclado y comprueba que este n�mero es mayor o igual que 0.
	//En caso negativo, lo volver� a pedir sino muestra ese n�mero por consola.
	//Hagalo primero con Do While (Hacer mientras) y despu�s con While (Mientras).
	Definir num1 Como Entero;
	Escribir "Introduce un numero";
	Leer num1;
	Mientras num1<=0 Hacer
			Escribir "Introduce un numero";
			Leer num1;
	FinMientras
	Escribir "El numero que introdujo es ",num1;
FinProceso
