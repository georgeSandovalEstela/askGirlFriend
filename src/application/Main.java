package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {		
			FXMLLoader loader = new FXMLLoader(Main.class.getClassLoader().getResource("application/askView.fxml"));
			loader.setController(new AskManager());
			Scene scene = new Scene((AnchorPane)loader.load());
			primaryStage.setScene(scene);
			primaryStage.setTitle(":3");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
