package com.YouXiu.Lesson03;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//窗口监听事件
public class TestWindows {
    public static void main(String[] args) {
        new WindowFrame();
    }
}
class WindowFrame extends Frame {
    public WindowFrame(){
        setBackground(Color.cyan);
        setBounds(100,100,100,100);
        setVisible(true);
        addWindowListener(new MyWindowListener());
//        this.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                System.out.println("你点击了关闭按钮");
//            }
//        });
    }
    //内部类
    class MyWindowListener extends WindowAdapter {
//        @Override
//        public void windowClosing(WindowEvent e) {
//            setVisible(false);
//            System.exit(0);//正常退出
//        }


        @Override
        public void windowOpened(WindowEvent e) {
            System.out.println("windowOpened");
        }

        @Override
        public void windowClosed(WindowEvent e) {
            System.out.println("windowClosed");
        }

        @Override
        public void windowActivated(WindowEvent e) {
            System.out.println("windowActivated");
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            System.out.println("windowDeactivated");
        }

        @Override
        public void windowStateChanged(WindowEvent e) {
            System.out.println("windowDeactivated");
        }

    }
}
