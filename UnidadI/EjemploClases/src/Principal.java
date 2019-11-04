import clases.Circulo;

public class Principal {
	public static void main(String args[]) {
		int a = 5;
		
		Circulo c = new Circulo(); //null
		Circulo c1 = new Circulo();
		Circulo c2 = new Circulo();
		
		c.color = "Rosado";  //NullPointerException
		c.diametro = 10;
		c.x = 4;
		c.y = 4;
		c.nombre="Circulo vicioso";
		
		c1.color = "Verde";
		c1.diametro = 15;
		c1.x = 6;
		c1.y = 77;
		
		c2.color = "Negro";
		c2.diametro = 12;
		c2.x = 65;
		c2.y = 66;	
		
		
		System.out.println("Color: " + c.color);
		System.out.println("Area del circulo: " + c.calcularArea());
		System.out.println("Nombre: " + c.nombre);
		
		System.out.println("Color: " + c1.color);
		System.out.println("Area del circulo: " + c1.calcularArea());
		System.out.println("Nombre: " + c1.nombre);
		
		System.out.println("Color: " + c2.color);
		System.out.println("Area del circulo: " + c2.calcularArea());
		System.out.println("Nombre: " + c2.nombre);
		
	}
}
