package bukaThis;

/**
 * @author Chin
 * @description
 * @date 2023/9/24 3:03 下午
 **/
public class Student {
    private String name;
    private  int  age;

    public Student(String name, int age) {
        System.out.println("有参构造器执行");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0){
            this.age = 10;
        }else {
            this.age = age;
        }

    }
}
