package com.YouXiu.Lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionEvent {
    public static void main(String[] args) {
        //按下按钮，触发事件
        Frame frame = new Frame();
        Button button = new Button("");
        myTestActionEvent myTestActionEvent = new myTestActionEvent();
        button.addActionListener(myTestActionEvent);
        frame.add(button,BorderLayout.CENTER);
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
//事件监听
class myTestActionEvent implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("aaaaa");
    }
}
