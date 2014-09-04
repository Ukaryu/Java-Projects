import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Martin on 02.09.2014.
 */
class TFeltlytter extends KeyAdapter{
    JTextField tFelt;
    JTextArea tVindu;
    TFeltlytter(JTextField tFelt, JTextArea tVindu) {
        this.tFelt = tFelt;
        this.tVindu = tVindu;
    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            tVindu.append(tFelt.getText());
            tFelt.setText("");
        }
    }
}
class TekstLytterDemo extends JFrame {
    TekstLytterDemo () {
        setTitle("Awesome");

        JLabel etikett = new JLabel("Skriv inn navn");
        JTextField tekstfelt = new JTextField(30);
        etikett.setLabelFor(tekstfelt);
        JTextArea tekstvindu = new JTextArea(10,30);
        JScrollPane rullevindu = new JScrollPane(tekstvindu);

        JPanel tekstpanel = new JPanel();
        tekstpanel.setLayout(new GridLayout(2, 1));
        tekstpanel.add(etikett);
        tekstpanel.add(tekstfelt);

        tekstfelt.addKeyListener (new TFeltlytter(tekstfelt, tekstvindu));

        add(tekstpanel, BorderLayout.NORTH);
        add(tekstfelt, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TekstLytterDemo();
            }
        });
    }



}
