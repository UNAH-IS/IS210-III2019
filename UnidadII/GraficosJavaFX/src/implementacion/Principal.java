package implementacion;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Principal extends Application {
    private int x=179;
    private GraphicsContext graficos;
    private Group root;
    private Scene escena;
    private Canvas lienzo;
    @Override
    public void start(Stage ventana) throws Exception {
        root = new Group();
        escena = new Scene(root, 500,500);
        lienzo = new Canvas(500,500);
        root.getChildren().add(lienzo);
        graficos = lienzo.getGraphicsContext2D(); //Obtener objeto para pintar
        //x, y, ancho, alto
        pintar();
        registrarEventos();
        ventana.setScene(escena);
        ventana.show();
    }

    public void pintar(){
        graficos.setFill(Color.GREEN);
        graficos.fillRect(30, 100,200, 100);
        graficos.setFill(Color.RED);
        graficos.fillOval(100,100,300,150);
        graficos.setFill(Color.rgb(120,25,255));
        graficos.fillText("Hola mundo", 0,20);
        // coordernadaXFragmentoImagen, coordernadaYFragmentoImagen, anchoFragmentoImagen, AltoFragmentoImagen, coordenaXDondeSePintara, coordenaYDondeSePintara, anchoDeLaImagenAPintar,altoDeLaImagenAPintar
        graficos.drawImage(new Image("implementacion/mario.png"),x, 121, 22,34, 0, 0, 22,34);
        graficos.drawImage(new Image("implementacion/mario.png"),118, 0, 16,18, 450, 10, 16,18);
    }

    public void registrarEventos() {
        escena.setOnKeyPressed(new EventHandler<KeyEvent>() {

            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode().toString()) {
                    case "RIGHT":
                        x+=5;
                        System.out.println(x);
                        break;
                    case "LEFT":
                        x-=5;
                        System.out.println(x);
                        break;

                }
            }
        });
    }

    public static void main(String args[]){
        launch(args);
    }
}



/*
RedGreenBlue
0-255,0-255,0-255
255,0,0 => Rojo
0,255,0 => Verde
0,0,255 => Azul
0,0,0 => Negro
255,255,255 =>Blanco
14,25,255 => En su mayoria es AZUL

CMYK
Frames Per Second
**/