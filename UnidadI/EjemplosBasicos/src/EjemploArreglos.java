
public class EjemploArreglos {
	public static void main(String[] args) {
		byte[] edades = new byte[4];
		float[] estaturas = new float[3];
		String[] nombres = new String[2];
		
		edades[0] = 23;
		edades[1] = 43;
		edades[2] = 55;
		edades[3] = 44;
		//edad[4] = 42; Error, solo se permiten cuatro elementos
		
		System.out.println("Valor indice 3: " + edades[3]);
		
		for (int i = 0; i < edades.length; i++) 
			System.out.println("["+i+"]: " + edades[i]);
		
		estaturas[0] = 45.4f;
		
		nombres[0] = "Juan";
		nombres[1] = new String("Perez");
		
		System.out.println("Nombre: " + nombres[0] + " " + nombres[1]);

	}

}
