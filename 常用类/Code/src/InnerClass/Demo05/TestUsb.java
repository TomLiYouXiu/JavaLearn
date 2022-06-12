package InnerClass.Demo05;

public class TestUsb {
    public static void main(String[] args) {
        //创建接口类型的变量
//        USB usb = new Mouse();
//        usb.service();

        //局部内部类
//        class Fan implements USB{
//
//            @Override
//            public void service() {
//                System.out.println("这是Fan");
//            }
//        }

        //使用局部内部类创建对象
//        USB fan = new Fan();
//        fan.service();

        //使用匿名内部类优化
        USB fan = new USB(){
            @Override
            public void service() {
                System.out.println("这是Fan");
            }
        };
        fan.service();
    }
}
