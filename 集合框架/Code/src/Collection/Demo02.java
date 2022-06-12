package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//保存学生信息
public class Demo02 {
    public static void main(String[] args) {
        //实例化
        Collection collection=new ArrayList();
        //添加学生数据
        Student s1=new Student("张三",19);
        Student s2=new Student("张四",19);
        Student s3=new Student("张五",19);
        Student s4=new Student("张六",19);
        collection.add(s1);
        collection.add(s2);
        collection.add(s3);
        collection.add(s4);
        System.out.println("元素个数："+collection.size());
        System.out.println(collection);
//        collection.remove(s1);
//        collection.clear();
//        System.out.println("删除之后:"+collection.size());
        //遍历
        for (Object o : collection) {
            System.out.println(o);
        }
        System.out.println("++++++++++++++++++++++++++++++++++");
        Iterator iterator=collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
