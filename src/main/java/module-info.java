module com.example.projet_rpg_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projet_rpg_javafx to javafx.fxml;
    exports com.example.projet_rpg_javafx;
}