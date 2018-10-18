package pl.mac.bry.kurs.moja.biblioteczka.controllers;

import java.io.IOException;
import java.util.ResourceBundle;

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
