package buka.String;

import buka.Student;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Calendar;

/**
 * @author Chin
 * @description
 * @date 2024/2/4 2:54 下午
 **/
public class demo {
    public static void main(String[] args) {
      /*  String str = new String("ab-cd-ef-g");
        String[] str2 = str.split("-");
        for (int i = 0;i<str2.length;i++){
            System.out.println(str2[i]);
        }
        String str3 = str.substring(2,4);
        System.out.println(str3);
        Integer integer = new Integer(100);
        Integer integer1 = new Integer("100");
        String s1 = "100";
        String s2 = integer.toString();
        int b = integer1.intValue();
        System.out.println(s2);
        System.out.println(b);
        String str4 =new String();
        BigDecimal bigDecimal = new BigDecimal(3.14);
        BigDecimal bigDecimal1= new BigDecimal(5.56);
        BigDecimal add = bigDecimal.add(bigDecimal1);
        BigDecimal multiply = bigDecimal.multiply(bigDecimal1);
        System.out.println(add);
        System.out.println(multiply);
        Student student = new Student(19,"张三");
        String s = student.toString();
        System.out.println(s);
*/
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR,10);
        int sum = calendar.get(Calendar.YEAR);
        System.out.println(sum);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime localDateTime1 = LocalDateTime.of(2011,11,11,11,11,11);
        System.out.println(localDateTime1);

    }
}
