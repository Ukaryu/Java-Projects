package SnakesLadders2;

/**
 * Created by Martin on 24.04.2015.
 */

import java.awt.*;
import javax.swing.JFrame;

public class SwingTimerExample extends JFrame {

    public SwingTimerExample(){

        initUI();

    }

    private void initUI(){

        add(new board());

        setResizable(false);
        pack();

        setTitle("Piece");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String [] args){

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame ex = new SwingTimerExample();
                ex.setVisible(true);
            }
        });
    }
}
