package pack1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author dzyfhuba
 */
public class GUI extends JFrame {
    JTextField tf_email;
    Border black_outline;
    static Client c;
    JLabel l_queue;
    JLabel l_time;
    public GUI(String title) throws RemoteException, NotBoundException {
        black_outline = BorderFactory.createLineBorder(Color.black);
        c = new Client();
//        c.getTime();
        init(title);
    }
    
    void init(String title) {
        control();
        
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 100, 1280, 605);
        setLayout(null);
        setResizable(false);
        setVisible(true);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        
        
        JLabel l_title = new JLabel(title);
        l_title.setBounds(530, 5, 220, 100);
        l_title.setFont(new Font("Sans Serif", 1, 48));
        
        JPanel p_ticket = new JPanel();
        p_ticket.setBounds(10, 110, 800, 400);
        p_ticket.setBackground(Color.white);
        p_ticket.setBorder(black_outline);
        p_ticket.setLayout(null);
        
        JLabel l_tickettitle = new JLabel(title);
        l_tickettitle.setBounds(290, 0, 220, 100);
        l_tickettitle.setFont(new Font("Sans Serif", 1, 48));
        p_ticket.add(l_tickettitle);
        
        
        l_queue = new JLabel("Z999");
        l_queue.setBounds(112, 100, 574, 200);
        l_queue.setFont(new Font("Sans Serif", 1, 200));
        p_ticket.add(l_queue);
        
        
        l_time = new JLabel("17.00 - 18.00 | 19 September 2022");
        l_time.setBounds(112, 200, 574, 200);
        l_time.setFont(new Font("Sans Serif", 1, 28));
        p_ticket.add(l_time);
        
        JLabel l_msg = new JLabel("Silahkan mengantre sesuai waktu yang ditentukan");
        l_msg.setBounds(10, 350, 790, 50);
        l_msg.setFont(new Font("Sans Serif", 1, 24));
        p_ticket.add(l_msg);
        
        
        add(p_ticket);
        add(l_title);
    }
    
    void control(){
        JLabel l_email = new JLabel("Email:");
        l_email.setBounds(820, 110, 450, 100);
        l_email.setFont(new Font("Sans Serif", 1, 36));
        add(l_email);
        
        tf_email = new JTextField();
        tf_email.setBounds(820, 210, 450, 50);
        tf_email.setBorder(black_outline);
        tf_email.setFont(new Font("Sans Serif", 1, 36));
        add(tf_email);
        
        JButton b_teller = new JButton("Ambil Tiket Teller");
        b_teller.setBounds(820, 290, 450, 100);
        b_teller.setFont(new Font("Sans Serif", 1, 24));
        b_teller.setBackground(Color.red);
        b_teller.setForeground(Color.white);
        b_teller.addActionListener((ActionEvent e) -> {
//            String queue = c.getQueue();
//            l_queue.setText(queue);
        });
        add(b_teller);
        
        JButton b_sc = new JButton("Ambil Tiket Customer Service");
        b_sc.setBounds(820, 410, 450, 100);
        b_sc.setFont(new Font("Sans Serif", 1, 24));
        b_sc.setBackground(Color.blue);
        b_sc.setForeground(Color.white);
        add(b_sc);
    }
    
}
