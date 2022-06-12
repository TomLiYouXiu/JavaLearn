package String;

import java.util.Locale;

public class Demo04 {
    public static void main(String[] args) {
        //.public String trim();去掉字符串前后的空格
        //.public String toUpperCase()/toLowerCase();将小写转换为大写、大写转小写
        //.public String endWith/startsWith(String str);判断字符串是否以str结尾，开头

        String name1=" java 是世界上最好的语言  ";
        String name2="java";
        String name3="Java";

        System.out.println(name1.trim());
        System.out.println(name3.toLowerCase());
        System.out.println(name2.toUpperCase(Locale.ROOT));
        System.out.println(name3.startsWith("J"));
        System.out.println(name3.endsWith("J"));
    }
}
