package Spiel.Controller;

import Spiel.Kniffel;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import java.io.IOException;

public class StartController {
    public Button HighscoreButton;
    public Button SpielButton;

    public void OnClickZurHighscore(ActionEvent actionEvent) throws IOException {
        Kniffel.instance.LoadScene("HighScoreView.fxml");
    }

    public void OnClickNeuesSpiel(ActionEvent actionEvent) throws IOException {
        Kniffel.instance.LoadScene("SpielAnlegenView.fxml");
    }
}
