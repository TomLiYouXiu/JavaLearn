package 字节缓冲流;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

/**
 * 使用缓冲流进行文件写入
 */
public class Demo02 {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos=new FileOutputStream("E:\\Java\\IO\\File\\Demo01.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        //写入文件
        for (int i = 0; i < 10; i++) {
            bos.write("你好世界\r\n".getBytes(StandardCharsets.UTF_8));//写入缓存区
            bos.flush();//刷新到硬盘
        }
        bos.close();
        System.out.println("执行完毕");

    }
}
