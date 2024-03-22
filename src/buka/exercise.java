package buka;

/**
 * @author Chin
 * @description
 * @date 2023/9/17 5:02 下午
 **/
public class exercise {
    public static void main(String[] args) {
        int[] myArray = change(4, 3);
        for (int p : myArray) {
            System.out.println(p);
        }

    }

    //1. break执行了后边代码不再执行直接退出循环,continue则继续执行
    //2 结束递归调用,返回结果
    //3. 堆内存,栈内存,方法区,方法调用存放于栈内存,对象创建存放于堆区
    //4. 在方法里,方法名相同,传入不同的参数类型或者不同的参数个数所构成的新方法叫做方法重载
    //5. switch(){case 1 :  break ; ----- case x  : break;-----default : break;}
    //6. long int short byte char double float  boolean
    //    8    4   2      1    2    8       4      1
    //7. 逻辑与判断|| 或者 && 时如果第一个已经满足true 或者 并且的false 则不用判断后边条件,短路则需要都判断
    //8. &&均为true为true || 有一个true为true ! false时为true
    //9. jdk>jre
    //10. java命令运行,javac编译
    //11. do while 至少执行一次,先执行后判断,while判断后再执行
    //12. for(定义变量;判断条件;条件改变){遍历执行}
    //13. 执行if判断 如果正确进入if里执行,否则判断else if,如果所有if 或者else if 没有执行则执行else
    //14. 引用参数传递改变地址,影响结果,值传递只改变值不改变地址原来所存储的数据,只是把原来的值复制一遍
    public static int[] change(int a, int b) {
        int[] arr = new int[2];
        arr[0] = a - b;
        arr[1] = a + b;
        return arr;
    }
    //16. int[]arr = new int[length];从0开始,0作为首地址在堆内存中连续存储,.length访问,索引越界,空指针异常,索引访问超过长度-1,在某个索引处赋值为null
    // 该数组在堆内存占用内存的内存地址

}
