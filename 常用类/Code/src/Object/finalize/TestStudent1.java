package Object.finalize;

public class TestStudent1 {
    public static void main(String[] args) {
//        Student a1 = new Student("aaa", 10);
//        Student a2 = new Student("bbb", 10);
//        Student a3 = new Student("ccc", 10);
//        Student a4 = new Student("ddd", 10);

        new Student("aaa", 10);
        new Student("bbb", 10);
        new Student("ccc", 10);
        new Student("ddd", 10);
        //回收垃圾
        System.gc();
        System.out.println("回收垃圾");

    }
}
