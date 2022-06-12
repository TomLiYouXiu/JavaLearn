package OOP.Demo01;
//引用传递 对象 本质还是值传递
public class Demo05 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        Demo05.change(person);
        System.out.println(person.name);
    }
    public static void change(Person person){
        //person是一个对象 指向的是---->Person类 Person person = new Person(); 是一个具体的对象 可以改变属性
        person.name="李优秀";
    }
}
//定义了一个Person类 有个属性name
class Person{
    String name;//null
}
