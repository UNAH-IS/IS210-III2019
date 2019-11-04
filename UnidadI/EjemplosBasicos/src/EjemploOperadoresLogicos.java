public class EjemploOperadoresLogicos{
	public static void main(String[] args){
		int a = 2;
		int b = 2;
		boolean resultado;
		resultado = a==b;
		System.out.println("a==b: "+resultado);
		resultado = a!=b;
		System.out.println("a!=b :"+resultado);
		resultado = (a!=b) && (a==b);
		System.out.println("a!=b && a==b :"+resultado);
	}
}