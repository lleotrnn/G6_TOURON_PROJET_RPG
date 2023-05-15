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

public class BattleLvl5Controller {

    private Image oldImage;

    private String username;

    @FXML
    private Text currentHpBar;

    @FXML
    private Text currentHpBarPlayer;

    @FXML
    private ProgressBar hpBar;

    @FXML
    private ProgressBar hpBarPlayer;

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

    public BattleLvl5Controller(Image oldImage, String username) {
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
        double currentHpPlayer = hpBarPlayer.getProgress();
        currentHp -= 0.05;
        currentHpPlayer -= 0.35;
        if (currentHp <= 0) {
            currentHp = 0;
        }
        if (currentHpPlayer <= 0) {
            currentHpPlayer = 0;
        }
        hpBar.setProgress(currentHp);
        currentHpBar.setText(String.format("%d", (int) (currentHp * 280)));
        hpBarPlayer.setProgress(currentHpPlayer);
        currentHpBarPlayer.setText(String.format("%d", (int) (currentHpPlayer * 100)));
        showPopup();
        showPopupGameOver();
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
    void defend(ActionEvent event) throws IOException {
        double currentHpPlayer = hpBarPlayer.getProgress();
        currentHpPlayer -= 0.05;
        if (currentHpPlayer <= 0) {
            currentHpPlayer = 0;
        }
        hpBarPlayer.setProgress(currentHpPlayer);
        currentHpBarPlayer.setText(String.format("%d", (int) (currentHpPlayer * 100)));
        showPopupGameOver();
    }

    @FXML
    void usePotion(ActionEvent event) {
        double currentHpPlayer = hpBarPlayer.getProgress();
        currentHpPlayer += 0.5;
        if (currentHpPlayer >= 1) {
            currentHpPlayer = 1;
        }
        hpBarPlayer.setProgress(currentHpPlayer);
        currentHpBarPlayer.setText(String.format("%d", (int) (currentHpPlayer * 100)));
    }

    @FXML
    void wingardiumLeviosa(ActionEvent event) throws IOException {
        double currentHp = hpBar.getProgress();
        double currentHpPlayer = hpBarPlayer.getProgress();
        currentHp -= 0.4;
        currentHpPlayer -= 0.35;
        if (currentHp <= 0) {
            currentHp = 0;
        }
        if (currentHpPlayer <= 0) {
            currentHpPlayer = 0;
        }
        hpBar.setProgress(currentHp);
        currentHpBar.setText(String.format("%d", (int) (currentHp * 280)));
        hpBarPlayer.setProgress(currentHpPlayer);
        currentHpBarPlayer.setText(String.format("%d", (int) (currentHpPlayer * 100)));
        showPopup();
        showPopupGameOver();
    }

    @FXML
    void accio(ActionEvent event) throws IOException {
        double currentHp = hpBar.getProgress();
        double currentHpPlayer = hpBarPlayer.getProgress();
        currentHp -= 0.2;
        currentHpPlayer -= 0.35;
        if (currentHp <= 0) {
            currentHp = 0;
        }
        if (currentHpPlayer <= 0) {
            currentHpPlayer = 0;
        }
        hpBar.setProgress(currentHp);
        currentHpBar.setText(String.format("%d", (int) (currentHp * 280)));
        hpBarPlayer.setProgress(currentHpPlayer);
        currentHpBarPlayer.setText(String.format("%d", (int) (currentHpPlayer * 100)));
        showPopup();
        showPopupGameOver();
    }

    @FXML
    void expelliarmus(ActionEvent event) throws IOException {
        double currentHp = hpBar.getProgress();
        double currentHpPlayer = hpBarPlayer.getProgress();
        currentHp -= 0.3;
        currentHpPlayer -= 0.35;
        if (currentHp <= 0) {
            currentHp = 0;
        }
        if (currentHpPlayer <= 0) {
            currentHpPlayer = 0;
        }
        hpBar.setProgress(currentHp);
        currentHpBar.setText(String.format("%d", (int) (currentHp * 280)));
        hpBarPlayer.setProgress(currentHpPlayer);
        currentHpBarPlayer.setText(String.format("%d", (int) (currentHpPlayer * 100)));
        showPopup();
        showPopupGameOver();
    }

    @FXML
    void expectroPatronum(ActionEvent event) throws IOException {
        double currentHp = hpBar.getProgress();
        double currentHpPlayer = hpBarPlayer.getProgress();
        currentHp -= 0.5;
        currentHpPlayer -= 0.35;
        if (currentHp <= 0) {
            currentHp = 0;
        }
        if (currentHpPlayer <= 0) {
            currentHpPlayer = 0;
        }
        hpBar.setProgress(currentHp);
        currentHpBar.setText(String.format("%d", (int) (currentHp * 280)));
        hpBarPlayer.setProgress(currentHpPlayer);
        currentHpBarPlayer.setText(String.format("%d", (int) (currentHpPlayer * 100)));
        showPopup();
        showPopupGameOver();
    }

    @FXML
    void sectumsempra(ActionEvent event) throws IOException {
        double currentHp = hpBar.getProgress();
        double currentHpPlayer = hpBarPlayer.getProgress();
        currentHp -= 0.6;
        currentHpPlayer -= 0.35;
        if (currentHp <= 0) {
            currentHp = 0;
        }
        if (currentHpPlayer <= 0) {
            currentHpPlayer = 0;
        }
        hpBar.setProgress(currentHp);
        currentHpBar.setText(String.format("%d", (int) (currentHp * 280)));
        hpBarPlayer.setProgress(currentHpPlayer);
        currentHpBarPlayer.setText(String.format("%d", (int) (currentHpPlayer * 100)));
        showPopup();
        showPopupGameOver();
    }

    @FXML
    void avadaKedabra(ActionEvent event) throws IOException {
        double currentHp = hpBar.getProgress();
        double currentHpPlayer = hpBarPlayer.getProgress();
        currentHp -= 4;
        currentHpPlayer -= 0.35;
        if (currentHp <= 0) {
            currentHp = 0;
        }
        hpBar.setProgress(currentHp);
        currentHpBar.setText(String.format("%d", (int) (currentHp * 280)));
        hpBarPlayer.setProgress(currentHpPlayer);
        currentHpBarPlayer.setText(String.format("%d", (int) (currentHpPlayer * 100)));
        showPopup();
        showPopupGameOver();
    }

    void showPopupGameOver() throws IOException {
        if (hpBarPlayer.getProgress() == 0) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("GAME OVER");
            alert.setHeaderText("GAME OVER!");

            ButtonType okButton = new ButtonType("OK", ButtonBar.ButtonData.OK_DONE);
            alert.getButtonTypes().setAll(okButton);

            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == okButton) {
                Stage stage8 = (Stage) hpBarPlayer.getScene().getWindow();
                stage8.close();
            }
        }
    }


    void showPopup() throws IOException {
        if (hpBar.getProgress() == 0) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Victory");
            alert.setHeaderText("You have defeated Dolores Ombrage!");

            ButtonType okButton = new ButtonType("OK", ButtonBar.ButtonData.OK_DONE);
            alert.getButtonTypes().setAll(okButton);

            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == okButton) {
                try {
                    String username = nameLabel.getText();
                    FXMLLoader battleLvl6ControllerLoader = new FXMLLoader(HelloApplication.class.getResource("battle6.fxml"));
                    BattleLvl6Controller battle = new BattleLvl6Controller(characterImageView.getImage(), username);
                    battleLvl6ControllerLoader.setControllerFactory(param -> battle);
                    Scene scene9 = new Scene(battleLvl6ControllerLoader.load());
                    Stage stage9 = new Stage();
                    stage9.setTitle("LEVEL 6 - THE HALF-BLOOD PRINCE");
                    stage9.setScene(scene9);
                    stage9.show();

                    Stage stage8 = (Stage) hpBar.getScene().getWindow();
                    stage8.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

