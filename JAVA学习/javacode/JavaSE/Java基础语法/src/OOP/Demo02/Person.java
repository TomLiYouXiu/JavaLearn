package OOP.Demo02;
//java文件----->class文件
public class Person {
    //一个类什么都不写也会存在一个方法
    //显示的定义构造器
    String name;
    int age;
    //实例化初始值
    //1.使用new关键字必须要有构造器，本质是调用构造器
    //2.初始化值

    //alt+insert 生成构造器
    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
/*
* public static void main(String[] args) {
        //new 实例化了一个对象
        Person person = new Person("nihao");
        System.out.println(person.name);
    }
    构造器
    1.和类名相同
    2.无返回值
    作用：
    1.new 本质在调用构造方法
    2.初始化对象的值
    注意点：
    1.定义有参构造之后，如果想使用无参构造，必须定义一个无参构造
* */