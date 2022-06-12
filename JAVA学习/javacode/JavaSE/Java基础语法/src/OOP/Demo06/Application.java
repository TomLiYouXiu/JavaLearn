package OOP.Demo06;

public class Application {
    public static void main(String[] args) {
        //类型转换
        //高                     低
        Person person = new Student();
        //person转换为Student类型就可以使用
//        Student person1 = (Student) person;
//        person1.go();
        //子类转换为父类可能会丢失一些方法
        ((Student) person).go();


    }
}
//    //一个对象的实际类型是确定的
//
//
//    //可以指向的引用类型不确定,父类的引用指向子类
//    //Student能的调用的方法只有自己的或者父类的
//    Student s1 = new Student();
//    //Person不能调用子类的方法
//    Person s2 = new Student();
//    Object s3= new Student();
//        s2.run();//子类重写了父类的方法。执行子类的方法
//                s1.run();
//                //对象能执行那些方法。主要看左边的类型，和右边关系不大
//                s1.eat();
//                ((Student) s2).eat();//类型转换

/*1.父类引用指向子类对象
2.把子类转换为父类向上转型
3.把父类转换为子类强制转型（可能会丢失精度）
4.方便方法的调用，减少重复的代码

封装 继承 多态
*
*
*
*
*
* */