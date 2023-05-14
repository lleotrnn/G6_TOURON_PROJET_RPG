package com.example.projet_rpg_javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

public class BattleLvl2Controller {

    private Image oldImage;

    private String username;

    @FXML
    private Text currentHpBar;

    @FXML
    private ProgressBar hpBar;

    @FXML
    private Text nameLabel;

    @FXML
    private ImageView characterImageView;

    @FXML
    private Text spellQuestion;

    @FXML
    private Button spellButton1;
    @FXML
    private Button spellButton2;
    @FXML
    private Button spellButton3;
    @FXML
    private Button spellButton4;
    @FXML
    private Button spellButton5;
    @FXML
    private Button spellButton6;

    private List<Button> spellButtons = new ArrayList<>();

    @FXML
    public void initialize() {
        printSelectedImage();
        displayName();
        progressBar();

        spellButtons.add(spellButton1);
        spellButtons.add(spellButton2);
        spellButtons.add(spellButton3);
        spellButtons.add(spellButton4);
        spellButtons.add(spellButton5);
        spellButtons.add(spellButton6);

        for (Button button : spellButtons) {
            button.setVisible(false);
        };
    }

    public void displayName() {
        nameLabel.setText(username);
    }

    public BattleLvl2Controller(Image oldImage, String username) {
        this.oldImage = oldImage;
        this.username = username;
    }

    public void printSelectedImage() {
        characterImageView.setImage(oldImage);
    }

    public void progressBar() {
        hpBar.setStyle("-fx-accent: #00FF00;");
    }

    @FXML
    void attack(ActionEvent event) throws IOException {
        double currentHp = hpBar.getProgress();
        currentHp -= 0.05;
        if (currentHp <= 0) {
            currentHp = 0;
        }
        hpBar.setProgress(currentHp);
        currentHpBar.setText(String.format("%d", (int) (currentHp * 100)));
        showPopup();
    }


    @FXML
    void castASpell(ActionEvent event) {
        spellQuestion.setText("Which spell do you want to cast ?");
        spellQuestion.setVisible(true);

        for (Button button : spellButtons) {
            button.setVisible(true);
        }
    }


    @FXML
    void defend(ActionEvent event) {
        double currentHp = hpBar.getProgress();
        currentHp -= 0.02;
        if (currentHp <= 0) {
            currentHp = 0;
        }
        hpBar.setProgress(currentHp);
        currentHpBar.setText(String.format("%d", (int) (currentHp * 100)));
    }

    @FXML
    void usePotion(ActionEvent event) {

    }

    @FXML
    void wingardiumLeviosa(ActionEvent event) throws IOException {
        double currentHp = hpBar.getProgress();
        currentHp -= 0.4;
        if (currentHp <= 0) {
            currentHp = 0;
        }
        hpBar.setProgress(currentHp);
        currentHpBar.setText(String.format("%d", (int) (currentHp * 100)));
        showPopup();
    }

    @FXML
    void accio(ActionEvent event) throws IOException {
        double currentHp = hpBar.getProgress();
        currentHp -= 0.2;
        if (currentHp <= 0) {
            currentHp = 0;
        }
        hpBar.setProgress(currentHp);
        currentHpBar.setText(String.format("%d", (int) (currentHp * 100)));
        showPopup();
    }

    @FXML
    void expelliarmus(ActionEvent event) throws IOException {
        double currentHp = hpBar.getProgress();
        currentHp -= 0.3;
        if (currentHp <= 0) {
            currentHp = 0;
        }
        hpBar.setProgress(currentHp);
        currentHpBar.setText(String.format("%d", (int) (currentHp * 100)));
        showPopup();
    }

    @FXML
    void expectroPatronum(ActionEvent event) throws IOException {
        double currentHp = hpBar.getProgress();
        currentHp -= 0.5;
        if (currentHp <= 0) {
            currentHp = 0;
        }
        hpBar.setProgress(currentHp);
        currentHpBar.setText(String.format("%d", (int) (currentHp * 100)));
        showPopup();
    }

    @FXML
    void sectumsempra(ActionEvent event) throws IOException {
        double currentHp = hpBar.getProgress();
        currentHp -= 0.6;
        if (currentHp <= 0) {
            currentHp = 0;
        }
        hpBar.setProgress(currentHp);
        currentHpBar.setText(String.format("%d", (int) (currentHp * 100)));
        showPopup();
    }

    @FXML
    void avadaKedabra(ActionEvent event) throws IOException {
        double currentHp = hpBar.getProgress();
        currentHp -= 4;
        if (currentHp <= 0) {
            currentHp = 0;
        }
        hpBar.setProgress(currentHp);
        currentHpBar.setText(String.format("%d", (int) (currentHp * 100)));
        showPopup();
    }


    void showPopup() throws IOException {
        if (hpBar.getProgress() == 0) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Victory");
            alert.setHeaderText("You have defeated the Basilisk!");

            ButtonType okButton = new ButtonType("OK", ButtonBar.ButtonData.OK_DONE);
            alert.getButtonTypes().setAll(okButton);

            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == okButton) {
                try {
                    String username = nameLabel.getText();
                    FXMLLoader battleLvl3ControllerLoader = new FXMLLoader(HelloApplication.class.getResource("battle3.fxml"));
                    BattleLvl3Controller battle = new BattleLvl3Controller(characterImageView.getImage(), username);
                    battleLvl3ControllerLoader.setControllerFactory(param -> battle);
                    Scene scene6 = new Scene(battleLvl3ControllerLoader.load());
                    Stage stage6 = new Stage();
                    stage6.setTitle("LEVEL 3 - THE PRISONNER OF AZKABAN");
                    stage6.setScene(scene6);
                    stage6.show();

                    Stage stage5 = (Stage) hpBar.getScene().getWindow();
                    stage5.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

