package Presentation.enums;

import Domain.Entity.View;
public enum ViewsEnums {
    MAIN("javafx/view/MainView.fxml");

    public final View view;

    ViewsEnums(String filename) {this.view = new View(filename);}
}
