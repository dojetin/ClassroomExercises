package solucion;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Persona[] lista= new Persona[10];
		boolean salida=true;
		int indice=0;
		
		Scanner sc1 = new Scanner(System.in);
		
		do {
			System.out.println(" --------------------------------------------------------------------");
			System.out.println("|                Bienvenido al men� del San Jos�                     |");
			System.out.println("|--------------------------------------------------------------------|");
			System.out.println("|      1) Introducir estudiante.                                     |");
			System.out.println("|      2) Introducir profesor.                                       |");
			System.out.println("|      3) Introducir trabajador.                                     |");
			System.out.println("|      4) Cargar trabajadores por defefcto.                          |");
			System.out.println("|      5) Mostrar todo.                                              |");
			System.out.println("|      6) Mostrar solo trabajadores.                                 |");
			System.out.println("|      7) Mostrar solo profesores.                                   |");
			System.out.println("|      8) Mostrar estudiantes.                                       |");
			System.out.println("|      9) Mostrar quien gana m�s de X                                |");
			System.out.println("|      10) Salir                                                     |");
			System.out.println(" --------------------------------------------------------------------");
			System.out.print(">> ");
			int eleccion = sc1.nextInt();
			sc1.nextLine();
			
			switch(eleccion) {
			 case 1:
			 {
				if(indice<10) {
					lista[indice]= new Estudiante();
					introducirDatosPersona(lista[indice]);
					introducirDatosEstudiante( (Estudiante) lista[indice]);
					indice++;
				}else {
					System.out.println("Array lleno, lo siento mucho");
				}
				break;
			 }
			 case 2:
			 {					
				if(indice<10) {
					lista[indice]= new Profesor();
					introducirDatosPersona(lista[indice]);
					introducirDatosProfesor( (Profesor) lista[indice]);
					indice++;
				}else {
					System.out.println("Array lleno, lo siento mucho");
				}
				 break;
			 }
			 case 3:
			 {
				 if(indice<10) {
					 lista[indice]= new Trabajador();
					 introducirDatosPersona(lista[indice]);
					 introducirDatosTrabajador( (Trabajador) lista[indice]);
					 indice++;
				 }else {
					System.out.println("Array lleno, lo siento mucho");
				}
				break;
			 }
			 case 4:
			 {
				 lista[0]= new Profesor("Juan", "Jimenez","Lechso", "7846514f", new Fecha(5,10,2021), 9548741, "joseaqqasq", 1, 45,3, 15248,new Fecha(1,10,12),"DAM", "BBDD", false);
				 lista[1]= new Profesor("Paco", "Pedro","Piuu", "987458ff", new Fecha(6,11,2021), 6857552, "sdofjwpf", 2, 467,0, 1472,new Fecha(10,5,52),"DAM", "Programacion", true);
				 lista[2]= new Profesor("Lucas", "Salvador","Evans", "fedesdw65", new Fecha(1,1,2021), 6584184, "sdfpiwefma", 6, 123,12, 1825,new Fecha(10,8,11),"DAM", "Lenguaje Marcas", false);
				 lista[3]= new Estudiante("Julio", "Salguero","Vilchez", "9874ade", new Fecha(24,3,2003), 9547756, "superman@gmail.com", 1, "TSEAS",2, 5);	
				 lista[3]= new Estudiante("Carlos", "perez","cantos", "453r874ade", new Fecha(4,1,2002), 95477564, "tedecampana@gmail.com", 2, "Sanitario",2, 5);	
				 lista[4]= new Trabajador( "Marilu", "Reverte", "Vecker", "9874547fc", new Fecha(1,5,1998),  987454, "Shu_hermanita@gmail.com",  10,  15145, 0,  1320, "Limpieza");
				 indice =5;
				 System.out.println("Datos introducidos correctamente.\n");
				 break;
			 }
			 case 5:
			 {
				 System.out.println("\tMostrando todos los datos");
				 boolean bandera=true;
				 
				 for(Persona p: lista) {
					 if(p!=null) {
						 System.out.println(p.toStringBonito());
						 bandera=false;
					 }
				 }
			
				 if(bandera) {
					 System.out.println("Ningun resultado coincide con el criterio de busqueda");
				 }
				 System.out.println();
				 break;
			 }
			 case 6:
			 case 7:
			 case 8:
			 {
				 String buscar="repaso.";
				 
				 if(eleccion==6) {
					 buscar+="Trabajador";
				 }else if(eleccion==7) {
					 buscar+="Profesor";
				 }else{
					 buscar+="Estudiante";
				 }
				 
				 System.out.println("\tMostrando los datos solicitados");
				 boolean bandera=true;
				 for(Persona p: lista) {
					 if(p!=null && p.getClass().getName().equals(buscar)) {
						 System.out.println(p.toStringBonito());
						 bandera=false;
					 }
				 }
				 
				 if(bandera) {
					 System.out.println("Ningun resultado coincide con el criterio de busqueda");
				 }
				 System.out.println();
				 break;
			 }
			 case 9:{
				 System.out.println("�Cual es el l�mtie de salario?");
				 
				 Scanner sc = new Scanner(System.in);
				 double limite = sc.nextDouble();
				 System.out.println("\tMostrando los datos solicitados");
				 boolean bandera=true;
				 for(Persona p: lista) {
					 if(!p.getClass().getName().equals("repaso.Estudiante")) {
						 Empleado e1 = (Empleado) p;
						 if(e1.getSueldoCompleto()>limite) {
							 System.out.println(p.toStringBonito());
							 bandera=false;
						 }
					 }
				 }
				 
				 if(bandera) {
					 System.out.println("Ningun resultado coincide con el criterio de busqueda");
				 }
				 System.out.println();
				 break;
			 }
			 case 10:
			 {
				 salida=false;
				 System.out.println("Hasta luego lucas.");
				 break;
			 }
			 case 11:
			 {
				 System.out.println("\tMostrando la clase de todos los objetos");
				 boolean bandera=true;
				 for(Persona p: lista) {
					 if(p!=null) {
						 System.out.println(p.getClass().getName());
						 bandera=false;
					 }
				 }
				 
				 if(bandera) {
					 System.out.println("Ningun resultado coincide con el criterio de busqueda");
				 }
				 System.out.println();
			 }
			 break;
			 default:
			 {
				 System.out.println("iNTRODUCE ALGO QUE VALGA ZOPENCO.");
				 break;
			 }
			
			}
			
			System.out.println("Pulse enter para continuar.");
			
			sc1.nextLine();	
			
		}while(salida);
		sc1.close();
				
	}
	
	
	static void introducirDatosPersona(Persona p) {
		Scanner sc = new Scanner(System.in);
		
		//Pedir datos generales de persona
		String nombre, ape1,ape2, dni,email;
		int telefono;
		String fecha;
		Fecha nacimiento;
		 
		System.out.print("Introduca el nombre: ");
		nombre = sc.nextLine();
		
		System.out.print("Introduca el apellido1: ");
		ape1 = sc.nextLine();
		
		System.out.print("Introduca el apellido2: ");
		ape2 = sc.nextLine();
		
		System.out.print("Introduca el dni: ");
		dni= sc.nextLine();
		
		System.out.print("Introduca la fecha de nacimiento dia/mes/a�o: ");
		fecha= sc.nextLine();
		int datosFecha[] = new int [3];
		int cuenta=0;
		int posicion=0;
		
		for(int j=0; j<fecha.length(); j++) {
			
			if(fecha.charAt(j) == '/') {
				datosFecha[cuenta]=  Integer.parseInt(fecha.substring(posicion,j));
				cuenta++;
				posicion=j+1;
			}					
		}
		
		nacimiento = new Fecha(datosFecha[2],datosFecha[1],datosFecha[0]);
		 
		
		System.out.print("Introduca el telefono: ");
		telefono= sc.nextInt();
		sc.nextLine();
		
		System.out.print("Introduca el email: ");
		email= sc.nextLine();
		p.setNombre(nombre);
		p.setApe1(ape1);
		p.setApe2(ape2);
		p.setDni(dni);
		p.setEmail(email);
		p.setFechanacimiento(nacimiento);
		p.setTelefono(telefono);
	}
	
	private static void introducirDatosEstudiante(Estudiante e) {
		
		Scanner sc = new Scanner(System.in);
		//Pedir datos del alumno
		System.out.print("Introduca el id_estudiante: ");
		int id_estudiante= sc.nextInt();
		sc.nextLine();
		
		System.out.print("Introduca el grado: ");
		String grado= sc.nextLine();
		
		System.out.print("Introduca el curso: ");
		int curso= sc.nextInt();
		sc.nextLine();
		
		System.out.print("Introduca la nota media: ");
		int notamedia= sc.nextInt();
		sc.nextLine();
		
		//Guardamos en el objeto
		e.setCurso(curso);
		e.setGrado(grado);
		e.setId_estudiante(id_estudiante);
		e.setNotamedia(notamedia);
	}
	
	private static void introducirDatosTrabajador(Trabajador t) {
		Scanner sc = new Scanner (System.in);
		//Cosas del trabajador
		System.out.print("Introduca el id del trabajador: ");
		int id_trabajador= sc.nextInt();
		sc.nextLine();
		
		System.out.print("Introduca horas de trabajo: ");
		int horasTrabajo= sc.nextInt();
		sc.nextLine();
		
		System.out.print("Introduca horas extra: ");
		int horasExtra= sc.nextInt();
		sc.nextLine();
		
		System.out.print("Introduca sueldoBase: ");
		double sueldoBase=0;
		sueldoBase= sc.nextDouble();
		sc.nextLine();
	 
	 
		System.out.print("Area de trabajo: ");
		String area = sc.nextLine();
		
		t.setId_trabajador(id_trabajador);
		t.setHorasExtra(horasExtra);
		t.setHorasTrabajo(horasTrabajo);
		t.setSueldoBase(sueldoBase);
		t.setArea(area);
	}
	
	private static void introducirDatosProfesor(Profesor p) {
		Scanner sc= new Scanner(System.in);
		//Cosas del trabajador
		System.out.print("Introduca el id del profesor: ");
		int id_trabajador= sc.nextInt();
		sc.nextLine();
		
		System.out.print("Introduca horas de trabajo: ");
		int horasTrabajo= sc.nextInt();
		sc.nextLine();
		
		System.out.print("Introduca horas extra: ");
		int horasExtra= sc.nextInt();
		sc.nextLine();
		
		System.out.print("Introduca sueldoBase: ");
		double sueldoBase=0;
		sueldoBase= sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Introduca la fecha que empezo a trabajar dia/mes/a�o: ");
		String fecha= sc.nextLine();
		int datosAnti[] = new int [3];
		int cuenta2=0;
		int posicion2=0;
		
		for(int j=0; j<fecha.length(); j++) {
			
			if(fecha.charAt(j) == '/') {
				datosAnti[cuenta2]=  Integer.parseInt(fecha.substring(posicion2,j));
				cuenta2++;
				posicion2=j+1;
			}					
		}
		
		Fecha antiguedad = new Fecha(datosAnti[2],datosAnti[1],datosAnti[0]);
		
		
		System.out.print("Introduca el departamento: ");
		String departamento = sc.nextLine();
		
		System.out.print("Introduca asignatura: ");
		String asignatura = sc.nextLine();
		
		System.out.print("�Es tutor? True/False");
		boolean tutor = sc.nextBoolean();

		p.setId_trabajador(id_trabajador);
		p.setHorasExtra(horasExtra);
		p.setHorasTrabajo(horasTrabajo);
		p.setSueldoBase(sueldoBase);
		p.setAntiguedad(antiguedad);
		p.setAsignatura(asignatura);
		p.setDepartamento(departamento);
		p.setTutor(tutor);
	
	}
}
