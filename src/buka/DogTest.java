package buka;

/**
 * @author Chin
 * @description
 * @date 2023/9/19 7:44 下午
 **/
public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog("pubg",19,"black",2);
        Dog dog1 = new Dog();
        dog.run();
        dog.say();
        System.out.println(dog.toString());
    }
}
