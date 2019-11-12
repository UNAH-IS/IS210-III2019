package implementacion;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import clases.Alumno;
import clases.Carrera;

public class Principal {
	public static void main(String[] args) {
		/*
		//Pruebas de composición 
		Carrera c = new Carrera(115, "Ing en Sistemas", 56, "Raul Palma", "Emilson Acosta");
		Alumno a =new Alumno("08014232","23423423","Juan","Perez",30,"Masculino",c);
		Alumno b =new Alumno("08014233","23423424","Pedro","Rodriguez",35,"Masculino", new Carrera(116, "Ing Quimica", 10, "X", "Y"));
		System.out.println(a);
		System.out.println(b);*/
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		int opcion;
		
		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(
					"1 Agregar un alumno\n"+
					"2 Modificar un alumno\n"+
					"3 Eliminar un alumno\n"+
					"4 Mostrar información\n"+
					"0 Salir"
			));
			
			switch(opcion) {
			case 0:
				System.out.println("Adios!");
				break;
			case 1:
				Alumno a = new Alumno();
				a.setIdentificacion(JOptionPane.showInputDialog("Identificación:"));
				a.setCuenta(JOptionPane.showInputDialog("Cuenta:"));
				a.setNombre(JOptionPane.showInputDialog("Nombre:"));
				a.setApellido(JOptionPane.showInputDialog("Apellido:"));
				a.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Edad:")));
				a.setGenero(JOptionPane.showInputDialog("Genero:"));
				
				Carrera c = new Carrera();
				c.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Codigo Carrera:")));
				c.setNombreCarrera(JOptionPane.showInputDialog("Nombre carrera:"));
				c.setCantidadClases(Integer.parseInt(JOptionPane.showInputDialog("Cantidad Clases")));
				c.setJefe(JOptionPane.showInputDialog("Jefe carrera:"));
				c.setCoordinador(JOptionPane.showInputDialog("Coordinador carrera:"));

				a.setCarrera(c);
				
				alumnos.add(a);
				 
				break;
			case 2:
				//Solicitar al usuario el indice del alumno a modificar
				int indiceModificar= Integer.parseInt(JOptionPane.showInputDialog("¿Que elemento desea modificar? (0 - "+(alumnos.size()-1)+")"));
				//Obtener el objeto del indice seleccionado
				Alumno alumno = alumnos.get(indiceModificar);
				//Modificar los atributos del objeto obtenido ingresando nuevamente tooooooda la informacion
				alumno.setIdentificacion(JOptionPane.showInputDialog("Identificación:",alumno.getIdentificacion()));
				alumno.setCuenta(JOptionPane.showInputDialog("Cuenta:",alumno.getCuenta()));
				alumno.setNombre(JOptionPane.showInputDialog("Nombre:",alumno.getNombre()));
				alumno.setApellido(JOptionPane.showInputDialog("Apellido:",alumno.getApellido()));
				alumno.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Edad:",alumno.getEdad())));
				alumno.setGenero(JOptionPane.showInputDialog("Genero:",alumno.getGenero()));
				
				Carrera carrera = alumno.getCarrera();
				carrera.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Codigo Carrera:",carrera.getCodigo())));
				carrera.setNombreCarrera(JOptionPane.showInputDialog("Nombre carrera:",carrera.getNombreCarrera()));
				carrera.setCantidadClases(Integer.parseInt(JOptionPane.showInputDialog("Cantidad Clases",carrera.getCantidadClases())));
				carrera.setJefe(JOptionPane.showInputDialog("Jefe carrera:",carrera.getJefe()));
				carrera.setCoordinador(JOptionPane.showInputDialog("Coordinador carrera:",carrera.getCoordinador()));
				
				break;
			case 3:
				//Solicitar al usuario que elemento eliminar
				int indiceEliminar = Integer.parseInt(JOptionPane.showInputDialog("¿Que elemento desea eliminar? (0 - "+(alumnos.size()-1)+")"));
				//Eliminar el elemento del ArrayList
				alumnos.remove(indiceEliminar);
				JOptionPane.showMessageDialog(null, "Se elimino el registro "+ indiceEliminar);
				break;
			case 4:
				/*
				//En caso de querer visualizarlo en la consola 
				System.out.println("-----Alumnos registrados-----");
				for(int i=0;i<alumnos.size();i++)
					System.out.println(alumnos.get(i));*/
				String registros="";
				for(int i=0;i<alumnos.size();i++)
					registros+=alumnos.get(i) + "\n";
				JOptionPane.showMessageDialog(null, registros);
				break;
			}
			
		}while(opcion!=0);
	}
}
