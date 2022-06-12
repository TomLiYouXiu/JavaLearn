package com.YouXiu.Lesson01;
//Panel可以看出是一个空间，但是不能单独存在

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();
        //布局的概念
        Panel panel = new Panel();
        //设置布局
        frame.setLayout(null);
        //坐标
        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(61, 217, 20));
        //设置坐标相对于frame
        panel.setBounds(50,50,400,400);
        panel.setBackground(Color.cyan);
        frame.add(panel);
        frame.setVisible(true);

        //监听事件。监听窗口关闭
        //适配器模式
        frame.addWindowListener(new WindowAdapter() {
            @Override
            //窗口点击关闭时要做的事情
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

                }

            );
        }
}
