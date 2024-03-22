package bukaExtendsOf;

/**
 * @author Chin
 * @description
 * @date 2023/9/26 6:58 下午
 **/
public class Animal {
    private int age;
    public String name;
    public Animal(int age){
        this.age = age;
        System.out.println(age);
        System.out.println("父类的有参构造执行了");
    }

   /* public Animal() {
        System.out.println("父类的构造方法调用了");
    }*/

    public void shout(){
        System.out.println("动物在叫");
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

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
