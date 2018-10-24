package pl.mac.bry.kurs.moja.biblioteczka;

import java.util.Locale;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main (String [] args ) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//Locale.setDefault(new Locale("en_US"));
	
		FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("/fxml/BorderPaneMain.fxml"));
		ResourceBundle resourceBundle = ResourceBundle.getBundle("bundles.ApplicationResources");
		fxmlLoader.setResources(resourceBundle);
		
		BorderPane borderPane = fxmlLoader.load();
		Scene scene = new Scene(borderPane);
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle(resourceBundle.getString("title.applictation"));
		primaryStage.show();
	}

}
