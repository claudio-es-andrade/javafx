package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;

public class SeuNomeNaTelaMain extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("NomeNaTela.fxml"));
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			Parent root = FXMLLoader.load(getClass().getResource("NomeNaTela.fxml"));
			Scene scene = new Scene(root);
			
			primaryStage.setTitle(" Pressionando o Botão: O que aparece?");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
