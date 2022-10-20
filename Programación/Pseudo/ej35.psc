Proceso ej35
	//35. Hacer el 37 pero que imprima una pirámide normal
	Definir altura, contador,a Como Entero;
	Repetir
		Escribir "Introduzca la altura de la pirámide";
		Leer altura;
	Hasta Que altura>0
	contador<-0;
	a<-1;
	Repetir
		contador<-0;
		Repetir
			Escribir "*" Sin Saltar;
			contador<-contador+1;
		Hasta Que contador==a
		a<-a+1;
		Escribir "";
	Hasta Que a>altura
FinProceso
