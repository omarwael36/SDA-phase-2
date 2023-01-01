package com.SDA.phase2.FawrySystem.services;

public class Donations  extends service{
    public Donations() {
    }

    public Donations(ServiceController sc) {
        super(sc);
    }

    public double cost(ServiceProvider sp, double amount,double dis){
        return (amount + (amount*sp.getTax()));
    }
}