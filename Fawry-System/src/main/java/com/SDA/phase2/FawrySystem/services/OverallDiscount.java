package com.SDA.phase2.FawrySystem.services;

public class OverallDiscount extends Discount{
    public OverallDiscount(service ser) {
        super(ser);
    }

    public OverallDiscount(ServiceController sc, service ser) {
        super(sc, ser);
    }

    public double cost(ServiceProvider sp, double amount, double dis){
        return ser.cost(sp,amount,dis) - (ser.cost(sp,amount,dis)* dis);
    }
}
