package homework;

import java.util.Scanner;

//计算器
public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===============计算器================");
        System.out.println("请输入你的运算法则");
        String a=scanner.next();
        System.out.println("请输入第一个数");
        double a1=scanner.nextDouble();
        System.out.println("请输入第二个数");
        double a2=scanner.nextDouble();
        switch (a){
            case "+":
                System.out.println("加法和为："+add(a1,a2));
                break;
            case "-":
                System.out.println("减法和为："+reduce(a1,a2));
                break;
            case "*":
                System.out.println("乘法和为："+multiplication(a1,a2));
                break;
            case "/":
                System.out.println("除法和为："+except(a1,a2));
                break;
            default:
                System.out.println("没有此运算");

        }
        scanner.close();

    }
    public static double add(double a,double b){
        return a+b;
    }
    public static double reduce(double a,double b){
        return a-b;
    }
    public static double multiplication(double a,double b){
        return a*b;
    }
    public static double except(double a,double b){
        return a/b;
    }
}
