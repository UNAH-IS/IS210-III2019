package clases;

import java.util.Arrays;

public class Archivo {
	private String nombreArchivo;
	private int tamanio;
	private Usuario usuarioSubio;
	private Usuario usuariosComparte[]; //private ArrayList<Usuario> usuariosComparte;
	private String nombreCarpeta;
	private Fecha fechaModificacion;
	private Fecha fechaSubida;
	public Archivo(String nombreArchivo, int tamanio, Usuario usuarioSubio, Usuario[] usuariosComparte,
			String nombreCarpeta, Fecha fechaModificacion, Fecha fechaSubida) {
		this.nombreArchivo = nombreArchivo;
		this.tamanio = tamanio;
		this.usuarioSubio = usuarioSubio;
		this.usuariosComparte = usuariosComparte;
		this.nombreCarpeta = nombreCarpeta;
		this.fechaModificacion = fechaModificacion;
		this.fechaSubida = fechaSubida;
	}
	
	public Archivo() {}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public Usuario getUsuarioSubio() {
		return usuarioSubio;
	}

	public void setUsuarioSubio(Usuario usuarioSubio) {
		this.usuarioSubio = usuarioSubio;
	}

	public Usuario[] getUsuariosComparte() {
		return usuariosComparte;
	}

	public void setUsuariosComparte(Usuario[] usuariosComparte) {
		this.usuariosComparte = usuariosComparte;
	}

	public String getNombreCarpeta() {
		return nombreCarpeta;
	}

	public void setNombreCarpeta(String nombreCarpeta) {
		this.nombreCarpeta = nombreCarpeta;
	}

	public Fecha getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Fecha fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public Fecha getFechaSubida() {
		return fechaSubida;
	}

	public void setFechaSubida(Fecha fechaSubida) {
		this.fechaSubida = fechaSubida;
	}

	@Override
	public String toString() {
		return "Archivo [nombreArchivo=" + nombreArchivo + ", tamanio=" + tamanio + ", usuarioSubio=" + usuarioSubio
				+ ", usuariosComparte=" + Arrays.toString(usuariosComparte) + ", nombreCarpeta=" + nombreCarpeta
				+ ", fechaModificacion=" + fechaModificacion + ", fechaSubida=" + fechaSubida + "]";
	}
	

	
	public boolean verificarTamanio() {
		return false;
	}
	
	public boolean verificarSeguridad() {
		return false;
	}
}
