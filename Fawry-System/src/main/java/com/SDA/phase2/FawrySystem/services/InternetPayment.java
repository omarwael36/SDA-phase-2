package com.SDA.phase2.FawrySystem.services;

public class InternetPayment extends service{
    public InternetPayment() {
    }

    public InternetPayment(ServiceController sc) {
        super(sc);
    }

    public double cost(ServiceProvider sp, double amount,double dis){
        return (amount + (amount*sp.getTax()));
    }
}
