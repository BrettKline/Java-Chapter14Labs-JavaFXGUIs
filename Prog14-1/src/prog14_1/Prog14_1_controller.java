package prog14_1;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Prog14_1_controller {

    @FXML
    private TextField markupTextfield;

    @FXML
    private Button calculateButton;

    @FXML
    private Label label1;

    @FXML
    private TextField costTextfield;

    @FXML
    private Label label2;

    @FXML
    private Label resultLabel;
    public void initialize() {
		
	}
	
	public void calculateButtonListener() {
		String costStr = costTextfield.getText();
		String markupStr = markupTextfield.getText();
		double markup = Double.parseDouble(costStr) * (Double.parseDouble(markupStr) / 100);
		double result = Double.parseDouble(costStr) + markup;
		resultLabel.setText("Result: $" + result + "");
	}
}


