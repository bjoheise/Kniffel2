package Spiel.Controller;

import Spiel.Kniffel;
import Spiel.Model.Spieler;
import Spiel.Model.SpielerStats;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;


import java.io.IOException;
import java.util.Random;

public class SpielController {

    public TextField ersterWuerfel;
    public TextField zweiterWuerfel;
    public TextField dritterWuerfel;
    public TextField vierterWuerfel;
    public TextField fuenfterWuerfel;

    //IDs der ToggleButtons:
    public ToggleButton wuerfelbut1;
    public ToggleButton wuerfelbut2;
    public ToggleButton wuerfelbut3;
    public ToggleButton wuerfelbut4;
    public ToggleButton wuerfelbut5;
    public TextField nameSpieler1;
    public TextField nameSpieler2;
    public TextField nameSpieler3;
    public TextField nameSpieler4;
    public Button wuerfeln;
    public TextField textFieldZaehler1;
    public TextField textFieldZaehler2;
    public TextField textFieldZaehler3;
    public TextField textFieldRundenZaehler;


    //würfeln ja/nein
    boolean wuerfeln1neu = true;
    boolean wuerfeln2neu = true;
    boolean wuerfeln3neu = true;
    boolean wuerfeln4neu = true;
    boolean wuerfeln5neu = true;
    int aktuellerWurf;

    int wuerfel1 = 0;
    int wuerfel2 = 0;
    int wuerfel3 = 0;
    int wuerfel4 = 0;
    int wuerfel5 = 0;

    public Button wuerfelbutton1;
    public Button wuerfelbutton2;
    public Button wuerfelbutton3;
    public Button wuerfelbutton4;
    public Button wuerfelbutton5;
    public TextField Spieler1_1;
    public TextField Spieler1_3;
    public TextField Spieler1_2;
    public TextField Spieler1_4;
    public TextField Spieler1_5;
    public TextField Spieler1_6;
    public TextField Spieler1_ergebnisZahlen;
    public TextField Spieler1_p35;
    public TextField Spieler1_gesamtOben;
    public TextField Spieler1_dreierP;
    public TextField Spieler1_viererP;
    public TextField Spieler1_fullHouse;
    public TextField Spieler1_kleineStr;
    public TextField Spieler1_grosseStr;
    public TextField Spieler1_Kniffel;
    public TextField Spieler1_Chance;
    public TextField Spieler1_gesamtOben2;
    public TextField Spieler1_gesamtUnten;
    public TextField Spieler1_Total;
    public TextField Spieler2_1;
    public TextField Spieler2_2;
    public TextField Spieler2_3;
    public TextField Spieler2_4;
    public TextField Spieler2_5;
    public TextField Spieler2_6;
    public TextField Spieler2_ergebnisZahlen;
    public TextField Spieler2_p35;
    public TextField Spieler2_gesamtOben;
    public TextField Spieler2_dreierP;
    public TextField Spieler2_viererP;
    public TextField Spieler2_fullHouse;
    public TextField Spieler2_kleineStr;
    public TextField Spieler2_grosseStr;
    public TextField Spieler2_Kniffel;
    public TextField Spieler2_Chance;
    public TextField Spieler2_gesamtOben2;
    public TextField Spieler2_gesamtUnten;
    public TextField Spieler2_Total;
    public TextField Spieler3_1;
    public TextField Spieler3_2;
    public TextField Spieler3_3;
    public TextField Spieler3_4;
    public TextField Spieler3_5;
    public TextField Spieler3_6;
    public TextField Spieler3_ergebnisZahlen;
    public TextField Spieler3_p35;
    public TextField Spieler3_gesamtOben;
    public TextField Spieler3_dreierP;
    public TextField Spieler3_viererP;
    public TextField Spieler3_fullHouse;
    public TextField Spieler3_kleineStr;
    public TextField Spieler3_grosseStr;
    public TextField Spieler3_Kniffel;
    public TextField Spieler3_Chance;
    public TextField Spieler3_gesamtOben2;
    public TextField Spieler3_gesamtUnten;
    public TextField Spieler3_Total;
    public TextField Spieler4_1;
    public TextField Spieler4_2;
    public TextField Spieler4_3;
    public TextField Spieler4_4;
    public TextField Spieler4_5;
    public TextField Spieler4_6;
    public TextField Spieler4_ergebnisZahlen;
    public TextField Spieler4_p35;
    public TextField Spieler4_gesamtOben;
    public TextField Spieler4_dreierP;
    public TextField Spieler4_viererP;
    public TextField Spieler4_fullHouse;
    public TextField Spieler4_kleineStr;
    public TextField Spieler4_grosseStr;
    public TextField Spieler4_Kniffel;
    public TextField Spieler4_Chance;
    public TextField Spieler4_gesamtOben2;
    public TextField Spieler4_gesamtUnten;
    public TextField Spieler4_Total;
    int s1z1;
    int s1z2;
    int s1z3;
    int s1z4;
    int s1z5;
    int s1z6;
    int S1ErgZahlen;
    int s1p35;
    int s1ErgOben;
    int s1_3p;
    int s1_4p;
    int s1_fh;
    int s1_klStr;
    int s1_grStr;
    int s1_kn;
    int s1_cha;

