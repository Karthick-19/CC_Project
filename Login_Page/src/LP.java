import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;

public class LP implements ActionListener {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton button1 = new JButton("Login");
    JButton button2 = new JButton("Reset");
    JTextField Userid = new JTextField();
    JPasswordField Password = new JPasswordField();
    JLabel userid_label = new JLabel("User ID:");
    JLabel password_label = new JLabel("Password:");
    JLabel message = new JLabel();

    HashMap<String,String> login_info = new HashMap<String,String>();


    private ImageIcon ii;
    private JLabel bgl;

    LP(HashMap<String, String> login_info_ori){
        ii=new ImageIcon(this.getClass().getResource("bg10.jpg"));
        bgl = new JLabel(ii);
        bgl.setSize(0,0);

        login_info=login_info_ori;

        bgl.setSize(400,400);

        userid_label.setBounds(50,100,75,25);
        userid_label.setFont(new Font(null,Font.BOLD,15));
        userid_label.setForeground(Color.white);

        password_label.setFont(new Font(null,Font.BOLD,14));
        password_label.setBounds(50,150,75,25);
        password_label.setForeground(Color.white);


        message.setBounds(125,250,250,35);
        message.setFont(new Font(null,Font.ROMAN_BASELINE,25));

        Userid.setBounds(125,100,200,25);
        Password.setBounds(125,150,200,25);

        button1.setBounds(125,200,100,25);
        button1.addActionListener(this);
        button1.setFocusable(false);

        button2.setBounds(225,200,100,25);
        button2.addActionListener(this);
        button2.setFocusable(false);

        panel.setSize(450,450);

        panel.add(bgl);

        frame.add(Userid);
        frame.add(Password);
        frame.add(userid_label);
        frame.add(password_label);
        frame.add(message);
        frame.add(button1);
        frame.add(button2);
        frame.add(panel);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setBackground(Color.magenta);
        frame.setSize(450,450);
        frame.setVisible(true);
        frame.setTitle("Login Page");
        frame.setLayout(null);

    }

    @Override//Implement Method
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==button2){
        Userid.setText("");
        Password.setText("");
    }
    if (e.getSource()==button1){
        String userID = Userid.getText();
        String password = String.valueOf(Password.getPassword());

        if (login_info.containsKey(userID)){
        if (login_info.get(userID).equals(password)){
            message.setForeground(Color.green);
            message.setText("Login Success");
            converter con = new converter();
        }
        else{
            message.setForeground(Color.RED);
            message.setText("Incorrect Password");
        }
    }
        else {
            message.setForeground(Color.RED);
            message.setText("UserName not found");
        }
    }
}}
