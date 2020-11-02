package dad.javafx.iniciosesion;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class View extends VBox {
	
	private Label usuarioLabel;
	private Label passLabel;
	private TextField usuarioText;
	private PasswordField passText;
	private Button accederButton;
	private Button cancelarButton;
	private Alert infoAlert = new Alert(AlertType.INFORMATION);
	private Alert errorAlert = new Alert(AlertType.ERROR);
	
	public View() {
		super();
		
		usuarioLabel = new Label("Usuario:");
		passLabel = new Label("Contraseña:");
		
		usuarioText = new TextField();
		usuarioText.setPromptText("Usuario");
		
		passText = new PasswordField();
		passText.setPromptText("Contraseña");
		
		accederButton = new Button("Acceder");
		cancelarButton = new Button("Cancelar");
		
		infoAlert.setTitle("Iniciar sesión");
		infoAlert.setHeaderText("Acceso permitido.");
		infoAlert.setContentText("Las credenciales de acceso son válidas.");
		
		errorAlert.setTitle("Iniciar sesión");
		errorAlert.setHeaderText("Acceso denegado.");
		errorAlert.setContentText("El usuario y/o la contraseña no son válidos.");
		
		HBox botonBox = new HBox();
		botonBox.setSpacing(10);
		botonBox.setAlignment(Pos.CENTER);
		botonBox.getChildren().addAll(accederButton, cancelarButton);
		
		GridPane view = new GridPane();
		view.setGridLinesVisible(false);
		view.setAlignment(Pos.BASELINE_CENTER);
		view.setVgap(10);
		view.setHgap(10);
		view.addRow(0, usuarioLabel, usuarioText);
		view.addRow(1, passLabel, passText);
		view.addRow(2, new Label(""), botonBox);
		
		ColumnConstraints[] cons1 = { new ColumnConstraints(), new ColumnConstraints(), };
		cons1[0].setHalignment(HPos.LEFT);
		cons1[1].setFillWidth(true);
		
		view.getColumnConstraints().setAll(cons1);
		

		this.setSpacing(15);
		this.setAlignment(Pos.CENTER);
		this.setPrefHeight(20);
		this.getChildren().addAll(view);
		this.setPadding(new Insets(30, 50, 50, 5));		
	}

	public TextField getUsuarioText() {
		return usuarioText;
	}

	public PasswordField getPassText() {
		return passText;
	}

	public Button getAccederButton() {
		return accederButton;
	}

	public Button getCancelarButton() {
		return cancelarButton;
	}
	
	

}