    int wuerfe = 0;
    int s1ErgUnten;

    int rundenzahl = 3;
    public int rundenZaehler = 1;
    int extraZaehler =1;


    public void initialize() {

        // Textfelder nicht ausfüllbar machen
        ersterWuerfel.setEditable(false);
        zweiterWuerfel.setEditable(false);
        dritterWuerfel.setEditable(false);
        vierterWuerfel.setEditable(false);
        fuenfterWuerfel.setEditable(false);
        textFieldRundenZaehler.setEditable(false);


        //
        if (SpielerStats.spielerCount == 1)
            nameSpieler1.setText(SpielerStats.spielerName1);
        else if (SpielerStats.spielerCount == 2) {
            nameSpieler1.setText(SpielerStats.spielerName1);
            nameSpieler2.setText(SpielerStats.spielerName2);
        } else if (SpielerStats.spielerCount == 3) {
            nameSpieler1.setText(SpielerStats.spielerName1);
            nameSpieler2.setText(SpielerStats.spielerName2);
            nameSpieler3.setText(SpielerStats.spielerName3);
        } else if (SpielerStats.spielerCount == 4) {
            nameSpieler1.setText(SpielerStats.spielerName1);
            nameSpieler2.setText(SpielerStats.spielerName2);
            nameSpieler3.setText(SpielerStats.spielerName3);
            nameSpieler4.setText(SpielerStats.spielerName4);
        }

        spielerAusblenden();

        // SPIELER 1
        Spieler1_1.setText(String.valueOf(0));
        Spieler1_2.setText(String.valueOf(0));
        Spieler1_3.setText(String.valueOf(0));
        Spieler1_4.setText(String.valueOf(0));
        Spieler1_5.setText(String.valueOf(0));
        Spieler1_6.setText(String.valueOf(0));
        Spieler1_p35.setText(String.valueOf(0));
        Spieler1_ergebnisZahlen.setText(String.valueOf(0));
        Spieler1_gesamtOben.setText(String.valueOf(0));
        Spieler1_dreierP.setText(String.valueOf(0));
        Spieler1_viererP.setText(String.valueOf(0));
        Spieler1_fullHouse.setText(String.valueOf(0));
        Spieler1_kleineStr.setText(String.valueOf(0));
        Spieler1_grosseStr.setText(String.valueOf(0));
        Spieler1_Kniffel.setText(String.valueOf(0));
        Spieler1_Chance.setText(String.valueOf(0));
        Spieler1_gesamtOben2.setText(String.valueOf(0));
        Spieler1_gesamtUnten.setText(String.valueOf(0));
        Spieler1_Total.setText(String.valueOf(0));

        // SPIELER 3

        Spieler3_1.setText(String.valueOf(0));
        Spieler3_2.setText(String.valueOf(0));
        Spieler3_3.setText(String.valueOf(0));
        Spieler3_4.setText(String.valueOf(0));
        Spieler3_5.setText(String.valueOf(0));
        Spieler3_6.setText(String.valueOf(0));
        Spieler3_p35.setText(String.valueOf(0));
        Spieler3_ergebnisZahlen.setText(String.valueOf(0));
        Spieler3_gesamtOben.setText(String.valueOf(0));
        Spieler3_dreierP.setText(String.valueOf(0));
        Spieler3_viererP.setText(String.valueOf(0));
        Spieler3_fullHouse.setText(String.valueOf(0));
        Spieler3_kleineStr.setText(String.valueOf(0));
        Spieler3_grosseStr.setText(String.valueOf(0));
        Spieler3_Kniffel.setText(String.valueOf(0));
        Spieler3_Chance.setText(String.valueOf(0));
        Spieler3_gesamtOben2.setText(String.valueOf(0));
        Spieler3_gesamtUnten.setText(String.valueOf(0));
        Spieler3_Total.setText(String.valueOf(0));

        // SPIELER 2

        Spieler2_1.setText(String.valueOf(0));
        Spieler2_2.setText(String.valueOf(0));
        Spieler2_3.setText(String.valueOf(0));
        Spieler2_4.setText(String.valueOf(0));
        Spieler2_5.setText(String.valueOf(0));
        Spieler2_6.setText(String.valueOf(0));
        Spieler2_p35.setText(String.valueOf(0));
        Spieler2_ergebnisZahlen.setText(String.valueOf(0));
        Spieler2_gesamtOben.setText(String.valueOf(0));
        Spieler2_dreierP.setText(String.valueOf(0));
        Spieler2_viererP.setText(String.valueOf(0));
        Spieler2_fullHouse.setText(String.valueOf(0));
        Spieler2_kleineStr.setText(String.valueOf(0));
        Spieler2_grosseStr.setText(String.valueOf(0));
        Spieler2_Kniffel.setText(String.valueOf(0));
        Spieler2_Chance.setText(String.valueOf(0));
        Spieler2_gesamtOben2.setText(String.valueOf(0));
        Spieler2_gesamtUnten.setText(String.valueOf(0));
        Spieler2_Total.setText(String.valueOf(0));

        // SPIELER 4

        Spieler4_1.setText(String.valueOf(0));
        Spieler4_2.setText(String.valueOf(0));
        Spieler4_3.setText(String.valueOf(0));
        Spieler4_4.setText(String.valueOf(0));
        Spieler4_5.setText(String.valueOf(0));
        Spieler4_6.setText(String.valueOf(0));
        Spieler4_p35.setText(String.valueOf(0));
        Spieler4_ergebnisZahlen.setText(String.valueOf(0));
        Spieler4_gesamtOben.setText(String.valueOf(0));
        Spieler4_dreierP.setText(String.valueOf(0));
        Spieler4_viererP.setText(String.valueOf(0));
        Spieler4_fullHouse.setText(String.valueOf(0));
        Spieler4_kleineStr.setText(String.valueOf(0));
        Spieler4_grosseStr.setText(String.valueOf(0));
        Spieler4_Kniffel.setText(String.valueOf(0));
        Spieler4_Chance.setText(String.valueOf(0));
        Spieler4_gesamtOben2.setText(String.valueOf(0));
        Spieler4_gesamtUnten.setText(String.valueOf(0));
        Spieler4_Total.setText(String.valueOf(0));

    }

