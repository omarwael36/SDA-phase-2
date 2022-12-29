package com.SDA.phase2.FawrySystem.services;

public class MonthlyReceipt extends Landline{
    public double cost(ServiceProvider sp,double amount){
        return (amount * 30 + (amount * 30 * sp.getTax()));
    }
}
