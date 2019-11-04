package clases;

public class Circulo {
	public int x;
	public int y;
	public int diametro;
	public String color;
	public String nombre = "Nombre por defecto";
	private int circunferencia;
	
	public double calcularArea(){
		return Math.PI * Math.pow((diametro/2),2);
	}
	
	public void colorear(){
		System.out.println("Colorear el circulo en color " + color);
	}
}
