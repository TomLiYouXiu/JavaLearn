package 转换流;

import java.io.FileInputStream;
import java.io.InputStreamReader;

//转换流的使用
public class Demo01 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("E:\\Java\\IO\\File\\hello.txt");
        InputStreamReader isr=new InputStreamReader(fis,"utf-8");
        int data;
        while ((data=isr.read())!=-1){
            System.out.print((char) data);
        }
        isr.close();
    }
}
