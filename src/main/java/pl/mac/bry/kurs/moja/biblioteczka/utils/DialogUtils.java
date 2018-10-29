package pl.mac.bry.kurs.moja.biblioteczka.utils;

import java.util.Optional;
import java.util.ResourceBundle;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;

public class DialogUtils {

	static ResourceBundle resourceBundle = FxmlUtils.resourceBundleLoader();
	
	public static void dialogAboutApp() {
		Alert informationAlert = new Alert(AlertType.INFORMATION);
		informationAlert.setTitle(resourceBundle.getString("informationAlert.title"));
		informationAlert.setHeaderText(resourceBundle.getString("informationAlert.header"));
		informationAlert.setContentText(resourceBundle.getString("informationAlert.context"));
		informationAlert.showAndWait();
	}
	
	public static Optional<ButtonType> confirmationDialog() {
		Alert confirmationAlert = new Alert(AlertType.CONFIRMATION);
		confirmationAlert.setTitle(resourceBundle.getString("confirmationAlert.title"));
		confirmationAlert.setContentText(resourceBundle.getString("confirmationAlert.header"));
		Optional<ButtonType>result = confirmationAlert.showAndWait();
		return result;
	}
	
	public static void errorDialog(String error) {
		Alert errorAlert = new Alert(AlertType.ERROR);
		errorAlert.setTitle(resourceBundle.getString("errorAlert.title"));
		errorAlert.setHeaderText(resourceBundle.getString("errorAlert.header"));
		TextArea textArea = new TextArea(error);
		errorAlert.getDialogPane().setContent(textArea);
		errorAlert.showAndWait();
	}
}
