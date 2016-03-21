package SnakesLadders4;

/**
 * Created by Martin on 24.04.2015.
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;


public class board extends JPanel implements ActionListener{



        private Timer timer;
        private pieceMove pise;
        private Image snakes;

        Dice d = new Dice(1,6);

        public board(){
            //addKeyListener(new TAdapter());
            setFocusable(true);
            setBackground(Color.black);
            setDoubleBuffered(true);

            pise = new pieceMove();

            timer = new Timer(5, this);
            timer.start();

            initBoard();
        }

        private void initBoard() {

            loadImage();

            int h = snakes.getHeight(this);
            int w = snakes.getWidth(this);
            setPreferredSize(new Dimension(w, h));

        }

        private void loadImage() {
            ImageIcon icon = new ImageIcon("Snakes and ladders.png");
            Image image = icon.getImage();
            Image scaledImage = image.getScaledInstance(1000, 1000, Image.SCALE_DEFAULT);
            ImageIcon ii = new ImageIcon(scaledImage);
            snakes = ii.getImage();
        }

        public void paint(Graphics g){
            super.paint(g);
            Graphics2D g2d = (Graphics2D)g;

            g.drawImage(snakes, 0, 0, null);
            g2d.drawImage(pise.getImage(),pise.getX(),pise.getY(), this);

            Toolkit.getDefaultToolkit().sync();
            g.dispose();
        }


        public void actionPerformed(ActionEvent e) {
            pise.move(d.throwDice());
            repaint();
        }

        private class TAdapter extends KeyAdapter {

            public void keyReleased(KeyEvent e){
                pise.keyReleased(e);
            }

            public void keyPressed(KeyEvent e) {
                pise.keyPressed(e);
            }
        }
    }


