package org.harry.prm_assignment_food_order.Model;

public class LoginObj {
    private String userName;
    private String password;

    public LoginObj(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public LoginObj() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
