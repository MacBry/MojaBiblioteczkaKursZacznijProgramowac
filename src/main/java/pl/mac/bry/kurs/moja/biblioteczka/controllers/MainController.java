package pl.mac.bry.kurs.moja.biblioteczka.controllers;

import java.io.IOException;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import pl.mac.bry.kurs.moja.biblioteczka.utils.DialogUtils;
import pl.mac.bry.kurs.moja.biblioteczka.utils.FxmlUtils;

public class MainController {

	@FXML
	private BorderPane borderPane;
	
	@FXML
	private TopMenueButtonsController topMenueButtonsController;
	
	@FXML
	private void initialize() {
		topMenueButtonsController.setMainController(this);
	}
	
	@FXML
	public void closeAppOnActrion () {
		Optional<ButtonType>result = DialogUtils.confirmationDialog();
		if(result.get() == ButtonType.OK) {
			Platform.exit();
			System.exit(0);
		}
	}
	
	@FXML
	public void setCaspianStyleOnAction() {
		Application.setUserAgentStylesheet("CASPIAN");
	}
	
	@FXML
	public void setModenaOnAction() {
		Application.setUserAgentStylesheet("MODENA");
	}
	
	@FXML
	public void setAllwaysOnTopOnActrion(ActionEvent event) {
		Boolean value = ((CheckMenuItem) event.getSource()).selectedProperty().get();
		Stage stage = (Stage)borderPane.getScene().getWindow();
		stage.setAlwaysOnTop(value);

	}
	
	@FXML
	public void aboutAppOnAction() {
		DialogUtils.dialogAboutApp();
	}
	
	public void setCenter(String fxmlPath) {
		Pane parent = FxmlUtils.fxmlLoader(fxmlPath);
		borderPane.setCenter(parent);
	}
}
