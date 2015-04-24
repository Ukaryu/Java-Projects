package SnakesLadders4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Martin on 24.04.2015.
 */
public class Listener implements ActionListener {

    Dice d = new Dice(1,6);

    public void actionPerformed(ActionEvent e){
        System.out.println(d.throwDice());
    }
}
