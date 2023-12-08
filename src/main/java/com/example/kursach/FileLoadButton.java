package com.example.kursach;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class FileUploadExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        FileChooser fileChooser = new FileChooser();
        Button uploadButton = new Button("Upload File");
        uploadButton.setOnAction(e -> {
            File file = fileChooser.showOpenDialog();

    }
}
