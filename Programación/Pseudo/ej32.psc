Proceso ej32
	//32. Algoritmo que dado un año, nos diga si es bisiesto o no. Un año es bisiesto bajo
	//las siguientes condiciones: Un año divisible por 4 es bisiesto y no debe ser
	//divisible entre 100. Si un año es divisible entre 100 y además es divisible entre
	//400, también resulta bisiesto.
	Definir anyo Como Entero;
	Escribir "Introduce el año";
	Leer anyo;
	Si (anyo MOD 4==0 Y anyo MOD 100<>0) O (anyo MOD 100==0 Y anyo MOD 400==0)Entonces
		Escribir "Es bisiesto";
	SiNo
		Escribir "No es bisiesto";
	FinSi
	
	
	
FinProceso
