package OOP.Demo04;

public class Application {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("liyouxiu");
        System.out.println(student.getName());
        student.setAge(999);
        System.out.println(student.getAge());
    }
}
