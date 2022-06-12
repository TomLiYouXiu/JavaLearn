package 泛型;

public class TestDemo02 implements Demo02<String>{
    @Override
    public String server(String s) {
        System.out.println(s);
        return s;
    }


}
