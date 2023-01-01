package com.SDA.phase2.FawrySystem.services;

public class MobileRecharge  extends service{
    public MobileRecharge() {
    }

    public MobileRecharge(ServiceController sc) {
        super(sc);
    }

    public double cost(ServiceProvider sp, double amount,double dis){
        return (amount + (amount*sp.getTax()));
    }
}