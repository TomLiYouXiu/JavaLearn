package OOP.Demo07;
//static
public class Student{
    private static int age;//静态变量 多线程
    private double score;//非静态变量
    public void run(){
        go();
    }
    public static void go(){

    }
    public static void main(String[] args) {
//        Student s1 = new Student();
//        System.out.println(Student.age);
//        //System.out.println(Student.score);
//        System.out.println(s1.age);
//        System.out.println(s1.score);
       new Student().run();
       go();
    }
}
