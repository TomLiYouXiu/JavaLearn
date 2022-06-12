package com.YouXiu.Lesson01;

import java.awt.*;

//GUI的第一个界面
public class TestFrame {
    public static void main(String[] args) {
        Frame frame = new Frame("我的第一个窗口");
        //设置可见性
        frame.setVisible(true);
        //w h默认为0
        frame.setSize(400,400);
        //设置背景
        frame.setBackground(new Color(0, 226, 255));
        //弹出的初始位置
        frame.setLocation(200,400);
        //设置大小固定
        frame.setResizable(false);

    }
}
