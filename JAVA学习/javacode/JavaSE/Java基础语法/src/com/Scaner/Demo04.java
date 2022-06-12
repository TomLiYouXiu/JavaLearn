package com.Scaner;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        //输入多个数字，并求总和和平均值
        Scanner scanner=new Scanner(System.in);

        //总和
        double sum=0;
        //数字个数
        int i=0;
        System.out.println("请输入数字");
        while(scanner.hasNextDouble()) {
            double v = scanner.nextDouble();
            sum+=v;
            i++;
        }
        System.out.println("总和为"+sum+"平均值为"+sum/i);
    }
}
