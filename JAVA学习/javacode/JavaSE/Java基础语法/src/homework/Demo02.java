package homework;

import java.util.Scanner;
//计算器改良版
public class Demo02 {
    public static void main(String[] args) {
        boolean bool = true;
        while (bool) {
            Scanner in = new Scanner(System.in);
            System.out.println("+------------+");
            System.out.println("|    计算器   |");
            System.out.println("|   1.加法    |");
            System.out.println("|   2.减法    |");
            System.out.println("|   3.乘法    |");
            System.out.println("|   4.除法    |");
            System.out.println("|   5.退出    |");
            System.out.println("+------------+");
            System.out.print("请输入选项：");
            int choice = in.nextInt();
            int a;
            int b;
            int c;
            switch (choice) {
                case 1:
                    System.out.print("请输入第一个加数：");
                    a = in.nextInt();
                    System.out.print("请输入第二个加数：");
                    b = in.nextInt();
                    c = a + b;
                    System.out.println("和为：" + c);
                    break;
                case 2:
                    System.out.print("请输入第一个减数：");
                    a = in.nextInt();
                    System.out.print("请输入第二个减数：");
                    b = in.nextInt();
                    c = a - b;
                    System.out.println("差为：" + c);
                    break;
                case 3:
                    System.out.print("请输入第一个乘数：");
                    a = in.nextInt();
                    System.out.print("请输入第二个乘数：");
                    b = in.nextInt();
                    c = a * b;
                    System.out.println("积为：" + c);
                    break;
                case 4:
                    System.out.print("请输入被除数：");
                    a = in.nextInt();
                    System.out.print("请输入除数：");
                    b = in.nextInt();
                    c = a / b;
                    System.out.println("商为：" + c);
                    break;
                case 5:
                    bool = false;
                    break;
                default:
                    System.out.println("输入有误");
            }
        }
    }
}
