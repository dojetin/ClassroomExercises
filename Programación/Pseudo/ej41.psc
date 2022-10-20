Proceso ej41
	//41. Crear un programa que pida el peso en kilogramos de una masa, luego muestra
	//las opciones de un menú (1 Hectogramos, 2 Decagramos, 3 Gramos, 4
	//Decigramos, 5 Centigramos, 6 Miligramos) para convertirlo a la unidad de
	//medida seleccionada.
	Definir peso,eleccion Como Entero;
	Repetir
		Escribir "Introduce el peso en kg";
		Leer peso;
	Hasta Que peso>0
	Escribir "¿A que unidad desea convertirlo?";
	Escribir "1.Hectogramos";
	Escribir "2.Decagramos";
	Escribir "3.Gramos";
	Escribir "4.Decigramos";
	Escribir "5.Centigramos";
	Escribir "6.Miligramos";
	Leer eleccion;
	Segun eleccion Hacer
		1:
			Escribir "El peso en Hectogramos es:",peso*10," Hectogramos";
		2:
			Escribir "El peso en Decagramos es:",peso*100," Decagramos";
		3:
			Escribir "El peso en Gramos es:",peso*1000,"Gramos";
		4:
			Escribir "El peso en Decigramos es:",peso*10000," Decigramos";
		5:
			Escribir "El peso en Centigramos es:",peso*100000," Centigramos";
		De Otro Modo:
			Escribir "El peso en Miligramos es:",peso*1000000," Miligramos";
	FinSegun
FinProceso
