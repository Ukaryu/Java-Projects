import javax.swing.*;
import java.awt.event.*;

/**
 * Created by Martin on 07.09.2014.
 */
class knapplytter implements ActionListener {

    JTextField tFelt;
    JTextArea tVindu;

    knapplytter(JTextField tFelt, JTextArea tVindu) {
        this.tVindu = tVindu;
        this.tFelt = tFelt;

    }

    public void actionPerformed(ActionEvent e) {
        tVindu.setText("");
        tFelt.setText("");
    }
}
