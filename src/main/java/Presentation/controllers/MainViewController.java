package Presentation.controllers;

import Presentation.enums.ViewsEnums;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainViewController {

    private Stage stage; // Referencia al Stage principal

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    private void buttonActionWelcome() {
        try {
            // Verifica que el Stage no sea null antes de usarlo
            if (stage != null) {
                Scene scene = new Scene(ViewsEnums.MAIN.loadView());
                stage.setScene(scene);
            } else {
                System.err.println("Stage no inicializado");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void buttonActionGame() {
        // Similar al método anterior
    }

    @FXML
    private void buttonActionHelp() {
        // Similar al método anterior
    }
}
