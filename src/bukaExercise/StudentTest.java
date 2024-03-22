package bukaExercise;

/**
 * @author Chin
 * @description
 * @date 2023/9/24 4:53 下午
 **/
public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[3];
       /* 没有值的时候调用方法会出现空指针异常,第一个数组new只是创建了Student数组,但是此时还没有指向实际的student数组,因为此时还没有创建
       students[0].setChineseScore(100);
        students[1].setChineseScore(50);
        students[2].setChineseScore(0);
        students[0].setMathScore(100);
        students[1].setMathScore(50);
        students[2].setMathScore(0);
        students[0].setEnglishScore(100);
        students[1].setEnglishScore(100);
        students[2].setEnglishScore(100);*/
        //可以二合一
        Student student = new Student("覃国晋",100,100,100);
        Student student1 = new Student("pubg",0,0,0);
        Student student2 = new Student("闫鑫",60,60,60);
        students[0] = student;
        students[1] = student1;
        students[2] = student2;
        //student[0,1,2] = new Student("覃国晋",100,100,100);
        for (Student student3 : students) {
            System.out.println(student3.getName());
            System.out.println(student3.getChineseScore());
            System.out.println(student3.getMathScore());
            System.out.println(student3.getEnglishScore());
        }
    }
}
