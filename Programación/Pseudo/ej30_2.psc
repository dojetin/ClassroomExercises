Proceso sin_titulo
	//30. Leer tres n�meros que denoten una fecha (d�a, mes, a�o). Comprobar que es
	//una fecha v�lida. Si no es v�lida escribir un mensaje de error. Si es v�lida
	//escribir la fecha cambiando el n�mero del mes por su nombre. Ej. si se
	//introduce 1 2 2006, se deber� imprimir "1 de febrero de 2006".
	Definir dia, mes, anyo Como Entero;
	Definir letra Como Caracter;
	Dimension letra[13];
	letra[0]<-"Error";
	letra[1]<-"Enero";
	letra[2]<-"Febrero";
	letra[3]<-"Marzo";
	letra[4]<-"Abril";
	letra[5]<-"Mayo";
	letra[6]<-"Junio";
	letra[7]<-"Julio";
	letra[8]<-"Agosto";
	letra[9]<-"Septiembre";
	letra[10]<-"Octubre";
	letra[11]<-"Noviembre";
	letra[12]<-"Dicciembre";
	
	Escribir "Introduce el d�a";
	Leer dia;
	Mientras dia<1 o dia>31 Hacer
		Escribir "Introduce el d�a";
		Leer dia;
	FinMientras
	
	Escribir "Introduce el mes con numero";
	Leer mes;
	Mientras mes<1 o mes>12 Hacer
		Escribir "Introduce el mes con numero";
		Leer mes;
	FinMientras
	
	Escribir "Introduce el a�o";
	Leer anyo;
	
	Escribir "La fecha es ",dia," ",letra[mes]," ",anyo;
	
	
	
FinProceso
