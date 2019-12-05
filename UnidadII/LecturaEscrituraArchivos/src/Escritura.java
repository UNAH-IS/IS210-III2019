import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escritura {

	public static void main(String[] args) {
		File archivo = new File("archivo.txt");
		System.out.println("Existe: " + archivo.exists());
		System.out.println("Ruta absoluta: "+archivo.getAbsolutePath());
		System.out.println("Tamaño: " + archivo.length());
		System.out.println("Ultima modificacion: " + archivo.lastModified());
		
		
		/*for (int i=0;i<1000;i++) {
			try {
				File archivo2 = new File("archivo-"+i+".txt");
				archivo2.createNewFile();			
			} catch (IOException e) {
				e.printStackTrace();
			}
		}*/
		/*File directorio = new File("directorioX");
		directorio.mkdir();*/
		archivo.delete();
		
		//Para escribir dentro de un archivo no se puede solo con la clase File
		//Escribir archivos basados en caracteres
		try {
			BufferedWriter flujo = new BufferedWriter(new FileWriter("usuarios.csv",true));
			flujo.write("Pedro,Perez,45,Masculino\n");
			flujo.write("Matusalen,Perez,45,Femenino\n");
			flujo.write("LaBritany,Perez,45,Femenino\n");
			flujo.flush(); //Descarga todo el contenido dentro del archivo
			flujo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
