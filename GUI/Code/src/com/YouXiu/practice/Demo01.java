package com.YouXiu.practice;

import java.awt.*;
//容器思想
public class Demo01 {
    public static void main(String[] args) {
        Frame frame = new Frame("练习1");
        //按钮
        Button button1 = new Button("button");
        Button button2 = new Button("button");
        Button button3 = new Button("button");
        Button button4 = new Button("button");
        Button button5 = new Button("button");
        Button button6 = new Button("button");
        Button button7 = new Button("button");
        Button button8 = new Button("button");
        Button button9 = new Button("button");
        Button button10 = new Button("button");
        //四个面板
        Panel panel1 = new Panel(new BorderLayout());
        Panel panel2 = new Panel(new GridLayout(2,1));
        Panel panel3 = new Panel(new BorderLayout());
        Panel panel4 = new Panel(new GridLayout(2,2));

        //
        frame.setLayout(new GridLayout(2,1));
        //上
        panel1.add(button1,BorderLayout.WEST);
        panel1.add(button2,BorderLayout.EAST);
        panel2.add(button3);
        panel2.add(button4);
        panel1.add(panel2);
        frame.add(panel1);
        //下
        panel3.add(button5,BorderLayout.WEST);
        panel3.add(button6,BorderLayout.EAST);
        panel4.add(button7);
        panel4.add(button8);
        panel4.add(button9);
        panel4.add(button10);
        panel3.add(panel4);
        frame.add(panel3);



        //窗口的设置
        frame.setSize(400,400);
        frame.setBackground(Color.cyan);
        frame.setLocation(600,600);
        frame.setVisible(true);



    }
}
