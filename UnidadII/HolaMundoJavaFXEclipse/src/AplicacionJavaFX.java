import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AplicacionJavaFX extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage ventana) throws Exception {
		Group root = new Group();
		ventana.setScene(new Scene(root, 500, 500));
		ventana.show();
	}

}
