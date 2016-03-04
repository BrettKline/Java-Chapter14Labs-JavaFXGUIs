package prog14_1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Prog14_1 extends Application {

	public void start(Stage stage) throws Exception {
		Parent parent = FXMLLoader.load(getClass().getResource("retailPrice.fxml"));
		Scene scene = new Scene(parent);
		stage.setTitle("Retail markup calculator");
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);

	}

}
