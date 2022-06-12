package File类;
//File类的使用

import java.io.File;
import java.util.Date;

/**
 * 1.分隔符
 * 2.文件操作
 */
public class Demo01 {
    public static void main(String[] args) throws Exception{
        separator();
        fileOpe();
    }
    //分隔符
    public static void separator(){
        System.out.println("路径分隔符"+ File.pathSeparator);
        System.out.println("名称分隔符"+ File.separator);
    }
    //文件操作
    public static void fileOpe() throws Exception{
       //创建文件
        File file=new File("E:\\Java\\IO\\File\\File.txt");
        System.out.println(file.toString());
        boolean b = file.createNewFile();


        //删除文件
        //1.直接删除
//        System.out.println("删除结果"+file.delete());
//        使用JVM删除
//        file.deleteOnExit();
//        Thread.sleep(5000);
        //获取文件信息
        System.out.println("获取文件绝对路径"+file.getAbsolutePath());
        System.out.println("文件名称"+file.getName());
        System.out.println("获取父目录"+file.getParent());
        System.out.println("获取文件大小"+file.length());
        System.out.println("文件创建时间"+new Date(file.lastModified()).toLocaleString());
        //判断
        System.out.println("文件是否可写"+file.canWrite());

    }
}
