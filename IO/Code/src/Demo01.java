import java.io.File;

//递归遍历文件夹
public class Demo01 {
    public static void main(String[] args) {
        listDir(new File("D:"));
    }
    public static void listDir(File dir){
        File[] files = dir.listFiles();
        if (files!=null&&files.length>0){
            for (File file : files) {
               if (file.isDirectory()){
                   listDir(file);
               }
               else {
                   System.out.println(file.getAbsolutePath());
               }
            }
        }
    }
}
