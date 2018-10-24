package pl.mac.bry.kurs.moja.biblioteczka.dialogs;

import java.util.Optional;
import java.util.ResourceBundle;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

public class DialogUtils {

	static ResourceBundle resourceBundle = ResourceBundle.getBundle("bundles.ApplicationResources");
	
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
}
