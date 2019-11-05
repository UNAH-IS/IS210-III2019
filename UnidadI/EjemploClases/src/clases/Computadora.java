package clases;

public class Computadora {
	String color;
	String marca;
	String modelo;
	int capacidadMemoria;
	int capacidadDisco;
	//...
	public Computadora(String color, String marca, String modelo, int capacidadMemoria, int capacidadDisco) {
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.capacidadMemoria = capacidadMemoria;
		this.capacidadDisco = capacidadDisco;
	}
	
	void encender() {
		System.out.println("Encendiendo");
	}
	
	

	void apagar() {
		System.out.println("Apagando");
	}
	
	void explotar() {
		System.out.println("Explotando x_x");
	}
}
