package OOP.Demo09;
//接口 interface 接口都需要实现类完成
public interface UserService {
    //接口中的方所有定义都是public
    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);
}
