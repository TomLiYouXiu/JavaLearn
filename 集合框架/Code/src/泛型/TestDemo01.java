package 泛型;

public class TestDemo01 {
    public static void main(String[] args) {
        //泛型只能是引用类型
        //注意：不同泛型类之间不能相互复制
        //使用泛型类创建对象
        Demo01<String> demo01=new Demo01<>();//new Demo01<>();可以写，也可以不写
        demo01.t="hello";
        demo01.show("大家好");
        System.out.println(demo01.getT());

        Demo01<Integer> demo011=new Demo01<Integer>();
        demo011.t=6;
        demo011.show(9);
        System.out.println(demo011.getT());

        TestDemo02 testDemo02 = new TestDemo02();
        testDemo02.server("你好");

        TestDemo02_1 testDemo02_1=new TestDemo02_1<Integer>();
        testDemo02_1.server(1);

    }
}
