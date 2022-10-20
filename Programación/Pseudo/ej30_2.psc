Proceso sin_titulo
	//30. Leer tres números que denoten una fecha (día, mes, año). Comprobar que es
	//una fecha válida. Si no es válida escribir un mensaje de error. Si es válida
	//escribir la fecha cambiando el número del mes por su nombre. Ej. si se
	//introduce 1 2 2006, se deberá imprimir "1 de febrero de 2006".
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
	
	Escribir "Introduce el día";
	Leer dia;
	Mientras dia<1 o dia>31 Hacer
		Escribir "Introduce el día";
		Leer dia;
	FinMientras
	
	Escribir "Introduce el mes con numero";
	Leer mes;
	Mientras mes<1 o mes>12 Hacer
		Escribir "Introduce el mes con numero";
		Leer mes;
	FinMientras
	
	Escribir "Introduce el año";
	Leer anyo;
	
	Escribir "La fecha es ",dia," ",letra[mes]," ",anyo;
	
	
	
FinProceso
