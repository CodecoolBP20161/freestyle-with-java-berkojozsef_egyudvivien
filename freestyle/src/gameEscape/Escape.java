//This is the entry point of the game. Here we have the main method.

package gameEscape;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Escape extends JFrame{

    public Escape() {
        initUI();
    }

    private void initUI() {

//        Here we put the Board to the center of the JFrame container.
        add(new Board());

//        This line sets the size of the window.
        setSize(800, 500);
        setResizable(false);

        setTitle("Escape");
//        This will close the application when we click on the close button. It is not the default behaviour.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        Passing null to the setLocationRelativeTo() method centers the window on the screen.
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            public void run() {
                Escape ex = new Escape();
                ex.setVisible(true);
            }
        });
    }
}