package SnakesLadders4;

/**
 * Created by Martin on 24.04.2015.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main extends JFrame{


    public main(){
        JPanel jp = new JPanel();
        JButton jb = new JButton();
        JTextField jtf= new JTextField(5);



        jb.addActionListener(new board());

        jb.setIcon(new ImageIcon("Rolling Button.png"));
        jb.setBackground(Color.black);


        jp.add(jb);
        jp.add(jtf);
        jp.add(new board());


        add(jp);
        setContentPane(jp);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();

        getContentPane().setBackground(Color.black);

        //setSize(400,300);
        setLocationRelativeTo(null);
        setTitle("Snakes and Ladders");
        //setResizable(false);
        setVisible(true);

    }


    public static void main(String [] args){
        new main();
    }
}
