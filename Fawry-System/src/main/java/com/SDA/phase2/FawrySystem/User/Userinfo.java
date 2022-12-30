package com.SDA.phase2.FawrySystem.User;


public class Userinfo {

    private String email ;
    private String password;
    public String username ;
    private String address;
    //Creditcard Ucredit = new Creditcard;
    //Wallet Uwallet = new Wallet;
    //ArrayList <Transactions> UTransactions = new ArrayList <Transactions> () ;


    public void setemail (String mail)
    {
        this.email = mail;
    }
    public void setpassword (String pswd)
    {
        this.password = pswd;
    }
    public void address (String address)
    {
        this.address = address;
    }

    public void setusername (String usr)
    {
        this.username = usr;
    }

    public String getemail () {
        return email;
    }

    public String getpassword () {
        return password;
    }
    public String getaddress () {
        return address;
    }
    public String getusername () {
        return username;
    }



}
