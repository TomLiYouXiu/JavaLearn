package com.YouXiu.Lesson01;

import java.awt.*;
//展示多个窗口
public class TestFrame2 {
    public static void main(String[] args) {
        MyFrame myFrame1 = new MyFrame(100, 100, 200, 200, Color.cyan);
        MyFrame myFrame2 = new MyFrame(300, 100, 200, 200, Color.red);
        MyFrame myFrame3 = new MyFrame(500, 100, 200, 200, Color.GREEN);
        MyFrame myFrame4 = new MyFrame(700, 100, 200, 200, Color.orange);

    }
}
class MyFrame extends Frame {
    static int ID=0;//可能存在多个窗口需要计数器
    public MyFrame(int x,int y,int w,int h,Color c){
        super("MyFrame"+(++ID));
        //设置可见性
        setVisible(true);
        //设置背景
        setBackground(c);
        setBounds(x,y,w,h);
    }
}