package 泛型;

/**
 * 泛型类
 * 语法：类名<T>
 *T表示占位符，表示一种引用类型，可以写多个使用逗号分割
 */
public class Demo01<T> {
    //使用泛型T
    //创建变量
    T t;

    //添加方法,作为方法的参数
    public void show(T t){
        System.out.println(t);
    }
    //使用泛型作为方法的返回值
    public T getT(){
        return t;
    }
}
