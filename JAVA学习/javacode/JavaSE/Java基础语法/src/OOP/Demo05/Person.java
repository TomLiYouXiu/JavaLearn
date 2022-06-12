package OOP.Demo05;
//人 person :父类 基类
//在java中所有的类都默认直接或间接继承Object
public class Person {
    //public
    //private

    public Person(String name) {
        System.out.println("Person无参");
    }
    public Person() {
        System.out.println("Person无参");
    }

    public int money=10_0000_0000;
    protected String name="liyouxiu";
    public void print(){
        System.out.println("Person");
    }
    public void say(){
        System.out.println("说了一句话");
    }
}
