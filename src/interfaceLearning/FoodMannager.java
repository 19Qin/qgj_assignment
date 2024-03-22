package interfaceLearning;

import java.util.Scanner;

/**
 * @author Chin
 * @description
 * @date 2023/10/24 7:36 下午
 **/
public class FoodMannager {
    public static void main(String[] args) {
        System.out.println("欢迎使用订餐系统");
        System.out.println("请选择功能 1.登录 2.注册");
        User user[] =new User[2];
        user[0]  = new User("zhangsan","000000");
        user[1] = new User("lisi","111111");
        Scanner scanner = new Scanner(System.in);
        while(true){
            boolean flag = false;
            int number = scanner.nextInt();
            if (number==1){
                System.out.println("请输入用户名和密码");
                String username = scanner.next();
                String password = scanner.next();
                for (int i = 0;i<user.length;i++){
                    if(username.equals(user[i].getUserName())&&password.equals(user[i].getPassword())){
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    System.out.println("登陆失败,请重新输入或注册一个账户");
                }else{
                    System.out.println("登录成功,请您点菜");

                }
            }else if(number==2){
                System.out.println("请输入你要注册的用户名及密码");
                boolean check2 = true;
                while(check2){
                    String newname = scanner.next();
                    String newpassword = scanner.next();
                    for (int i = 0;i<user.length;i++){
                                int t = i;
                        while(newname.equals(user[t].getUserName())){
                            System.out.println("该用户已存在请重新输入");
                            t++;
                        }
                            check2 = false;
                            //扩容
                            User[] newUser = new User[user.length+1];
                            newUser[user.length] = new User(newname,newpassword);
                            for (int j = 0;j<newUser.length-1;j++){
                                newUser[j] = user[j];
                            }
                            System.out.println("创建成功");
                            user = newUser;

                    }
        }

            }

        }
    }
}
