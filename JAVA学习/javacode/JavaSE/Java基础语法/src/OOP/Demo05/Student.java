package OOP.Demo05;
//学生是人 派生类 ，子类
//子类继承了父类 就会拥有父类的全部的方法
public class Student extends Person{
    //隐藏代码 调用了父类的无参构造
    public Student() {
        super("hello");//隐藏的代码 调用父类的构造器必须放在子类构造器第一行
        // this("hello");
        System.out.println("Student无参");

    }



    private String name="liwei";
    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
    public void print(){
        System.out.println("Student");
    }
    public void test1(){
        print();
        this.print();
        super.print();
    }
}
//       Student student = new Student();
//        student.say();
//        System.out.println(student.money);
//        student.test("lwl");
//        System.out.println("======================================");
//        student.test1();