package application;
import application.TextFieldFormatter;
import application.ValidaCPF;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.input.KeyEvent;

import java.util.function.UnaryOperator;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;

public class CPF_TestController {
	@FXML
	private TextField txtFLD_Checa;
	@FXML
	private Button btnCheca;
	@FXML
	private Label lblResultado;

	
	// Applying the TextFieldMask 
	@FXML
    void txtFldRlsd(KeyEvent event) {
		
		TextFieldFormatter txtFldFMT = new TextFieldFormatter();
		txtFldFMT.setMask("###.###.###-##");
		txtFldFMT.setCaracteresValidos("0123456789");
		txtFldFMT.setTf(txtFLD_Checa);
		txtFldFMT.formatter();
		
    }
	// Event Listener on Button[#btnCheca].onAction	
	@FXML
	public void onClickedBtn(ActionEvent event) {
		
		
		// Getting the numbers from the TextFieldFX
		String cpfTxtFLD = txtFLD_Checa.getText();
		//System.out.println("CPF Texto: " + cpfTxtFLD );
		
		// Removing the points and the dash from the digits
		String cpfNumberOnly = cpfTxtFLD.replaceAll("[^0-9]", "");
		//System.out.println("CPF Números: " + cpfNumberOnly);
		
		// Defining the integer array of CPF digits
		int[] digitosCPF = new int[cpfNumberOnly.length()];
		// Transforms the String in array of characters
		char[] cpfChar = cpfNumberOnly.toCharArray();
		
		
//		for (char digitos : cpfChar ) {
//			System.out.println("CPF Caracteres(Digitos): " + digitos);
//		}
		
		// Transforming one array of characters in array of integer
		for (int pos = 0; pos < cpfNumberOnly.length(); pos++) { 
			 
			digitosCPF[pos] = (int)cpfChar[pos] - 48; 
			//System.out.println("CPF Inteiros(Digitos): " + digitosCPF[pos]);
		} 
				
		// Classe CPF
		ValidaCPF meuCPF = new ValidaCPF(digitosCPF);
		boolean numerosRepetidos = meuCPF.ConfirmaIgualdadeDigitos();
		if (numerosRepetidos == false) {
			
			String estadoOrigem      = meuCPF.verificaEstadoOrigem();
			String veracidadeDigitos = meuCPF.calculaComparaDigitosVerificadores();
			lblResultado.setText(veracidadeDigitos + estadoOrigem);
		}
		else {
			
			lblResultado.setText("CPF INVÁLIDO");
		}
			
		//System.out.println("Teste Inicial");
	}
	
}