    /*public void OnClickWuerfel1(ActionEvent actionEvent) {
    }

    public void OnClickWuerfel2(ActionEvent actionEvent) {
    }

    public void OnClickWuerfel3(ActionEvent actionEvent) {
    }

    public void OnClickWuerfel4(ActionEvent actionEvent) {
    }

    public void OnClickWuerfel5(ActionEvent actionEvent) {
    }

    public void OnSpieler1_1(ActionEvent actionEvent) {
    }*/

    public void OnClickErsterWuerfel(ActionEvent actionEvent) {

        boolean isSelected = wuerfelbut1.isSelected();

        if (isSelected) {
            wuerfeln1neu = false;
            wuerfelbut1.setText("halten");
        } else {
            wuerfeln1neu = true;
            wuerfelbut1.setText("neu");
        }
    }

    public void OnClickZweiterWuerfel(ActionEvent actionEvent) {

        boolean isSelected = wuerfelbut2.isSelected();
        if (isSelected) {
            wuerfeln2neu = false;
            wuerfelbut2.setText("halten");
        } else {
            wuerfeln2neu = true;
            wuerfelbut2.setText("neu");
        }
    }

    public void OnClickDritterWuerfel(ActionEvent actionEvent) {
        boolean isSelected = wuerfelbut3.isSelected();

        if (isSelected) {
            wuerfeln3neu = false;
            wuerfelbut3.setText("halten");
        } else {
            wuerfeln3neu = true;
            wuerfelbut3.setText("neu");
        }
    }

    public void OnClickVierterWuerfel(ActionEvent actionEvent) {
        boolean isSelected = wuerfelbut4.isSelected();

        if (isSelected) {
            wuerfeln4neu = false;
            wuerfelbut4.setText("halten");
        } else {
            wuerfeln4neu = true;
            wuerfelbut4.setText("neu");
        }
    }

    public void OnClickFuenfterWuerfel(ActionEvent actionEvent) {
        boolean isSelected = wuerfelbut5.isSelected();

        if (isSelected) {
            wuerfeln5neu = false;
            wuerfelbut5.setText("halten");
        } else {
            wuerfeln5neu = true;
            wuerfelbut5.setText("neu");
        }
    }

    // Hier werden 13 Runden gezählt


    // Hier wird die Zufallszahl von 1-6 für jeden Wurf ermittelt
    public int randomZahl() {


        Random wurf = new Random();
        aktuellerWurf = wurf.nextInt(6) + 1;
        return aktuellerWurf;
    }

