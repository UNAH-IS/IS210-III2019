import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		//Los metodos parse retorna primitivos
		int a = Integer.parseInt("787"); //retorna int
		double b = Double.parseDouble("5.12"); //retorna double
		boolean c = Boolean.parseBoolean("false"); //retorna boolean
		
		//Los metodos valueOf retornan objetos de clases envolventes
		Integer d = Integer.valueOf("787"); //retorna Integer
		Double e = Double.valueOf("5.12"); //retorna Double
		Boolean f = Boolean.valueOf("false"); //retorna Boolean
		System.out.println(f);
		
		Integer x = a; //Se puede hacer la asignación directa de un primitivo a una clase envolvente
		
		Double y = 3.4;
		float z = y.floatValue();
		
		ArrayList<Integer> enteros = new ArrayList<Integer>();
		int enterosPrimitivos[] = new int[5];
				
	}

}