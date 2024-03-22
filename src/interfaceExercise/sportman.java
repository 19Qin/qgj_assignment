package interfaceExercise;

/**
 * @author Chin
 * @description
 * @date 2023/10/17 8:03 下午
 **/
public abstract class sportman extends Person{
    public sportman() {
    }

    public sportman(int age, String name) {
        super(age, name);
    }

    public abstract void study();

}
