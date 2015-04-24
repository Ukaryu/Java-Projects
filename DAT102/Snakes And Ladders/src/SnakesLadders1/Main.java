package SnakesLadders1;

/**
 * Created by Martin on 24.04.2015.
 */

import javax.swing.*;

public class Main extends JFrame{

    public Main(){
        initUI();
    }

    private void initUI(){
        add(new board());

        pack();

        setTitle("Snakes and Ladders");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String [] args){
    Main m = new Main();
  }

}
