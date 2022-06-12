package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class Demo06 {
    public static void main(String[] args) {
        //创建集合
        Vector vector=new Vector();
        vector.add("草莓");
        vector.add("芒果");
        vector.add("西瓜");
        System.out.println("元素的个数："+vector.size());
        //删除
//        vector.remove(0);
        //遍历
        //使用枚举器
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()){
            Object o = elements.nextElement();
            System.out.println(o);
        }
    }
}
