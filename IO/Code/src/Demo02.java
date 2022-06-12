import java.util.Properties;

//Properties的使用
public class Demo02 {
    public static void main(String[] args) {
        Properties properties=new Properties();
        //添加数据
        properties.setProperty("name","zhansan");
        properties.setProperty("age","20");
        System.out.println(properties.toString());
    }
}
