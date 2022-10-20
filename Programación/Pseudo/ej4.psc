Proceso ej4
	//4. Cree un programa que permita pasar de kg a g y viceversa.
	Definir peso Como Real;
	Definir eleccion Como Entero;
	
	Escribir "Introduzca 1 si desea convertir de kg a g y 2 si desea convertir de g a kg";
	Leer eleccion;
	
	Mientras eleccion<0 o eleccion>2 Hacer
		Escribir "Debe introducir 1 o 2";
		Escribir "Introduzca 1 si desea convertir de kg a g y 2 si desea convertir de g a kg";
		Leer eleccion;
	FinMientras
	Si eleccion<>0 Entonces
		Escribir "Introduzca la cantidad que desee convertir";
		Leer peso;
		
		Si eleccion==1 Entonces
			peso<-peso*1000;
			Escribir "El peso introducido convertido a gramos es de ",peso,"g";
		SiNo
			peso<-peso/1000;
			Escribir "El peso introducido convertido a kilogramos es de ",peso,"kg";
	FinSi
	FinSi
FinProceso
