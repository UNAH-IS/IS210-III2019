package implementacion;
import clases.Circulo;

public class Principal {
	public static void main(String args[]) {
		int a = 5;
		
		
		Circulo c3 = new Circulo(6,10,50,"Morado","Circulo diabolico",100);
		
		Circulo c = new Circulo(); //null
		Circulo c1 = new Circulo();
		Circulo c2 = new Circulo();
		
		//c3.setColor("Violeta");
		
		c.setColor("Rosado");  //NullPointerException
		c.setDiametro(10);
		c.setX(4);
		c.setY(4);
		c.setNombre("Circulo vicioso");
		//c.circunferencia = 4; //no se puede acceder porque es privado
		
		c1.setColor("Verde");
		c1.setDiametro(15);
		c1.setX(6);
		c1.setY(77);
		
		c2.setColor("Negro");
		c2.setDiametro(12);
		c2.setX(65);
		c2.setY(66);	
		
		System.out.println("X: " + c.getX());
		System.out.println("Color: " + c.getColor());
		System.out.println("Area del circulo: " + c.calcularArea());
		System.out.println("Nombre: " + c.getNombre());
		
		System.out.println("Color: " + c1.getColor());
		System.out.println("Area del circulo: " + c1.calcularArea());
		System.out.println("Nombre: " + c1.getNombre());
		
		System.out.println("Color: " + c2.getColor());
		System.out.println("Area del circulo: " + c2.calcularArea());
		System.out.println("Nombre: " + c2.getNombre());
		
		System.out.println("Color: " + c3.getColor());
		System.out.println("Area del circulo: " + c3.calcularArea());
		System.out.println("Nombre: " + c3.getNombre());
		
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
