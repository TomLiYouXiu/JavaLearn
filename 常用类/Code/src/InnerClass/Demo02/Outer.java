package InnerClass.Demo02;
//外部类
public class Outer {
    //变量
    private String name="张三";
    private int age=10;
    //private,public等修饰符也可以修饰类
    //内部类
    class Inner{
        private String address="北京";
        private String phone="999";
        //同名内部类属性
        private String name="李四";
        private int age=20;

        //成员内部类不能定义静态成员 , 但可以包含静态常量final

        private static final String cry="中国";

        //打印
        public void show(){
            //打印外部类
            //当外部类，内部类存在重名属性时，会优先访问内部类属性 如果想访问同名外部类属性
            System.out.println(Outer.this.name);
            System.out.println(age);
            //打印内部类
            System.out.println(address);
            System.out.println(phone);
        }


    }
}
