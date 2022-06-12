package set;


import java.util.TreeSet;

/**
 * TreeSet使用
 * 存储结构：红黑树
 *
 */
public class Demo04 {
    public static void main(String[] args) {
        //创建集合
        TreeSet<String> treeMap=new TreeSet<String>();
        //添加元素
        treeMap.add("xyz");
        treeMap.add("abc");
        treeMap.add("hello");
        System.out.println("个数："+treeMap.size());
        System.out.println(treeMap.toString());
        //
    }

}
