package com.SDA.phase2.FawrySystem.services;

public abstract class Discount extends service{
    public service ser;
    public DiscountInfo DI;
    public Discount(service ser){
        this.ser = ser;
    }

    public Discount(ServiceController sc, service ser) {
        super(sc);
        this.ser = ser;
    }

    public abstract double cost(ServiceProvider sp, double amount, double dis);
}
