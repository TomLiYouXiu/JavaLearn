package 字符流;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * 使用字符流复制文件，只能复制字符文件，无法复制图片
 */
public class Demo04 {
    public static void main(String[] args) throws Exception{
        FileReader fr=new FileReader("E:\\Java\\IO\\File\\hello.txt");
        FileWriter fw=new FileWriter("E:\\Java\\IO\\File\\helloCopy.txt");
        //读写
        int data;
        while ((data=fr.read())!=-1){
            fw.write(data);
            fw.flush();
        }
        fr.close();
        fw.close();
        System.out.println("执行完毕");
    }
}
