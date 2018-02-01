package x.ui;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    JFrame frame = new JFrame();
    JButton start = new JButton("START");
    Canvas canvas = new Canvas();
    JPanel panel = new JPanel();
     final int FRAME_SIZE = 500;
     final int START_LOCATION = 200;



    public MyWindow(){

        setTitle("Emuliator");
        setBounds(START_LOCATION,START_LOCATION,FRAME_SIZE,FRAME_SIZE);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        canvas.setBackground(Color.LIGHT_GRAY);
        add(BorderLayout.CENTER,canvas);
        setVisible(true);


    }
}
