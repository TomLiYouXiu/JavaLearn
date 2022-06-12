package com.base;

public class Demo02 {
    public static void main(String[] args) {
        //整数拓展 进制 二进制0b 八进制0 十进制 十六进制0x
        int i=10;
        int i1=010; //八进制
        int i2=0x10; //十六进制
        System.out.println(i);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println("===============================================");
        //===============================================
        //浮点数拓展 银行业务
        //BigDecimal 数学工具类
        //===============================================
        //float 有限  离散  舍入误差    大约  接近但不等于
        //double
        //最好不要使用浮点数进行比较
        //最好不要使用浮点数进行比较
        //最好不要使用浮点数进行比较
        float f=0.1f; //0.1
        double d=1.0/10; //0.1
        System.out.println(f==d);
        //System.out.println(f);
        //System.out.println(d);
        float d1=1238972349857f;
        float d2=d1+1;
        System.out.println(d1==d2);
        System.out.println("===============================================");
        //===============================================
        //字符拓展
        //所有字符的本质还是数字
        //编码 Unicode 2字节 65536
        //===============================================
        char c1='a';
        char c2='中';
        System.out.println(c1);
        System.out.println((int)c1);//强制转换
        System.out.println(c2);
        System.out.println((int)c2);//强制转换
        //U0000-UFFFF
        char c3='\u0061';
        System.out.println(c3);
        //转义字符
        //\t 制表
        //\n 换行
        //……………………
        System.out.println("你好\t世界");
        //对象 从内存分析
        System.out.println("===============================================");
        String s1=new String("你好 世界");
        String s2=new String("你好 世界");
        System.out.println(s1==s2);
        String s3="你好 世界";
        String s4="你好 世界";
        System.out.println(s3==s4);
        System.out.println("===============================================");
    }
}
