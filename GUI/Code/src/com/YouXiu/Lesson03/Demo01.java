package com.YouXiu.Lesson03;

import java.awt.*;

public class Demo01 {
    public static void main(String[] args) {
        myPainter myPainter = new myPainter();
        myPainter.loadFrame();
    }
}
class myPainter extends Frame {
    public void loadFrame(){
        setBounds(200,200,500,600);
        setVisible(true);

    }
    public void paint(Graphics g){
//        super.paint(g);
        //画笔需要有颜色，可以画画
        g.setColor(Color.cyan);
//        g.drawOval(100,100,100,100);
        g.fillOval(100,100,100,100);//实心的圆
        g.setColor(Color.BLUE);
        g.fillRect(200,200,100,100);
    }
}
