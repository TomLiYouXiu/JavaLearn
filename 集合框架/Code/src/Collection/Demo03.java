package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * List子接口的使用
 * 特点：有序，有下标，可以重复
 */
public class Demo03 {
    public static void main(String[] args) {
        //创建集合对象
        List list=new ArrayList<>();
        //添加元素
        list.add("苹果");
        list.add("西瓜");
        list.add(0,"香蕉");
        System.out.println("元素个数："+list.size());
        System.out.println(list);
        //删除元素
//        list.remove("香蕉");
//        list.remove(0);
//        System.out.println("元素个数："+list.size());
//        System.out.println(list);
        //遍历
//        for (Object o : list) {
//            System.out.println(o);
//        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //迭代器遍历
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //使用列表迭代器 和Iterator的区别 可以向前或向后遍历，可以添加元素和删除，修改
        ListIterator listIterator = list.listIterator();
        System.out.println("使用列表迭代器正向");
        while (listIterator.hasNext()){
            System.out.println(listIterator.nextIndex()+":"+listIterator.next());
        }
        System.out.println("逆向");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previousIndex()+":"+listIterator.previous());
        }

        //获取位置
        System.out.println(list.indexOf("苹果"));
    }
}
