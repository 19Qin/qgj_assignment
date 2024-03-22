package bukaExtendsOf;

/**
 * @author Chin
 * @description
 * @date 2023/9/26 7:33 下午
 **/
public class Cat extends Animal {
    public int a = 100;
    public Cat() {
        super(20);

        super.shout();
        System.out.println("子类的无参构造调用了");
    }

    @Override
    public void shout(){
        System.out.println("猫在叫");
    }
}
