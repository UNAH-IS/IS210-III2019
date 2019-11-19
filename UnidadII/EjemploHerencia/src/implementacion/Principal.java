package implementacion;

import clases.Alumno;
import clases.Carrera;

public class Principal {
    public static void main(String args[]){
        Alumno a = new Alumno(
                    "08013123123",
                    "Juan",
                    "Perez",
                    37,
                    "Masculino",
                    new Carrera(
                            324,
                            "Ing Sistemas",
                            11,
                            "Raul",
                            "Emilson"
                    ),
                    "201600154",
                    32.2
        );

        System.out.println(a);
        a.matricular();
    }
}
