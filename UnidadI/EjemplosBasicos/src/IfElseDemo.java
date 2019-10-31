public class IfElseDemo {
    public static void main(String[] args) {
        int nota = 76;
        char grado;
        if (nota >= 90) {
            grado = 'A';
        } else if (nota >= 80) {
            grado = 'B';
        } else if (nota >= 70) {
            grado = 'C';
        } else if (nota >= 60) {
            grado = 'D';
        } else {
            grado = 'F';
        }
        System.out.println("Grado= " + grado);
    }
}
