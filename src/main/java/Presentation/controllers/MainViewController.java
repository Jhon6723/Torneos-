package Presentation.controllers;

import Presentation.enums.ViewsEnums;
import javafx.stage.Stage;
import javafx.scene.Scene;
import java.io.IOException;

public class MainViewController {

    private Stage stage; // Referencia al Stage principal

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    // Acción del botón "Iniciar"
    public void buttonActionWelcome() {
        try {
            Scene scene = new Scene(ViewsEnums.MAIN.loadView());
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace(); // Manejo básico de errores
        }
    }

    // Otras acciones
    public void buttonActionGame() {
        try {
            Scene scene = new Scene(ViewsEnums.MAIN.loadView()); // Cambia la vista si es necesario
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void buttonActionHelp() {
        try {
            Scene scene = new Scene(ViewsEnums.MAIN.loadView()); // Cambia la vista si es necesario
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

