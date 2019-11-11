package implementacion;

import java.util.ArrayList;

import clases.Alumno;

public class Principal {
	public static void main(String[] args) {
		//Alumno alumnos[] = new Alumno[5];
		
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		//ArratList<TipoDato> nombreColeccion = new ArrayList<TipoDato>();
		//RawType (Receptáculo): En el caso de los ArrayList se utiliza para indicar el tipo de dato que gestionaran
		//El RawType debe ir entre los simbolos < y >
		
		Alumno a = new Alumno("080154545","20160354545","Juan","Perez",35,"Masculino");
		Alumno b = new Alumno("080154545","20160354545","Maria","Rodrigez",20,"Femenino","Ing Sistemas");
		Alumno y = new Alumno("6667","20160354545","ElKevin","Perz",20,"Femenino","Ing Sistemas");		Alumno c = new Alumno();
		c.setNombre("ElBrayan");
		c.setApellido("Gomez");
		
		alumnos.add(a);
		alumnos.add(b);
		alumnos.add(c);
		alumnos.add(new Alumno("080154546","20160354546","Pedro","Martinex",33,"Masculino","Ing en Quimica")); //Agregar un objeto anonimo
	
		Alumno x = alumnos.get(3); //Obtener el objeto de pedro
		x.setCarrera("Ing Mecanica");//Actualizar la carrera
		
		//Sustituir un objeto completo Juan->ELKevin
		alumnos.set(0, y);
		
		
		alumnos.remove(1); //Eliminar a Maria :(
		
		for(int i=0;i<alumnos.size();i++) //size retorna el tamaño de la colección
			System.out.println(alumnos.get(i));
		
		/*
		Alumno a=new Alumno();
		a.setNombre("Matusalen");
		a.setApellido("Perez");
		Alumno b = a.crearCopiar(); //Crear una copia.
		b.setNombre("Goku");
		System.out.println(a); //Matusalen
		System.out.println(b); //Goku
		*/
	}
}
