package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * map接口的使用
 * 存储的是键值对，键不可以，值可以重复，无序
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建集合
        Map<String,String> map=new HashMap<>();
        //添加元素
        map.put("cn","中国");
        map.put("uk","英国");
        map.put("usa","美国");
        System.out.println("个数:"+map.size());
        System.out.println(map.toString());
        //删除
//        map.remove("usa");
//        System.out.println("个数:"+map.size());
        //遍历
        //使用Keyset
        System.out.println("--------使用Keyset-----------");
        Set<String> strings = map.keySet();
        for (String string : strings) {
            System.out.println(string+"-----------"+map.get(string));
        }
        //使用entryset方法
        System.out.println("------使用entryset------");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+"----"+entry.getValue());
        }

    }
}
