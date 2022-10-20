Proceso sin_titulo
	//34. Algoritmo que lea un número entero (altura) y a partir de él cree una escalera
	//invertida de asteriscos con esa altura. Deberá quedar así, si ponemos una altura de 5.
	//*****
	//****
	//***
	//**
	//*
	Definir altura, contador Como Entero;
	Repetir
		Escribir "Introduzca la altura de la pirámide";
		Leer altura;
	Hasta Que altura>0
	contador<- altura;
	Repetir
		Repetir
			Escribir "*" Sin Saltar;
			contador<-contador-1;
		Hasta Que contador==0
		altura<-altura-1;
		contador<-altura;
		Escribir "";
	Hasta Que altura==0
	
FinProceso