    public void OnClickWuerfeln(ActionEvent actionEvent) throws IOException {

        wuerfeln.setText("würfeln");
        textFieldRundenZaehler.setText(String.valueOf(rundenZaehler));

        if (rundenZaehler <= rundenzahl) {

            if (wuerfe <= 2) {

                if (wuerfeln1neu == true) {
                    randomZahl();
                    wuerfel1 = aktuellerWurf;
                    ersterWuerfel.setText(String.valueOf(wuerfel1));
                    System.out.print(wuerfel1 + " ");
                }
                if (wuerfeln2neu == true) {
                    randomZahl();
                    wuerfel2 = aktuellerWurf;
                    zweiterWuerfel.setText(String.valueOf(wuerfel2));
                    System.out.print(wuerfel2 + " ");
                }
                if (wuerfeln3neu == true) {
                    randomZahl();
                    wuerfel3 = aktuellerWurf;
                    dritterWuerfel.setText(String.valueOf(wuerfel3));
                    System.out.print(wuerfel3 + " ");
                }
                if (wuerfeln4neu == true) {
                    randomZahl();
                    wuerfel4 = aktuellerWurf;
                    vierterWuerfel.setText(String.valueOf(wuerfel4));
                    System.out.print(wuerfel4 + " ");
                }
                if (wuerfeln5neu == true) {
                    randomZahl();
                    wuerfel5 = aktuellerWurf;
                    fuenfterWuerfel.setText(String.valueOf(wuerfel5));
                    System.out.println(wuerfel5);

                }
                wuerfe++;


                if (wuerfe == 1) {
                    textFieldZaehler1.setStyle("-fx-background-color: red;");
                }
                if (wuerfe == 2) {
                    textFieldZaehler2.setStyle("-fx-background-color: red;");
                }
                if (wuerfe == 3) {

                    wuerfeln.setText("weiter!");
                    textFieldZaehler3.setStyle("-fx-background-color: red;");


                }
            } else {

                ersterWuerfel.setText("");
                zweiterWuerfel.setText("");
                dritterWuerfel.setText("");
                vierterWuerfel.setText("");
                fuenfterWuerfel.setText("");

                wuerfeln1neu = true;
                wuerfelbut1.setSelected(false);
                wuerfelbut1.setText("neu");
                wuerfeln2neu = true;
                wuerfelbut2.setSelected(false);
                wuerfelbut2.setText("neu");
                wuerfeln3neu = true;
                wuerfelbut3.setSelected(false);
                wuerfelbut3.setText("neu");
                wuerfeln4neu = true;
                wuerfelbut4.setSelected(false);
                wuerfelbut4.setText("neu");
                wuerfeln5neu = true;
                wuerfelbut5.setSelected(false);
                wuerfelbut5.setText("neu");

                wuerfe = 0;


                //textFieldRundenZaehler.setText(String.valueOf(rundenZaehler));

                textFieldZaehler1.setStyle("-fx-background-color: white;");
                textFieldZaehler2.setStyle("-fx-background-color: white;");
                textFieldZaehler3.setStyle("-fx-background-color: white;");

                if (extraZaehler == SpielerStats.spielerCount){
                    rundenZaehler++;
                    extraZaehler=0;
                }
                extraZaehler++;

                if (rundenZaehler > rundenzahl) {
                    wuerfeln.setText("Ergebnis");
                    wuerfeln.setStyle("-fx-background-color: green; -fx-text-background-color: white;");
                    textFieldRundenZaehler.setText(String.valueOf("X"));
                    textFieldRundenZaehler.setStyle("-fx-background-color: red;-fx-background-radius: 20;");
                }

            }
        } else {

            datenBankCreate();
            PopUpSpielErgebnis();
            Kniffel.instance.LoadScene("SpielAnlegenView.fxml");
        }


        //wurfAuswerten();

    }

