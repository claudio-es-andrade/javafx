package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class JogoDaVelhaMain extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("JogoDaVelha.fxml"));
			Scene scene = new Scene(root,900,600);
			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle(" # # # Jogo da Velha # # # ");
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
