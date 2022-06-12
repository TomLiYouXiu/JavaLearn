package com.YouXiu.Lesson01;

import java.awt.*;

public class TestBorderLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("TestBorderLayout");
        Button East = new Button("East");
        Button West  = new Button("West ");
        Button North = new Button("North");
        Button South = new Button("South");
        Button Center = new Button("Center");
        frame.setSize(400,400);

        frame.add(East,BorderLayout.EAST);
        frame.add(West,BorderLayout.WEST);
        frame.add(North,BorderLayout.NORTH);
        frame.add(South,BorderLayout.SOUTH);
        frame.add(Center,BorderLayout.CENTER);


        frame.setVisible(true);
    }
}
