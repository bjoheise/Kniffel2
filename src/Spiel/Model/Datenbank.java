package Spiel.Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Datenbank {

    //String url = "jdbc:mysql://localhost:3306/kniffel";
    //String url = "jdbc:sqlite:src/Spiel/Database/HighscoreDB.db";
    String url = "jdbc:sqlite::resource:HighscoreDB.db";
    //String user = "root";
    //String passwort = "";

    static Connection verbindung;


    public void Connect(){
        try {
            Class.forName("org.sqlite.JDBC");
            //verbindung = DriverManager.getConnection(url, user, passwort);
            //verbindung = DriverManager.getConnection(url);
            verbindung = DriverManager.getConnection("jdbc:sqlite::resource:" + getClass().getResource("/database/HighscoreDB.db").toString());

            //verbindung = DriverManager.getConnection("jdbc:sqlite::resource:src/Spiel/Database/HighscoreDB.db");
            //verbindung = DriverManager.getConnection("jdbc:sqlite::resource:HighscoreDB.db");
            //verbindung = DriverManager.getConnection("jdbc:sqlite::resource:" +
                            //getClass().getResource("/HighscoreDB.db"));
                            //getClass().getResource("/E:/Java/Kniffel/out/artifacts/Kniffel_jar/Kniffel.jar"));
                            //getClass().getResource("/E:/Java/Kniffel/out/artifacts/Kniffel_jar/HighscoreDB.db"));


            System.out.println("Du bist verbunden!");

            /*DatabaseMetaData dm = (DatabaseMetaData) verbindung.getMetaData();
            System.out.println("Driver name: " + dm.getDriverName());
            System.out.println("Driver version: " + dm.getDriverVersion());
            System.out.println("Product name: " + dm.getDatabaseProductName());
            System.out.println("Product version: " + dm.getDatabaseProductVersion());*/

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void eintragHighscore(Spieler spieler){
        System.out.println(spieler.getSpielername());
        System.out.println(spieler.getPunktzahl());

        try{
            String neuerEintrag = "INSERT INTO highscore(spielername, punktzahl) VALUES (?,?);";
            PreparedStatement preparedStatement = verbindung.prepareStatement(neuerEintrag);
            preparedStatement.setString(1, spieler.getSpielername());
            preparedStatement.setInt(2, spieler.getPunktzahl());

            preparedStatement.execute();
            System.out.println("Datensatz wurde eingefügt");

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static ObservableList<Spieler> GetAll() throws SQLException {

        ObservableList<Spieler>spielerListe= FXCollections.observableArrayList();

        String sql = "SELECT * FROM highscore ORDER BY punktzahl desc ;";
        Statement statement = verbindung.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while(resultSet.next()){

            String name = resultSet.getString("spielername");
            int punkte = resultSet.getInt("punktzahl");

            Spieler spieler = new Spieler(name,punkte);
            spielerListe.add(spieler);
        }
        return spielerListe;
    }
}
