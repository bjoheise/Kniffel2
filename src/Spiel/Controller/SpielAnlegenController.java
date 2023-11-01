package Spiel.Controller;

import Spiel.Kniffel;
import Spiel.Model.SpielerStats;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;

import java.io.IOException;

public class SpielAnlegenController {
    public Button StartButton;
    public TextField textSpieler1;
    public TextField textSpieler2;
    public TextField textSpieler3;
    public TextField textSpieler4;
    public ToggleButton toggle1;
    public ToggleButton toggle2;

    public ToggleButton toggle3;
    public ToggleButton toggle4;

    public void initialize(){

        toggle1.setSelected(true);

        textSpieler1.setDisable(false);
        textSpieler2.setDisable(true);
        textSpieler3.setDisable(true);
        textSpieler4.setDisable(true);

        SpielerStats.spielerCount = 1;
    }


    public void OnButtonClickStart(ActionEvent actionEvent) throws IOException {


        SpielerStats.spielerName1 = textSpieler1.getText();
        SpielerStats.spielerName2 = textSpieler2.getText();
        SpielerStats.spielerName3 = textSpieler3.getText();
        SpielerStats.spielerName4 = textSpieler4.getText();

        Kniffel.instance.LoadScene("SpielView.fxml");

    }


    public void onToggleClick1(ActionEvent actionEvent) {

        textSpieler1.setDisable(false);
        textSpieler2.setDisable(true);
        textSpieler3.setDisable(true);
        textSpieler4.setDisable(true);

        SpielerStats.spielerCount = 1;

        toggle1.setSelected(true);
        toggle2.setSelected(false);
        toggle3.setSelected(false);
        toggle4.setSelected(false);

    }

    public void onToggleClick2(ActionEvent actionEvent) {
        textSpieler1.setDisable(false);
        textSpieler2.setDisable(false);
        textSpieler3.setDisable(true);
        textSpieler4.setDisable(true);

        SpielerStats.spielerCount = 2;

        toggle1.setSelected(false);
        toggle2.setSelected(true);
        toggle3.setSelected(false);
        toggle4.setSelected(false);

    }

    public void onToggleClick3(ActionEvent actionEvent) {
        textSpieler1.setDisable(false);
        textSpieler2.setDisable(false);
        textSpieler3.setDisable(false);
        textSpieler4.setDisable(true);

        SpielerStats.spielerCount = 3;

        toggle1.setSelected(false);
        toggle2.setSelected(false);
        toggle3.setSelected(true);
        toggle4.setSelected(false);

    }

    public void onToggleClick4(ActionEvent actionEvent) {
        textSpieler1.setDisable(false);
        textSpieler2.setDisable(false);
        textSpieler3.setDisable(false);
        textSpieler4.setDisable(false);

        SpielerStats.spielerCount = 4;

        toggle1.setSelected(false);
        toggle2.setSelected(false);
        toggle3.setSelected(false);
        toggle4.setSelected(true);

    }
}
