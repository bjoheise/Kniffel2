package Spiel;

import Spiel.Model.Datenbank;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;


public class Kniffel extends Application {



    Stage primaryStage;
    BorderPane borderPane;

    //Singleton
    public static Kniffel instance;

    public Datenbank kniffelDB = new Datenbank();


    /*int paar1;
    int paar2;
    int paar3;
    int paar4;
    int paar5;
    int paar6;
    int paar7;
    int paar8;
    int paar9;
    int paar10;

    int drilling1;
    int drilling2;
    int drilling3;
    int drilling4;
    int drilling5;
    int drilling6;*/

    public static void run(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        instance = this;
        kniffelDB.Connect();

        primaryStage.setTitle("Willkommen zum Kniffel");
        primaryStage.setWidth(550);
        primaryStage.setHeight(800);
        primaryStage.setResizable(false);

        InitMainView();

        LoadScene("StartView.fxml");
        primaryStage.show();
    }

    public void InitMainView() throws IOException {     //wird ein Mal aufgerufen, um die MainView anzuzeigen
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/Spiel/View/MainView.fxml"));

        borderPane = loader.load(); // aus der Datei lädt er die komplette Pane in eine Variable
        Scene primaryScene = new Scene(borderPane); //Pane der Szene hinzufügen
        primaryStage.setScene(primaryScene);    //Scene der Stage hinzufügen
    }

    public void LoadScene(String sceneToLoad) throws IOException {

        borderPane.getChildren().remove(borderPane.getCenter());

        String pfad = "/Spiel/View/" + sceneToLoad;

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(pfad));

        Pane pane = loader.load(); // aus der Datei lädt er die komplette Pane in eine Variable

        borderPane.setCenter(pane);
        //Scene primaryScene = new Scene(anchorPane); //Pane der Szene hinzufügen
        //primaryStage.setScene(primaryScene);    //Scene der Stage hinzufügen
    }



    //Hier werden die Spielrunden gezählt - z.B. 10
    /*public void spielRunden(){

        //10 Runden
        //Spieler 1 -> würfeln
        //Spieler 2 -> würfeln

        for (int runde=1;runde<=1;runde++){
            System.out.println("Start Spieler1 - " + runde + ". Runde");
            wuerfeln();
            System.out.println("Start Spieler2 - " + runde + ". Runde");
            wuerfeln();
        }
    }*/

}