    public void OnSpieler1_ergebnisZahlen(ActionEvent actionEvent) {
        // 1 - 6
        s1z1 = Integer.parseInt(Spieler1_1.getText());
        s1z2 = Integer.parseInt(Spieler1_2.getText());
        s1z3 = Integer.parseInt(Spieler1_3.getText());
        s1z4 = Integer.parseInt(Spieler1_4.getText());
        s1z5 = Integer.parseInt(Spieler1_5.getText());
        s1z6 = Integer.parseInt(Spieler1_6.getText());
        S1ErgZahlen = s1z1 + s1z2 + s1z3 + s1z4 + s1z5 + s1z6;
        Spieler1_ergebnisZahlen.setText(String.valueOf(S1ErgZahlen));

        // Bonus
        if (S1ErgZahlen >= 63) {
            Spieler1_p35.setText(String.valueOf(35));
        }
        // Gesamt oben
        s1p35 = Integer.parseInt(Spieler1_p35.getText());
        s1ErgOben = S1ErgZahlen + s1p35;

        s1_3p = Integer.parseInt(Spieler1_dreierP.getText());
        s1_4p = Integer.parseInt(Spieler1_viererP.getText());
        s1_fh = Integer.parseInt(Spieler1_fullHouse.getText());
        s1_klStr = Integer.parseInt(Spieler1_kleineStr.getText());
        s1_grStr = Integer.parseInt(Spieler1_grosseStr.getText());
        s1_kn = Integer.parseInt(Spieler1_Kniffel.getText());
        s1_cha = Integer.parseInt(Spieler1_Chance.getText());
        s1ErgUnten = s1_3p + s1_4p + s1_fh + s1_klStr + s1_grStr + s1_kn + s1_cha;

        System.out.println(s1ErgUnten);

        Spieler1_gesamtUnten.setText(String.valueOf(s1ErgUnten));

        Spieler1_gesamtOben.setText(String.valueOf(s1ErgOben));
        Spieler1_gesamtOben2.setText(String.valueOf(s1ErgOben));

        Spieler1_Total.setText(String.valueOf(s1ErgOben + s1ErgUnten));
    }


    public void OnSpieler2_ergebnisZahlen(ActionEvent actionEvent) {
        // 1 - 6
        int s2z1 = Integer.parseInt(Spieler2_1.getText());
        int s2z2 = Integer.parseInt(Spieler2_2.getText());
        int s2z3 = Integer.parseInt(Spieler2_3.getText());
        int s2z4 = Integer.parseInt(Spieler2_4.getText());
        int s2z5 = Integer.parseInt(Spieler2_5.getText());
        int s2z6 = Integer.parseInt(Spieler2_6.getText());
        int S2ErgZahlen = s2z1 + s2z2 + s2z3 + s2z4 + s2z5 + s2z6;
        Spieler2_ergebnisZahlen.setText(String.valueOf(S2ErgZahlen));

        // Bonus
        if (S2ErgZahlen >= 63) {
            Spieler2_p35.setText(String.valueOf(35));
        }
        // Gesamt oben
        int s2p35 = Integer.parseInt(Spieler2_p35.getText());
        int s2ErgOben = S2ErgZahlen + s2p35;

        int s2_3p = Integer.parseInt(Spieler2_dreierP.getText());
        int s2_4p = Integer.parseInt(Spieler2_viererP.getText());
        int s2_fh = Integer.parseInt(Spieler2_fullHouse.getText());
        int s2_klStr = Integer.parseInt(Spieler2_kleineStr.getText());
        int s2_grStr = Integer.parseInt(Spieler2_grosseStr.getText());
        int s2_kn = Integer.parseInt(Spieler2_Kniffel.getText());
        int s2_cha = Integer.parseInt(Spieler2_Chance.getText());
        int s2ErgUnten = s2_3p + s2_4p + s2_fh + s2_klStr + s2_grStr + s2_kn + s2_cha;


        Spieler2_gesamtUnten.setText(String.valueOf(s2ErgUnten));

        Spieler2_gesamtOben.setText(String.valueOf(s2ErgOben));
        Spieler2_gesamtOben2.setText(String.valueOf(s2ErgOben));

        Spieler2_Total.setText(String.valueOf(s2ErgOben + s2ErgUnten));

    }


    public void OnSpieler3_ergebnisZahlen(ActionEvent actionEvent) {
        // 1 - 6
        int s3z1 = Integer.parseInt(Spieler3_1.getText());
        int s3z2 = Integer.parseInt(Spieler3_2.getText());
        int s3z3 = Integer.parseInt(Spieler3_3.getText());
        int s3z4 = Integer.parseInt(Spieler3_4.getText());
        int s3z5 = Integer.parseInt(Spieler3_5.getText());
        int s3z6 = Integer.parseInt(Spieler3_6.getText());
        int S3ErgZahlen = s3z1 + s3z2 + s3z3 + s3z4 + s3z5 + s3z6;
        Spieler3_ergebnisZahlen.setText(String.valueOf(S3ErgZahlen));

        // Bonus
        if (S3ErgZahlen >= 63) {
            Spieler3_p35.setText(String.valueOf(35));
        }
        // Gesamt oben
        int s3p35 = Integer.parseInt(Spieler3_p35.getText());
        int s3ErgOben = S3ErgZahlen + s3p35;

        int s3_3p = Integer.parseInt(Spieler3_dreierP.getText());
        int s3_4p = Integer.parseInt(Spieler3_viererP.getText());
        int s3_fh = Integer.parseInt(Spieler3_fullHouse.getText());
        int s3_klStr = Integer.parseInt(Spieler3_kleineStr.getText());
        int s3_grStr = Integer.parseInt(Spieler3_grosseStr.getText());
        int s3_kn = Integer.parseInt(Spieler3_Kniffel.getText());
        int s3_cha = Integer.parseInt(Spieler3_Chance.getText());
        int s3ErgUnten = s3_3p + s3_4p + s3_fh + s3_klStr + s3_grStr + s3_kn + s3_cha;


        Spieler3_gesamtUnten.setText(String.valueOf(s3ErgUnten));

        Spieler3_gesamtOben.setText(String.valueOf(s3ErgOben));
        Spieler3_gesamtOben2.setText(String.valueOf(s3ErgOben));

        Spieler3_Total.setText(String.valueOf(s3ErgOben + s3ErgUnten));
    }


