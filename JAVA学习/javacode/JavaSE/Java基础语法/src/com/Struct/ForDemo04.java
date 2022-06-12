package com.Struct;

public class ForDemo04 {
    public static void main(String[] args) {
        //打印九九乘法表
        for (int i = 1; i <=9; i++) {
            for (int i1 = 1; i1 <=i; i1++) {
                System.out.print(i+"*"+i1+"="+i*i1+"\t");
            }
            System.out.println();
        }
    }
}
