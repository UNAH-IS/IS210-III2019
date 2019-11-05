package clases;

//Plain Old Java Object (POJO): Es un clase con constructor, atributos privados, metodos set y get, el metodo toString
public class Circulo { //Upper CamelCase
	private int x; //Lower camelCase
	private int y;
	private int diametro;
	private String color;
	private String nombre = "Nombre por defecto";
	private int circunferencia;
	
	public Circulo(
			int x, 
			int y, 
			int diametro, 
			String color, 
			String nombre, 
			int circunferencia
	) {
		this.x = x;
		this.y = y;
		this.diametro = diametro;
		this.color = color;
		this.nombre = nombre;
		this.circunferencia = circunferencia;
	}

	public Circulo() {
		//Constructor vacio, no inicializa naadaaaa
	}
	
	public double calcularArea(){
		return Math.PI * Math.pow((diametro/2),2);
	}
	
	public void colorear(){
		System.out.println("Colorear el circulo en color " + color);
	}
	
	public void mostrarCircunferencia() {
		System.out.println("Circunferencia: " + circunferencia);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCircunferencia() {
		return circunferencia;
	}

	public void setCircunferencia(int circunferencia) {
		this.circunferencia = circunferencia;
	}

	public String toString() {
		return "Circulo [x=" + x + ", y=" + y + ", diametro=" + diametro + ", color=" + color + ", nombre=" + nombre
				+ ", circunferencia=" + circunferencia + "]";
	}
	
	/*public String toString() {
		return 	this.x+","+
				this.y+","+
				this.nombre+","+
				this.circunferencia+","+
				this.color+","+
				this.diametro;
	}*/
	
	
}
