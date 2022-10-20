Proceso ej14
	//14. Realizar un código fuente que lea un importe por teclado y calcule el importe
	//con un X% de descuento y la cantidad que se le ha descontado. X es un numero
	//que le introduciremos por teclado.
	Definir importe Como Real;
	Definir descuento Como Real;
	Definir final Como Real;
	Escribir "introduzca el importe del producto ";
	Leer importe;
	Escribir "Introduzca el descuento";
	Leer descuento;
	descuento<-100-descuento;
	final<-importe*descuento/100;
	Escribir "El importe final es ", final;
FinProceso
