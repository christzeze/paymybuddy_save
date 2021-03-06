package com.openclassroooms.paymybuddy.view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.io.File;


public class ConnectionView {
    public static void main(String[] args) {

        Border blackline = BorderFactory.createLineBorder(Color.black);

        JPanel panelTop=new JPanel();
        panelTop.setBackground(Color.BLACK);
        panelTop.setBounds(0,0,750,30);

        JLabel firstLabel =new JLabel();
        firstLabel.setText("Pay My Buddy");
        firstLabel.setForeground(Color.WHITE);

        JPanel middlePanel=new JPanel();
        middlePanel.setBackground(Color.WHITE);
        middlePanel.setBorder(blackline);
        middlePanel.setBounds(150,100,400,300);

        JLabel image1=new JLabel("exemple");
        File file = new File("resources/rolleyes.png");
        String absolutePath = file.getAbsolutePath();
        ImageIcon myImage=new ImageIcon("rolleyes.png");
        image1.setIcon(myImage);


        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setBackground(Color.WHITE);
        frame.setSize(750,750);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(panelTop);
        panelTop.add(firstLabel);
        frame.add(middlePanel);
        middlePanel.add(image1);
        frame.validate();
    }
}
