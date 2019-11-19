package clases;

public class Alumno extends Persona{
    private String cuenta;
    private double promedio;

    public Alumno(String identificacion, String nombre, String apellido, int edad, String genero, Carrera carrera, String cuenta, double promedio){
        super(identificacion, nombre, apellido, edad, genero, carrera);
        this.cuenta = cuenta;
        this.promedio = promedio;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    /*@Override
    public String toString() {
        return "Alumno{" +
                "nombre=" + nombre +
                "apellido=" + apellido +
                "edad=" + edad +
                "cuenta='" + cuenta + '\'' +
                ", promedio=" + promedio +
                '}';
    }*/

    @Override
    public String toString() {
        return super.toString() + " ---- Alumno{" +
                "cuenta='" + cuenta + '\'' +
                ", promedio=" + promedio +
                '}';
    }

    @Override
    public void matricular(){
        super.matricular();
        System.out.println("Metodo matricular desde la clase alumno");
    }
}
