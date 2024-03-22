package bukaExtendsExercise;

/**
 * @author Chin
 * @description
 * @date 2023/9/26 7:56 下午
 **/
public class Person {
    private String name;
    private int age;
   // public int a = 100;

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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
