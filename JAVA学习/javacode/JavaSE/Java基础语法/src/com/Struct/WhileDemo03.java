package com.Struct;

public class WhileDemo03 {
    public static void main(String[] args) {
        //输出0-1000之间能被5整除的数，每行输出三个
        int i=0;//0-1000
        while(i<=1000){
            if(i%5==0){
                System.out.print(i+" ");
            }
            if (i%15==0){
                System.out.println();
            }
            i++;
        }
    }

}
