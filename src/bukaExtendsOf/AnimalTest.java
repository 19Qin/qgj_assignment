package bukaExtendsOf;

/**
 * @author Chin
 * @description
 * @date 2023/9/26 6:59 下午
 **/
public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog(1000);
        dog.name = "小黑";
        dog.setAge(100);
        dog.shout();
        System.out.println(dog.name);
        System.out.println(dog.toString());
        Cat cat = new Cat();
        cat.shout();
        Student student = new Student(18,"小明");
        Student student1 = new Student(19,"小王");
        student1.print("理工");
        student.cout();
    }
}
