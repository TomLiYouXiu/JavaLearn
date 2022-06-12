package com.YouXiu.Lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionEvent2 {
    public static void main(String[] args) {
        //按下按钮，触发事件
        Frame frame = new Frame("开始-停止");
        Button button1 = new Button("start");
        Button button2 = new Button("stop");

        myTestActionEvent1 myTestActionEvent1 = new myTestActionEvent1();

        button1.setActionCommand("start");
        button2.setActionCommand("stop");

        button1.addActionListener(myTestActionEvent1);
        button2.addActionListener(myTestActionEvent1);

        frame.add(button1,BorderLayout.EAST);
        frame.add(button2,BorderLayout.WEST);
        frame.pack();
        frame.setSize(400,400);
        frame.setVisible(true);
        WindowsClose(frame);


    }
    //关闭窗口的事件
    public static void WindowsClose( Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
class myTestActionEvent1 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        //e.getActionCommand()
        System.out.println("按钮被点击了"+e.getActionCommand());
        if(e.getActionCommand().equals("start")){
            System.out.println("您按的是开始");
        }
        if(e.getActionCommand().equals("stop")){
            System.out.println("您按的是结束");
        }
    }
}

