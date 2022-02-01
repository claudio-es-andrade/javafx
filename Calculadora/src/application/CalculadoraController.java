package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculadoraController {

    @FXML
    private Button btn_0;

    @FXML
    private Button btn_1;

    @FXML
    private Button btn_2;

    @FXML
    private Button btn_3;

    @FXML
    private Button btn_4;

    @FXML
    private Button btn_5;

    @FXML
    private Button btn_6;

    @FXML
    private Button btn_7;

    @FXML
    private Button btn_8;

    @FXML
    private Button btn_9;

    @FXML
    private Button btn_Clear;

    @FXML
    private Button btn_Div;

    @FXML
    private Button btn_Equal;

    @FXML
    private Button btn_Minus;

    @FXML
    private Button btn_Multi;

    @FXML
    private Button btn_Sum;

    @FXML
    private TextField txtFld_Display;
    
    float data = 0;
    float secondOperand = 0;
    float resultado = 0;
    int calcOperation = -1;
    

    @FXML
    void DoingAllActions(ActionEvent event) {
    	
    	if (event.getSource()  == btn_0) {
    		txtFld_Display.setText(txtFld_Display.getText() + "0");
    	}
    	else if (event.getSource()  == btn_1) {
    		txtFld_Display.setText(txtFld_Display.getText() + "1");
    	}
    	else if (event.getSource()  == btn_2) {
    		txtFld_Display.setText(txtFld_Display.getText() + "2");
    	}
    	else if (event.getSource()  == btn_3) {
    		txtFld_Display.setText(txtFld_Display.getText() + "3");
    	}
    	else if (event.getSource()  == btn_4) {
    		txtFld_Display.setText(txtFld_Display.getText() + "4");
    	}
    	else if (event.getSource()  == btn_5) {
    		txtFld_Display.setText(txtFld_Display.getText() + "5");
    	}
    	else if (event.getSource()  == btn_6) {
    		txtFld_Display.setText(txtFld_Display.getText() + "6");
    	}
    	else if (event.getSource()  == btn_7) {
    		txtFld_Display.setText(txtFld_Display.getText() + "7");
    	}
    	else if (event.getSource()  == btn_8) {
    		txtFld_Display.setText(txtFld_Display.getText() + "8");
    	}
    	else if (event.getSource()  == btn_9) {
    		txtFld_Display.setText(txtFld_Display.getText() + "9");
    	}
    	else if (event.getSource()  == btn_Clear) {
    		txtFld_Display.setText("");
    	}
    	else if (event.getSource()  == btn_Sum) {
    		data = Float.parseFloat(txtFld_Display.getText());
    		calcOperation = 1;
    		txtFld_Display.setText("");
    	}
    	else if (event.getSource()  == btn_Minus) {
    		data = Float.parseFloat(txtFld_Display.getText());
    		calcOperation = 2;
    		txtFld_Display.setText("");
    	}
    	else if (event.getSource()  == btn_Multi) {
    		data = Float.parseFloat(txtFld_Display.getText());
    		calcOperation = 3;
    		txtFld_Display.setText("");
    	}
    	else if (event.getSource()  == btn_Div) {
    		data = Float.parseFloat(txtFld_Display.getText());
    		calcOperation = 4;
    		txtFld_Display.setText("");
    	}
    	else if (event.getSource()  == btn_Equal) {
    		secondOperand = Float.parseFloat(txtFld_Display.getText());
    		
    		switch(calcOperation)
    		{
    		case 1://Addition
    			resultado = data + secondOperand;
    			txtFld_Display.setText(String.valueOf(resultado));
    			break;
    		case 2://Subtraction
    			resultado = data - secondOperand;
    			txtFld_Display.setText(String.valueOf(resultado));
    			break;
    		case 3://Multiplication
    			resultado = data * secondOperand;
    			txtFld_Display.setText(String.valueOf(resultado));
    			break;
    		case 4://Division
    			try {
    				resultado = data / secondOperand;
        			
    			}
    			catch(Exception e) {
    				e.printStackTrace();
    				txtFld_Display.setText("ERROR");
    			}
    			finally {
    				txtFld_Display.setText(String.valueOf(resultado));
    			}
   				break;
    		}
    	}
    	
    	
    }

}