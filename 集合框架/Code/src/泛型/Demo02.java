package 泛型;

/**
 * 泛型接口
 * 接口后面 接口名 <T>
 * 注意：不能创建泛型静态常量
 */
public interface Demo02<T> {
    String name="张三";
    T server(T t);



}
