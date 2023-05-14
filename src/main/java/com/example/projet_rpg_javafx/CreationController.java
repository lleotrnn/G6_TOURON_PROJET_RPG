package com.example.projet_rpg_javafx;

import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ResourceBundle;

public class CreationController implements Initializable {

    @FXML
    private ChoiceBox<String> choiceCharacterBox;

    @FXML
    private ImageView characterImageView;

    @FXML
    private TextField nameTextField;

    @FXML
    private Button nextButton;

    private String[] characterSprite = {"Character 1", "Character 2", "Character 3", "Character 4"};

    private String[] characterImages = {"character1.png", "character2.png", "character3.png", "character4.png"};

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        choiceCharacterBox.getItems().addAll(characterSprite);
        choiceCharacterBox.setOnAction(this::getCharacterSprite);

        nextButton.setDisable(true);
    }

    public void getCharacterSprite(ActionEvent event) {
        int index = choiceCharacterBox.getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            Image characterImage = new Image(getClass().getResourceAsStream("/images/" + characterImages[index]));
            characterImageView.setImage(characterImage);

            nextButton.setDisable(false);
        } else {
            characterImageView.setImage(null);

            nextButton.setDisable(true);
        }
    }

    @FXML
    void next(MouseEvent event) {
        try {
            String username = nameTextField.getText();
            Node source = (Node) event.getSource();
            Stage stage3 = (Stage) source.getScene().getWindow();

            FXMLLoader battleLvl1ControllerLoader = new FXMLLoader(HelloApplication.class.getResource("battle.fxml"));
            BattleLvl1Controller battle = new BattleLvl1Controller(characterImageView.getImage(), username);
            battleLvl1ControllerLoader.setControllerFactory(param -> battle);
            Scene scene4 = new Scene(battleLvl1ControllerLoader.load());
            Stage stage4 = new Stage();
            stage4.setTitle("LEVEL 1 - THE PHILOSOPHER'S STONE");
            stage4.setScene(scene4);
            stage4.show();
            stage3.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
