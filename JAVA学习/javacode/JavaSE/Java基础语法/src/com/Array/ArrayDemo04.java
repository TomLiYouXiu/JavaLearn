package com.Array;

public class ArrayDemo04 {
    public static void main(String[] args) {
        //增强for循环
        int[] a={1,2,3,4,5};
        //增强for循环,JDK1.5以后没有下标
//        for (int i : a) {
//            System.out.println(i);
//        }
        PrintArray(a);
        System.out.println();
        System.out.println("===============================");
        int[] b=reverse(a);
        for (int i : b) {
            System.out.print(i+" ");
        }
    }
    //数组打印方法
    public static void PrintArray(int[] a){
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
    //数组反转
    public static int[] reverse(int[] a){
        int[] rev=new int[a.length];
        //数组反转
        int b=0;
        for (int i = a.length-1; i >=0 ; i--) {
            rev[b++]=a[i];
        }

        return rev;
    }
}
