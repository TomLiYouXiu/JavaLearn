package com.Struct;

public class SwitchDemo02 {
    public static void main(String[] args) {
        String name="李优秀";

        //JDK7之后才支持可以匹配字符串
        //字符的本质还是数字

        //利用IDEA反编译
        switch(name)
        {
            case "李良好":
                System.out.println("李良好");
                break;
            case "李优秀":
                System.out.println("李优秀");
                break;
            default:
                System.out.println(name);

        }
    }
}
