Proceso ej13
	//13. Pedir un número por pantalla (un número menor que 10) y visualizar por
	//pantalla su tabla de multiplicar.
	Definir num, contador Como Entero;
	contador<-1;
	Repetir
		Escribir "Introduce un numero";
		Leer num;
	Hasta Que num>1 Y num<10
	
	Repetir
		Escribir num*contador;
		contador<-contador+1;
	Hasta Que contador=11
	
FinProceso
