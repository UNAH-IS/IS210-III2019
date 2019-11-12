package clases;

public class Carrera {
	private int codigo;
	private String nombreCarrera;
	private int cantidadClases;
	private String jefe;
	private String coordinador;
	public Carrera(int codigo, String nombreCarrera, int cantidadClases, String jefe, String coordinador) {
		super();
		this.codigo = codigo;
		this.nombreCarrera = nombreCarrera;
		this.cantidadClases = cantidadClases;
		this.jefe = jefe;
		this.coordinador = coordinador;
	}
	
	public Carrera() {}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombreCarrera() {
		return nombreCarrera;
	}

	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}

	public int getCantidadClases() {
		return cantidadClases;
	}

	public void setCantidadClases(int cantidadClases) {
		this.cantidadClases = cantidadClases;
	}

	public String getJefe() {
		return jefe;
	}

	public void setJefe(String jefe) {
		this.jefe = jefe;
	}

	public String getCoordinador() {
		return coordinador;
	}

	public void setCoordinador(String coordinador) {
		this.coordinador = coordinador;
	}

	@Override
	public String toString() {
		return "Carrera [codigo=" + codigo + ", nombreCarrera=" + nombreCarrera + ", cantidadClases=" + cantidadClases
				+ ", jefe=" + jefe + ", coordinador=" + coordinador + "]";
	}	
}
