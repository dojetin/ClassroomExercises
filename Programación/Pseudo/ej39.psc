Proceso ej39
	//39. Desarrolla un tipo test de 8 preguntas con respuesta Verdadero/Falso, al
	//responder a todas las preguntas el programa debe devolverte la nota en base
	//10.
	Definir res Como Caracter;
	Definir nota Como Entero;
	nota<-0;
	Escribir "1.¿Cómo se llama el presidente del gobierno actual?";
	Leer res;
	Si res=="Pedro Sanchez" O res=="Perro Sanchez" O res=="pedro sanchez" O res=="Pedro sanchez" Entonces
		nota<-nota+1;
		Escribir "¡Correcto!";
	SiNo
		Escribir "Incorrecto";
	FinSi
	Escribir "2.Cuánto es 4*5*5";
	Leer res;
	Si res="100" Entonces
		nota<-nota+1;
		Escribir "¡Correcto!";
	SiNo
		Escribir "¡Incorrecto!";
	FinSi
	Escribir "3.¿Cómo se llama el compañero mas lonjevo de clase?";
	Leer res;
	Si res=="Julio" O res=="julio" Entonces
		nota<-nota+1;
		Escribir "¡Correcto!";
	SiNo
		Escribir "Incorrecto";
	FinSi
	Escribir "4.¿Cuál es la capital de Hungría?";
	Leer res;
	Si res=="Budapest" O res=="budapest" Entonces
		nota<-nota+1;
		Escribir "¡Correcto!";
	SiNo
		Escribir "Incorrecto";
	FinSi
	Escribir "5.¿Cómo se llama el protagonista de Umbrella Academy?";
	Leer res;
	Si res=="cinco" O res=="Cinco" Entonces
		nota<-nota+1;
		Escribir "¡Correcto!";
	SiNo
		Escribir "Incorrecto";
	FinSi
	Escribir "6.¿Los cereales antes o despues de la leche?";
	Leer res;
	Si res=="despues" O res=="Despues" Entonces
		nota<-nota+1;
		Escribir "¡Correcto!";
	SiNo
		Escribir "Incorrecto";
	FinSi
	Escribir "7.¿Cuantas casillas tiene el tablero de ajedrez?";
	Leer res;
	Si res=="64" Entonces
		nota<-nota+1;
		Escribir "¡Correcto!";
	SiNo
		Escribir "Incorrecto";
	FinSi
	Escribir "8.¿One Piece o Naruto?";
	Leer res;
	Si res=="One Piece" O res=="one piece" O res=="One piece" Entonces
		nota<-nota+1;
		Escribir "¡Correcto!";
	SiNo
		Escribir "Incorrecto";
	FinSi
	Escribir "Tienes un ",nota*1.25," ¡felicidades!";
FinProceso
