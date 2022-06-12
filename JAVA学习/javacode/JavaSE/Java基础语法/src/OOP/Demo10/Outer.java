package OOP.Demo10;
public class Outer {
    private int id=10;
    public void out(){
        System.out.println("这是外部类的方法");
    }
    public class inner{
        public void in(){
            System.out.println("这是内部类方法");
        }
        //获得内部类的私有属性
        public  void getID(){
            //System.out.println(id);
        }
    }
    //局部内部类
    public void test(){
        class inner{

        }
    }
}
