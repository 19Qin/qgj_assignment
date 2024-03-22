package bukaExtendsExercise;

/**
 * @author Chin
 * @description
 * @date 2023/9/26 7:59 下午
 **/
public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("覃国晋",18);
        Student student = new Student("pubg",18);
        teacher.teaching();
        student.studying();
        System.out.println(teacher.toString());
        System.out.println(student.toString());
    }
}
