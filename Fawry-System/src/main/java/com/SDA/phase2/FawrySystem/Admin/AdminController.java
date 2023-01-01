package com.SDA.phase2.FawrySystem.Admin;

public class AdminController
{
    public void ADDNewSP()
    {
        // create new SP using Admin info
        AdminInfo adminInfo = new AdminInfo();
        adminInfo.Username = "Admin";
        adminInfo.Password = "1234";
        adminInfo.Email = "admin@gmail.com";
        System.out.println("Add New Service Provider");
    }
    public void ADDDiscount()
    {
        System.out.println("Add Discount");
    }
    public void ShowUserTransactions()
    {
        System.out.println("Show User Transactions");
    }
    public void ShowRefund()
    {
        System.out.println("Show Refund");
    }
    public boolean AcceptRefund()
    {
        System.out.println("Accept Refund");
        return true;
    }
}
