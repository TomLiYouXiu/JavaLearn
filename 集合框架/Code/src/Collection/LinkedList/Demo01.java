package Collection.LinkedList;

import Collection.Student;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * LinkedList的使用
 * 存储结构：双向链表
 */
public class Demo01 {
    public static void main(String[] args) {
        LinkedList<Object> objects = new LinkedList<>();
        Student s1=new Student("刘德华",20);
        Student s2=new Student("郭富城",20);
        Student s3=new Student("梁朝伟",20);
        objects.add(s1);
        objects.add(s2);
        objects.add(s3);
        System.out.println("元素个数："+objects.size());
        System.out.println(objects.toString());
        //删除
//        objects.remove(0);
//        objects.remove(s1);
        //System.out.println("元素个数："+objects.size());

        //遍历
        System.out.println("---------for--------------");
        for (int i = 0; i <objects.size() ; i++) {
            System.out.println(objects.get(i));
        }
        System.out.println("-------增强for--------------");
        for (Object object : objects) {
            System.out.println(object);

        }
        System.out.println("-------使用迭代器--------------");
        Iterator<Object> iterator = objects.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-------使用逆向迭代器--------------");
        ListIterator<Object> objectListIterator = objects.listIterator();
        while(objectListIterator.hasNext()){
            System.out.println(objectListIterator.next());
        }

    }
}
