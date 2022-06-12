package String;

import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
        //.public char[] toCharArray(); 将字符串转成数组
        //.public int indexOf(String str);查找str首次出现的下标，存在返回该下标，不存在返回-1
        //.public int lastIndexOf(String str);查找str最后出现的一次下标

        String name="java是世界上最好的语言java";
        char[] chars = name.toCharArray();
        //增强for快捷键 xxx.for
//        for (char aChar : chars) {
//            System.out.print(aChar+" ");
//        }
        System.out.println(Arrays.toString(chars));
        System.out.println(name.indexOf("j"));
        System.out.println(name.lastIndexOf("j"));
    }
}
