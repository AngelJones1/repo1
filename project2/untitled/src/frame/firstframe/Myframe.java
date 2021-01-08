package frame.firstframe;

import javax.swing.*;
import java.awt.*;


public class Myframe {
    public static void main(String[] args) {
        JFrame f1=new JFrame();
        f1.setLocation(100,50);
        f1.setSize(500,300);
        f1.setTitle("我的第一个窗口");
//        f1.setBackground(Color.BLUE);
        Container con=f1.getContentPane();
       con.setBackground(Color.blue);
//        f1.setResizable(false);
        f1.setVisible(true);
        JFrame f2=new JFrame("我的第二个窗口");
        f2.setBounds(700,50,500,300);
        con=f2.getContentPane();
        con.setBackground(Color.PINK);
        f2.setVisible(true);


    }
}
