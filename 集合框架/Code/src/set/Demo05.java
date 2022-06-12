package set;

import java.util.TreeSet;

/**
 * 使用TreeSet存储数据
 * 存储结构：红黑树
 * 元素对象的类型必须实现Comparable接口
 */
public class Demo05 {
    public static void main(String[] args) {
        //创建集合
        TreeSet<person> people=new TreeSet<>();
        person p1=new person("李德华",18);
        person p2=new person("王德华",18);
        person p3=new person("张德华",18);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        System.out.println(people.size());
        System.out.println(people.toString());
    }
}
