package pl.mac.bry.kurs.moja.biblioteczka.controllers;

import javafx.fxml.FXML;
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
}
