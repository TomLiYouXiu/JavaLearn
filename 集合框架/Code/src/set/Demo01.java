package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 测试set接口的使用
 * 特点、；无序，没有下标，不重复
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建集合
        Set<String> set=new HashSet<>();
        //添加数据
        set.add("小米");
        set.add("华为");
        set.add("苹果");
        System.out.println("数据个数："+set.size());
        System.out.println(set.toString());
        //删除
//        set.remove("华为");
//        System.out.println("数据个数："+set.size());
//        System.out.println(set.toString());
        //遍历
        System.out.println("------增强for--------");
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("--------迭代器--------");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //判断
    }
}
