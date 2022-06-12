package set;

public class person implements Comparable<person>{
    String name;
    int age;

    public person(String name, int age) {
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

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        int n1=this.name.hashCode();
        int n2=this.age;
        return n1+n2;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if (obj==null){
            return false;
        }
        if (obj instanceof person){
            person p=(person) obj;
            if (this.name.equals(p.getName())&&this.age==p.getAge()){
                return true;
            }
        }
        return false;
    }
    //先按姓名比再按年龄比
    @Override
    public int compareTo(person o) {
        int n1=this.getName().compareTo(o.getName());
        int n2=this.getAge()-o.getAge();

        return n1==0?n2:n1;
    }
}
