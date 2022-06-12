package Packaging;

public class Demo01 {
    public static void main(String[] args) {
        //int a=10;


        //类型转换 装箱 基本类型转为引用类型的过程（栈--->堆）
        //基本类型（基栈）
        int num=18;
        //使用Integer类创建对象
        //Integer integer=new Integer(num);//构造函数Integer(int)在第9版后已弃用
        Integer integer=Integer.valueOf(num);
        System.out.println("装箱："+integer);

        //拆箱 引用类型转换为基本类型（堆---->栈）
        Integer integer1=Integer.valueOf(1001);
        int i = integer1.intValue();
        System.out.println("拆箱："+i);

        //JDK1.5以后提供了自动拆箱装箱
        int age=21;
        //自动装箱
        Integer integer2=age;
        int age1=integer2;

        System.out.println("=================================");
        //基本类型和字符串之间的转换
        //基本类型转换为字符串
        int n1=100;
        //使用+
        String s1=n1+"";
        System.out.println(s1);
        //使用Integer中的toString方法
        String s2 = Integer.toString(n1);
        System.out.println(s2);
        //字符串转基本类型
        String s3="100";
        int i1 = Integer.parseInt(s3);
        System.out.println(i1);
        //boolean字符串形式转成基本类型   “true”会转成true其余则是false
        String s4="tue";
        boolean b1=Boolean.parseBoolean(s4);
        System.out.println(b1);
    }
}
