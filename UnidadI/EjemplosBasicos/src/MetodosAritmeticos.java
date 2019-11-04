public class MetodosAritmeticos{
	static int sumar(int a,int b){
		return a+b;
	}
	
	static int sumar(int a, int b, int c) {
		return a+b+c;
	}
	
	static int sumar(float a, float b) {
		return (int)(a+b);
	}
	
	static int restar(int a,int b){
		return a-b;
	}
	static float dividir(int a,int b){
		return (float)a/(float)b;
	}
	
	public static void main(String[] args){
		int x = 5;
		int y = 4;
		System.out.println("Suma: " + sumar(x,y));
		System.out.println("Resta: " + restar(x,y));
		System.out.println("Multiplicacion: " + multiplicar(x,y));
		System.out.println("Division: " + dividir(x,y));
		
		System.out.println("Suma: " + sumar(4,5));
		System.out.println("Suma: " + sumar(4,5,6));
		System.out.println("Suma: " + sumar(3.2f,55.2f));
	}
	
	static int multiplicar(int a,int b){
		return a*b;
	}
}