package com.example.projet_rpg_javafx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.IOException;


public class IntroductionController {

    @FXML
    void next(MouseEvent event) {
        try {
            Node source = (Node) event.getSource();
            Stage stage2 = (Stage) source.getScene().getWindow();
            FXMLLoader CreationController = new FXMLLoader(HelloApplication.class.getResource("creation.fxml"));
            Scene scene3 = new Scene(CreationController.load());
            Stage stage3 = new Stage();
            stage3.setTitle("Creation of the character");
            stage3.setScene(scene3);
            stage3.show();
            stage2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

