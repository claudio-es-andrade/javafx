package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;

public class SampleController {
	
	@FXML
    private Label txLbl;

	// Event Listener on Button.onAction
	@FXML
	public void on_btn_Clicked(ActionEvent event) {
		
		txLbl.setText(" Olá FX!! Olá Mundo!!");
		
		
	}
}
