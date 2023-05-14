package com.example.projet_rpg_javafx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    void start(MouseEvent event) {
        try {
            Node source = (Node) event.getSource();
            Stage stage = (Stage) source.getScene().getWindow();
            FXMLLoader IntroductionController = new FXMLLoader(HelloApplication.class.getResource("intro.fxml"));
            Scene scene2 = new Scene(IntroductionController.load());
            Stage stage2 = new Stage();
            stage2.setTitle("Introduction");
            stage2.setScene(scene2);
            stage2.show();
            stage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
