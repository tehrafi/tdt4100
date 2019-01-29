package personliste;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class PersonApp extends Application{
	@Override
	public void start(final Stage primaryStage) throws Exception {
		primaryStage.setTitle("Personer");
		primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("PersonListGUI.fxml"))));
		primaryStage.show();
		
	}
	public static void main(final String[] args) {
		Application.launch(args);
	}
}
