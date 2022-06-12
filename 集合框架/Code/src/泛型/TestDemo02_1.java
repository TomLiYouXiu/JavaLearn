package 泛型;

public class TestDemo02_1<T> implements Demo02<T>{
    @Override
    public T server(T t) {
        System.out.println(t);
        return null;
    }
}
