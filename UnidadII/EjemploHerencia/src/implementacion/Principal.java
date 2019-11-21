package implementacion;

import clases.Alumno;
import clases.Carrera;
import clases.Maestro;
import clases.Persona;

import java.util.ArrayList;

public class Principal {
    public static void main(String args[]){
        ArrayList<Persona> personas = new ArrayList<Persona>();

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

        Alumno a1 = new Alumno(
                "08013123123",
                "Pedro",
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

        Alumno a2 = new Alumno(
                "08013123123",
                "Maria",
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

        Maestro m = new Maestro(
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
                1000,
                "Ing Sistemas"
        );

        Maestro m1 = new Maestro(
                "08013123123",
                "Mirian",
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
                1000,
                "Ing Sistemas"
        );
        Maestro m2 = new Maestro(
                "08013123123",
                "Matusalen",
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
                1000,
                "Ing Sistemas"
        );

        //System.out.println(a);
        //System.out.println(m);
        //a.matricular();

        personas.add(a);
        personas.add(m);
        personas.add(a1);
        personas.add(m1);
        personas.add(a2);
        personas.add(m2);

        for (int i=0;i<personas.size();i++) {
            if (personas.get(i) instanceof Maestro)
                System.out.println(personas.get(i));
        }

        for (int i=0;i<personas.size();i++) {
            if (personas.get(i) instanceof Alumno)
                System.out.println(personas.get(i));
        }

        /*Persona p = new Alumno();
        Persona p2 = new Maestro();*/
    }
}
