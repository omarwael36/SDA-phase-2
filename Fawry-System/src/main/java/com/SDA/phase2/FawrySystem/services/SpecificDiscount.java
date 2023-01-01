package com.SDA.phase2.FawrySystem.services;

public class SpecificDiscount extends Discount{
    public SpecificDiscount(service ser) {
        super(ser);
    }

    public SpecificDiscount(ServiceController sc, service ser) {
        super(sc, ser);
    }

    public double cost(ServiceProvider sp, double amount, double dis){
        return ser.cost(sp,amount,dis) - (ser.cost(sp,amount,dis)* dis);

    }
}