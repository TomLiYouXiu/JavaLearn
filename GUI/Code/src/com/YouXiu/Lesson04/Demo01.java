package com.YouXiu.Lesson04;

import javax.swing.*;
import java.awt.*;

//swing
public class Demo01 {
    //初始化
    public void init(){
        JFrame jFrame = new JFrame("这是一个JFrame窗口");
        jFrame.setBounds(100,100,100,100);
        jFrame.setVisible(true);
        //设置容器 容器里面才是真的颜色
        Container contentPane = jFrame.getContentPane();
        contentPane.setBackground(Color.cyan);
        //设置文字
        JLabel jLabel = new JLabel("李优秀");
        //设置居中
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jFrame.add(jLabel);
        //关闭事件
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        //建立一个窗口
        new Demo01().init();
    }
}
