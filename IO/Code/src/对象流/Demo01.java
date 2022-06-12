package 对象流;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * 实现对对象的序列化
 */
public class Demo01 {
    public static void main(String[] args) throws Exception{
        //创建对象流
        FileOutputStream fos=new FileOutputStream("E:\\Java\\IO\\File\\stu.bin");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        //序列化 写入操作
        Student zhangsan=new Student("张三",18);
        oos.writeObject(zhangsan);
        oos.close();
        System.out.println("序列化完毕");
    }
}
