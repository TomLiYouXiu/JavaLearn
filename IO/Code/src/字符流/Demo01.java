package 字符流;

import java.io.FileInputStream;

/**
 * 读取文件 没法读取中文
 */
public class Demo01 {
    public static void main(String[] args) throws Exception{
        //创建对象
        FileInputStream fis=new FileInputStream("E:\\Java\\IO\\File\\hello.txt");
        int data;
        while ((data=fis.read())!=-1){
            System.out.print((char) data);
        }
        //关闭
        fis.close();
    }
}
