package clases;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	
	public Fecha() {}
	
	public Fecha(String fecha) {//DD-MM-YYYY
		String partes[] = fecha.split("-");
		this.dia = Integer.parseInt(partes[0]);
		this.mes = Integer.parseInt(partes[1]);
		this.anio = Integer.parseInt(partes[2]);
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
	}
	
	public boolean verificarFecha() {
		return false;
	}
	
}
