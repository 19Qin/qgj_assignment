package bukaExtendsExercise;

/**
 * @author Chin
 * @description
 * @date 2023/9/26 7:57 下午
 **/
public class Teacher extends Person{
    //public int a = 1000;
    public Teacher(String name, int age) {
        super(name, age);
    }

    public void teaching(){
        //int a = 10000;
        System.out.println("老师在教书");
        //System.out.println(a);
    }

}
