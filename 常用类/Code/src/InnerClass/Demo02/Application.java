package InnerClass.Demo02;

public class Application {
    public static void main(String[] args) {
        //1.创建外部类对象
//        Outer outer = new Outer();
        //2.创建内部类对象
//        Outer.Inner inner = outer.new Inner();

        //一步到位
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}
