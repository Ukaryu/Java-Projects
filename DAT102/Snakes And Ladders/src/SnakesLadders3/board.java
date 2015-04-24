package SnakesLadders3;

/**
 * Created by Martin on 24.04.2015.
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

public class board extends JPanel implements ActionListener{

    private Timer timer;
    private piece pise;

    public board(){
        addKeyListener(new TAdapter());
        setFocusable(true);
        //setBackground(Color.black);
        setDoubleBuffered(true);

        pise = new piece();

        timer = new Timer(5, this);
        timer.start();
    }



    public void paint(Graphics g){
        super.paint(g);

        Graphics2D g2d = (Graphics2D)g;
        g2d.drawImage(pise.getImage(),pise.getX(),pise.getY(), this);

        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }

    public void actionPerformed(ActionEvent e) {
        pise.move();
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

