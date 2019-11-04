import java.util.Scanner;

public class EjemploScanner {

	public static void main(String[] args) {
		
		String nombre;
		String apellido;
		int edad;
		String genero;
		Scanner entrada;
		String gustos[];
		int cantidadGustos;
		
		
		entrada = new Scanner(System.in);
		
		System.out.print("Ingrese el nombre: ");
		nombre = entrada.nextLine();
		System.out.print("Ingrese el apellido: ");
		apellido = entrada.nextLine();
		System.out.print("Ingrese el edad: ");
		edad = entrada.nextInt();
		System.out.print("Ingrese el genero: ");
		genero = entrada.next();
		System.out.println("¿Cuantos gustos ingresará?");
		cantidadGustos = entrada.nextInt();
		gustos = new String[cantidadGustos];//Aqui no se esta instanciando, solo se esta dando un tamaño al arreglo
		
		System.out.println("Ingrese los gustos");
		for(int i=0;i<gustos.length;i++) {
			System.out.print("Gusto " + i + ":");
			gustos[i] = entrada.next();
		}
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Edad: " + edad);
		System.out.println("Genero: " + genero);
		System.out.println("Gustos: ");
		for(int i=0;i<gustos.length;i++) {
			System.out.print(gustos[i] + ",");
		}
		
		entrada.close();//Liberar recursos
		//entrada.next(); //falla
	}

}
