package InnerClass.Demo04;
//外部类
public class Outer {
    private String name="张三";
    private int age=20;
    public void show(){
        String address="北京";
        //局部内部类 注意：不能加任何访问修饰符
        class Inner{
            private String phone="111";
            private String emali="111@162.com";

            public void show2(){
                //访问外部类属性
                System.out.println(Outer.this.name);
                System.out.println(age);
                //访问内部类属性
                System.out.println(this.phone);
                System.out.println(emali);

            }
            //在方法内部创建局部类对象  进行实例化
        }
        Inner inner = new Inner();
        inner.show2();

    }
}
