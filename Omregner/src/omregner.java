import javax.swing.*;
import java.awt.*;

/**
 * Created by Martin on 07.09.2014.
 */
class omregner extends JFrame {
    JLabel etikett;
    JTextField tekstfelt;
    JTextArea tekst;
    JPanel tekstpanel;
    JButton knapp;

    omregner() {
        setTitle("Omregner");

        etikett = new JLabel("Skriv inn sekunder for omregning (etter 10 linjer blir info slettet): ");
        tekstfelt = new JTextField();
        tekst = new JTextArea(26, 64);                                  //Definerer variablene som vinduelementene skal inneholde
        tekstpanel = new JPanel();
        knapp = new JButton("Reset");

        etikett.setLabelFor(tekstfelt);


        tekstpanel.setLayout(new GridLayout(3, 1));                     //Designerer hvordan elementene skal vise i panelet
        tekstpanel.add(etikett);                                        //Legger til elementer i panelet
        tekstpanel.add(tekstfelt);
        tekstpanel.add(knapp, BorderLayout.EAST);

        add(tekst, BorderLayout.SOUTH);                                 //Legger til et tekstvindu i hovedvinduet


        add(tekstpanel);                                                //Legger til panelet i hovedvinduet

        knapp.addActionListener(new knapplytter(tekstfelt, tekst));     //bruker addActionListener fra knapplytter-klassen
        tekstfelt.addKeyListener(new lytter(tekstfelt, tekst));         //bruker addKeyListener fra lytter-klassen

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }


}
