import Presentation.controllers.MainViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args); // Inicia la aplicación JavaFX
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/javafx/view/MainView.fxml"));
        Scene scene = new Scene(loader.load());
        MainViewController controller = loader.getController();
        controller.setStage(stage); // Pasa el Stage al controlador
        stage.setScene(scene);
        stage.setTitle("Aplicación de Torneos");
        stage.show();
    }
}
