package com.openclassroooms.paymybuddy.view;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class test {
    private JPanel panel1;

    public static void main(String[] args) {
        JLabel image1=new JLabel("exemple");
        File file = new File("resources/rolleyes.png");
        String absolutePath = file.getAbsolutePath();
        ImageIcon myImage=new ImageIcon("rolleyes.png");
        image1.setIcon(myImage);

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLayout(null);
        frame.setBackground(Color.WHITE);
        frame.setSize(750,750);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(image1);
    }
}
