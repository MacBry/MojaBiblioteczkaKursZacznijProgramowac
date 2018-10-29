package pl.mac.bry.kurs.moja.biblioteczka;

import java.util.Locale;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import pl.mac.bry.kurs.moja.biblioteczka.utils.FxmlUtils;

public class Main extends Application {

	private static final String BORDER_PANE_MAIN_FXML = "/fxml/BorderPaneMain.fxml";

	public static void main (String [] args ) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//Locale.setDefault(new Locale("en_US"));
		FxmlUtils.fxmlLoader(BORDER_PANE_MAIN_FXML);
		
		Pane borderPane = FxmlUtils.fxmlLoader(BORDER_PANE_MAIN_FXML);
		Scene scene = new Scene(borderPane);
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle(FxmlUtils.resourceBundleLoader().getString("title.applictation"));
		primaryStage.show();
	}

}
