Proceso testdepersonalidad
	Definir var Como Entero;
	Definir res,poke Como Caracter;
	Dimension poke[20];
	poke[0]<-"Pikachu";
	poke[1]<-"Charizard";
	poke[2]<-"Onix";
	poke[3]<-"Mew";
	poke[4]<-"Gengar";
	poke[5]<-"Evee";
	poke[6]<-"Lapras";
	poke[7]<-"Gyarados";
	poke[8]<-"Snorlax";
	poke[9]<-"Ditto";
	poke[10]<-"Blastoise";
	poke[11]<-"Venusaur";
	poke[12]<-"Magnemite";
	poke[13]<-"Geodude";
	poke[14]<-"Pidgey";
	poke[15]<-"Machop";
	poke[16]<-"Oddish";
	poke[17]<-"Ponyta";
	poke[18]<-"Dragonair";
	poke[19]<-"Bidoff";
	
	Escribir "¿Desea usted realizar su test de personalidad pokèmon?";
	Leer res;
	Si res=="Si" O res=="si" Entonces
		Repetir
			Escribir "¿Qué te llevarías a una isla desierta?";
			Escribir "1.Un móvil";
			Escribir "2.Una novia";
			Escribir "3.Comida";
			Escribir "4.A mi";
			Leer var;
		Hasta Que var>0 Y var<5
		Repetir
			Escribir "¿Qué adjetivo te define mejor?";
			Escribir "1.Amable";
			Escribir "2.Picaro";
			Escribir "3.Glotón";
			Escribir "4.Impaciente";
			Leer var;
		Hasta Que var>0 Y var<5
		Repetir
			Escribir "¿Dónde preferirías celebrar ru luna de miel?";
			Escribir "1.París";
			Escribir "2.Puerto Rico";
			Escribir "3.Tailandia";
			Escribir "4.Mi cama";
			Leer var;
		Hasta Que var>0 Y var<5
		Repetir
			Escribir "¿Qué tipo de música te gusta más?";
			Escribir "1.Pop";
			Escribir "2.Trap";
			Escribir "3.Rap";
			Escribir "4.Reguetón";
			Leer var;
		Hasta Que var>0 Y var<5
		Repetir
			Escribir "¿Qué profesor te cae mejor?";
			Escribir "1.Rufo";
			Escribir "2.JoseMª";
			Escribir "3.Jairo";
			Escribir "4.La de fol";
			Leer var;
		Hasta Que var>0 Y var<5
		Escribir "Su test ha finalizado...";
		Escribir "El pokemon que define mejor tu personalidad es ",poke[azar(20)];
	SiNo
		Escribir "Inutil";
	FinSi
	
FinProceso
