package OOP.Demo01;
//值传递
public class Demo04 {
    public static void main(String[] args) {
        int a=1;
        System.out.println(a);
        change(a);
        System.out.println(a);
    }
    //返回值为空
    public static void change(int a){
        a=10;
    }
}
