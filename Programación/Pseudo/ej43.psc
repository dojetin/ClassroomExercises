Proceso ej43
	//43. Desarrolla el algoritmo de un programa que genere un n�mero aleatorio del 1
	//al 100 y no lo muestre. El usuario deber� intentar adivinar el n�mero secreto, y
	//el programa le dir� si el introducido es correcto o no, tiene 3 intentos.
	Definir num,intento,contador Como Entero;
	num<-azar[100];
	contador<-0;
	
	Mientras contador<3 Hacer
		Escribir "Intenta adivinar el numero secreto";
		Leer intento;
			Si intento==num Entonces
				Escribir"Lo has acertado campe�n";
			SiNo
				Escribir "Sigue intentandolo campe�n";
				contador<-contador+1;
			FinSi
		FinMientras
	
FinProceso
