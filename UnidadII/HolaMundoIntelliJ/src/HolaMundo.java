import clases.Alumno;
import clases.Carrera;

import javax.swing.*;

public class HolaMundo {
    public static void main(String args[]){
        System.out.println("HOla mundo");
        JOptionPane.showMessageDialog(null,"Hola mundo");
        Alumno a = new Alumno(
                "000",
                "0000",
                "Juan",
                "Perez",
                34,
                "Masculino",
                new Carrera(
                        123,
                        "Ing Sistemas",
                        35,
                        "Raul",
                        "Emilson"
                )
        );

        System.out.println(a);


    }
}
