import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Prog14_3_controller {

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private TextField lastTextfield;

    @FXML
    private Button button6;

    @FXML
    private TextField middleTextfield;

    @FXML
    private TextField titleTextfield;

    @FXML
    private Button button1;

    @FXML
    private Label labelResult;

    @FXML
    private TextField firstTextfield;
    
    public void initialize() {
		
	}
	
	public void Button1Listener() {
		labelResult.setText(titleTextfield.getText() + " " + firstTextfield.getText() + " " + middleTextfield.getText() + " " +  lastTextfield.getText());
	}	

	public void Button2Listener() {
		labelResult.setText(firstTextfield.getText() + " " + middleTextfield.getText() + " " + lastTextfield.getText());
	}	

	public void Button3Listener() {
		labelResult.setText(firstTextfield.getText() + " " + lastTextfield.getText());
	}	

	public void Button4Listener() {
		labelResult.setText(lastTextfield.getText() + ", " + firstTextfield.getText() + " " + middleTextfield.getText() + ", " + titleTextfield.getText());
	}	

	public void Button5Listener() {
		labelResult.setText(lastTextfield.getText() + ", " + firstTextfield.getText() + " " + middleTextfield.getText());
	}	

	public void Button6Listener() {
		labelResult.setText(lastTextfield.getText() + ", " + firstTextfield.getText());
	}	
}

