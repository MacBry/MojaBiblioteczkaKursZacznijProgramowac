package pl.mac.bry.kurs.moja.biblioteczka.utils;

import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class FxmlUtils {
	
	public static Pane fxmlLoader (String fxmlPath) {
		FXMLLoader fxmlLoader = new FXMLLoader(FxmlUtils.class.getResource(fxmlPath));
		fxmlLoader.setResources(resourceBundleLoader());
		
		try {
			return fxmlLoader.load();
		} catch (Exception e) {
			DialogUtils.errorDialog(e.getMessage());
		}
		return null;
	}
	
	public static ResourceBundle resourceBundleLoader () {
		ResourceBundle resourceBundle = ResourceBundle.getBundle("bundles.ApplicationResources");
		return resourceBundle;
	}
}
