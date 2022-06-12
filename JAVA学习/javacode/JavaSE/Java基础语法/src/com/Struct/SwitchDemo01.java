package com.Struct;

public class SwitchDemo01 {
    public static void main(String[] args) {
        //case:穿透   switch：匹配具体的值
        char c='B';
        switch(c){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
        }

    }
}
