package pl.mac.bry.kurs.moja.biblioteczka.controllers;

import java.io.IOException;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

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
		Platform.exit();
		System.exit(0);
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
	public void setAllwaysOnTopOnActrion() {
		
	}
	
	@FXML
	public void aboutAppOnAction() {
		
	}
	
	public void setCenter(String fxmlPath) {
		FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource(fxmlPath));
		ResourceBundle resourceBundle = ResourceBundle.getBundle("bundles.ApplicationResources");
		fxmlLoader.setResources(resourceBundle);
		Parent parent = null;
		try {
			parent = fxmlLoader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		borderPane.setCenter(parent);
	}
}
