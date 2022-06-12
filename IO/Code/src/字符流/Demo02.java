package 字符流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

/**
 * 文件字符输入流
 */
public class Demo02 {
    public static void main(String[] args) throws Exception {
        FileReader fr=new FileReader("E:\\Java\\IO\\File\\hello.txt");
        //使用单个字符
        //        int data;
//        while ((data=fr.read())!=-1){//读取一个字符
//            System.out.print((char) data);
//        }
        //缓冲区读取
        char[] bf=new char[1024];
        int count=0;
        while ((count=fr.read(bf))!=-1){
            System.out.println(new String(bf,0,count));
        }
        fr.close();
    }
}
