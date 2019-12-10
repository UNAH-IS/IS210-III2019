package implementacion;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import clases.Persona;

public class LecturaObjetos {

	public static void main(String[] args) {
		try {
			ObjectInputStream flujo = new ObjectInputStream(new FileInputStream("usuarios.data"));
			try {
				while(true) {
					Persona a = (Persona)flujo.readObject();
					System.out.println(a);
				}
			}catch(EOFException e) {
				//e.printStackTrace();
				System.out.println("Se llego al final del archivo");
			}
			//flujo.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
//EOF => End Of File
}
