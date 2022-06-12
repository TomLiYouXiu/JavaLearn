package OOP.Demo02;
//学生类
public class Student {
    //属性：字段
    String name;//null
    int age;//0
    //方法
    public void study(){
        System.out.println(this.name+"在学习");
    }
}
/*测试
public static void main(String[] args) {
        //类是抽象的，需要实例化
        //类实例化后会返回一个实例化的对象
        //student对象就是Student的一个具体实例
        Student xiaoming = new Student();
        Student xiaohong = new Student();
        xiaoming.name="小明";
        System.out.println(xiaoming.name);
        System.out.println(xiaoming.age);
        xiaoming.study();
    }
* */