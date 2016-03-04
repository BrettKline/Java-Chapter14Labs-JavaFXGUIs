import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Prog14_2_controller {

    @FXML
    private Button leftButton;

    @FXML
    private Button centerButton;

    @FXML
    private Button rightButton;

    @FXML
    private Label resultLabel;
    
    public void initialize() {
		
	}
	
	public void leftButtonListener() {
		resultLabel.setText("left");
	}	
	public void centerButtonListener() {
		resultLabel.setText("center");
	}	
	public void rightButtonListener() {
		resultLabel.setText("right");
	}
}

