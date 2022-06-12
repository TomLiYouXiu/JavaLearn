package Object.finalize;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//重写toString方法
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
//重写equals方法

    @Override
    public boolean equals(Object o) {
        //比较两个引用是否指向同一个对象
        if (this == o) return true;
        //判断obj是否为null
        //判断两个引用指向的实际对象类型是否一致
        if (o == null || getClass() != o.getClass()) return false;
        //强制类型转换
        Student student = (Student) o;
        //依次比较各个属性值是否相同
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.name+"对象被回收了");
    }
}
