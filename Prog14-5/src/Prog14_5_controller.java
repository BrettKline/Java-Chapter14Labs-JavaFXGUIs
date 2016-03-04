import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Prog14_5_controller {

    @FXML
    private Label label5;

    @FXML
    private Label label8;

    @FXML
    private Button calculateButton;

    @FXML
    private TextField speedTextfield;

    @FXML
    private Label label12;

    public void initialize() {
    	
    }

    public void calculateButtonListener() {
    	String speedStr = speedTextfield.getText();
    	double speed = Double.parseDouble(speedStr);

    	double result5 = speed * 5;
    	double result8 = speed * 8;
    	double result12 = speed * 12;
    	label5.setText("Distance in 5 hours: " + result5 + " miles");
    	label8.setText("Distance in 8 hours: " + result8 + " miles");
    	label12.setText("Distance in 12 hours: " + result12 + " miles");
    }
}


