Proceso ej23
	//23. Diseñar el algoritmo correspondiente a un programa que al introducir una
	//cantidad de dinero expresado en euros nos indique cuántos billetes y monedas
	//se puede tener como mínimo.
	Definir dinero Como Real;
	Definir billetes, monedas Como Entero;
	billetes<-0;
	monedas<-0;
	Repetir
		Escribir "Introduce una cantidad de dinero";
		Leer dinero;
	Hasta Que dinero>0
	Repetir
		Si (dinero-500)>=0 Entonces
			Repetir
				dinero<-dinero-500;
				billetes<-billetes+1;
			Hasta Que (dinero-500)<0
		SiNo
			Si (dinero-200)>=0 Entonces
				Repetir
					dinero<-dinero-200;
					billetes<-billetes+1;
				Hasta Que (dinero-200)<0
			SiNo
				Si (dinero-100)>=0 Entonces
					Repetir
						dinero<-dinero-100;
						billetes<-billetes+1;
					Hasta Que (dinero-100)<0
				SiNo
					Si (dinero-50)>=0 Entonces
						Repetir
							dinero<-dinero-50;
							billetes<-billetes+1;
						Hasta Que (dinero-50)<0
					SiNo
						Si (dinero-20)>=0 Entonces
							Repetir
								dinero<-dinero-20;
								billetes<-billetes+1;
							Hasta Que (dinero-20)<0
						SiNo
							Si (dinero-10)>=0 Entonces
								Repetir
									dinero<-dinero-10;
									billetes<-billetes+1;
								Hasta Que (dinero-10)<0
							SiNo
								Si (dinero-5)>=0 Entonces
									Repetir
										dinero<-dinero-5;
										billetes<-billetes+1;
									Hasta Que (dinero-5)<0
								SiNo
									Si (dinero-2)>=0 Entonces
										Repetir
											dinero<-dinero-2;
											monedas<-monedas+1;
										Hasta Que (dinero-2)<0
									SiNo
										Si (dinero-1)>=0 Entonces
											Repetir
												dinero<-dinero-1;
												monedas<-monedas+1;
											Hasta Que (dinero-1)<0
										SiNo
											Si (dinero-0.5)>=0 Entonces
												Repetir
													dinero<-dinero-0.5;
													monedas<-monedas+1;
												Hasta Que (dinero-0.5)<0
											SiNo
												Si (dinero-0.2)>=0 Entonces
													Repetir
														dinero<-dinero-0.2;
														monedas<-monedas+1;
													Hasta Que (dinero-0.2)<0
												SiNo
													Si (dinero-0.1)>=0 Entonces
														Repetir
															dinero<-dinero-0.1;
															monedas<-monedas+1;
														Hasta Que (dinero-0.1)<0
													SiNo
														Si (dinero-0.05)>=0 Entonces
															Repetir
																dinero<-dinero-0.05;
																monedas<-monedas+1;
															Hasta Que (dinero-0.05)<0
														SiNo
															Si (dinero-0.02)>=0 Entonces
																Repetir
																	dinero<-dinero-0.02;
																	monedas<-monedas+1;
																Hasta Que (dinero-0.02)<0
															SiNo
																Si (dinero-0.01)>=0 Entonces
																	Repetir
																		dinero<-dinero-0.01;
																		monedas<-monedas+1;
																	Hasta Que (dinero-0.01)<0
																SiNo
																FinSi
															FinSi
														FinSi
													FinSi
												FinSi
											FinSi
										FinSi
									FinSi
								FinSi
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	Hasta Que dinero=0
	Escribir "Lo puedes tener con ",billetes," billetes y ",monedas," monedas";
	
FinProceso
