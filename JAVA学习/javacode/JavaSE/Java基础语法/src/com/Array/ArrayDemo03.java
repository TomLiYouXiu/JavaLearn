package com.Array;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};

        //打印数组元素
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("=====================");

        //计算所有元素的和
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        System.out.println("数组的和是："+sum);
        System.out.println("=====================");
        //寻找最大的数
        int max=a[0];
        for (int i = 0; i <a.length ; i++) {
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("最大的数是："+max);
    }
}
