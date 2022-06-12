package Object.hashCode;

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
        //getClass 方法
        Class class1=a2.getClass();
        System.out.println(a1.getClass());
        System.out.println(class1);
        System.out.println("===========================================");
        //hashCode 方法
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        Student a3=a1;
        System.out.println(a3.hashCode());

    }
}
