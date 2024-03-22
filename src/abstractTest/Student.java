package abstractTest;

/**
 * @author Chin
 * @description
 * @date 2023/10/15 4:50 下午
 **/
public  abstract class Student extends Person{
    @Override
    public void teach() {
        System.out.println("..");
    }

    @Override
    public void doing() {
        System.out.println("..");
    }
}
