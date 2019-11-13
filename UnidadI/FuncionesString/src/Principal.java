
public class Principal {

	public static void main(String[] args) {
		String nombre = "Pedror";
		String email = "pmartinez@gmail.com";
		
		System.out.println(nombre.length());
		System.out.println(nombre.indexOf("r"));
		System.out.println(nombre.lastIndexOf("r"));
		System.out.println(nombre.charAt(0));
		System.out.println(nombre.substring(0,3));
		System.out.println(nombre.toUpperCase());
		System.out.println(nombre.toLowerCase());
		System.out.println(("Juan").equals("juan"));
		System.out.println(("Juan").equalsIgnoreCase("juan"));
		System.out.println(String.valueOf(34));
		System.out.println(("    Hola Mundo    ").trim());
		
		System.out.println(email.indexOf("@"));
		System.out.println(email.lastIndexOf("@"));
		
		String [] partes = email.split("@");
		
		System.out.println(partes[0]);
		System.out.println(partes[1]);
		System.out.println(partes.length);
		
	}

}
