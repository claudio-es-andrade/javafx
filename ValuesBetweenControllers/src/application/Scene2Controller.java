package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
	

public class Scene2Controller {
	
	@FXML
	Label lblNameAnswer;
	
	public void displayName(String username) {
		lblNameAnswer.setText("Olá,  " + username);
	}

}
