package 字符流;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * 文件字符输入流
 */
public class Demo03 {
    public static void main(String[] args) throws Exception{
        FileWriter fw=new FileWriter("E:\\Java\\IO\\File\\hello.txt");
        for (int i = 0; i < 10; i++) {
            fw.write("java是世界上最好的语言\r\n");
        }
        fw.close();
        System.out.println("执行完毕");
    }
}
