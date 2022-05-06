package io.raptor.peraptor;

import io.raptor.peraptor.components.ZoomableScrollPane;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import jfxtras.styles.jmetro.JMetro;
import jfxtras.styles.jmetro.JMetroStyleClass;
import jfxtras.styles.jmetro.Style;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        JMetro jMetro = new JMetro(Style.DARK);

        Parent parent = new FXMLLoader(HelloApplication.class.getResource("hex-panel-view.fxml")).load();
        ZoomableScrollPane zsp = new ZoomableScrollPane(parent);

        Scene scene = new Scene(zsp, 320, 240);
        jMetro.setScene(scene);
        scene.getStylesheets().add(HelloApplication.class.getResource("hex-panel-view.css").toExternalForm());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        jMetro.reApplyTheme();
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}