import javax.swing.*;

//awt
//swing
//javafx
public class Ventana extends JFrame {
    public Ventana(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,700);
        setLocationRelativeTo(null); //Centrarla
        setTitle("Mi primera ventana :') "); //Titulo
        setVisible(true); //Para mostrarla
    }
    public static void main(String args[]){
        new Ventana();
    }
}
