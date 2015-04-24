package SnakesLadders2;

/**
 * Created by Martin on 24.04.2015.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class board extends JPanel implements ActionListener{
    private final int B_WIDTH = 350;
    private final int B_HEIGHT = 350;
    private final int INITIAL_X = -40;
    private final int INITIAL_Y = -40;
    private final int DELAY = 2;

    private Image piece;
    private Timer timer;
    private int x,y;

    public board(){

        initBoard();

    }

    private void loadImage(){

        ImageIcon ii = new ImageIcon("Player 1.png");
        piece = ii.getImage();

    }

    private void initBoard(){
        setBackground(Color.black);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        setDoubleBuffered(true);

        loadImage();

        x = INITIAL_X;
        y = INITIAL_Y;

        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        drawPiece(g);
    }

    private void drawPiece(Graphics g){
        g.drawImage(piece,x , y, this);
        Toolkit.getDefaultToolkit().sync();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        x += 1;
        y += 1;

        if (y > B_HEIGHT) {

            y = INITIAL_Y;
            x = INITIAL_X;
        }

        repaint();
    }
}