    public void OnSpieler4_ergebnisZahlen(ActionEvent actionEvent) {
        // 1 - 6
        int s4z1 = Integer.parseInt(Spieler4_1.getText());
        int s4z2 = Integer.parseInt(Spieler4_2.getText());
        int s4z3 = Integer.parseInt(Spieler4_3.getText());
        int s4z4 = Integer.parseInt(Spieler4_4.getText());
        int s4z5 = Integer.parseInt(Spieler4_5.getText());
        int s4z6 = Integer.parseInt(Spieler4_6.getText());
        int S4ErgZahlen = s4z1 + s4z2 + s4z3 + s4z4 + s4z5 + s4z6;
        Spieler4_ergebnisZahlen.setText(String.valueOf(S4ErgZahlen));

        // Bonus
        if (S4ErgZahlen >= 63) {
            Spieler4_p35.setText(String.valueOf(35));
        }
        // Gesamt oben
        int s4p35 = Integer.parseInt(Spieler4_p35.getText());
        int s4ErgOben = S4ErgZahlen + s4p35;

        int s4_3p = Integer.parseInt(Spieler4_dreierP.getText());
        int s4_4p = Integer.parseInt(Spieler4_viererP.getText());
        int s4_fh = Integer.parseInt(Spieler4_fullHouse.getText());
        int s4_klStr = Integer.parseInt(Spieler4_kleineStr.getText());
        int s4_grStr = Integer.parseInt(Spieler4_grosseStr.getText());
        int s4_kn = Integer.parseInt(Spieler4_Kniffel.getText());
        int s4_cha = Integer.parseInt(Spieler4_Chance.getText());
        int s4ErgUnten = s4_3p + s4_4p + s4_fh + s4_klStr + s4_grStr + s4_kn + s4_cha;


        Spieler4_gesamtUnten.setText(String.valueOf(s4ErgUnten));

        Spieler4_gesamtOben.setText(String.valueOf(s4ErgOben));
        Spieler4_gesamtOben2.setText(String.valueOf(s4ErgOben));

        Spieler4_Total.setText(String.valueOf(s4ErgOben + s4ErgUnten));
    }


    public void onClicktextFieldZaehler1(ActionEvent actionEvent) {
    }

    public void onClicktextFieldZaehler2(ActionEvent actionEvent) {
    }

    public void onClicktextFieldZaehler3(ActionEvent actionEvent) {
    }

