package Escape;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Board extends JPanel {

    private Image playerImage;
    protected Player player;
    protected Thread thread;

    public Board() {
        this.thread = new Thread();
        initBoard();
        thread.start();
    }

    private void initBoard() {
        setBackground(Color.green);
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int centerX = gd.getDisplayMode().getWidth() / 2;
        int centerY = gd.getDisplayMode().getHeight() / 2;
        Image playerImage = loadImage("images/player1.png");
        Player hedgeHog = new Player(centerX, centerY , playerImage);
        this.player = hedgeHog;



    }

    private Image loadImage(String path) {
        return new ImageIcon(path).getImage();
    }

    @Override
    public void paintComponent(Graphics g) {
       super.paintComponent(g);
       Character player = this.player;
        player.move();
        g.drawImage(player.image, player.getX(), player.getY(), null);

//        System.out.println("Mouse: x, y: " + MouseInfo.getPointerInfo().getLocation().x  + "," + MouseInfo.getPointerInfo().getLocation().y);
//        System.out.println("player: x, y" + (player.getCenterX()) + "," + (player.getCenterY()));
        // Comment this out if you dont want an infinite loop!
        repaint();
        Toolkit.getDefaultToolkit().sync();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}


