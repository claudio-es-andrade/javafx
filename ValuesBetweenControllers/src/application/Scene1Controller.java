package application;

import java.io.IOException;

import javafx.event.ActionEvent; 
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Scene1Controller {
	
	private Stage stage;
	private Scene Scene;
	private AnchorPane root;
	
	
	@FXML
    private Button btnLogin;

    @FXML
    private TextField txtFldName;

    @FXML
    void onClicked(ActionEvent event) throws IOException{
    	try {
    		
    		String username = txtFldName.getText();
    		
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
    		root = loader.load();
    		
    		Scene2Controller scene2Controller = loader.getController();
    		scene2Controller.displayName(username);
    		
    		// root = (AnchorPane)FXMLLoader.load(getClass().getResource("ValuesBetweenControllersFXML_02.fxml"));
    		// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
    		
    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    		Scene scene = new Scene(root);
    		stage.setTitle(" A outra tela.");
    		stage.setScene(scene);
    		stage.show();
    	
    	}catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    	
    }
}
