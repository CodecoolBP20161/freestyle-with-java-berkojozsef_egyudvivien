package Escape;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Board extends JPanel {

    private Image playerImage;

    public Board() {

        initBoard();
    }

    private void initBoard() {

        loadImage();

        int w = playerImage.getWidth(this);
        int h =  playerImage.getHeight(this);
        setPreferredSize(new Dimension(w, h));
    }

    private void loadImage() {

        ImageIcon ii = new ImageIcon("images/player1.png");
        playerImage = ii.getImage();

    }

    @Override
    public void paintComponent(Graphics g) {

        g.drawImage(playerImage, 30, 30, null);
        System.out.println("(" + MouseInfo.getPointerInfo().getLocation().x +
                ", " +
                MouseInfo.getPointerInfo().getLocation().y + ")");
        // Comment this out if you dont want an infinite loop!
        repaint();
    }
}


