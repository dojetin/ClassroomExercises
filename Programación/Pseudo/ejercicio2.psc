Proceso sin_titulo
	Definir num1,num2 Como Entero;
	Escribir "Introduce un numero";
	Leer num1;
	Escribir "Introduce otro numero";
	Leer num2;
	Si num1==num2 Entonces
		Escribir "Son iguales";
	SiNo 
		Si num1>num2 Entonces
			Escribir"El primer numero es mayor";
			Escribir num1," Es mayor que ",num2;
		SiNo
			Escribir"El segundo es mayor";
			Escribir num2," Mayor que ",num1;
		FinSi
	FinSi
FinProceso
