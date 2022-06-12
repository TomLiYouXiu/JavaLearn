package com.Struct;

public class ForDemo02 {
    public static void main(String[] args) {
        //计算1-100的奇数和偶数的和
        int ji=0,ou=0;
        for (int i = 0; i <=100; i++) {
            if(i%2==0) {
                ou+=i;
            }
            else {
                ji+=i;
            }

        }
        System.out.println("奇数的和是"+ji+"偶数的和是"+ou);
    }
}
