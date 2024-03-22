package buka;

import java.util.Scanner;

/**
 * @author Chin
 * @description
 * @date 2023/9/3 1:39 下午
 **/
public class demo07 {
    public static void main(String[] args) {
      /* int a = 123;
       for(int i = 0;i<3;i++){
           System.out.println(a%10);
           a/=10;
       }
       int b = 456;
        System.out.println("b的个位数是"+(b%10));
        b/=10;
        System.out.println("b的十位数是"+(b%10));
        b/=10;
        System.out.println("b的百位数是"+(b%10));
*/
       /* short a = 10;
        a+=10;
        System.out.println(a);
        a = (short)(a+10);
        System.out.println(a);*/
       /* int a = 150;
        int b = 210;
        int c = 165;
        int d = a>b?a:b;
        int e = d>c?d:c;
        System.out.println(e);*/
      /*  Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("跑步");
                    break;
                case 2:
                    System.out.println("游泳");
                    break;
                case 3:
                    System.out.println("慢跑");
                    break;
                case 4:
                    System.out.println("打龙拳");
                    break;
                case 5:
                    System.out.println("拳击");
                    break;
                case 6:
                    System.out.println("爬山");
                    break;
                case 7:
                    System.out.println("下馆子");
                    break;
                default:
                    System.out.println("输入值有误");
                    a = -1;
                    break;
            }
            if (a == -1) {
                break;
            }*/
//
        /*int sum = 0;
        for(int i = 0;i<=50;i++){
            sum+=2*i;
        }
        System.out.println(sum);*/
        //数组的空指针异常和索引越界异常
       /* int[]arr = new int[3];
        arr = null;
        System.out.println(arr[0]);*/
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
   /*     int temp = 0;
        int[] arr = new int[]{12, 45, 98, 73, 60};
        temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
           if(arr[i]>temp){
               temp = arr[i];
           }
        }
        System.out.println(temp);
        temp = arr[arr.length-1];
        for(int index = arr.length-1;index>0;index--){
            if(temp<arr[index-1]){
                temp = arr[index-1];
            }
        }
        System.out.println(temp);
        //如果一开始指定不一样的索引,要想再一次少个比较,那么我们加个判断,如果断言的索引相同,那就继续执行
*/
    /*int a = 10;
    int[]arr = new int[10];
    arr[0] = 5;
    change(arr,a);
        System.out.println(arr[0]);
        System.out.println(a);
    }
    public static void change(int arr[],int a){
        arr[0] = 100;
        a = 200;
    }*/
     /* int a = 1;
      int b = 2;
      int c = 3;
      double d = 2.0;
      add(a,b);
      add(a,b,c);
      add(a,d);
        System.out.println( add(a,b));
    }
    public static int add(int a,int b){
        System.out.println("执行方法1");
        return a+b;
    }
    public static int add(int a,int b,int c){
        System.out.println("执行方法2");
        return a+b+c;
    }
    public static double add(int a , double b){
        System.out.println("执行方法3");
        return a+b;*/
        sum();
    }

    public static void sum() {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println(sum);
        }
    }
}




