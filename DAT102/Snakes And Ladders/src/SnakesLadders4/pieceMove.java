package SnakesLadders4;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

/**
 * Created by Martin on 24.04.2015.
 */
public class pieceMove {
    private String pice = "Player 1.png";

    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;

    Dice d = new Dice(1,6);

    public pieceMove(){
        ImageIcon ii = new ImageIcon(pice);
        Image imag = ii.getImage();
        Image scaledImage = imag.getScaledInstance(26, 44, Image.SCALE_DEFAULT);
        ImageIcon ii2 = new ImageIcon(scaledImage);
        image = ii2.getImage();
        x = 50;
        y = 900;
    }

    public void move(int roll){
        x += dx;
        y += dy;

    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public Image getImage(){
        return image;
    }

    public void keyPressed(KeyEvent e){

        int key = e.getKeyCode();

        if (key == KeyEvent.VK){
            dx = -1;
        }

        if (key == KeyEvent.VK_RIGHT){
            dx = 1;
        }

        if (key == KeyEvent.VK_UP){
            dy = -1;
        }

        if (key == KeyEvent.VK_DOWN){
            dy = 1;
        }
    }

    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT){
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT){
            dx = 0;
        }

        if (key == KeyEvent.VK_UP){
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN){
            dy = 0;
        }
    }

}
