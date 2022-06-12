package InnerClass.Demo03;

public class TestOuter {
    public static void main(String[] args) {
        //直接创建静态内部类对象
        //Outer.Inner 表示包含关系
        Outer.Inner inner = new Outer.Inner();
        inner.show();
    }
}
