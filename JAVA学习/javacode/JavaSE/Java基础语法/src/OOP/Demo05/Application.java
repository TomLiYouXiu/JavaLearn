package OOP.Demo05;

public class Application {
    //静态方法和非静态方法区别较大
    public static void main(String[] args) {
        //静态方法：方法的调用只和左边，定义的数据类型有关
        //非静态：重写
        A a = new A();
        a.test();//A

        //父类的引用指向了子类
        B b=new A();//子类重写了父类的方法
        b.test();//B
    }
}
