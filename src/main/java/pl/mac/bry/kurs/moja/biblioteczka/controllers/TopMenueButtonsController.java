package pl.mac.bry.kurs.moja.biblioteczka.controllers;



import javafx.fxml.FXML;

public class TopMenueButtonsController {

	private MainController mainController;
	
	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}

	@FXML
	private void initialize() {
		
	}
	
	@FXML
	public void openLibrary() {
		System.out.println("biblioteka");
	}
	
	@FXML
	public void openBooksList() {
		System.out.println("list ksi¹zek");
	}
	
	@FXML
	public void openStatisctic() {
		System.out.println("Statystyki");
	}
}
