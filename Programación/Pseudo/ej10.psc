Proceso ej10
	//10. Diseñe un código fuente que convierta X segundos en sus correspondientes
	//horas, minutos y segundos expresándolo por pantalla.
	Definir a, minutos, horas,seg  Como Real;
	Escribir "Introduce los segundos";
	Leer a;
	seg<-a MOD 60;
	minutos<-a/60;
	horas<-minutos/60;
	Escribir seg,"segundos",minutos,"minutos",horas,"horas";
	
	Si a>3600 Entonces
		acciones_por_verdadero
	SiNo
		acciones_por_falso
	FinSi
FinProceso
