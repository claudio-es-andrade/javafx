package application;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import java.util.Objects;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class JogoDaVelhaController {
	@FXML
	private Button btn_01;
	@FXML
	private Button btn_02;
	@FXML
	private Button btn_03;
	@FXML
	private Button btn_04;
	@FXML
	private Button btn_05;
	@FXML
	private Button btn_06;
	@FXML
	private Button btn_07;
	@FXML
	private Button btn_08;
	@FXML
	private Button btn_09;
	@FXML
    private Button btn_jogarMais;
	@FXML
	private Label lbl_Jogador;
	@FXML
	private Label lbl_Vencedor;
	@FXML
    private Label vencidos_O;
    @FXML
    private Label vencidos_X;
    
    private int jogosVencidos_X = 0;
	private int jogosVencidos_O = 0;
    
	// Event Listener on Button[#btn_01].onAction
	@FXML
	public void btn_Clicked(ActionEvent event) {
	   	
		
		boolean receiverJogador = lbl_Jogador.getText().equals(playerX());
		
		
		
		
					
			if (event.getSource()  == btn_01) {
				if(receiverJogador ) {

					btn_01.setText("X");
					btn_01.setTextFill(Color.RED);
					btn_01.setDisable(true);
					lbl_Jogador.setText("O");
					lbl_Jogador.setTextFill(Color.BLUE);
					if(winnerCheck() ) {

						jogosVencidos_X += 1;
						vencidos_X.setText((String.valueOf(jogosVencidos_X )) );
						vencidos_X.setTextFill(Color.RED);


					}

				}
				else {

					btn_01.setText("O");
					btn_01.setTextFill(Color.BLUE);
					btn_01.setDisable(true);
					lbl_Jogador.setText("X");
					lbl_Jogador.setTextFill(Color.RED);
					if(winnerCheck() ) {

						jogosVencidos_O += 1;
						vencidos_O.setText((String.valueOf(jogosVencidos_O)) );
						vencidos_O.setTextFill(Color.BLUE);

					}

				}
			}
			else if (event.getSource()  == btn_02) {
				if(receiverJogador  ) {
					btn_02.setText("X");
					btn_02.setTextFill(Color.RED);
					btn_02.setDisable(true);
					lbl_Jogador.setText("O");
					lbl_Jogador.setTextFill(Color.BLUE);
					if(winnerCheck() ) {

						jogosVencidos_X += 1;
						vencidos_X.setText((String.valueOf(jogosVencidos_X)) );
						vencidos_X.setTextFill(Color.RED);


					}

				}
				else {
					btn_02.setText("O");
					btn_02.setTextFill(Color.BLUE);
					btn_02.setDisable(true);
					lbl_Jogador.setText("X");
					lbl_Jogador.setTextFill(Color.RED);
					if(winnerCheck() ) {

						jogosVencidos_O += 1;
						vencidos_O.setText((String.valueOf(jogosVencidos_O)) );
						vencidos_O.setTextFill(Color.BLUE);


					}

				}
			}
			else if (event.getSource()  == btn_03) {
				if(receiverJogador  ) {
					btn_03.setText("X");
					btn_03.setTextFill(Color.RED);
					btn_03.setDisable(true);
					lbl_Jogador.setText("O");
					lbl_Jogador.setTextFill(Color.BLUE);
					if(winnerCheck() ) {

						jogosVencidos_X += 1;
						vencidos_X.setText((String.valueOf(jogosVencidos_X)) );
						vencidos_X.setTextFill(Color.RED);


					}

				}
				else {
					btn_03.setText("O");
					btn_03.setTextFill(Color.BLUE);
					btn_03.setDisable(true);
					lbl_Jogador.setText("X");
					lbl_Jogador.setTextFill(Color.RED);
					if(winnerCheck() ) {

						jogosVencidos_O += 1;
						vencidos_O.setText((String.valueOf(jogosVencidos_O)) );
						vencidos_O.setTextFill(Color.BLUE);


					}

				}
			}
			else if (event.getSource()  == btn_04) {
				if(receiverJogador  ) {
					btn_04.setText("X");
					btn_04.setTextFill(Color.RED);
					btn_04.setDisable(true);
					lbl_Jogador.setText("O");
					lbl_Jogador.setTextFill(Color.BLUE);
					if(winnerCheck() ) {

						jogosVencidos_X += 1;
						vencidos_X.setText((String.valueOf(jogosVencidos_X)) );
						vencidos_X.setTextFill(Color.RED);


					}

				}
				else {
					btn_04.setText("O");
					btn_04.setTextFill(Color.BLUE);
					btn_04.setDisable(true);
					lbl_Jogador.setText("X");
					lbl_Jogador.setTextFill(Color.RED);
					if(winnerCheck() ) {

						jogosVencidos_O += 1;
						vencidos_O.setText((String.valueOf(jogosVencidos_O)) );
						vencidos_O.setTextFill(Color.BLUE);


					}

				}
			}
			else if (event.getSource()  == btn_05) {
				if(receiverJogador  ) {
					btn_05.setText("X");
					btn_05.setTextFill(Color.RED);
					btn_05.setDisable(true);
					lbl_Jogador.setText("O");
					lbl_Jogador.setTextFill(Color.BLUE);
					if(winnerCheck() ) {

						jogosVencidos_X += 1;
						vencidos_X.setText((String.valueOf(jogosVencidos_X)) );
						vencidos_X.setTextFill(Color.RED);


					}

				}
				else {
					btn_05.setText("O");
					btn_05.setTextFill(Color.BLUE);
					btn_05.setDisable(true);
					lbl_Jogador.setText("X");
					lbl_Jogador.setTextFill(Color.RED);
					if(winnerCheck() ) {

						jogosVencidos_O += 1;
						vencidos_O.setText((String.valueOf(jogosVencidos_O)) );
						vencidos_O.setTextFill(Color.BLUE);


					}

				}
			}
			else if (event.getSource()  == btn_06) {
				if(receiverJogador  ) {
					btn_06.setText("X");
					btn_06.setTextFill(Color.RED);
					btn_06.setDisable(true);
					lbl_Jogador.setText("O");
					lbl_Jogador.setTextFill(Color.BLUE);
					if(winnerCheck() ) {

						jogosVencidos_X += 1;
						vencidos_X.setText((String.valueOf(jogosVencidos_X)) );
						vencidos_X.setTextFill(Color.RED);


					}

				}
				else {
					btn_06.setText("O");
					btn_06.setTextFill(Color.BLUE);
					btn_06.setDisable(true);
					lbl_Jogador.setText("X");
					lbl_Jogador.setTextFill(Color.RED);
					if(winnerCheck() ) {

						jogosVencidos_O += 1;
						vencidos_O.setText((String.valueOf(jogosVencidos_O)) );
						vencidos_O.setTextFill(Color.BLUE);


					}

				}
			}
			else if (event.getSource()  == btn_07) {
				if(receiverJogador  ) {
					btn_07.setText("X");
					btn_07.setTextFill(Color.RED);
					btn_07.setDisable(true);
					lbl_Jogador.setText("O");
					lbl_Jogador.setTextFill(Color.BLUE);
					if(winnerCheck() ) {

						jogosVencidos_X += 1;
						vencidos_X.setText((String.valueOf(jogosVencidos_X)) );
						vencidos_X.setTextFill(Color.RED);

						
					}

				}
				else {
					btn_07.setText("O");
					btn_07.setTextFill(Color.BLUE);
					btn_07.setDisable(true);
					lbl_Jogador.setText("X");
					lbl_Jogador.setTextFill(Color.RED);
					if(winnerCheck() ) {

						jogosVencidos_O += 1;
						vencidos_O.setText((String.valueOf(jogosVencidos_O)) );
						vencidos_O.setTextFill(Color.BLUE);


					}

				}
			}
			else if (event.getSource()  == btn_08) {
				if(receiverJogador  ) {
					btn_08.setText("X");
					btn_08.setTextFill(Color.RED);
					btn_08.setDisable(true);
					lbl_Jogador.setText("O");
					lbl_Jogador.setTextFill(Color.BLUE);
					if(winnerCheck() ) {

						jogosVencidos_X += 1;
						vencidos_X.setText((String.valueOf(jogosVencidos_X)) );
						vencidos_X.setTextFill(Color.RED);


					}

				}
				else {
					btn_08.setText("O");
					btn_08.setTextFill(Color.BLUE);
					btn_08.setDisable(true);
					lbl_Jogador.setText("X");
					lbl_Jogador.setTextFill(Color.RED);
					if(winnerCheck() ) {

						jogosVencidos_O += 1;
						vencidos_O.setText((String.valueOf(jogosVencidos_O)) );
						vencidos_O.setTextFill(Color.BLUE);


					}

				}
			}
			else if (event.getSource()  == btn_09) {
				if(receiverJogador  ) {
					btn_09.setText("X");
					btn_09.setTextFill(Color.RED);
					btn_09.setDisable(true);
					lbl_Jogador.setText("O");
					lbl_Jogador.setTextFill(Color.BLUE);
					if(winnerCheck() ) {

						jogosVencidos_X += 1;
						vencidos_X.setText((String.valueOf(jogosVencidos_X)) );
						vencidos_X.setTextFill(Color.RED);


					}

				}
				else {
					btn_09.setText("O");
					btn_09.setTextFill(Color.BLUE);
					btn_09.setDisable(true);
					lbl_Jogador.setText("X");
					lbl_Jogador.setTextFill(Color.RED);
					if(winnerCheck() ) {

						jogosVencidos_O += 1;
						vencidos_O.setText((String.valueOf(jogosVencidos_O)) );
						vencidos_O.setTextFill(Color.BLUE);


					}

				}
			}
			else if (event.getSource() == btn_jogarMais) {
				redoGame();
			}
			
	}// Fim do btn_Clicked()
	

	
	public boolean winnerCheck() {
		
		if (btn_01.getText().equals(btn_02.getText() )  && btn_01.getText().equals(btn_03.getText() )  )  {
			lbl_Vencedor.setVisible(true);
			lbl_Vencedor.setText("VENCEDOR!!");
			lbl_Vencedor.setTextFill(Color.GOLD);
			btn_01.setTextFill(Color.GOLD);
			btn_02.setTextFill(Color.GOLD);
			btn_03.setTextFill(Color.GOLD);
			btn_04.setDisable(true);
			btn_05.setDisable(true);
			btn_06.setDisable(true);
			btn_07.setDisable(true);
			btn_08.setDisable(true);
			btn_09.setDisable(true);
			btn_jogarMais.setTextFill(Color.GOLD);
			return true;
		}
		else if(btn_04.getText().equals(btn_05.getText() ) && btn_04.getText().equals(btn_06.getText() )  ) {
			lbl_Vencedor.setVisible(true);
			lbl_Vencedor.setText("VENCEDOR!!");
			lbl_Vencedor.setTextFill(Color.GOLD);
			btn_04.setTextFill(Color.GOLD);
			btn_05.setTextFill(Color.GOLD);
			btn_06.setTextFill(Color.GOLD);
			btn_01.setDisable(true);
			btn_02.setDisable(true);
			btn_03.setDisable(true);
			btn_07.setDisable(true);
			btn_08.setDisable(true);
			btn_09.setDisable(true);
			btn_jogarMais.setTextFill(Color.GOLD);
			return true;
		}
		else if(btn_07.getText().equals(btn_08.getText() ) && btn_07.getText().equals(btn_09.getText() )  ) {
			lbl_Vencedor.setVisible(true);
			lbl_Vencedor.setText("VENCEDOR!!");
			lbl_Vencedor.setTextFill(Color.GOLD);
			btn_07.setTextFill(Color.GOLD);
			btn_08.setTextFill(Color.GOLD);
			btn_09.setTextFill(Color.GOLD);
			btn_01.setDisable(true);
			btn_02.setDisable(true);
			btn_03.setDisable(true);
			btn_04.setDisable(true);
			btn_05.setDisable(true);
			btn_06.setDisable(true);
			btn_jogarMais.setTextFill(Color.GOLD);
			return true;
		}
		else if(btn_01.getText().equals(btn_04.getText()  ) && btn_01.getText().equals(btn_07.getText() )  ) {
			lbl_Vencedor.setVisible(true);
			lbl_Vencedor.setText("VENCEDOR!!");
			lbl_Vencedor.setTextFill(Color.GOLD);
			btn_01.setTextFill(Color.GOLD);
			btn_04.setTextFill(Color.GOLD);
			btn_07.setTextFill(Color.GOLD);
			btn_02.setDisable(true);
			btn_03.setDisable(true);
			btn_05.setDisable(true);
			btn_06.setDisable(true);
			btn_08.setDisable(true);
			btn_09.setDisable(true);
			btn_jogarMais.setTextFill(Color.GOLD);
			return true;
		}
		else if(btn_02.getText().equals(btn_05.getText()  ) && btn_02.getText().equals(btn_08.getText() )  ) {
			lbl_Vencedor.setVisible(true);
			lbl_Vencedor.setText("VENCEDOR!!");
			lbl_Vencedor.setTextFill(Color.GOLD);
			btn_02.setTextFill(Color.GOLD);
			btn_05.setTextFill(Color.GOLD);
			btn_08.setTextFill(Color.GOLD);
			btn_01.setDisable(true);
			btn_03.setDisable(true);
			btn_04.setDisable(true);
			btn_06.setDisable(true);
			btn_07.setDisable(true);
			btn_09.setDisable(true);
			btn_jogarMais.setTextFill(Color.GOLD);
			return true;
		}
		else if(btn_03.getText().equals(btn_06.getText()  ) && btn_03.getText().equals(btn_09.getText()  )  ) {
			lbl_Vencedor.setVisible(true);
			lbl_Vencedor.setText("VENCEDOR!!");
			lbl_Vencedor.setTextFill(Color.GOLD);
			btn_03.setTextFill(Color.GOLD);
			btn_06.setTextFill(Color.GOLD);
			btn_09.setTextFill(Color.GOLD);
			btn_01.setDisable(true);
			btn_02.setDisable(true);
			btn_04.setDisable(true);
			btn_05.setDisable(true);
			btn_07.setDisable(true);
			btn_08.setDisable(true);
			btn_jogarMais.setTextFill(Color.GOLD);
			return true;
		}
		else if(btn_01.getText().equals(btn_05.getText()  ) && btn_01.getText().equals(btn_09.getText()  )  ) {
			lbl_Vencedor.setVisible(true);
			lbl_Vencedor.setText("VENCEDOR!!");
			lbl_Vencedor.setTextFill(Color.GOLD);
			btn_01.setTextFill(Color.GOLD);
			btn_05.setTextFill(Color.GOLD);
			btn_09.setTextFill(Color.GOLD);
			btn_02.setDisable(true);
			btn_03.setDisable(true);
			btn_04.setDisable(true);
			btn_06.setDisable(true);
			btn_07.setDisable(true);
			btn_08.setDisable(true);
			btn_jogarMais.setTextFill(Color.GOLD);
			return true;
		}
		else if(btn_03.getText().equals(btn_05.getText()  ) && btn_03.getText().equals(btn_07.getText()   )  ) {
			lbl_Vencedor.setVisible(true);
			lbl_Vencedor.setText("VENCEDOR!!");
			lbl_Vencedor.setTextFill(Color.GOLD);
			btn_03.setTextFill(Color.GOLD);
			btn_05.setTextFill(Color.GOLD);
			btn_07.setTextFill(Color.GOLD);
			btn_01.setDisable(true);
			btn_02.setDisable(true);
			btn_04.setDisable(true);
			btn_06.setDisable(true);
			btn_08.setDisable(true);
			btn_09.setDisable(true);
			btn_jogarMais.setTextFill(Color.GOLD);
			return true;
		}
		else {
			return false;
		}
	}
	
	public void redoGame() {
		
		btn_01.setText("1");
		btn_02.setText("2");
		btn_03.setText("3");
		btn_04.setText("4");
		btn_05.setText("5");
		btn_06.setText("6");
		btn_07.setText("7");
		btn_08.setText("8");
		btn_09.setText("9");
		
		btn_01.setTextFill(Color.GREEN);
		btn_02.setTextFill(Color.GREEN);
		btn_03.setTextFill(Color.GREEN);
		btn_04.setTextFill(Color.GREEN);
		btn_05.setTextFill(Color.GREEN);
		btn_06.setTextFill(Color.GREEN);
		btn_07.setTextFill(Color.GREEN);
		btn_08.setTextFill(Color.GREEN);
		btn_09.setTextFill(Color.GREEN);
		
		
		
		btn_01.setDisable(false);
		btn_02.setDisable(false);
		btn_03.setDisable(false);
		btn_04.setDisable(false);
		btn_05.setDisable(false);
		btn_06.setDisable(false);
		btn_07.setDisable(false);
		btn_08.setDisable(false);
		btn_09.setDisable(false);
		btn_jogarMais.setDisable(false);
		btn_jogarMais.setVisible(true);
		btn_jogarMais.setTextFill(Color.GREEN);	
		lbl_Vencedor.setVisible(false);
		
		
			
		lbl_Jogador.setText("X");
		lbl_Jogador.setTextFill(Color.RED);
			
	}
	
	public String playerX() {
		String player = "X";
		if (lbl_Jogador.getText().equals(player)  ) {
			 
			return player;
		}
		return player;
	}
	public String playerO() {
		String player = "O";
		if (lbl_Jogador.getText().equals(player)  ) {
			 
			return player;
		}
		return player;
	}

	@Override
	public int hashCode() {
		return Objects.hash(btn_01, btn_02, btn_03, btn_04, btn_05, btn_06, btn_07, btn_08, btn_09, lbl_Jogador);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JogoDaVelhaController other = (JogoDaVelhaController) obj;
		return Objects.equals(btn_01, other.btn_01) && Objects.equals(btn_02, other.btn_02)
				&& Objects.equals(btn_03, other.btn_03) && Objects.equals(btn_04, other.btn_04)
				&& Objects.equals(btn_05, other.btn_05) && Objects.equals(btn_06, other.btn_06)
				&& Objects.equals(btn_07, other.btn_07) && Objects.equals(btn_08, other.btn_08)
				&& Objects.equals(btn_09, other.btn_09) && Objects.equals(lbl_Jogador, other.lbl_Jogador);
	}

	 
	
	
	
}// End of TicTacToeController