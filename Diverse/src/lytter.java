import javax.swing.*;
import java.awt.event.*;

/**
 * Created by Martin on 02.09.2014.
 */
class Lyttedemo implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("/007");
    }
}

class lytter extends JFrame {
    lytter() {
        setTitle("Lyttedemo");
        JButton knapp = new JButton("Press me");

        knapp.addActionListener(new Lyttedemo());

        add(knapp);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new lytter();
            }
        });
    }

}
