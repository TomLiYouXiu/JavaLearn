package String;
//StringBuffer：可变长字符串，JDK1.0提供，运行效率慢，线程安全
//StringBuilder：可变长字符串，JDK5.0提供，运行效率快，线程不安全
//和String的区别 效率高，节省内存
public class Demo06 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        //1.append();追加
        stringBuffer.append("java世界第一");
        System.out.println(stringBuffer.toString());
        stringBuffer.append("java真香");
        System.out.println(stringBuffer.toString());
        stringBuffer.append("java不错");
        System.out.println(stringBuffer.toString());
        //2.insert() 添加
        stringBuffer.insert(0,"我在最前面");
        System.out.println(stringBuffer.toString());
        //3.replace() 替换
        stringBuffer.replace(0,5,"我是替换的");//含头不含尾原则
        System.out.println(stringBuffer.toString());
        //4.delete 删除
        stringBuffer.delete(0,5);
        System.out.println(stringBuffer.toString());
        //清空
        stringBuffer.delete(0,stringBuffer.length());
        System.out.println(stringBuffer.toString());
    }
}
