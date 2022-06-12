package 对象流;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * 反序列化
 */
public class Demo02 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("E:\\Java\\IO\\File\\stu.bin");
        ObjectInputStream ois=new ObjectInputStream(fis);
        //写入
        Student s=(Student) ois.readObject();
        ois.close();
        System.out.println(s.toString());
    }
}
