package SnakesLadders4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Martin on 24.04.2015.
 */
public class Listener implements ActionListener {

    Dice d = new Dice(1,6);
    board b = new board();


    JTextField tField;

    public Listener(JTextField tField){
        this.tField = tField;
    }

    public void actionPerformed(ActionEvent e){
        tField.setText(Integer.toString(d.throwDice()));



    }
}
