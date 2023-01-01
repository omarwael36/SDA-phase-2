package com.SDA.phase2.FawrySystem.User;

import com.SDA.phase2.FawrySystem.Refund.Transactions;

import java.util.ArrayList;

public class Userinfo {
    private String email ;
    private String password;
    public String username ;
    private String address;
    ArrayList<Transactions> UTransactions = new ArrayList <Transactions> () ;

    //Creditcard Ucredit = new Creditcard;
    //Wallet Uwallet = new Wallet;

    public Userinfo(String email, String password, String username, String address, ArrayList<Transactions> UTransactions) {
        this.email = email;
        this.password = password;
        this.username = username;
        this.address = address;
        this.UTransactions = UTransactions;
    }

    public Userinfo() {
        this.email = " ";
        this.password = " ";
        this.username = " ";
        this.address = " ";
    }
    public void setemail (String mail)
    {
        this.email = mail;
    }
    public void setpassword (String pswd)
    {
        this.password = pswd;
    }
    public void setAddress (String address)
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
    public String getAddress () {
        return address;
    }
    public String getusername () {
        return username;
    }



}
