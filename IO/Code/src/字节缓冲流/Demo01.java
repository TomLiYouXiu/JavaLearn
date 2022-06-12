package 字节缓冲流;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 使用字节缓冲流读取
 */
public class Demo01 {
    public static void main(String[] args) throws Exception{
        //创建
        FileInputStream fis=new FileInputStream("E:\\Java\\IO\\File\\Demo01.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        //读取
        int data=0;
        while((data=bis.read())!=-1){
            System.out.println((char)data);
        }
        //关闭
        bis.close();
    }
}
