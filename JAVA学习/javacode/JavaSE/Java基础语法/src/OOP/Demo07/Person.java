package OOP.Demo07;

public final class Person {
    //2.赋初始值
    {
        //代码块（匿名代码块）
        System.out.println("匿名代码块");

    }
    //1.只执行一次
    static {
        //静态代码块
        System.out.println("静态代码块");
    }
    //3
    public Person() {
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("===============================");
        Person person1 = new Person();
    }
}
