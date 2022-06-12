package com.base;

public class Demo04 {
    public static void main(String[] args) {
        //操作比较大的数的时候注意溢出问题
        //JDK7 的新特性 ,数字之间可以用下划线分割
        int money=10_0000_0000;
        System.out.println(money);
        int years=20;
        int total=money*years;
        System.out.println(total);//-1474836480，计算溢出
        long total1=money*years;
        System.out.println(total1);//-1474836480,默认是int转换之前就出现问题
        long total2=money*((long)years);
        System.out.println(total2);//先把一个数转换为long

        //L l
    }
}
