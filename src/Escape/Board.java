package Escape;

import java.awt.*;
import java.awt.geom.AffineTransform;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
class Board extends JPanel {
    private int centerX;
    private int centerY;
    private Player player;
    private Thread thread;

    public Board() {

        this.thread = new Thread();
        initBoard();
        thread.start();
    }

    private void initBoard() {
        // Create and configure Board, and the characters on it
        setBackground(Color.green);
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        this.centerX = gd.getDisplayMode().getWidth() / 2;
        this.centerY = gd.getDisplayMode().getHeight() / 2;
        Image playerImage = loadImage("images/player1.png");
        this.player= new Player(this.centerX, this.centerY , playerImage);

    }

    private Image loadImage(String path) {
        return new ImageIcon(path).getImage();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Character player = this.player;
        player.move();

        // Rotation towards mouse
        Graphics2D gr = (Graphics2D)g;
        int mouseX  = MouseInfo.getPointerInfo().getLocation().x;
        int mouseY = MouseInfo.getPointerInfo().getLocation().y;

        double angle = Math.atan2(player.getCenterY() - mouseY, player.getCenterX() - mouseX) - (Math.PI / 2);
        gr.translate(player.getCenterX(), player.getCenterY());
        gr.rotate(angle);
        gr.translate(-player.getCenterX(), -player.getCenterY());
        g.drawImage(player.image, player.getX(), player.getY(), null);
        //-------------------------------------------------------------------------------------------------
        repaint();
        Toolkit.getDefaultToolkit().sync();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


