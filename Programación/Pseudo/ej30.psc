Proceso sin_titulo
	//30. Leer tres n�meros que denoten una fecha (d�a, mes, a�o). Comprobar que es
	//una fecha v�lida. Si no es v�lida escribir un mensaje de error. Si es v�lida
	//escribir la fecha cambiando el n�mero del mes por su nombre. Ej. si se
	//introduce 1 2 2006, se deber� imprimir "1 de febrero de 2006".
	Definir dia, mes, anyo Como Entero;
	
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
	
	Segun mes Hacer
		1:
			Escribir "La fecha es ",dia," enero ",anyo;
		2:
			Escribir "La fecha es ",dia," febrero ",anyo;
		3:
			Escribir "La fecha es ",dia," marzo ",anyo;
		4:
			Escribir "La fecha es ",dia," abril ",anyo;
		5:
			Escribir "La fecha es ",dia," mayo ",anyo;
		6:
			Escribir "La fecha es ",dia," junio ",anyo;
		7:
			Escribir "La fecha es ",dia," julio ",anyo;
		8:
			Escribir "La fecha es ",dia," agosto ",anyo;
		9:
			Escribir "La fecha es ",dia," septiembre ",anyo;
		10:
			Escribir "La fecha es ",dia," octubre ",anyo;
		11:
			Escribir "La fecha es ",dia," noviembre ",anyo;
		12:
			Escribir "La fecha es ",dia," dicciembre ",anyo;
		De Otro Modo:
			Escribir "Error";
	
	FinSegun
	
	
	
	
FinProceso
