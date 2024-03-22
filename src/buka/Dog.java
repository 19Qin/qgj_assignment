package buka;

/**
 * @author Chin
 * @description
 * @date 2023/9/19 7:42 下午
 **/
public class Dog {
    String name;
    int age;
    String color;
    int dicklong;

    public void say(){
        System.out.println("狗叫");
    }
    public void run(){
        System.out.println("狗在跑");
    }
    public Dog(){
        System.out.println("pubg在狗叫");
    }

    public Dog(String name, int age, String color, int dicklong) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.dicklong = dicklong;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