    public void spielerAusblenden() {
        if (SpielerStats.spielerCount == 1) {
            nameSpieler2.setDisable(true);
            Spieler2_1.setDisable(true);
            Spieler2_2.setDisable(true);
            Spieler2_3.setDisable(true);
            Spieler2_4.setDisable(true);
            Spieler2_5.setDisable(true);
            Spieler2_6.setDisable(true);
            Spieler2_p35.setDisable(true);
            Spieler2_ergebnisZahlen.setDisable(true);
            Spieler2_gesamtOben.setDisable(true);
            Spieler2_dreierP.setDisable(true);
            Spieler2_viererP.setDisable(true);
            Spieler2_fullHouse.setDisable(true);
            Spieler2_kleineStr.setDisable(true);
            Spieler2_grosseStr.setDisable(true);
            Spieler2_Kniffel.setDisable(true);
            Spieler2_Chance.setDisable(true);
            Spieler2_gesamtOben2.setDisable(true);
            Spieler2_gesamtUnten.setDisable(true);
            Spieler2_Total.setDisable(true);

            nameSpieler3.setDisable(true);
            Spieler3_1.setDisable(true);
            Spieler3_2.setDisable(true);
            Spieler3_3.setDisable(true);
            Spieler3_4.setDisable(true);
            Spieler3_5.setDisable(true);
            Spieler3_6.setDisable(true);
            Spieler3_p35.setDisable(true);
            Spieler3_ergebnisZahlen.setDisable(true);
            Spieler3_gesamtOben.setDisable(true);
            Spieler3_dreierP.setDisable(true);
            Spieler3_viererP.setDisable(true);
            Spieler3_fullHouse.setDisable(true);
            Spieler3_kleineStr.setDisable(true);
            Spieler3_grosseStr.setDisable(true);
            Spieler3_Kniffel.setDisable(true);
            Spieler3_Chance.setDisable(true);
            Spieler3_gesamtOben2.setDisable(true);
            Spieler3_gesamtUnten.setDisable(true);
            Spieler3_Total.setDisable(true);

            nameSpieler4.setDisable(true);
            Spieler4_1.setDisable(true);
            Spieler4_2.setDisable(true);
            Spieler4_3.setDisable(true);
            Spieler4_4.setDisable(true);
            Spieler4_5.setDisable(true);
            Spieler4_6.setDisable(true);
            Spieler4_p35.setDisable(true);
            Spieler4_ergebnisZahlen.setDisable(true);
            Spieler4_gesamtOben.setDisable(true);
            Spieler4_dreierP.setDisable(true);
            Spieler4_viererP.setDisable(true);
            Spieler4_fullHouse.setDisable(true);
            Spieler4_kleineStr.setDisable(true);
            Spieler4_grosseStr.setDisable(true);
            Spieler4_Kniffel.setDisable(true);
            Spieler4_Chance.setDisable(true);
            Spieler4_gesamtOben2.setDisable(true);
            Spieler4_gesamtUnten.setDisable(true);
            Spieler4_Total.setDisable(true);
        }
        if (SpielerStats.spielerCount == 2) {
            nameSpieler3.setDisable(true);
            Spieler3_1.setDisable(true);
            Spieler3_2.setDisable(true);
            Spieler3_3.setDisable(true);
            Spieler3_4.setDisable(true);
            Spieler3_5.setDisable(true);
            Spieler3_6.setDisable(true);
            Spieler3_p35.setDisable(true);
            Spieler3_ergebnisZahlen.setDisable(true);
            Spieler3_gesamtOben.setDisable(true);
            Spieler3_dreierP.setDisable(true);
            Spieler3_viererP.setDisable(true);
            Spieler3_fullHouse.setDisable(true);
            Spieler3_kleineStr.setDisable(true);
            Spieler3_grosseStr.setDisable(true);
            Spieler3_Kniffel.setDisable(true);
            Spieler3_Chance.setDisable(true);
            Spieler3_gesamtOben2.setDisable(true);
            Spieler3_gesamtUnten.setDisable(true);
            Spieler3_Total.setDisable(true);

            nameSpieler4.setDisable(true);
            Spieler4_1.setDisable(true);
            Spieler4_2.setDisable(true);
            Spieler4_3.setDisable(true);
            Spieler4_4.setDisable(true);
            Spieler4_5.setDisable(true);
            Spieler4_6.setDisable(true);
            Spieler4_p35.setDisable(true);
            Spieler4_ergebnisZahlen.setDisable(true);
            Spieler4_gesamtOben.setDisable(true);
            Spieler4_dreierP.setDisable(true);
            Spieler4_viererP.setDisable(true);
            Spieler4_fullHouse.setDisable(true);
            Spieler4_kleineStr.setDisable(true);
            Spieler4_grosseStr.setDisable(true);
            Spieler4_Kniffel.setDisable(true);
            Spieler4_Chance.setDisable(true);
            Spieler4_gesamtOben2.setDisable(true);
            Spieler4_gesamtUnten.setDisable(true);
            Spieler4_Total.setDisable(true);
        }
        if (SpielerStats.spielerCount == 3) {
            nameSpieler4.setDisable(true);
            Spieler4_1.setDisable(true);
            Spieler4_2.setDisable(true);
            Spieler4_3.setDisable(true);
            Spieler4_4.setDisable(true);
            Spieler4_5.setDisable(true);
            Spieler4_6.setDisable(true);
            Spieler4_p35.setDisable(true);
            Spieler4_ergebnisZahlen.setDisable(true);
            Spieler4_gesamtOben.setDisable(true);
            Spieler4_dreierP.setDisable(true);
            Spieler4_viererP.setDisable(true);
            Spieler4_fullHouse.setDisable(true);
            Spieler4_kleineStr.setDisable(true);
            Spieler4_grosseStr.setDisable(true);
            Spieler4_Kniffel.setDisable(true);
            Spieler4_Chance.setDisable(true);
            Spieler4_gesamtOben2.setDisable(true);
            Spieler4_gesamtUnten.setDisable(true);
            Spieler4_Total.setDisable(true);
        }
    }

