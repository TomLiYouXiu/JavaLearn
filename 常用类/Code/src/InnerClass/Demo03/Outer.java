package InnerClass.Demo03;
//外部类
public class Outer {
    private String name="张三";
    private int age=10;
    //静态内部类 和外部类级别相同
    static  class Inner{
        private String address="北京";
        private String phone="111";
        //可以包含静态成员
        private static int count=10000;

        public void show(){
            //调用外部类属性
            //首先创建外部类对象
            Outer Outer=new Outer();
            System.out.println(Outer.name);
            System.out.println(Outer.age);

            //调用内部类属性
            System.out.println(address);
            System.out.println(phone);

            //调用静态内部类的静态属性
            System.out.println(Inner.count);
        }
    }
}
