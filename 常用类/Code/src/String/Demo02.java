package String;

public class Demo02 {
    public static void main(String[] args) {
        //字符串方法的使用
        //.public int length(); 返回字符串的长度
        //.public char charAt(int index);根据下标获取字符
        //.public boolean contains(String str);判断当前字符串中是否包含str

        String content="java是世界上最好的编程语言";
        System.out.println(content.length());
        System.out.println(content.charAt(4));
        System.out.println(content.contains("java"));
        System.out.println(content.contains("php"));

    }
}
