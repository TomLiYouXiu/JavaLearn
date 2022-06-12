package com.Array;

public class ArrayDemo01 {
    public static void main(String[] args) {
        //定义有两种方法
        //1.首先选用
        int[] num;
        //2.
        int num2[];

        //使用new方法定义数组，开辟空间
        num = new int[10]; //存放10个int类型的数
        //给数组赋值
        num[0]=1;
        num[1]=2;
        num[2]=3;
        num[3]=4;
        num[4]=5;
        num[5]=6;
        num[6]=7;
        num[7]=8;
        num[8]=9;
        num[9]=10;
        int sum =0;
        //计算所有元素的和
        for (int i = 0; i < 10; i++) {
            sum +=num[i];
        }
        System.out.println(num[3]);
        System.out.println(num.length); //获取数组的长度
        System.out.println(sum);

    }
}
