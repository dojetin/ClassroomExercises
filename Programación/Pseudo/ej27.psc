Proceso ej27
	//27. Desarrolla un programa que me pida dos n�meros y me calcule las 4
	//operaciones matem�ticas.
	Definir num1,num2,eleccion Como Entero;
	Definir suma,resta,division,multi Como Real;
	Repetir
		Escribir "Introduce un n�mero";
		Leer num1;
	Hasta Que num1>0
	Repetir
		Escribir "Introduce otro n�mero";
		Leer num2;
	Hasta Que num2>0
	Repetir
		Escribir "Introduce un numero";
		Escribir "1. Suma";Escribir "2. Resta";Escribir "3. Multiplicaci�n";Escribir "4. Divisi�n";
		Leer eleccion;
	Hasta Que eleccion>0 Y eleccion<5
	Segun eleccion Hacer
		1:
			suma<-sumatorio(num1,num2);
			Escribir "Soluci�n ",suma;
		2:
			resta<-restatorio(num1,num2);
			Escribir "Soluci�n ",resta;
		3:
			multi<-multitorio(num1,num2);
			Escribir "Soluci�n ",multi;
		De Otro Modo:
			division<-divisorio(num1,num2);
			Escribir "Soluci�n ",division;
	FinSegun
FinProceso

SubProceso suma <- sumatorio ( num1,num2 )
	Definir suma Como Real;
	suma<-num1+num2;
FinSubProceso

SubProceso resta <- restatorio ( num1,num2 )
	Definir resta Como Real;
	resta<-num1-num2;
FinSubProceso

SubProceso multi <- multitorio ( num1,num2 )
	Definir multi Como Real;
	multi<-num1*num2;
FinSubProceso

SubProceso division <- divisorio ( num1,num2 )
	Definir division Como Real;
	division<-num1/num2;
FinSubProceso