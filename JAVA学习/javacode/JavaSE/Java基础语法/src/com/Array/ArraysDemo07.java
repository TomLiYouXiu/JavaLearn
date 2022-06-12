package com.Array;

import java.util.Arrays;

//冒泡排序
/*
* 数组排序
* */
public class ArraysDemo07 {
    public static void main(String[] args) {
        int[] a={12,3,4,5,6,788,23,4,67};
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    //逻辑
    //1.比较数组两个元素
    //2.每一次比较都选出最大的一个或者最小的一个数字
    //3.下一次少比较一次
    //4.依次循环直至数组结束
    public static int[] sort(int[] arrays){
        //临时变量
        int t;
        //外层循环，判断要走多少次
        for (int i = 0; i <arrays.length-1 ; i++) {
            //内层循环，交换位置，如果第一个数字比第二个数字大进行位置交换
            for (int j = 0; j <arrays.length-1-i ; j++) {
                if (arrays[j]>arrays[j+1]) {
                    t=arrays[j];
                    arrays[j]=arrays[j+1];
                    arrays[j+1]=t;
                }
            }
        }
        return arrays;
    }
}
