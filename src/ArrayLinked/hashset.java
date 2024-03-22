package ArrayLinked;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * @author Chin
 * @description
 * @date 2023/11/23 7:21 下午
 **/
public class hashset {
    public static void main(String[] args) {
        TreeSet<User> hashSet = new TreeSet<>();
        hashSet.add(new User("张三",18));
        hashSet.add(new User("李四",20));
        hashSet.add(new User("王五",30));
        hashSet.add(new User("张三",18));
        for (User user : hashSet) {
            System.out.println(user);
        }

    }
}
