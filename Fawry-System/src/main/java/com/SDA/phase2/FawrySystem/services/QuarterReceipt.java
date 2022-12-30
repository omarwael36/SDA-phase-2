package com.SDA.phase2.FawrySystem.services;

public class QuarterReceipt  extends Landline{
    public double cost(ServiceProvider sp,double amount){
        return (amount * 90 + (amount * 90 * sp.getTax()));
    }
}