package com.Scaner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i=0;
        float f=0.0f;
        //判断输入的是否为整数
        System.out.println("请输入一个整数");
        if (scanner.hasNextInt()) {
             i = scanner.nextInt();
            System.out.println("输入的是"+i);
        }
        else {
            System.out.println("输入有误");
        }
        System.out.println("请输入小数");
        if (scanner.hasNextFloat()) {
            f = scanner.nextFloat();
            System.out.println("输入的是"+f);
        }
        else {
            System.out.println("输入有误");
        }

        scanner.close();
    }
}
