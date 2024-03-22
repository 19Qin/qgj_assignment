package buka;

/**
 * @author Chin
 * @description
 * @date 2023/9/19 7:07 下午
 **/
public class Student {
    int age;
    String name;
    public void playing(){
        System.out.println("学生打游戏");
    }
    public void studying(){
        System.out.println("学生学习");
    }
    public void sleeping(){
        System.out.println("学生睡觉");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("有参构造器执行");
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
