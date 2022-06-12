package com.Struct;

public class ForDemo03 {
    public static void main(String[] args) {
        //输出0-1000之间能被5整除的数，每行输出三个
        int sum=0;//计数
        for (int i = 0; i <= 1000; i++) {
            if(i%5==0){
                System.out.print(i+" ");// \t 制表符
                sum++;
                if (sum%3==0){
                    System.out.println();
                    // System.out.print("\n"); \n 换行
                }
            }
        }
        //println 输出之后换行
        //print   输出之后不会换行
    }
}
