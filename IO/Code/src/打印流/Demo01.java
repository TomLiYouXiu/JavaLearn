package 打印流;

import java.io.PrintWriter;

//打印流
public class Demo01 {
    public static void main(String[] args) throws Exception{
        PrintWriter pw=new PrintWriter("E:\\Java\\IO\\File\\字符缓冲流.txt");
        pw.println(97);
        pw.println('a');
        pw.println(true);
        pw.println(3.14);
        pw.close();
    }
}
