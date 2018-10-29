package pl.mac.bry.kurs.moja.biblioteczka.controllers;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleGroup;

public class TopMenueButtonsController {
	
	private static final String ADD_BOOK_FXML = "/fxml/AddBook.fxml";

	private static final String STATISTICS_FXML = "/fxml/Statisti.fxml";

	private static final String BOOK_LIST_FXML = "/fxml/BookList.fxml";

	private static final String LIBRARY_FXML = "/fxml/Library.fxml";

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
		mainController.setCenter(LIBRARY_FXML);
	}
	
	@FXML
	public void openBooksList() {
		mainController.setCenter(BOOK_LIST_FXML);
	}
	
	@FXML
	public void openStatisctic() {
		mainController.setCenter(STATISTICS_FXML);
	}
	
	@FXML
	public void addBookOnAction(){
		if(toggleButtons.getSelectedToggle() != null) {
			toggleButtons.getSelectedToggle().setSelected(false);
		}
		
		mainController.setCenter(ADD_BOOK_FXML);
	}
}
