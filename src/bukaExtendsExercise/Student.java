package bukaExtendsExercise;

/**
 * @author Chin
 * @description
 * @date 2023/9/26 7:58 下午
 **/
public class Student extends Person{
    public Student(String name, int age) {
        super(name, age);
    }

    public void studying(){
        System.out.println("学生在学习");
    }

}
