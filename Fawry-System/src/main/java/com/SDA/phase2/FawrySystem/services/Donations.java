package com.SDA.phase2.FawrySystem.services;

public class Donations  extends service{
    public double cost(ServiceProvider sp,double amount){
        return (amount + (amount*sp.getTax()));
    }
}