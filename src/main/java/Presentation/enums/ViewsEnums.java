package Presentation.enums;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;

public enum ViewsEnums {
    MAIN("/javafx/view/MainView.fxml");

    private final String fxmlPath;

    ViewsEnums(String fxmlPath) {
        this.fxmlPath = fxmlPath;
    }

    public String getFxmlPath() {
        return fxmlPath;
    }

    // Método para cargar el archivo FXML y devolver el nodo raíz
    public Parent loadView() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
        return loader.load();
    }

    // Método opcional para devolver el FXMLLoader si necesitas control adicional
    public FXMLLoader getLoader() {
        return new FXMLLoader(getClass().getResource(fxmlPath));
    }
}
