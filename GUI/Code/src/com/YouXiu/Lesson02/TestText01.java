package com.YouXiu.Lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestText01 {
    public static void main(String[] args) {
        //启动
        new myFrame();
    }
}


class myFrame extends Frame {
    public myFrame(){
        TextField textField = new TextField();
        add(textField);
        //监听这个文本框输入的文字
        myActionListener myActionListener = new myActionListener();
        //按下enter，就会触发这个输入框的事件
        textField.addActionListener(myActionListener);
        //设置编码 显示为*****
        textField.setEchoChar('*');

        setVisible(true);
        pack();
    }
}


class myActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        TextField field=(TextField)e.getSource();//获得资源,返回的对象
        System.out.println(field.getText());//获得输入框文本
        field.setText("");//回车完之后为空

    }
}