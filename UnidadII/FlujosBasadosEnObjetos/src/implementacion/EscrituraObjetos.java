package implementacion;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import clases.Persona;

public class EscrituraObjetos {

	public static void main(String[] args) {
		Persona a = new Persona("Matusalen","Perez");
		Persona b = new Persona("LaKimberly","Rodriguez");
		Persona c = new Persona("LaYorleny","Lainez");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		//Serializando objetos ()
		//Escribir objetos
		try {
			ObjectOutputStream flujo = new ObjectOutputStream(new FileOutputStream("usuarios.data"));
			//No se puede guardar un objeto si la clase no implementa la interfaz Serializable
			flujo.writeObject(a);
			flujo.writeObject(b);
			flujo.writeObject(c);
			flujo.flush();
			System.out.println("Se guardaron los objetos");
			flujo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
