import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.*;
import java.util.Random;

public class HOT5_controller {

    @FXML
    private RadioButton headsRadiobutton;

    @FXML
    private Label correctLabel;

    @FXML
    private Label incorrectLabel;

    @FXML
    private RadioButton tailsRadiobutton;

    @FXML
    private Button guessButton;

    @FXML
    private ToggleGroup choice;

    @FXML
    private ImageView resultImage;
    
    private int incorrectGuesses, correctGuesses;

    
    public void initialize() {
    	
    }

    public void guessButtonListener() {
        Random RNG = new Random();
        int flipResult = RNG.nextInt(2);
        if (flipResult == 0) {
        	Image myImage = new Image("obverse.jpg");
        	resultImage.setImage(myImage);
            if (headsRadiobutton.isSelected()) {
            	correctGuesses++;
            }
            else {
            	incorrectGuesses++;
            }
        }
        else if (flipResult == 1) {
        	Image myImage = new Image("reverse.jpg");
        	resultImage.setImage(myImage);
            if (headsRadiobutton.isSelected()) {
            	incorrectGuesses++;
            }
            else {
            	correctGuesses++;
            }
        }
        correctLabel.setText("Correct guesses: " + correctGuesses);
        incorrectLabel.setText("Incorrect guesses: " + incorrectGuesses);
    }
}

