package clases;

public class Usuario {
	private String nombre;
	private String correo;
	public Usuario(String nombre, String correo) {
		this.nombre = nombre;
		this.correo = correo;
	}
	
	public Usuario() {}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", correo=" + correo + "]";
	}

	public boolean verificarCorreo() {
		return false;
	}
}
