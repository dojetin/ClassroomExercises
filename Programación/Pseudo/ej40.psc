Proceso ej40
	//40. Realizar un cajero automático que permita con un menú las siguientes tareas,
	//desarrolladas en funciones:
	//Comprobar el saldo (Al principio la cuenta está a 0)
	//Ingresar dinero
	//Sacar Dinero
	//Hacer transferencias
	Definir saldo,elec,var Como Real;
	saldo<-0;
	Repetir
		Escribir "Introduce segun lo desee";
		Escribir "1.Comprobar saldo";
		Escribir "2.Ingresar dinero";
		Escribir "3.Sacar dinero";
		Escribir "4.Hacer transferencia";
		Leer elec;
	Hasta Que elec<5 Y elec>0
	Segun elec Hacer
		1:
			Escribir "Su saldo actual es de ",saldo,"?";
		2:
			Escribir "¿Cuanto desea ingresar?";
			Leer var;
			saldo<-saldo+var;
			Escribir "Movimiento aceptado";
		3:
			Escribir "¿Cuanto desea sacar?";
			Leer var;
			saldo<-saldo-var;
			Escribir "Movimiento aceptado";
		De Otro Modo:
			Escribir "¿Cuanto desea transferir?";
			Leer var;
			Escribir "Transferencia realizada";
	FinSegun
	
	
FinProceso
