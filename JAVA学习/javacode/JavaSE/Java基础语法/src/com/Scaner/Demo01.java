package com.Scaner;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        //创建一个扫描器对象，用于接受数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next方式接收：");
        //判断用户有没有输入字符串
        if (scanner.hasNext())
        {
            //使用next方式接收
            String str=scanner.next();
            System.out.println("输出的是："+str);
        }
        //凡是属于IO流的类用完之后要关闭，如果不关闭会一直占用资源，要养成好习惯
        scanner.close();
    }
}
