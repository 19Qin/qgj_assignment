package buka;

/**
 * @author Chin
 * @description
 * @date 2023/9/19 7:10 下午
 **/
public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(18,"张三");
        student1.playing();
        student1.sleeping();
        student1.studying();
        System.out.println(student1.toString());
    }
}
