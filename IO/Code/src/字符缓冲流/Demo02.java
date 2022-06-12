package 字符缓冲流;

import java.io.BufferedWriter;
import java.io.FileWriter;

//使用字符缓冲流写
public class Demo02 {
    public static void main(String[] args) throws Exception{
        FileWriter fw=new FileWriter("E:\\Java\\IO\\File\\字符缓冲流.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        //写入
        for (int i = 0; i < 10; i++) {
            bw.write("好好学习");
            bw.newLine();//写入换行符
            bw.flush();
        }
        bw.close();
        System.out.println("执行完毕");
    }
}
