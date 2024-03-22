package abstractTest;

/**
 * @author Chin
 * @description
 * @date 2023/10/15 4:50 下午
 **/
public abstract class Person {
    private int a;
    public abstract void teach();
    public abstract void doing();

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
