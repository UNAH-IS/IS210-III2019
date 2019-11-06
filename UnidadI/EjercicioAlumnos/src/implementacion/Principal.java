package implementacion;

import java.util.Scanner;
import clases.Alumno;

public class Principal {
	public static void main(String args[]) {
		Alumno alumnos[];
		Scanner entrada = new Scanner(System.in);
		int opcion;
				
		System.out.println("¿Cuantos alumnos registrará?");
		alumnos= new Alumno[entrada.nextInt()];
		System.out.println("Tamaño del arreglo: " + alumnos.length);
		
		for(int i=0;i<alumnos.length;i++) {
			System.out.println("---Ingresar información del alumno " +(i+1));
			Alumno a = new Alumno();
			
			//Solicitar información
			System.out.print("Cuenta:");
			a.setCuenta(entrada.next());
			System.out.print("Identificación:");
			a.setIdentificacion(entrada.next());
			System.out.print("Nombre:");
			a.setNombre(entrada.next());
			System.out.print("Apellido:");
			a.setApellido(entrada.next());
			System.out.print("Edad:");
			a.setEdad(entrada.nextInt());
			System.out.print("Genero:");
			a.setGenero(entrada.next());
			System.out.print("Carrera:");
			a.setCarrera(entrada.next());
			
			alumnos[i] = a;
			
			//Esto tambien funciona!
			/*alumnos[i] = new Alumno();
			
			//Solicitar información
			System.out.print("Cuenta:");
			alumnos[i].setCuenta(entrada.next());
			System.out.print("Identificación:");
			alumnos[i].setIdentificacion(entrada.next());
			System.out.print("Nombre:");
			alumnos[i].setNombre(entrada.next());
			System.out.print("Apellido:");
			alumnos[i].setApellido(entrada.next());
			System.out.print("Edad:");
			alumnos[i].setEdad(entrada.nextInt());
			System.out.print("Genero:");
			alumnos[i].setGenero(entrada.next());
			System.out.print("Carrera:");
			alumnos[i].setCarrera(entrada.next());*/
		}
		
		//******
		/* 1.Mostrar información 
		 * 2.Mostrar un alumno (0-N) 
		 * 3.Salir
		 * */
		
		do {
			System.out.println(
					"1. Mostrar información\n"+
					"2. Mostrar un alumno\n"+
					"3. Salir"
			);
			opcion = entrada.nextInt();
			switch(opcion) {
				case 1:
					//Mostrar toda la información
					System.out.println("----Listado de alumnos-----");
					for(int i=0;i<alumnos.length;i++)
						System.out.println(alumnos[i]);
					break;
				case 2:
					//Mostrar un alumno
					System.out.println("¿Que alumno quiere visualizar? (0-"+(alumnos.length-1)+")");
					System.out.println(alumnos[entrada.nextInt()]);
					break;
				case 3:
					System.out.println("Adios :'(");
					break;
				default:
					System.out.println("Opcion inválida");
					break;
			
			}
		}while(opcion!=3);
	}
}
