package Spiel.Controller;

import Spiel.Kniffel;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.io.IOException;

public class MainController {
    public void onZurStartViewOnClick(ActionEvent actionEvent) throws Exception {
        Kniffel.instance.LoadScene("StartView.fxml");
        System.out.println("geklickt!");
    }

    public void onSpielAnlegenOnClick(ActionEvent actionEvent) throws IOException {
        Kniffel.instance.LoadScene("SpielAnlegenView.fxml");
        System.out.println("geklickt!");
    }

    public void onZurHighscoreOnClick(ActionEvent actionEvent) throws IOException {
        Kniffel.instance.LoadScene("HighScoreView.fxml");
        //Kniffel.instance.LoadScene("SpielAnlegenView.fxml");
        System.out.println("geklickt!");
    }

    public void onInfoPupUpOnClick(ActionEvent actionEvent) throws IOException {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Heiseleiter's cbm jKniffel");
        alert.setHeaderText("made by Heiseleiter 2022");
        alert.setContentText("Voll gute App mit megageilen Funktionen und super viel Fun.");
        alert.setGraphic(null);
        alert.show();
        System.out.println("geklickt!");
    }

    public void onAppBeendenOnClick(ActionEvent actionEvent) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"Echt jetzt?", ButtonType.OK, ButtonType.NO);
        alert.showAndWait();

        if(alert.getResult() == ButtonType.OK){

            Platform.exit();
            System.exit(0);}
        else if (alert.getResult() == ButtonType.NO) {
            System.out.println("Gute Entscheidung");
            System.out.println("geklickt!");
        }
    }
}
