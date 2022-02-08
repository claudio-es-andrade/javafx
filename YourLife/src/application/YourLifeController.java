package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import application.TextFieldFormatter;
import javafx.scene.control.TextFormatter;
import javafx.scene.input.KeyEvent;
import java.util.function.UnaryOperator;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class YourLifeController {


	@FXML
	private Button btnCalcule;

	@FXML
	private DatePicker dpCalendario;
	
	@FXML
    private Label lblRespostaAgora;
	
	@FXML
    private Label lblRespostaAnos;

    @FXML
    private Label lblRespostaDias;

    @FXML
    private Label lblRespostaHoras;

    @FXML
    private Label lblRespostaMeses;

    @FXML
    private Label lblRespostaMiliSegundos;

    @FXML
    private Label lblRespostaMinutos;

    @FXML
    private Label lblRespostaNanoSegundos;

    @FXML
    private Label lblRespostaSegundos;

    @FXML
    private Label lblRespostaSemanas;
	

	@FXML
	private TextField txtFldHora;

	private void imprimeTudo(long anos, long meses, long semanas, long dias, long horas, long minutos, long segundos,
			long miliss, long nanoss, String formatoDateTimeAgora) {
		// Listagem dos valores na tela
		lblRespostaAgora.setText( formatoDateTimeAgora );
		lblRespostaAnos.setText( String.valueOf(anos) );
		lblRespostaMeses.setText( String.valueOf(meses) );
		lblRespostaSemanas.setText( String.valueOf(semanas) );
		lblRespostaDias.setText( String.valueOf(dias) );
		lblRespostaHoras.setText( String.valueOf(horas) );
		lblRespostaMinutos.setText( String.valueOf(minutos) );
		lblRespostaSegundos.setText( String.valueOf(segundos) );
		lblRespostaMiliSegundos.setText( String.valueOf(miliss) );
		lblRespostaNanoSegundos.setText( String.valueOf(nanoss) );
		
		// Listagem dos valores no terminal
		System.out.println(" Seu tempo de vida em ANOS é de     " + anos + "    até agora: " + formatoDateTimeAgora);
		System.out.println(" Seu tempo de vida em MESES é de    " + meses + "    até agora: " + formatoDateTimeAgora);
		System.out.println(" Seu tempo de vida em SEMANAS é de  " + semanas + "    até agora: " + formatoDateTimeAgora);
		System.out.println(" Seu tempo de vida em DIAS é de     " + dias + "    até agora: " + formatoDateTimeAgora);
		System.out.println(" Seu tempo de vida em HORAS é de    " + horas + "    até agora: "  + formatoDateTimeAgora);
		System.out.println(" Seu tempo de vida em MINUTOS é de  " + minutos + "    até agora: " + formatoDateTimeAgora);
		System.out.println(" Seu tempo de vida em SEGUNDOS é de " + segundos + "    até agora: " + formatoDateTimeAgora);
		System.out.println(" Seu tempo de vida em MILISEGUNDOS é de " + miliss + "    até agora: " + formatoDateTimeAgora);
		System.out.println(" Seu tempo de vida em NANOSEGUNDOS é de " + nanoss + "    até agora: " + formatoDateTimeAgora);

	} // End of function
	
	
	@FXML
	void txtFldRlsd(KeyEvent event) {

		TextFieldFormatter txtFldFMT = new TextFieldFormatter();
		txtFldFMT.setMask("##:##");
		txtFldFMT.setCaracteresValidos("0123456789");
		txtFldFMT.setTf(txtFldHora);
		txtFldFMT.formatter();

	}

	@FXML
	void onClicked(ActionEvent event) {

		try {
			
			LocalDate Aniversario = dpCalendario.getValue();
			System.out.println("LocalDate(Aniversário): " + Aniversario);
			
			LocalDateTime aniversario = LocalDateTime.parse(String.valueOf(Aniversario)+ "T" + String.valueOf(txtFldHora.getText() )   );
			System.out.println("LocalDateTime(Aniversário): " + aniversario);
			
			LocalDateTime agora = LocalDateTime.now();
			DateTimeFormatter formatacao = DateTimeFormatter.ISO_DATE_TIME;
			
			String formatoDateTimeAgora = agora.format(DateTimeFormatter.ofPattern("dd/MMM/yyyy --> HH:mm:ss")) ;
			System.out.println("Agora:" + formatoDateTimeAgora);
			

			//ChronoUnit.(WEEKS, DIAS, MONTHS, YEARS)...
			long anos     = ChronoUnit.YEARS.between(aniversario , agora);
			long meses    = ChronoUnit.MONTHS.between(aniversario , agora);
			long semanas  = ChronoUnit.WEEKS.between(aniversario , agora);
			long dias     = ChronoUnit.DAYS.between(aniversario , agora);

			long horas    = ChronoUnit.HOURS.between(aniversario , agora);
			long minutos  = ChronoUnit.MINUTES.between(aniversario , agora);
			long segundos = ChronoUnit.SECONDS.between(aniversario , agora);
			long miliss   = ChronoUnit.MILLIS.between(aniversario , agora);
			long nanoss   = ChronoUnit.NANOS.between(aniversario , agora);

			
			imprimeTudo(anos, meses, semanas, dias, horas, minutos, segundos, miliss, nanoss, formatoDateTimeAgora);

		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	} // End of onClicked Event

} // End of Class