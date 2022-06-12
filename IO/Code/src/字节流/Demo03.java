package 字节流;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 使用字节流进行文件的复制
 */
public class Demo03 {
    public static void main(String[] args) throws Exception{
        //文件字节输入流
        FileInputStream fis=new FileInputStream("C:\\Users\\57343\\Pictures\\Camera Roll\\8e59c9bfefa6665b87b01f273e274422_1.jpg");
        //文件字节输出流
        FileOutputStream fos=new FileOutputStream("E:\\Java\\IO\\File\\Demo03.jpg");
        //一边读一边写
        byte[] buf=new byte[1024];
        int count=0;
        while ((count=fis.read(buf))!=-1){
            fos.write(buf,0,count);
        }
        //关闭
        fis.close();
        fos.close();
        System.out.println("复制完毕");
    }
}
