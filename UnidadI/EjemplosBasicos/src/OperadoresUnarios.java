public class OperadoresUnarios{
	static int x=10;
	
	public static void main(String[] args){
		final int PESO = 10;
		int a = 2;
		int b = 2;		
		
		System.out.println(a++); //Imprime 2
		System.out.println(++b); //Imprime 3
		System.out.print("Estado Final (a) :");
		System.out.println(a); //Imprime 3
		System.out.print("Estado Final (b) :");
		System.out.println(b); //Imprime 3
		System.out.println(x);
	}
}
