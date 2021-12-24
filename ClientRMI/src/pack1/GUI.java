package pack1;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author dzyfhuba
 */
public class GUI {

    JFrame f;
    JTextField[] tf;

    public GUI() {
        f = new JFrame("E-Ticket A");
        init();
    }

    void init() {
        tf = new JTextField[100];
        for (int i = 0; i < tf.length; i++) {
            tf[i] = new JTextField();
            f.add(tf[i]);
        }
        f.setVisible(true);
        f.setSize(500, 500);
        f.setLayout(new GridLayout(10, 10));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
