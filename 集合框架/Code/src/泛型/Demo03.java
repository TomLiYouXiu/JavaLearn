package 泛型;

/**
 * 泛型方法
 * 语法<T>返回值类型
 *
 */
public class Demo03 {
    public <T> T show(T t){
        System.out.println("泛型方法"+t);
        return t;
    }
}
