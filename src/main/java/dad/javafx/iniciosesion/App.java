package dad.javafx.iniciosesion;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	private Controller controller;
	private Scene scene;

	@Override
	public void start(Stage primaryStage) throws Exception {
		controller = new Controller();
		
		scene = new Scene(controller.getView(), 480, 320);
		primaryStage.setTitle("Iniciar sesi�n");
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	
	public Object getScene() {
		return scene;
	}

	public static void main(String[] args) {
		launch(args);

	}

}
