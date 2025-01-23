import Presentation.controllers.MainViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Carga el archivo FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/javafx/view/MainView.fxml"));
        Scene scene = new Scene(loader.load());

        // Obtén el controlador y pasa el Stage principal
        MainViewController controller = loader.getController();
        controller.setStage(stage);

        // Configura el Stage
        stage.setScene(scene);
        stage.setTitle("Aplicación de Torneos");
        stage.show();
    }
}
