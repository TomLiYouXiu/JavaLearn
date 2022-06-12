package set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet集合的使用
 * Comparator：实现定制比较（比较器）
 *
 */
public class Demo06 {
    public static void main(String[] args) {
        TreeSet<person> treeSet=new TreeSet<>(new Comparator<person>() {
            @Override
            public int compare(person o1, person o2) {
                int n1=o1.getAge()-o2.getAge();
                int n2=o1.getName().compareTo(o2.getName());
                return n1==0?n2:n1;
            }
        });
        person p1=new person("李德华",18);
        person p2=new person("王德华",18);
        person p3=new person("张德华",18);
        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        System.out.println(treeSet.size());

    }
}
