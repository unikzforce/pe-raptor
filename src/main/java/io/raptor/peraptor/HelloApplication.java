package io.raptor.peraptor;

import io.raptor.peraptor.components.Draggable;
import io.raptor.peraptor.components.ZoomableScrollPane;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import org.scenicview.ScenicView;
import javafx.stage.Stage;
import jfxtras.styles.jmetro.JMetro;
import jfxtras.styles.jmetro.Style;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        JMetro jMetro = new JMetro(Style.DARK);

        Parent parent = new FXMLLoader(HelloApplication.class.getResource("hex-panel-view.fxml")).load();
        Draggable.Nature nature = new Draggable.Nature(parent);
        final var group = new Group();
        Button b1 = new Button();
        b1.setTranslateX(0);
        b1.setTranslateY(0);
        b1.setStyle("-fx-background-color: red;");

        Button b2 = new Button();
        b2.setStyle("-fx-background-color: yellow;");
        b2.setOnMouseClicked(event -> {
            b1.setTranslateX(b1.getTranslateX() + 50);
            b1.setTranslateY(b1.getTranslateY() + 50);
        });
        group.getChildren().add(b1);
        group.getChildren().add(b2);
        ZoomableScrollPane zsp = new ZoomableScrollPane(group);

        Scene scene = new Scene(zsp, 320, 240);
        jMetro.setScene(scene);
        scene.getStylesheets().add(HelloApplication.class.getResource("hex-panel-view.css").toExternalForm());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        jMetro.reApplyTheme();
        ScenicView.show(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}