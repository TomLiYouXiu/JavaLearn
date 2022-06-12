package com.Struct;

import java.util.Scanner;

public class IfDemo01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //equals:判断字符串是否相等
        String s=scanner.nextLine();
        if(s.equals("Hello"))
        {
            System.out.println(s);
        }

        System.out.println("End");

        scanner.close();
    }
}
