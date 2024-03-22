package interfaceLearning;

/**
 * @author Chin
 * @description
 * @date 2023/10/24 7:38 下午
 **/
public class User {
    private String UserName;
    private String password;

    public User(String userName, String password) {
        UserName = userName;
        this.password = password;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
