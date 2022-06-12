package Collection;

import java.util.ArrayList;
import java.util.List;

public class Demo04 {
    public static void main(String[] args) {
        //集合创建
        List list=new ArrayList();
        //数据添加  (自动装箱)
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("元素个数："+list.size());
        System.out.println(list);

        //删除
        //list.remove(1);
        //list.remove( (Object)20);
        list.remove(new Integer(20));
        System.out.println("元素个数："+list.size());

        //补充 sublist 返回子集合 含头不含尾
        List list1 = list.subList(1, 3);
        System.out.println(list1);


    }
}
