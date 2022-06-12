package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
Collection 接口的使用
1.添加元素
2.删除元素
3.遍历元素
4.判断
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建集合
        Collection collection=new ArrayList();
        //1.添加元素
        collection.add("苹果");
        collection.add("西瓜");
        collection.add("香蕉");
        System.out.println("元素个数:"+collection.size());
        System.out.println(collection);
        //2.删除元素
//        collection.remove("苹果");
//        System.out.println("元素个数:"+collection.size());
//        System.out.println(collection);

        //3.遍历元素
        //使用增强for
        System.out.println("===================================");
        System.out.println("使用增强for遍历");
        for (Object o : collection) {
            System.out.println(o);
        }
        //使用迭代器（迭代器专门用来遍历集合）
        //hasNext 判断是否由下一个元素
        //next 获取下一个元素
        //remove 删除元素
        System.out.println("使用迭代器遍历");
        Iterator it=collection.iterator();
        while (it.hasNext()){
            String next = (String)it.next();
            System.out.println(next);
            //使用迭代器不允许使用命令删除 会破坏整体完整性

        }
        //判断
        System.out.println(collection.contains("西瓜"));//判断是否有西瓜
        System.out.println(collection.isEmpty());//判断集合是否为空

    }
}
