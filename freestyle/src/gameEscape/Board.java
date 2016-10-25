//create panel where the game takes place

package gameEscape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Board extends JPanel implements ActionListener {

    private Timer timer;
    private Player player;
    private final int DELAY = 10;

    public Board() {

        initBoard();
    }

    private void initBoard() {

        addKeyListener(new TAdapter());
        setFocusable(true);

        player = new Player();

        timer = new Timer(DELAY, this);
        timer.start();
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);

        Toolkit.getDefaultToolkit().sync();
    }

    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(player.getImage(), player.getX(), player.getY(), this);
    }


    public void actionPerformed(ActionEvent e) {

        player.move();
        repaint();
    }

    private class TAdapter extends KeyAdapter {


        public void keyReleased(KeyEvent e) {
            player.keyReleased(e);
        }


        public void keyPressed(KeyEvent e) {
            player.keyPressed(e);
        }
    }
}
