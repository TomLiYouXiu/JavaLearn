package String;

import java.util.Arrays;

public class Demo05 {
    public static void main(String[] args) {
        //.public String replace(char oldChar,char newChar);将旧字符串替换成新的
        //.public String[] split(String str);根据str做拆分
        String name="张三";
        System.out.println(name.replace("三","四"));
        String say="java is the best programing      language,java xiang";
//        String[] s = say.split(" ");
        String[] s = say.split("[ ,]+");// [] 选择分割 空格或者，进行分割
        System.out.println(Arrays.toString(s));

        //方法补充equals compareTo()；比较大小
        String s1="hello";
        String s2="HELLO";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));//忽略大小写

        String s3="abc";//97
        String s4="xyz";//120
        System.out.println(s3.compareTo(s4));

    }
}
