package dad.javafx.iniciosesion;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Controller {
	View view = new View();
	App app = new App();
	
	public Controller() {
		view.getAccederButton().setOnAction(e -> onAccederAction(e));
		view.getCancelarButton().setOnAction(e -> onCancelarAction(e));
	}
	
	private void onCancelarAction(ActionEvent e) {
		Stage stage = (Stage) view.getScene().getWindow();
	    stage.close();
	}

	private void onAccederAction(ActionEvent e) {
		
		Model datosUsuario = new Model(view.getUsuarioText().getText(), view.getPassText().getText());
		
		if(datosUsuario.comprobar() == true) {
			Alert infoAlert = new Alert(AlertType.INFORMATION);
			infoAlert.setTitle("Iniciar sesi�n");
			infoAlert.setHeaderText("Acceso permitido.");
			infoAlert.setContentText("Las credenciales de acceso son v�lidas.");
			infoAlert.showAndWait();
		}else {
			Alert errorAlert = new Alert(AlertType.ERROR);
			errorAlert.setTitle("Iniciar sesi�n");
			errorAlert.setHeaderText("Acceso denegado.");
			errorAlert.setContentText("El usuario y/o la contrase�a no son v�lidos.");
			errorAlert.showAndWait();
		}
		
	}	


	public View getView() {
		return view;
	}
}
