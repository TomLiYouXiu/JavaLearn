package com.method;

public class Demo02 {
    public static void main(String[] args) {
//        int max = max(3, 4);
        int max = max(3, 3);
        System.out.println(max);
    }
    //比较大小
    //方法一
//    public static int max(int a,int b){
//        if(a>b){
//            return a;
//        }
//        else {
//            return b;
//        }
//    }
    //方法二
    public static int max(int a,int b){
        int result=-1; //初始化
        if (a==b){
            System.out.println("两数相等");
            return 0; //终止方法
        }
        if(a>b){
            result=a;
        }else {
            result=b;
        }

        return result;
    }
}
