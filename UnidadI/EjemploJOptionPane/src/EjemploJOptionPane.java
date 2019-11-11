import javax.swing.JOptionPane;

public class EjemploJOptionPane {

	public static void main(String[] args) {
		
		//Atributos/metodos estaticos
		Alumno a = new Alumno();
		Alumno b = new Alumno();
		Alumno c = new Alumno();
		Alumno.atributoEstatico = 66;
		a.atributoEstatico = 30;
		b.atributoEstatico = 50;
		c.atributoEstatico = 20;
		System.out.println(Alumno.atributoEstatico);
		System.out.println(a.atributoEstatico);
		System.out.println(b.atributoEstatico);
		System.out.println(c.atributoEstatico);
		
		System.out.println("Seno: " + Math.sin(0.5));
		System.out.println("Potencia: " + Math.pow(2, 3));
		
		String nombre = "";
		do
			nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
		while(nombre.equals(""));
		
		
		JOptionPane.showMessageDialog(null, "Nombre ingresado: " + nombre); //Primer parametro es el componente padre, por ejemplo un formulario
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
		JOptionPane.showMessageDialog(null, "Edad ingresada: " + edad);
		
		//Forma correcta de comparar cadenas
		String n1="Juan";
		String n2="Juan";
		if(!n1.equals(n2)) {
			
		}
	}

}
