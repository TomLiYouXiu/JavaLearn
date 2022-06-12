package com.Scaner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用nextLine进行输入");
        //判断是还有输入
        if(scanner.hasNext())
        {
            String str=scanner.nextLine();
            System.out.println("输出的是："+str);
        }
        scanner.close();
    }
}
