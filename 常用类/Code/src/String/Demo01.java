package String;

public class Demo01 {
    public static void main(String[] args) {
        String name="hello";//常量存在字符串池中
        name="张三";//“张三”赋值给name 给字符串赋值时，并没有修改数据只是从新开辟了空间
        String name2="张三";

        //字符串的另一种创建方式 new String();
        String str1=new String("java");
        String str2=new String("java");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
    }
}
