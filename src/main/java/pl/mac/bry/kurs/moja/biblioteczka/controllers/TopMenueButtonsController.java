package pl.mac.bry.kurs.moja.biblioteczka.controllers;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleGroup;

public class TopMenueButtonsController {
	
	@FXML
	private MainController mainController;
	
	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}
	@FXML
	private Button addBookButton;
	
	@FXML
	private ToggleGroup toggleButtons;

	@FXML
	private void initialize() {
		
	}
	
	@FXML
	public void openLibrary() {
		mainController.setCenter("/fxml/Library.fxml");
	}
	
	@FXML
	public void openBooksList() {
		mainController.setCenter("/fxml/BookList.fxml");
	}
	
	@FXML
	public void openStatisctic() {
		mainController.setCenter("/fxml/Statistics.fxml");
	}
	
	@FXML
	public void addBookOnAction(){
		if(toggleButtons.getSelectedToggle() != null) {
			toggleButtons.getSelectedToggle().setSelected(false);
		}
		
		mainController.setCenter("/fxml/AddBook.fxml");
	}
}
