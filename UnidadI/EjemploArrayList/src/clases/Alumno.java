package clases;

public class Alumno {
	private String identificacion;
	private String cuenta;
	private String nombre;
	private String apellido;
	private int edad;
	private String genero;
	private String carrera;
	
	public Alumno(String identificacion, String cuenta, String nombre, String apellido, int edad, String genero,
			String carrera) {
		this.identificacion = identificacion;
		this.cuenta = cuenta;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
		this.carrera = carrera;
	}
	
	public Alumno(String identificacion, String cuenta, String nombre, String apellido, int edad, String genero) {
		this.identificacion = identificacion;
		this.cuenta = cuenta;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
		this.carrera = "Sin carrera";
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

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String toString() {
		return "Alumno [identificacion=" + identificacion + ", cuenta=" + cuenta + ", nombre=" + nombre + ", apellido="
				+ apellido + ", edad=" + edad + ", genero=" + genero + ", carrera=" + carrera + "]";
	}
	
	public Alumno crearCopiar() {
		return new Alumno(
				this.identificacion,
				this.cuenta,
				this.nombre,
				this.apellido,
				this.edad,
				this.genero,
				this.carrera
		);
	}
}
