package OOP.Demo01;

public class Demo03 {
    public static void main(String[] args) {
        Demo03 demo03 = new Demo03();
        //实际参数和形式参数一一对应
        int add=demo03.add(1,2);
        System.out.println(add);
    }
    public int add(int a,int b){
        return a+b;
    }
}
