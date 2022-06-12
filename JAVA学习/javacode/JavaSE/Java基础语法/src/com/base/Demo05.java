package com.base;

public class Demo05 {
    //属性：变量

    //实例变量：从属于对象  如果不自行初始化变成默认值
    //布尔值一般为false
    //除了基本类型，其余的默认值为null
    String name;//初始化值一般为null
    int age; //初始化值一般为0

    //类变量 static
    static double salary=2500;

    //main方法
    public static void main(String[] args) {
        // 注重程序可读性
        //局部变量：必须声明和初始化值
        int i=10;
        System.out.println(i);

        //变量类型 变量名字=new Demo05();
        Demo05 demo05 = new Demo05();
        System.out.println(demo05.age);
        System.out.println(demo05.name);

        //类变量
        System.out.println(salary);

    }

    //其他方法
    public void add()
    {
        //System.out.println(i);
    }
}
