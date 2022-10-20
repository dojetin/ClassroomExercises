Proceso sin_titulo
	//30. Leer tres números que denoten una fecha (día, mes, año). Comprobar que es
	//una fecha válida. Si no es válida escribir un mensaje de error. Si es válida
	//escribir la fecha cambiando el número del mes por su nombre. Ej. si se
	//introduce 1 2 2006, se deberá imprimir "1 de febrero de 2006".
	Definir dia, mes, anyo Como Entero;
	Definir letra Como Caracter;
	Dimension letra[13];
	letra[0]<-" Error ";
	letra[1]<-" Enero ";
	letra[2]<-" Febrero ";
	letra[3]<-" Marzo ";
	letra[4]<-" Abril ";
	letra[5]<-" Mayo ";
	letra[6]<-" Junio ";
	letra[7]<-" Julio ";
	letra[8]<-" Agosto ";
	letra[9]<-" Septiembre ";
	letra[10]<-" Octubre ";
	letra[11]<-" Noviembre ";
	letra[12]<-" Dicciembre ";
	
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
	
	Segun mes Hacer
		1:
			Escribir "La fecha es ",dia,letra[1],anyo;
		2:
			Escribir "La fecha es ",dia,letra[2],anyo;
		3:
			Escribir "La fecha es ",dia,letra[3],anyo;
		4:
			Escribir "La fecha es ",dia,letra[4],anyo;
		5:
			Escribir "La fecha es ",dia,letra[5],anyo;
		6:
			Escribir "La fecha es ",dia,letra[6],anyo;
		7:
			Escribir "La fecha es ",dia,letra[7],anyo;
		8:
			Escribir "La fecha es ",dia,letra[8],anyo;
		9:
			Escribir "La fecha es ",dia,letra[9],anyo;
		10:
			Escribir "La fecha es ",dia,letra[10],anyo;
		11:
			Escribir "La fecha es ",dia,letra[11],anyo;
		12:
			Escribir "La fecha es ",dia,letra[12],anyo;
		De Otro Modo:
			Escribir "Error";
	
	FinSegun
	
	
	
	
FinProceso
