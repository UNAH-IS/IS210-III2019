public class HolaMundo{
	public static void main(String args[]){
		System.out.println("Hola " + args[0]);
		System.out.println("Cantidad de parametros: " + args.length);
		for(int i=0;i<args.length;i++)
			System.out.println("Parametro " + i + ": " + args[i]);
	}
}