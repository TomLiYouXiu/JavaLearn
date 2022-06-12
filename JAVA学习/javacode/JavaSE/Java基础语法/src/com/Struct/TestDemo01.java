package com.Struct;

public class TestDemo01 {
    public static void main(String[] args) {
        //打印三角形 五行
        for (int i = 1; i <=5; i++) {
            for (int j = 5; j >=i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*");
            }
            /*
            for (int j = 1; j <i ; j++) {
                System.out.print("*");
            }*/
            System.out.println();
        }
        
    }
}
