package com.Array;

public class ArrayDemo05 {
    public static void main(String[] args) {
        int[][] a={{1,2},{3,4},{5,6}};
        PrintArray(a[1]);
    }
    public static void PrintArray(int[] a){
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}
