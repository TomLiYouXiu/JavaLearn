package System;

public class student {
    private String naem;
    private int age;

    public student(String naem, int age) {
        this.naem = naem;
        this.age = age;
    }

    public student() {
    }

    public String getNaem() {
        return naem;
    }

    public void setNaem(String naem) {
        this.naem = naem;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "naem='" + naem + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("回收了"+naem);
    }
}
