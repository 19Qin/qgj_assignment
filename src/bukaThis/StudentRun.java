package bukaThis;

/**
 * @author Chin
 * @description
 * @date 2023/9/24 3:05 下午
 **/
public class StudentRun {
    public static void main(String[] args) {
        Student student = new Student("pubg",20);
        System.out.println(student.getAge());
        student.setAge(-20);
        System.out.println(student.getAge());
        student.setAge(10);
        System.out.println(student.getAge());
        System.out.println(student.getName());
        student.setName("覃国晋是pubg的爹");
        System.out.println(student.getName());


    }
}
