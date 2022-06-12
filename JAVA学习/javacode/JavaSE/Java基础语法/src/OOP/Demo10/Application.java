package OOP.Demo10;

public class Application {
    public static void main(String[] args) {
        //new
        Outer outer = new Outer();

        //通过外部类实现内部类方法
        Outer.inner inner = outer.new inner();
        inner.getID();
    }
}
