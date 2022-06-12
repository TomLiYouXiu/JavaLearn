package Object.getClass;

public class TestStudent {
    public static void main(String[] args) {
        Student a1 = new Student("aaa", 20);
        Student a2 = new Student("bbb", 22);

        //判断a1和a2是不是一个类型
        if (a1.getClass()==a2.getClass()){
            System.out.println("类型统一");
        }else {
            System.out.println("类型不一致");
        }
        Class class1=a2.getClass();
        System.out.println(a1.getClass());
        System.out.println(class1);

    }
}
