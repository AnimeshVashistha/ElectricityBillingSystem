package Electricity;

import java.awt.*;
import java.awt.event.*;
import jsvsx.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{

    JLabel l1,l2,l3;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1,b2;
    JPanel p1,p2,p3,p4,p5;

    Login(){
        super("Login Page");
        l1 = new JLabel("Username");
        l2 = new JLabel("Password");
        tf1 = new JTextField(15);
        pf2 = new JPasswordField(15);

        ImageIcon ic1 = new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image i1 = ic1.getImage().getScaledInstance(16 , 16, Image.SCALE_DEFUALT);
        b1 = new JButton("Login", new ImageIcon(i1));

        ImageIcon ic2 = new ImageIcon(ClassLoader.getSystemResource("icon/cancel.png"));
        Image i2 = ic2.getImage().getScaledInstance(16 , 16, Image.SCALE_DEFUALT);
        b2 = new JButton("Cancel", new ImageIcon(i2));

        b1.addActionListener(this);
        b2.addActionListener(this);

        ImageIcon ic3 = new ImageIcon(ClassLoader.getSystemResource("icon/pop.png"));
        Image i3 = ic3.getImage().getScaledInstance(120 , 120, Image.SCALE_DEFUALT);
        ImageIcon ic3 = new ImageIcon(i3);
        l3= new JLabel(icc3);

        setLayout(new BorderLayout());






    }
}