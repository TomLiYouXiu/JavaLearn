package com.Array;

import java.util.Arrays;

public class ArraysDemo06 {
    public static void main(String[] args) {
        int[] a={1,5,6,7,34,5,67,345};
        System.out.println(a);//[I@4554617c
        //打印数组元素
        System.out.println(Arrays.toString(a));
        System.out.println("==========================");
        //Print(a);

        //排序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("==========================");

        //填充
        Arrays.fill(a,0);
        System.out.println(Arrays.toString(a));
    }
    //不要重复造轮子
    public static void Print(int[] a){
        for (int i = 0; i <a.length ; i++) {
            if (i==0){
                System.out.print("[");
            }
            if(i==a.length-1){
                System.out.print(a[i]+"]");
            }else {
                System.out.print(a[i]+", ");
            }

        }
    }
}
