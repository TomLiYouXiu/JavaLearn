package set;

import java.util.HashSet;

/**
 * hashset的使用
 */
public class Demo03 {
    public static void main(String[] args) {
        HashSet<person> hashSet=new HashSet<>();

        person p1=new person("李德华",18);
        person p2=new person("王德华",18);
        person p3=new person("张德华",18);
        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);

        System.out.println("个数"+hashSet.size());
        System.out.println(hashSet.toString());
    }
}
