package clases;

public class Maestro extends Persona{
    private double sueldo;
    private String titulo;

    public Maestro(String identificacion, String nombre, String apellido, int edad, String genero, Carrera carrera, double sueldo, String titulo) {
        super(identificacion, nombre, apellido, edad, genero, carrera);
        this.sueldo = sueldo;
        this.titulo = titulo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Maestro{" +
                "sueldo=" + sueldo +
                ", titulo='" + titulo + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                ", carrera=" + carrera +
                '}';
    }

    @Override
    public void matricular(){
        System.out.println("Metodo sobreescrito obligatoriamente");
    }
}
