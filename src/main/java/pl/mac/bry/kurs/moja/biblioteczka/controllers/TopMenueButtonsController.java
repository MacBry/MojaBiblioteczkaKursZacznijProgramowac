package pl.mac.bry.kurs.moja.biblioteczka.controllers;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

public class TopMenueButtonsController {

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
		System.out.println("biblioteka");
	}
	
	@FXML
	public void openBooksList() {
		System.out.println("list ksi�zek");
	}
	
	@FXML
	public void openStatisctic() {
		System.out.println("Statystyki");
	}
	public void addBookOnAction(){
		if(toggleButtons.getSelectedToggle() != null) {
			toggleButtons.getSelectedToggle().setSelected(false);
		}
	}
}
