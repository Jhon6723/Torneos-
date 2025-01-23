import Presentation.controllers.MainViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args); // Llama al método JavaFX para inicializar la app
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("javafx/view/MainView.fxml"));
        Scene scene = new Scene(fxmlLoader.load()); // Ajusta el tamaño según necesites
        stage.setTitle("Aplicación de Torneos");
        stage.setScene(scene);
        stage.show();
    }
}

