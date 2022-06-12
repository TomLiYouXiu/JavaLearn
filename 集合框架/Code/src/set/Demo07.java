package set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 使用TreeSet集合实现字符串按照长度进行排序
 * helloworld zhang lsii wangwu beijing xian nanjing
 */
public class Demo07 {
    public static void main(String[] args) {
        TreeSet<String> treeSet=new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int n1=o1.length()-o2.length();
                int n2=o1.compareTo(o2);
                return n1==0?n2:n1;
            }
        });
        treeSet.add("helloworld");
        treeSet.add("zhang");
        treeSet.add("lsii");
        treeSet.add("wangwu");
        treeSet.add("beijing");
        treeSet.add("xian");
        treeSet.add("nanjing");
        System.out.println("长度："+treeSet.size());
        System.out.println(treeSet.toString());
    }
}
