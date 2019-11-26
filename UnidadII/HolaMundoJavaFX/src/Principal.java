import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Principal extends Application{
    public Principal(){}

    @Override
    public void start(Stage stage) throws Exception {
        //Stage es una ventana
        Group root = new Group();
        Scene escena = new Scene(root, 500,500);
        stage.setScene(escena);
        stage.setTitle("Mi primera ventana con JavaFX");
        stage.show();
    }

    public static void main(String args[]){
        launch(args);
    }
}
