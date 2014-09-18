import javax.swing.*;
import java.awt.event.*;

/**
 * Created by Martin on 07.09.2014.
 */
class lytter extends KeyAdapter {               //I denne klassen så blir informasjon oppgitt av bruker utregnet
    int år;
    int måneder;
    int uker;
    int dager;
    int timer;
    int minutter;
    int sekunderr;
    int sek;

    JTextField tFelt;
    JTextArea tVindu;
    int i = 0;

    lytter(JTextField tFelt, JTextArea tVindu) {
        this.tVindu = tVindu;
        this.tFelt = tFelt;

    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER){
            String t = tFelt.getText();

            if (i == 10) {
                tVindu.setText(""); //Fjerner innholdet i tekstvinduet etter at 10 linjer har blitt skrevet ut
                i = 0;
            }
            i++;

            int sekund = Integer.parseInt(t);  //Konverterer string variabelen til en int variabel
            sek = sekund;


            år = (sekund / 31536000);
            måneder =((sekund % 31536000) / 2628000);  // For å sjekke om koden fungerer bruk 34772461 som referanseverdi, skal oppgi 1 av alt
            uker = (((sekund % 31536000 ) % 2628000 ) / 604800);
            dager = ((((sekund % 31536000 ) % 2628000 ) % 604800) / 84600);
            timer = (((((sekund % 31536000 ) % 2628000 ) % 604800) % 84600) / 3600);
            minutter = (((((sekund % 31536000 ) % 2628000) % 604800 ) % 3600) / 60);
            sekunderr = (((((sekund % 31536000 ) % 2628000) % 604800 ) % 3600) % 60);

            if (sekund != 0) {
                tVindu.append("Omregningen gir at " + sekund + " sekunder er " + år + " år, " + måneder + " måneder, " + uker + " uker, "
                        + dager + " dager, " + timer + " timer, " + minutter + " minutter" + " og " + sekunderr + " sekunder.");

                tVindu.append(System.getProperty("line.separator"));
                tVindu.append(System.getProperty("line.separator"));
            } else {
                tVindu.append("Sekundene du har oppgitt har nullverdi.");
                tVindu.append(System.getProperty("line.separator"));
                tVindu.append(System.getProperty("line.separator"));
                tVindu.append("Avslutter...");
            }

            tFelt.setText("");
        } //get key
    } // public void
}
