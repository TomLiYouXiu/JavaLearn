package 字节流;

import java.io.FileOutputStream;

/*
演示文件字节输出流
 */
public class Demo02  {
    public static void main(String[] args) throws Exception{
       //创建文件字节输出流
        FileOutputStream fos=new FileOutputStream("E:\\Java\\IO\\File\\Demo02.txt");
        //写入字节
        fos.write(97);
        fos.write('b');
        fos.write('c');
        fos.close();
        System.out.println("执行完毕");
    }
}
