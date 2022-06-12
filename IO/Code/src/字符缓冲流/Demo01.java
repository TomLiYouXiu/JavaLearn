package 字符缓冲流;

import java.io.BufferedReader;
import java.io.FileReader;

//使用字符缓冲流进行数据的读
public class Demo01 {
    public static void main(String[] args) throws Exception{
        //创建缓冲流
        FileReader fr=new FileReader("E:\\Java\\IO\\File\\hello.txt");
        BufferedReader br=new BufferedReader(fr);
        //读取
        //第一种方式
//        char[] buf=new char[1024];
//        int count;
//        while ((count=fr.read(buf))!=-1){
//            System.out.println(new String(buf,0,count));
//        }
        //第二种方式   一行一行的读
        br.readLine();
        String line=null;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
        //关闭
        br.close();
    }
}
