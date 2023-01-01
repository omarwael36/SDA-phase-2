package com.SDA.phase2.FawrySystem.services;

public class MonthlyReceipt extends Landline{

    public MonthlyReceipt(ServiceController sc) {
        super(sc);
    }

    public double cost(ServiceProvider sp, double amount,double dis){
        return (amount * 30 + (amount * 30 * sp.getTax()));
    }
}
