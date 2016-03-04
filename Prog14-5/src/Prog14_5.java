import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Prog14_5 extends Application {

	public void start(Stage stage) throws Exception {
		Parent parent = FXMLLoader.load(getClass().getResource("distance.fxml"));
		Scene scene = new Scene(parent);
		stage.setTitle("Distance in a car");
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);

	}

}
