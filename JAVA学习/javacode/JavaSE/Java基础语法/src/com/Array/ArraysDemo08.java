package com.Array;

import java.util.Arrays;

public class ArraysDemo08 {
    public static void main(String[] args) {
        //稀疏数组

        //1.创建棋盘 0：没有棋子 ，1：黑棋 ，2：白棋
        int[][] a=new int[11][11];
        a[1][2]=1;
        a[2][3]=2;
        //输出原始数组
        System.out.println("输出原始数组");
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
            }
        System.out.println("===================================================");
        //1.转换为稀疏数组保存
        //获取有效值的个数
        int sum=0;
        for (int i = 0; i <11 ; i++) {
            for (int j = 0; j <11 ; j++) {
                if (a[i][j]!=0){
                    sum++;
                }
            }
        }
        System.out.println("有效值的个数"+sum);
        //2.创建稀疏数组
        int[][] a2=new int[sum+1][3];
        a2[0][0]=11;
        a2[0][1]=11;
        a2[0][2]=sum;
        //遍历二维数组，将值存放在稀疏数组中
        int count=0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                if(a[i][j]!=0){
                    count++;
                    a2[count][0]=i;
                    a2[count][1]=j;
                    a2[count][2]=a[i][j];

                }
            }
        }
        //输出稀疏数组
        System.out.println("稀疏数组");
        for (int[] ints : a2) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
        System.out.println("===================================================");
        //还原稀疏数组
        System.out.println("还原稀疏数组");
        int[][] a3=new int[a2[0][0]][a2[0][1]];
        //还原值
        for (int i = 1; i < a2.length ; i++) {
            a3[a2[i][0]][a2[i][1]]=a2[i][2];
        }
        System.out.println("打印还原稀疏数组");
        for (int[] ints : a3) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
        }
    
    }

