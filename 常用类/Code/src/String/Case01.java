package String;

public class Case01 {
    //需求
    // 已知String str="this is a text";
    // 1.将str中的单词提取出来
    // 2.将str中的text替换为practice
    // 3.在text前面插入easy
    // 4.将每个单词的首字母改为大写
    public static void main(String[] args) {
        String str="this is a text";
        //将str中的单词提取出来
        String[] s = str.split(" ");
        for (String s1 : s) {
            System.out.println(s1);
        }
        //将str中的text替换为practice
        String replace = str.replace("text", "practice");
        System.out.println(replace);
        //在text前面插入easy
        String easy = str.replace("text", "easy text");
        System.out.println(easy);
        //将每个单词的首字母改为大写
        for (int i = 0; i <s.length ; i++) {
            char frist=s[i].charAt(0);
            //把第一个字符转成大写
            char upperfrist = Character.toUpperCase(frist);
            String news=upperfrist+s[i].substring(1);//截取
            System.out.println(news);
        }
    }
}
