Proceso ej5_Mientras
	//5. Lee un número por teclado y comprueba que este número es mayor o igual que 0.
	//En caso negativo, lo volverá a pedir sino muestra ese número por consola.
	//Hagalo primero con Do While (Hacer mientras) y después con While (Mientras).
	Definir num1 Como Entero;
	Escribir "Introduce un numero";
	Leer num1;
	Mientras num1<=0 Hacer
			Escribir "Introduce un numero";
			Leer num1;
	FinMientras
	Escribir "El numero que introdujo es ",num1;
FinProceso
