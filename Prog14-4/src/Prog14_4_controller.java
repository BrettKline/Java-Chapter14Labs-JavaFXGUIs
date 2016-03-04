import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.text.DecimalFormat;

public class Prog14_4_controller {

    @FXML
    private Label tipLabel;

    @FXML
    private Button calculateButton;

    @FXML
    private TextField costTextfield;

    @FXML
    private Label taxLabel;

    @FXML
    private Label resultLabel;
    public void initialize() {
		
	}
	
	public void calculateButtonListener() {
		DecimalFormat money = new DecimalFormat("###,##0.00");
		String costStr = costTextfield.getText();
		double cost = Double.parseDouble(costStr);
		final double TIP_RATE = .18;
		final double TAX_RATE = .07;
		double taxMarkup = cost * TAX_RATE;
		double tipMarkup = cost * TIP_RATE;
		double totalCost = taxMarkup + tipMarkup + cost;
		tipLabel.setText("18% tip: $" + money.format(tipMarkup));
		taxLabel.setText("7% sales tax: $" + money.format(taxMarkup));
		resultLabel.setText("Total meal cost: $" + money.format(totalCost));
		
	}
}