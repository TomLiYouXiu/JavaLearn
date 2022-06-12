package com.Struct;

import java.util.Scanner;

public class IfDemo02 {
    public static void main(String[] args) {
        //考试分数大于60及格，小于60不及格
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你的分数");
        float score=scanner.nextFloat();
        //score:分数
        if(score>=60) {
            System.out.println("及格");
        }
        else {
            System.out.println("不及格");
        }
        scanner.close();
    }
}
