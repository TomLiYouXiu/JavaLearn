package 字节流;

import java.io.FileInputStream;
import java.util.Arrays;

/**
 * 演示FileInputStream的使用
 * 文件字节输入流
 */
public class Demo01 {
    public static void main(String[] args) throws Exception {
        //创建文件字节流  并定义文件路径
        FileInputStream file = new FileInputStream("E:\\Java\\IO\\File\\Demo01.txt");
        //读取文件
        //1.单个字节打印
//        file.read();
//        int data = 0;
//        while ((data = file.read()) != -1) {
//            System.out.println((char)data);
//        }
        //2。一次读取多个字节
        byte[] buf=new byte[3];
//        int a=file.read(buf);//返回的是实际的个数
//        System.out.println(a);
//        System.out.println(new String(buf));
        int con=0;
        while((con=file.read(buf))!=-1){
            System.out.println(new String(buf,0,con));
        }
        //关闭
        file.close();
        System.out.println("执行完毕");
    }
}