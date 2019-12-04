package clases;

import javax.swing.JOptionPane;

public class Alumno {
	private String identificacion;
	private String cuenta;
	private String nombre;
	private String apellido;
	private int edad;
	private String fechaNacimiento;
	private String genero;
	private Carrera carrera;
	
	public Alumno(String identificacion, String cuenta, String nombre, String apellido, int edad,String fechaNacimiento, String genero,
			Carrera carrera) {
		this.identificacion = identificacion;
		this.cuenta = cuenta;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.carrera = carrera;
	}

	public Alumno() {}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Alumno [identificacion=" + identificacion + ", cuenta=" + cuenta + ", nombre=" + nombre + ", apellido="
				+ apellido + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero
				+ ", carrera=" + carrera + "]";
	}

	public void solicitarInformacion() {
		this.identificacion = JOptionPane.showInputDialog("Identificación:", this.identificacion);
		this.cuenta = JOptionPane.showInputDialog("Cuenta:",this.cuenta);
		this.nombre = JOptionPane.showInputDialog("Nombre:",this.nombre);
		this.apellido = JOptionPane.showInputDialog("Apellido:",this.apellido);
		this.edad = Integer.parseInt(JOptionPane.showInputDialog("Edad:",this.edad));
		this.genero = JOptionPane.showInputDialog("Genero:",this.genero);
		
		if (this.carrera==null)
			this.carrera = new Carrera();
		carrera.solicitarInformacion();
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}
