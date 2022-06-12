package com.method;

public class Demo01 {
    //main方法
    public static void main(String[] args) {
        int sum = add(1, 2);  //实际参数：实际调用传递的参数
        System.out.println(sum);
//        test();
    }
    //加法
    //形式参数：定义参数
    public static int add(int a,int b){
        return a+b;
    }
    public static void test()
    {
        int sum=0;//计数
        for (int i = 0; i <= 1000; i++) {
            if(i%5==0){
                System.out.print(i+" ");// \t 制表符
                sum++;
                if (sum%3==0){
                    System.out.println();
                    // System.out.print("\n"); \n 换行
                }
            }
        }
    }
}
