package SnakesLadders1; /**
 * Created by Martin on 24.04.2015.
 */
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;

import javax.swing.*;

public class board extends JPanel{

    private Image snakes;

    public board(){
        initBoard();
    }

    private void initBoard(){

        loadImage();

        int h = snakes.getHeight(this);
        int w = snakes.getWidth(this);
        setPreferredSize(new Dimension(w,h));

    }

    private void loadImage(){
        ImageIcon ii = new ImageIcon("Snakes and ladders.png");
        snakes = ii.getImage();
    }

    @Override
    public void paintComponent(Graphics g){
        g.drawImage(snakes,0,0,null);
    }
}

