package com.YouXiu.practice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//简易计算器
public class TestCalc {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.loadFrame();
    }

}
//计算器类
class Calculator extends Frame {
    TextField num1,num2,num3;
    public void loadFrame() {
        //三个文本框
         num1 = new TextField(10);//字符数10个
         num2 = new TextField(10);
         num3 = new TextField(20);
        //1个按钮
        Button button=new Button("=");
        MyCalculatorTestActionEvent myCalculatorTestActionEvent = new MyCalculatorTestActionEvent(this);
        button.addActionListener(myCalculatorTestActionEvent);
        //1个标签
        Label label = new Label("+");
        //布局
        setLayout(new FlowLayout());//流失布局
        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);
        pack();
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            //窗口点击关闭时要做的事情
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

//监听器类
class MyCalculatorTestActionEvent implements ActionListener {
//    private TextField num1,num2,num3;
//    public MyCalculatorTestActionEvent(TextField num1, TextField num2, TextField num3) {
    Calculator calculator=null;
    public MyCalculatorTestActionEvent(Calculator calculator) {
        this.calculator=calculator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //获取三个变量
        //1.获得加数被加数
//        int i1 = Integer.parseInt(num1.getText());
//        int i2 = Integer.parseInt(num2.getText());
        int i1=Integer.parseInt(calculator.num1.getText());
        int i2=Integer.parseInt(calculator.num1.getText());
        //2.加法运算之后放到第三个框
        calculator.num3.setText(""+(i1+i2));
        //清除前两个框
        calculator.num2.setText("");
        calculator.num1.setText("");
    }
}