package OOP.Demo08;
//抽象类 abstract  extends：类单继承  （接口可以实现多继承）
public abstract class Action {
    //约束~有人帮我们实现
    //抽象方法 只有方法名字，没有方法体
    public abstract void DoSomeThing();
    //1.不能new这个抽象类，只能子类实现他 约束
    //2.抽象类中可以写普通方法
    //3.抽象方法必须写在抽象类中
    //抽象的抽象

}
