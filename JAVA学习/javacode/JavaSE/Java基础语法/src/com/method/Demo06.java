package com.method;
//递归思想：但是尽量少用递归
public class Demo06 {
    public static void main(String[] args) {
        //阶乘
        int i = 5;
        System.out.println(f(i));

    }
    //5! 5*4*3*2*2*1
    public static int f(int n)
    {
        if(n==1){
            return 1;
        }else {
            return n*f(n-1);
        }
    }
}
