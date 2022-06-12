package OOP.Demo06;

public class Person {
    public void run(){
        System.out.println("run");
    }
}
/*
* 多态注意事项
*   1.多态是方法的多态，属性没有多态
*   2.父类和子类有联系（类型转换异常【ClassCastException】）
*   3.存在的条件：继承关系，方法需要重写，父类引用指向子类对象！father f1=new son；
*       不能重写的
*       1.static ：方法，属于类，他不属于实例
*       2.final  ：常量
*       3.private ：私有的不能重写
*
*
* */
//Object object = new Student();
////Object->Person->Student
////Object->Person->Teacher
////Object->String
//        System.out.println(object instanceof Student);
//                System.out.println(object instanceof Person);
//                System.out.println(object instanceof Object);
//                System.out.println(object instanceof Teacher);
//                System.out.println(object instanceof String);
//                System.out.println("=======================================");
//                Person person = new Student();
//                System.out.println(person instanceof Student);
//                System.out.println(person instanceof Person);
//                System.out.println(person instanceof Object);
//                System.out.println(person instanceof Teacher);
//                //System.out.println(person instanceof String); 编译错误
//                System.out.println("=======================================");
//                Student student = new Student();
//                System.out.println(student instanceof Student);
//                System.out.println(student instanceof Person);
//                System.out.println(student instanceof Object);
////        System.out.println(student instanceof Teacher);编译错误
////        System.out.println(student instanceof String);编译错误
////System.out.println(x instanceof y);  能不能通过编译主要是通过是否存在父子关系