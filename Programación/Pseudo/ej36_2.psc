Proceso sin_titulo
	Definir mires,sures,victoria,derrota Como Entero;
	Definir res Como Caracter;
	victoria<-0;
	derrota<-0;
	
	Mientras victoria<>3 Y derrota<>3 Hacer
		Escribir"Introduce piedra, papel, tijeras, lagarto, spock";
		Leer res;
		sures<-azar(4)+1;
		Si res=="piedra" O res=="Piedra" Entonces
			mires<-1;
		SiNo
			Si res=="papel" O res=="Papel" Entonces
				mires<-2;
			SiNo
				Si res=="tijeras" O res=="Tijeras" Entonces
					mires<-3;
				SiNo
					Si res=="lagarto" O res=="Lagarto" Entonces
						mires<-4;
					SiNo
						mires<-5;
					FinSi
				FinSi
				
			FinSi
		FinSi
		
		Segun mires Hacer
			1: //piedra
				Si sures==1 Entonces
					Escribir "¡Piedra!";
					Escribir "Empate técnico";
				SiNo
					Si sures==2 Entonces
						Escribir"¡Papel!";
						Escribir"¡Has perdido!";
						derrota<-derrota+1;
					SiNo
						Si sures==3 Entonces
							Escribir "¡Tijeras!";
							Escribir "¡Has ganado!";
							victoria<-victoria+1;
						SiNo
							Si sures==4 Entonces
								Escribir "¡Lagarto!";
								Escribir "¡Has ganado!";
								victoria<-victoria+1;
							SiNo
								Escribir "¡Spock!";
								Escribir"¡Has perdido!";
								derrota<-derrota+1;
							FinSi
						FinSi
						
					FinSi
				FinSi
			2: //papel
				Si sures==1 Entonces
					Escribir "¡Piedra!";
					Escribir "Has ganado";
					victoria<-victoria+1;
				SiNo
					Si sures==2 Entonces
						Escribir"¡Papel!";
						Escribir"¡Empate técnico!";
					SiNo
						Si sures==3 Entonces
							Escribir "¡Tijeras!";
							Escribir "¡Has perdido!";
							derrota<-derrota+1;
						SiNo
							Si sures==4 Entonces
								Escribir "¡Lagarto!";
								Escribir "¡Has perdido!";
								derrota<-derrota+1;
							SiNo
								Escribir "¡Spock!";
								Escribir"¡Has ganado!";
								victoria<-victoria+1;
							FinSi
						FinSi
					FinSi
				FinSi
			3: //tijeras
				Si sures==1 Entonces
					Escribir "¡Piedra!";
					Escribir "Has perdido";
					derrota<-derrota+1;
				SiNo
					Si sures==2 Entonces
						Escribir"¡Papel!";
						Escribir"¡Has ganado!";
						victoria<-victoria+1;
					SiNo
						Si sures==3 Entonces
							Escribir "¡Tijeras!";
							Escribir "¡Empate técnico!";
						SiNo
							Si sures==4 Entonces
								Escribir "¡Lagarto!";
								Escribir "¡Has ganado!";
								victoria<-victoria+1;
							SiNo
								Escribir "¡Spock!";
								Escribir"¡Has perdido!";
								derrota<-derrota+1;
							FinSi
						FinSi
					FinSi
				FinSi
			4: //lagarto
				Si sures==1 Entonces
					Escribir "¡Piedra!";
					Escribir "Has perdido";
					derrota<-derrota+1;
				SiNo
					Si sures==2 Entonces
						Escribir"¡Papel!";
						Escribir"¡Has ganado!";
						victoria<-victoria+1;
					SiNo
						Si sures==3 Entonces
							Escribir "¡Tijeras!";
							Escribir "¡Has perdido!";
							derrota<-derrota+1;
						SiNo
							Si sures==4 Entonces
								Escribir "¡Lagarto!";
								Escribir "¡Empate Técnico!";
							SiNo
								Escribir "¡Spock!";
								Escribir"¡Has ganado!";
								victoria<-victoria+1;
							FinSi
						FinSi
					FinSi
				FinSi
			5: //spock
				Si sures==1 Entonces
					Escribir "¡Piedra!";
					Escribir "Has ganado";
					victoria<-victoria+1;
				SiNo
					Si sures==2 Entonces
						Escribir"¡Papel!";
						Escribir"¡Has perdido!";
						derrota<-derrota+1;
					SiNo
						Si sures==3 Entonces
							Escribir "¡Tijeras!";
							Escribir "¡Has ganado!";
							victoria<-victoria+1;
						SiNo
							Si sures==4 Entonces
								Escribir "¡Lagarto!";
								Escribir "¡Has perdido!";
								derrota<-derrota+1;
							SiNo
								Escribir "¡Spock!";
								Escribir"¡Empate Técnico!";
							FinSi
						FinSi
					FinSi
				FinSi
		De Otro Modo:
			Escribir "Error";
	FinSegun
	Escribir "Llevas ",victoria," victorias y ",derrota," derrotas";
	FinMientras
FinProceso
