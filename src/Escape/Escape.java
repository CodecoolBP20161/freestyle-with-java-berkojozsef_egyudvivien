package Escape;


import java.awt.EventQueue;
import javax.swing.JFrame;

public class Escape extends JFrame {

    public Escape() {

        initUI();
    }

    private void initUI() {

        add(new Board());
        setSize(800, 600);
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