    public void datenBankCreate() {

        if (SpielerStats.spielerCount == 1) {
            String spielername1 = nameSpieler1.getText();
            int punktzahl1 = Integer.parseInt(Spieler1_Total.getText());
            Spieler spieler1 = new Spieler(spielername1, punktzahl1);
            Kniffel.instance.kniffelDB.eintragHighscore(spieler1);
            System.out.println("Highscore eingetragen");
        }
        if (SpielerStats.spielerCount == 2) {
            String spielername1 = nameSpieler1.getText();
            int punktzahl1 = Integer.parseInt(Spieler1_Total.getText());
            Spieler spieler1 = new Spieler(spielername1, punktzahl1);
            Kniffel.instance.kniffelDB.eintragHighscore(spieler1);
            System.out.println("Highscore eingetragen");

            String spielername2 = nameSpieler2.getText();
            int punktzahl2 = Integer.parseInt(Spieler2_Total.getText());
            Spieler spieler2 = new Spieler(spielername2, punktzahl2);
            Kniffel.instance.kniffelDB.eintragHighscore(spieler2);
            System.out.println("Highscore eingetragen");
        }
        if (SpielerStats.spielerCount == 3) {
            String spielername1 = nameSpieler1.getText();
            int punktzahl1 = Integer.parseInt(Spieler1_Total.getText());
            Spieler spieler1 = new Spieler(spielername1, punktzahl1);
            Kniffel.instance.kniffelDB.eintragHighscore(spieler1);
            System.out.println("Highscore eingetragen");

            String spielername2 = nameSpieler2.getText();
            int punktzahl2 = Integer.parseInt(Spieler2_Total.getText());
            Spieler spieler2 = new Spieler(spielername2, punktzahl2);
            Kniffel.instance.kniffelDB.eintragHighscore(spieler2);
            System.out.println("Highscore eingetragen");

            String spielername3 = nameSpieler3.getText();
            int punktzahl3 = Integer.parseInt(Spieler3_Total.getText());
            Spieler spieler3 = new Spieler(spielername3, punktzahl3);
            Kniffel.instance.kniffelDB.eintragHighscore(spieler3);
            System.out.println("Highscore eingetragen");
        }
        if (SpielerStats.spielerCount == 4) {
            String spielername1 = nameSpieler1.getText();
            int punktzahl1 = Integer.parseInt(Spieler1_Total.getText());
            Spieler spieler1 = new Spieler(spielername1, punktzahl1);
            Kniffel.instance.kniffelDB.eintragHighscore(spieler1);
            System.out.println("Highscore eingetragen");

            String spielername2 = nameSpieler2.getText();
            int punktzahl2 = Integer.parseInt(Spieler2_Total.getText());
            Spieler spieler2 = new Spieler(spielername2, punktzahl2);
            Kniffel.instance.kniffelDB.eintragHighscore(spieler2);
            System.out.println("Highscore eingetragen");

            String spielername3 = nameSpieler3.getText();
            int punktzahl3 = Integer.parseInt(Spieler3_Total.getText());
            Spieler spieler3 = new Spieler(spielername3, punktzahl3);
            Kniffel.instance.kniffelDB.eintragHighscore(spieler3);
            System.out.println("Highscore eingetragen");

            String spielername4 = nameSpieler4.getText();
            int punktzahl4 = Integer.parseInt(Spieler4_Total.getText());
            Spieler spieler4 = new Spieler(spielername4, punktzahl4);
            Kniffel.instance.kniffelDB.eintragHighscore(spieler4);
            System.out.println("Highscore eingetragen");
        }
    }

    public void PopUpSpielErgebnis() throws IOException {
        String beiEinemSpieler = nameSpieler1.getText() + " hat " + Spieler1_Total.getText() + " Punkte gemacht. \n";
        String beiZweiSpielern = nameSpieler2.getText() + " hat " + Spieler2_Total.getText() + " Punkte gemacht. \n";
        String beiDreiSpielern = nameSpieler3.getText() + " hat " + Spieler3_Total.getText() + " Punkte gemacht. \n";
        String beiVierSpielern = nameSpieler4.getText() + " hat " + Spieler4_Total.getText() + " Punkte gemacht.";

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("cbm J Kniffel");
        alert.setHeaderText("Spielergebnis:");
        if (SpielerStats.spielerCount==1){
            alert.setContentText(beiEinemSpieler);
        }
        if (SpielerStats.spielerCount==2){
            alert.setContentText(beiEinemSpieler+beiZweiSpielern);
        }
        if (SpielerStats.spielerCount==3){
            alert.setContentText(beiEinemSpieler+beiZweiSpielern+beiDreiSpielern);
        }
        if (SpielerStats.spielerCount==4){
            alert.setContentText(beiEinemSpieler+beiZweiSpielern+beiDreiSpielern+beiVierSpielern);
        }
        alert.setGraphic(null);
        alert.show();
        System.out.println("geklickt!");
    }
}
