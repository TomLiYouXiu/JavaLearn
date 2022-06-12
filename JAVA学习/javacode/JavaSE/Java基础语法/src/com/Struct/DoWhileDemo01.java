package com.Struct;

public class DoWhileDemo01 {
    public static void main(String[] args) {
        int i=0;
        int sun=0;
        do {
            sun+=i;
            i++;
        }while(i<=100);
        System.out.println(sun);
        //Do-While至少执行一次
    }

}
