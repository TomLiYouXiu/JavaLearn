package Collection;

public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        //判断是不是同一个对象
        if(this==obj){
            return true;
        }
        //判断是否为空
        if(this==null){
            return false;
        }
        //判断是否为Student类型
        if(obj instanceof Student){
            Student s=(Student) obj;
            if(this.name.equals(s.getName())&&this.age==s.getAge()){
                return true;
            }
        }
        //不满足条件
        return false;
    }
}
