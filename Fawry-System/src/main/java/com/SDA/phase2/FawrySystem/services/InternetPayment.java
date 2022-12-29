package com.SDA.phase2.FawrySystem.services;

public class InternetPayment extends service{
    public double cost(ServiceProvider sp,double amount){
        return (amount + (amount*sp.getTax()));
    }
}
