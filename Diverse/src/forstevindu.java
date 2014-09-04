import javax.swing.*;

/**
 * Created by Martin on 01.09.2014.
 */
class forstevindu extends JFrame {

    forstevindu() {
        setTitle("Awesome");
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater
                (new Runnable() {
                    public void run() {
                        new forstevindu();

                    }
                });
    }
}

