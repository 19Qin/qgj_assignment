package bukaExtendsOf;

/**
 * @author Chin
 * @description
 * @date 2023/10/10 8:15 下午
 **/
public class Student {
    private int age;
    private String name;
    public static String school;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public  void print( String school){
        Student.school =school;
    }
    public  void cout(){
        System.out.println(school);
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

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }
}
