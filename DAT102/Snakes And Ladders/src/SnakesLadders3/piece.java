package SnakesLadders3;

/**
 * Created by Martin on 24.04.2015.
 */

import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class piece {

    private String pice = "Player 1.png";

    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;

    public piece(){
        ImageIcon ii = new ImageIcon(pice);
        image = ii.getImage();
        x = 0;
        y = 245;
    }

    public void move(){
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

        if (key == KeyEvent.VK_LEFT){
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
