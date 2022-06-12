package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Arraylist 的使用
 * 存储结构：数组查找遍历速度快，增删慢
 */
public class Demo05 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList arrayList=new ArrayList();

        //2.添加元素
        Student s1=new Student("刘德华",20);
        Student s2=new Student("郭富城",20);
        Student s3=new Student("梁朝伟",20);
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        System.out.println("元素个数："+arrayList.size());
        System.out.println(arrayList);
        //3.删除元素
        //arrayList.remove(s1);
        arrayList.remove(new Student("刘德华",20));
        System.out.println("删除之后元素个数："+arrayList.size());

        //4.遍历
        //迭代器的使用
        System.out.println("迭代器的遍历");
        Iterator iterator=arrayList.iterator();
        while (iterator.hasNext()){
            Student student=(Student)iterator.next();
            System.out.println(student.toString());
        }
        //列表迭代器的遍历
        System.out.println("列表迭代器");
        ListIterator listIterator=arrayList.listIterator();
        while (listIterator.hasNext()){
            Student student1=(Student)listIterator.next();
            System.out.println(student1.toString());
        }
        System.out.println("逆序迭代");
        while (listIterator.hasPrevious()){
            Student student2=(Student)listIterator.previous();
            System.out.println(student2.toString());
        }
        //5.判断
        System.out.println(arrayList.contains(new Student("郭富城",20)));

        //6.查找
        System.out.println(arrayList.indexOf(s3));
    }
}
