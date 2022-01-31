package application;

import javafx.fxml.FXML;

import javafx.scene.control.TextField;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;

import javafx.scene.input.KeyEvent;


public class SeuNomeNaTelaController {
	@FXML
	private TextField recebeTexto;
	@FXML
	private Label informaTexto;

	
	// Event Change the other Label!
	
	@FXML
    void txtMoveToBtn(KeyEvent event) {
		informaTexto.setVisible(true);
		informaTexto.setText(" Agora é só pressionar o botão acima!!");
    }
	
	// Event Listener on Button.onAction
	@FXML
	public void on_btn_clicked(ActionEvent event) {
		
		String texto01 = new String();
		String textofinal = new String();
		
		texto01    = recebeTexto.getText();
		textofinal = " Olá ," + texto01 + ", seja muito bem vindo(a) !!";
		
		informaTexto.setText(textofinal);
	}
	
	

	
}
