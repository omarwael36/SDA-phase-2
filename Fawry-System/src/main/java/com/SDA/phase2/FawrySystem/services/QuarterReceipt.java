package com.SDA.phase2.FawrySystem.services;

public class QuarterReceipt  extends Landline{
    public QuarterReceipt() {
    }

    public QuarterReceipt(ServiceController sc) {
        super(sc);
    }

    public double cost(ServiceProvider sp, double amount,double dis){
        return (amount * 90 + (amount * 90 * sp.getTax()));
    }
}