import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Martin on 02.09.2014.
 */
public class omrev extends JFrame implements ActionListener {
    JButton dialogknapp;
    JTextArea tekstvindu;

    omrev (){
        setTitle("Omregner");

        dialogknapp = new JButton("Vis Dialog");
        dialogknapp.addActionListener(this);
        tekstvindu = new JTextArea(5, 15);
        JScrollPane rullevindu = new JScrollPane(tekstvindu);

        add(dialogknapp, BorderLayout.NORTH);
        add(rullevindu, BorderLayout.CENTER);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed (ActionEvent e) {
        String [] valg = {"Ja", "Nei", "Glem det" };

        int svar = JOptionPane.showOptionDialog(this,
                "Ønsker du å svare?",
                "Et umulig spørsmål",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                valg,
                valg[0]);

        String respons;

        switch (svar){
            case JOptionPane.YES_OPTION:
                respons = valg[0];
                break;
            case JOptionPane.NO_OPTION:
                respons = valg[1];
                break;
            default:
                respons = valg[2];
                break;
        }

        tekstvindu.append("Du svarte " + respons + "\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new omrev();
            }
        });
    }
}
