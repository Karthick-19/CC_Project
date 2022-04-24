import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class converter implements ActionListener {
    JTextField tf1=new JTextField(null);
    Double ip, op;

    JFrame frame = new JFrame("Converter");
    JPanel panel = new JPanel();
    JLabel label1 = new JLabel("Enter Value");
    JLabel label2 = new JLabel("From");
    JLabel label3 = new JLabel("To");
    String[] Currency1 = {"INR","USD","GBP","EURO","SAR","BTC"};
    JComboBox fromBox = new JComboBox(Currency1);
    String[] Currency2 = {"USD", "INR", "GBP", "EURO", "SAR","BTC"};
    JComboBox ToBox = new JComboBox(Currency2);
    JTextField rcurrency = new JTextField("");
    JButton convert = new JButton("Convert");
    JButton reset=new JButton("Reset");
    JLabel cv = new JLabel("Converted");

    private ImageIcon ii;
    private JLabel bgl;

    converter(){

        ii=new ImageIcon(this.getClass().getResource("/bg-img.jpeg"));
        bgl = new JLabel(ii);
        bgl.setSize(0,0);

        panel.setBounds(0,0,600,600);
        label1.setBounds(93,82,100,100);
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("Serif",Font.BOLD,15));
        label2.setFont(new Font("Serif",Font.BOLD,15));
        label2.setBounds(120,150,100,100);
        label2.setForeground(Color.BLACK);
        label3.setBounds(310,150,100,100);
        label3.setFont(new Font("Serif",Font.BOLD,15));
        label3.setForeground(Color.BLACK);
        tf1.setBounds(195,120,220,30);
        tf1.addActionListener(this);
        fromBox.setBounds(170,190,100,25);
        fromBox.setForeground(Color.green);
        fromBox.setBackground(Color.white);
        fromBox.addActionListener(this);
        ToBox.setBounds(340,190,100,25);
        ToBox.setForeground(Color.red);
        ToBox.setBackground(Color.white);
        ToBox.addActionListener(this);
        rcurrency.setBounds(210,390,180,30);
        convert.setBounds(250,330,80,30);
        convert.setBackground(Color.DARK_GRAY);
        convert.setForeground(Color.white);
        convert.setFocusable(false);
        convert.addActionListener(this);
        reset.setBounds(400,390,80,30);
        reset.setBackground(Color.gray);
        reset.setForeground(Color.black);
        reset.setFocusable(false);
        reset.addActionListener(this);
        cv.setBounds(120,389,180,30);
        cv.setFont(new Font("Serif",Font.BOLD,15));
        cv.setForeground(Color.BLACK);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(224,194,194));
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setTitle("Currency Converter");

        panel.add(bgl);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(tf1);
        frame.add(fromBox);
        frame.add(ToBox);
        frame.add(rcurrency);
        frame.add(convert);
        frame.add(panel);
        frame.add(reset);
        frame.add(cv);
        frame.add(panel);
    }

    public static void main(String[] args) {
        converter con =  new converter();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ip = Double.parseDouble(tf1.getText());
        if (e.getSource() == reset) {
            rcurrency.setText("");
            tf1.setText("");
        }
        if (e.getSource() == convert) {
            if (fromBox.getSelectedItem().toString() == "INR")
                if (ToBox.getSelectedItem().toString() == "BTC")
                    op = ip / 304489.99;
            rcurrency.setText(String.valueOf(op));
        }
        if (e.getSource() == convert) {
            if (fromBox.getSelectedItem().toString() == "BTC")
                if (ToBox.getSelectedItem().toString() == "INR")
                    op = ip*304489.99;
            rcurrency.setText(String.valueOf(op));
        }
        if (e.getSource() == convert) {
            if (fromBox.getSelectedItem().toString() == "INR")
                if (ToBox.getSelectedItem().toString() == "USD")
                    op = ip/76.48;
            rcurrency.setText(String.valueOf(op));
        }
        if (e.getSource() == convert) {
            if (fromBox.getSelectedItem().toString() == "BTC")
                if (ToBox.getSelectedItem().toString() == "USD")
                    op = ip*39768.10;
            rcurrency.setText(String.valueOf(op));
        }
        if (e.getSource() == convert) {
            if (fromBox.getSelectedItem().toString() == "USD")
                if (ToBox.getSelectedItem().toString() == "BTC")
                    op = ip/39768.10;
            rcurrency.setText(String.valueOf(op));
        }
        if(e.getSource()==convert){
            if(fromBox.getSelectedItem().toString()=="BTC")
                if(ToBox.getSelectedItem().toString()=="EURO")
                    op=ip*36832.52;
            rcurrency.setText(String.valueOf(op));
        }
        if(e.getSource()==convert){
            if(fromBox.getSelectedItem().toString()=="BTC")
                if(ToBox.getSelectedItem().toString()=="EURO")
                    op=ip*36832.52;
            rcurrency.setText(String.valueOf(op));
        }
        if(e.getSource()==convert){
            if(fromBox.getSelectedItem().toString()=="EURO")
                if(ToBox.getSelectedItem().toString()=="BTC")
                    op=ip/36832.52;
            rcurrency.setText(String.valueOf(op));
        }
        if(e.getSource()==convert){
            if(fromBox.getSelectedItem().toString()=="BTC")
                if(ToBox.getSelectedItem().toString()=="SAR")
                    op=ip*149205.33;
            rcurrency.setText(String.valueOf(op));
        }
        if(e.getSource()==convert){
            if(fromBox.getSelectedItem().toString()=="SAR")
                if(ToBox.getSelectedItem().toString()=="BTC")
                    op=ip/149205.33;
            rcurrency.setText(String.valueOf(op));
        }
        if(e.getSource()==convert){
            if(fromBox.getSelectedItem().toString()=="BTC")
                if(ToBox.getSelectedItem().toString()=="BTC")
                    op=ip;
            rcurrency.setText(String.valueOf(op));
        }
        if (e.getSource() == convert) {
            if (fromBox.getSelectedItem().toString() == "USD")
                if (ToBox.getSelectedItem().toString() == "INR")
                    op = ip*76.48;
            rcurrency.setText(String.valueOf(op));
        }
        if (e.getSource() == convert) {
            if (fromBox.getSelectedItem().toString() == "INR")
                if (ToBox.getSelectedItem().toString() == "EURO")
                    op = ip/82.74;
            rcurrency.setText(String.valueOf(op));
        }
        if (e.getSource() == convert) {
            if (fromBox.getSelectedItem().toString() == "EURO")
                if (ToBox.getSelectedItem().toString() == "INR")
                    op = ip*82.74;
            rcurrency.setText(String.valueOf(op));
        }
        if (e.getSource() == convert) {
            if (fromBox.getSelectedItem().toString() == "INR")
                if (ToBox.getSelectedItem().toString() == "SAR")
                    op = ip/20.39;
            rcurrency.setText(String.valueOf(op));
        }
        if (e.getSource() == convert) {
            if (fromBox.getSelectedItem().toString() == "SAR")
                if (ToBox.getSelectedItem().toString() == "INR")
                    op = ip*20.39;
            rcurrency.setText(String.valueOf(op));
        }
        if (e.getSource() == convert) {
            if (fromBox.getSelectedItem().toString() == "INR")
                if (ToBox.getSelectedItem().toString() == "INR")
                    op = ip;
            rcurrency.setText(String.valueOf(op));
        }
        if (e.getSource() == convert) {
            if (fromBox.getSelectedItem().toString() == "USD")
                if (ToBox.getSelectedItem().toString() == "EURO")
                    op = ip*0.93;
            rcurrency.setText(String.valueOf(op));
        }
        if (e.getSource() == convert) {
            if (fromBox.getSelectedItem().toString() == "EURO")
                if (ToBox.getSelectedItem().toString() == "USD")
                    op = ip*1.08;
            rcurrency.setText(String.valueOf(op));
        }
        if (e.getSource() == convert) {
            if (fromBox.getSelectedItem().toString() == "USD")
                if (ToBox.getSelectedItem().toString() == "SAR")
                    op = ip*3.75;
            rcurrency.setText(String.valueOf(op));
        }  if (e.getSource() == convert) {
            if (fromBox.getSelectedItem().toString() == "SAR")
                if (ToBox.getSelectedItem().toString() == "USD")
                    op = ip*0.27;
            rcurrency.setText(String.valueOf(op));
        }
        if (e.getSource() == convert) {
            if (fromBox.getSelectedItem().toString() == "USD")
                if (ToBox.getSelectedItem().toString() == "INR")
                    op = ip*76.48;
            rcurrency.setText(String.valueOf(op));
            if (e.getSource() == convert) {
                if (fromBox.getSelectedItem().toString() == "USD")
                    if (ToBox.getSelectedItem().toString() == "USD")
                        op = ip;
                rcurrency.setText(String.valueOf(op));
            }
        }  if (e.getSource() == convert) {
            if (fromBox.getSelectedItem().toString() == "EURO")
                if (ToBox.getSelectedItem().toString() == "SAR")
                    op = ip*4.06;
            rcurrency.setText(String.valueOf(op));
        }
        if (e.getSource() == convert) {
            if (fromBox.getSelectedItem().toString() == "EURO")
                if (ToBox.getSelectedItem().toString() == "EURO")
                    op = ip;
            rcurrency.setText(String.valueOf(op));
        }
        if (e.getSource() == convert) {
            if (fromBox.getSelectedItem().toString() == "SAR")
                if (ToBox.getSelectedItem().toString() == "EURO")
                    op = ip*0.25;
            rcurrency.setText(String.valueOf(op));
        }
        if (e.getSource() == convert) {
            if (fromBox.getSelectedItem().toString() == "SAR")
                if (ToBox.getSelectedItem().toString() == "SAR")
                    op = ip*76.48;
            rcurrency.setText(String.valueOf(op));
        }
        if(e.getSource()==convert){
            if(fromBox.getSelectedItem().toString()=="GBP")
                if(ToBox.getSelectedItem().toString()=="INR")
                    op=ip*98.19;
            rcurrency.setText(String.valueOf(op));
        }
        if(e.getSource()==convert){
            if(fromBox.getSelectedItem().toString()=="INR")
                if(ToBox.getSelectedItem().toString()=="GBP")
                    op=ip/98.19;
            rcurrency.setText(String.valueOf(op));
        }
        if(e.getSource()==convert){
            if(fromBox.getSelectedItem().toString()=="GBP")
                if(ToBox.getSelectedItem().toString()=="USD")
                    op=ip*1.28;
            rcurrency.setText(String.valueOf(op));
        }
        if(e.getSource()==convert){
            if(fromBox.getSelectedItem().toString()=="USD")
                if(ToBox.getSelectedItem().toString()=="GBP")
                    op=ip/1.28;
            rcurrency.setText(String.valueOf(op));
        }
        if(e.getSource()==convert){
            if(fromBox.getSelectedItem().toString()=="GBP")
                if(ToBox.getSelectedItem().toString()=="EURO")
                    op=ip*1.19;
            rcurrency.setText(String.valueOf(op));
        }
        if(e.getSource()==convert){
            if(fromBox.getSelectedItem().toString()=="EURO")
                if(ToBox.getSelectedItem().toString()=="GBP")
                    op=ip/1.19;
            rcurrency.setText(String.valueOf(op));
        }
        if(e.getSource()==convert){
            if(fromBox.getSelectedItem().toString()=="GBP")
                if(ToBox.getSelectedItem().toString()=="SAR")
                    op=ip*4.28;
            rcurrency.setText(String.valueOf(op));
        }
        if(e.getSource()==convert){
            if(fromBox.getSelectedItem().toString()=="GBP")
                if(ToBox.getSelectedItem().toString()=="SAR")
                    op=ip*4.28;
            rcurrency.setText(String.valueOf(op));
        }
        if(e.getSource()==convert){
            if(fromBox.getSelectedItem().toString()=="GBP")
                if(ToBox.getSelectedItem().toString()=="BTC")
                    op=ip/30993.42;
            rcurrency.setText(String.valueOf(op));
        }
        if(e.getSource()==convert){
            if(fromBox.getSelectedItem().toString()=="BTC")
                if(ToBox.getSelectedItem().toString()=="GBP")
                    op=ip*30993.42;
            rcurrency.setText(String.valueOf(op));
        }
    }}