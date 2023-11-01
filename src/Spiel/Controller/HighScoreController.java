package Spiel.Controller;

import Spiel.Model.Datenbank;
import Spiel.Model.Spieler;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.Date;
import java.sql.SQLException;

public class HighScoreController {

    @FXML
    public TableView<Spieler> tabelleGanz;

    @FXML
    public TableColumn<Spieler, String> spielername;
    //private TableColumn<Tier, Integer>tieralter;

    @FXML
    public TableColumn<Spieler, Integer> punktzahl;
    //private TableColumn<Tier, Integer>id;

    //public TableColumn spielername;
    //public TableColumn punktzahl;

    ObservableList<Spieler> spielerListe = FXCollections.observableArrayList();

    //ObservableList<Tier>tierListe = FXCollections.observableArrayList( new Tier("Bambi",10,0));

    public void initialize() throws SQLException {
        spielername.setCellValueFactory(new PropertyValueFactory<Spieler, String>("spielername"));
        punktzahl.setCellValueFactory(new PropertyValueFactory<Spieler, Integer>("punktzahl"));

        spielerListe = Datenbank.GetAll();
        tabelleGanz.setItems(spielerListe);

        System.out.println("Stimmt");
    }
}
