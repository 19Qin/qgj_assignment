package interfaceExercise;

/**
 * @author Chin
 * @description
 * @date 2023/10/17 8:21 下午
 **/
public abstract class Coach extends Person{
    public Coach() {
    }

    public Coach(int age, String name) {
        super(age, name);
    }
    public abstract void teach();
}
