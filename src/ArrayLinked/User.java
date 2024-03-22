package ArrayLinked;

import java.util.Comparator;
import java.util.Objects;

/**
 * @author Chin
 * @description
 * @date 2023/11/23 7:21 下午
 **/
public class User {
    private String name;
    private int age;

    public User(String name, int age) {
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
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    public int compareTo(User o){
        if (this.age-o.age==0){
            if(this.name.equals(o.getName())){
                return 0;
            }
            return -1;
        }else{
            return this.age - o.age;
        }
    }
}
