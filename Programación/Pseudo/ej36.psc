Proceso sin_titulo
	Definir mires,sures Como Entero;
	Definir res Como Caracter;
	sures<-azar(2)+1;
	
	Escribir"Introduce piedra, papel o tijeras";
	Leer res;
	Si res=="piedra" Entonces
		mires<-1;
	SiNo
		Si res=="papel" Entonces
			mires<-2;
		SiNo
			mires<-3;
		FinSi
	FinSi
	
	Segun mires Hacer
		1:
			Si sures==1 Entonces
				Escribir "¡Piedra!";
				Escribir "Empate técnico";
			SiNo
				Si sures==2 Entonces
					Escribir"¡Papel!";
					Escribir"¡Has perdido!";
				SiNo
					Escribir "¡Tijeras!";
					Escribir "¡Has ganado!";
				FinSi
			FinSi
		2:
			Si sures==1 Entonces
				Escribir "¡Piedra!";
				Escribir "Has ganado";
			SiNo
				Si sures==2 Entonces
					Escribir"¡Papel!";
					Escribir"¡Empate técnico!";
				SiNo
					Escribir "¡Tijeras!";
					Escribir "¡Has perdido!";
				FinSi
			FinSi
		3:
			Si sures==1 Entonces
				Escribir "¡Piedra!";
				Escribir "Has perdido";
			SiNo
				Si sures==2 Entonces
					Escribir"¡Papel!";
					Escribir"¡Has ganado!";
				SiNo
					Escribir "¡Tijeras!";
					Escribir "¡Empate técnico!";
				FinSi
			FinSi
		De Otro Modo:
			Escribir "Error";
	FinSegun
FinProceso
