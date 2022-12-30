package com.SDA.phase2.FawrySystem.Admin;

public class Admin
{
    private String password;
    private String Email;
    public String UserName;
    public void setUserName(String userName) {
        UserName = userName;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getUserName() {
        return UserName;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return Email;
    }

}
