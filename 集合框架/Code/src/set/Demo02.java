package set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * hashset集合的使用
 * 存储结构：哈希表（）数组+链表+红黑树
 */
public class Demo02 {
    public static void main(String[] args) {
        //创建集合
        HashSet<String> hashMap=new HashSet<String>();
        //添加元素
        hashMap.add("刘德华");
        hashMap.add("周润发");
        hashMap.add("梁朝伟");
        hashMap.add("周星驰");
        System.out.println("个数"+hashMap.size());
        System.out.println(hashMap.toString());
        //删除
//        hashMap.remove("梁朝伟");
//        System.out.println("个数"+hashMap.size());
//        System.out.println(hashMap.toString());
        //遍历
        System.out.println("------增强for----------");
        for (String s : hashMap) {
            System.out.println(s);
        }
        //迭代器
        System.out.println("--------迭代器----------");
        Iterator<String> iterator = hashMap.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //判断
        System.out.println(hashMap.contains("郭富城"));

    }

}
