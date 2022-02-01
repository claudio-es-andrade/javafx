package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;


public class ValuesBetwwenControllersMain extends Application {
	@Override
	public void start(Stage primaryStage) {
		
			try {
				
				Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
				Scene scene = new Scene(root);
				primaryStage.setTitle(" Passando valores para a segunda tela.");
				primaryStage.setScene(scene);
				primaryStage.show();
				
			}catch(Exception e ) {
				e.printStackTrace();
			}
			
			
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
