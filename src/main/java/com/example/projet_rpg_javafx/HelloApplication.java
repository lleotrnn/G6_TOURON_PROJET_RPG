package com.example.projet_rpg_javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    // Inspiré de Pokemon pour le système de combat

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader launchTheGame = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(launchTheGame.load());
        stage.setTitle("Harry Potter At Home");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
