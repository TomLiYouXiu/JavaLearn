package Map;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap集合的使用
 * 存储结构：哈希表（数组+链表+红黑树）
 */
public class Demo02 {
    public static void main(String[] args) {
        Map<Student,String> map=new HashMap<Student, String>();
        Student s1=new Student("猪八戒",100);
        Student s2=new Student("孙悟空",101);
        Student s3=new Student("唐三藏",102);
        map.put(s1,"北京");
        map.put(s2,"河南");
        map.put(s3,"湖北");
        System.out.println("个数："+map.size());
        System.out.println(map.toString());
    }
}
