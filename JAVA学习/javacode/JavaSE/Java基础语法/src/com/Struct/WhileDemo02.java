package com.Struct;

public class WhileDemo02 {
    public static void main(String[] args) {
        //计算1-100的和
        int i=1,sum=0;

        while(i<=100){
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}
