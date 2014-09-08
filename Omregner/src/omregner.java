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
        tekst = new JTextArea(26, 64);
        tekstpanel = new JPanel();
        knapp = new JButton("Reset");

        etikett.setLabelFor(tekstfelt);


        tekstpanel.setLayout(new GridLayout(3, 1));
        tekstpanel.add(etikett);
        tekstpanel.add(tekstfelt);
        tekstpanel.add(knapp, BorderLayout.EAST);

        add(tekst, BorderLayout.SOUTH);


        add(tekstpanel);

        knapp.addActionListener(new knapplytter(tekstfelt, tekst));
        tekstfelt.addKeyListener(new lytter(tekstfelt, tekst));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new omregner(); // Åpner vinduet som kaller inn funksjonene fra "lytter"-klassen

            }
        });


    }
}
