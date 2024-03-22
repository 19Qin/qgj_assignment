package buka;

/**
 * @author Chin
 * @description
 * @date 2023/9/3 3:50 下午
 **/
public class demo02 {
    public static void main(String[] args) {
        System.out.println(true & true);
        System.out.println(false & true);
        System.out.println(true | false);
        System.out.println(false | false);
        System.out.println(true ^ false);
        System.out.println(true ^ true);
        System.out.println(false ^ false);
        int a = 10;
        int b = 1;
        System.out.println((a > 1) || (b++ > 1));
        System.out.println(b);
        System.out.println(a < 9 && b++ > 1);
        System.out.println(b);
    }
}
