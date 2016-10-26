package Escape;
import java.awt.*;
import javax.swing.JFrame;

public class Escape extends JFrame {

    public Escape() {

        initUI();
    }

    private void initUI() {
        // Getting resolution of screen
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int width = gd.getDisplayMode().getWidth();
        int height = gd.getDisplayMode().getHeight();

        // Creating and configuring window
        add(new Board());
        setSize(width, height);
        setTitle("Escape");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Escape ex = new Escape();
                ex.setVisible(true);
            }
        });
    }
}