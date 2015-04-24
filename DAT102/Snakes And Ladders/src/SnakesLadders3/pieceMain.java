package SnakesLadders3;

/**
 * Created by Martin on 24.04.2015.
 */

import javax.swing.JFrame;

public class pieceMain extends JFrame {

    public pieceMain(){


        add(new board());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);
        setLocationRelativeTo(null);
        setTitle("Snakes and Ladders");
        setResizable(false);
        setVisible(true);

    }

    public static void main(String [] args){
        new pieceMain();
    }
}
