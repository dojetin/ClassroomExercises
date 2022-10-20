Proceso ej43
	//43. Desarrolla el algoritmo de un programa que genere un número aleatorio del 1
	//al 100 y no lo muestre. El usuario deberá intentar adivinar el número secreto, y
	//el programa le dirá si el introducido es correcto o no, tiene 3 intentos.
	Definir num,intento,contador Como Entero;
	num<-azar[100];
	contador<-0;
	
	Mientras contador<3 Hacer
		Escribir "Intenta adivinar el numero secreto";
		Leer intento;
			Si intento==num Entonces
				Escribir"Lo has acertado campeón";
			SiNo
				Escribir "Sigue intentandolo campeón";
				contador<-contador+1;
			FinSi
		FinMientras
	
FinProceso
