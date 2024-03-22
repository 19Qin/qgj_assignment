package interfaceExercise;

/**
 * @author Chin
 * @description
 * @date 2023/10/17 7:54 下午
 **/
public abstract class Person {
    private int age;
    private String name;

    public Person(){}

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
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

    public  abstract void eating();

}
