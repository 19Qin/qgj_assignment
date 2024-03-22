package bukaExtendsOf;

/**
 * @author Chin
 * @description
 * @date 2023/9/26 6:59 下午
 **/
public class Dog extends Animal{
    public Dog(int age) {
        super(age);
        System.out.println(age);
        System.out.println("子类的有参构造执行了");
    }

    @Override
    public void shout() {
        System.out.println("小狗在叫");
        super.shout();
    }
}
