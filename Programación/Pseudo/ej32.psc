Proceso ej32
	//32. Algoritmo que dado un a�o, nos diga si es bisiesto o no. Un a�o es bisiesto bajo
	//las siguientes condiciones: Un a�o divisible por 4 es bisiesto y no debe ser
	//divisible entre 100. Si un a�o es divisible entre 100 y adem�s es divisible entre
	//400, tambi�n resulta bisiesto.
	Definir anyo Como Entero;
	Escribir "Introduce el a�o";
	Leer anyo;
	Si (anyo MOD 4==0 Y anyo MOD 100<>0) O (anyo MOD 100==0 Y anyo MOD 400==0)Entonces
		Escribir "Es bisiesto";
	SiNo
		Escribir "No es bisiesto";
	FinSi
	
	
	
FinProceso
